fun main() {
    val a = 12 // 1100 in binary
    val b = 25 // 11001 in binary

    // Bitwise AND
    val andResult = a and b
    println("a and b = $andResult") // Output: 8 (1000 in binary)

    // Bitwise OR
    val orResult = a or b
    println("a or b = $orResult") // Output: 29 (11101 in binary)

    // Bitwise XOR
    val xorResult = a xor b
    println("a xor b = $xorResult") // Output: 21 (10101 in binary)

    // Bitwise NOT
    val notResult = a.inv()
    println("not a = $notResult") // Output: -13 (in binary: all bits inverted)

    // Left Shift
    val leftShift = a shl 2
    println("a shl 2 = $leftShift") // Output: 48 (110000 in binary)

    // Right Shift
    val rightShift = a shr 2
    println("a shr 2 = $rightShift") // Output: 3 (11 in binary)

    // Unsigned Right Shift
    val unsignedRightShift = a ushr 2
    println("a ushr 2 = $unsignedRightShift") // Output: 3 (11 in binary)
}
