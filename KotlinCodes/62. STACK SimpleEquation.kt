import java.util.Stack // Import the Stack class from the java.util package

// Function that evaluates a mathematical expression passed as a string and returns an integer
fun equation(equation: String): Int {
    val tokens = equation.toCharArray() // Convert the expression into an array of characters
    val values = Stack<Int>() // Stack to store the values (numbers)
    val operators = Stack<Char>() // Stack to store the operators (+, -, *, /)
    var i = 0 // Index to traverse the characters in the expression

    // Main loop to process each character in the expression
    while (i < tokens.size) {
        // Skip spaces
        if (tokens[i] == ' ') {
            i++ // Increment the index
            continue // Continue to the next character
        }

        // If the current character is a digit
        if (tokens[i].isDigit()) {
            val sbuf = StringBuilder() // Used to build the number
            // Collect all consecutive digits
            while (i < tokens.size && tokens[i].isDigit()) {
                sbuf.append(tokens[i++]) // Append the digit to the StringBuilder
            }
            values.push(sbuf.toString().toInt()) // Convert to integer and add to the values stack
            i-- // Decrement the index to not skip the next character
        }
        // If the character is an opening parenthesis
        else if (tokens[i] == '(') {
            operators.push(tokens[i]) // Add the parenthesis to the operators stack
        }
        // If the character is a closing parenthesis
        else if (tokens[i] == ')') {
            // Apply operators until the matching opening parenthesis is found
            while (operators.peek() != '(') {
                // Pop the operator from the top and apply it to the last two values in the values stack
                values.push(applyOp(operators.pop(), values.pop(), values.pop()))
            }
            operators.pop() // Remove the opening parenthesis
        }
        // If the character is an operator (+, -, *, /)
        else if (tokens[i] in "+-*/") {
            // While there are operators in the stack and the current operator has precedence
            while (!operators.isEmpty() && hasPrecedence(tokens[i], operators.peek())) {
                // Apply the operator on the top of the operators stack
                values.push(applyOp(operators.pop(), values.pop(), values.pop()))
            }
            operators.push(tokens[i]) // Add the current operator to the operators stack
        }
        i++ // Increment the index for the next character
    }

    // Apply all remaining operators in the stack
    while (!operators.isEmpty()) {
        values.push(applyOp(operators.pop(), values.pop(), values.pop()))
    }

    return values.pop() // Return the final result, which is on top of the values stack
}

// Function that checks the precedence between two operators
fun hasPrecedence(op1: Char, op2: Char): Boolean {
    if (op2 == '(' || op2 == ')') return false // Parentheses do not have precedence
    if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return false // * and / have precedence over + and -
    return true // Otherwise, op1 has precedence
}

// Function that applies an operator to two operands and returns the result
fun applyOp(op: Char, b: Int, a: Int): Int {
    return when (op) {
        '+' -> a + b // Addition
        '-' -> a - b // Subtraction
        '*' -> a * b // Multiplication
        '/' -> { // Division
            if (b == 0) throw UnsupportedOperationException("Cannot divide by zero") // Throws exception if division by zero
            a / b // Returns the result of the division
        }
        else -> 0 // Default case (should not occur)
    }
}

// Main function to test the equation function
fun main() {
    println(equation("1+1"))         // Output: 2
    println(equation("7*4-2"))       // Output: 26
    println(equation("1+1+1+1+1"))   // Output: 5
}
