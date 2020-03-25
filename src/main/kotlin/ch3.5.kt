fun main() {
    println(1 in 1..3)
    println((1..5).toList())
    println(1 in 3 downTo 1)
    println(3 in 1 until 3)
    println(2 in 1..3)
    println(2 in 1..3)
    println(1 !in 1..3)
    println('x' in 'a'..'z')
    println('X' in 'a'..'z')
}