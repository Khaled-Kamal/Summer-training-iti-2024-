abstract class Shape {
    abstract fun calcArea(): Double
}


class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun calcArea(): Double {
        return width * height
    }
}


class Circle(val radius: Double) : Shape() {
    override fun calcArea(): Double {
        return Math.PI * radius * radius
    }
}


class Triangle(val base: Double, val height: Double) : Shape() {
    override fun calcArea(): Double {
        return 0.5 * base * height
    }
}


fun sumAreas(shape1: Shape, shape2: Shape, shape3: Shape): Double {
    return shape1.calcArea() + shape2.calcArea() + shape3.calcArea()
}

fun main() {
    val rectangle = Rectangle(4.0, 5.0)
    val circle = Circle(3.0)
    val triangle = Triangle(6.0, 7.0)

    println("Sum of areas: ${sumAreas(rectangle, circle, triangle)}")
}
