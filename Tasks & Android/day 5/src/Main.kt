open class Person(val name: String, val id: String)

class Librarian(name: String, id: String, val password: String) : Person(name, id)

class User(name: String, id: String, val job: String) : Person(name, id)

open class LibraryItem(val title: String, val isbn: String, val publication: String, val numberOfPages: Int) {
    var isAvailable: Boolean = true
}

class Book(title: String, isbn: String, publication: String, numberOfPages: Int) : LibraryItem(title, isbn, publication, numberOfPages)

class Magazine(title: String, isbn: String, publication: String, numberOfPages: Int) : LibraryItem(title, isbn, publication, numberOfPages)

class Journal(title: String, isbn: String, publication: String, numberOfPages: Int) : LibraryItem(title, isbn, publication, numberOfPages)

class LibraryDatabase {
    var currentLibrarian: Librarian? = null
    val availableBooks = mutableListOf<LibraryItem>()
    val borrowedBooks = mutableMapOf<User, LibraryItem>()

    fun addBook(book: LibraryItem) {
        availableBooks.add(book)
    }

    fun lendBook(bookTitle: String, user: User) {
        val book = availableBooks.find { it.title == bookTitle && it.isAvailable }
        book?.let {
            it.isAvailable = false
            borrowedBooks[user] = it
            availableBooks.remove(it)
        }
    }

    fun viewAvailableBooks(): List<String> {
        return availableBooks.filter { it.isAvailable }.map { it.title }
    }

    fun searchForABook(title: String): LibraryItem? {
        return availableBooks.find { it.title == title }
    }

    fun receiveBookFromBorrower(user: User) {
        borrowedBooks[user]?.let {
            it.isAvailable = true
            availableBooks.add(it)
            borrowedBooks.remove(user)
        }
    }
}

fun main() {
    val libraryDb = LibraryDatabase()
    libraryDb.addBook(Book("Book1", "ISBN1", "Publication1", 100))
    libraryDb.addBook(Book("Book2", "ISBN2", "Publication2", 200))
    println("Available Books: ${libraryDb.viewAvailableBooks()}")
    val user1 = User("John Doe", "001", "Student")
    libraryDb.lendBook("Book1", user1)
    println("Available Books after lending: ${libraryDb.viewAvailableBooks()}")
    libraryDb.receiveBookFromBorrower(user1)
    println("Available Books after receiving: ${libraryDb.viewAvailableBooks()}")
}
