package day_one

fun main(args: Array<String>) {
    var i = 1
    val rows = 4
    var n = 1
    while (i <= rows) {
        var j = 1
        while (j <= rows - i) {
            print(" ")
            j++
        }

        var a = 1
        while (a <= i) {
            print("$n ")
            a++
        }

        n++
        println()
        i++
    }
}

/*
Certainly! Let's go through the modified logic of the code step by step:

We initialize the variable i to 1, representing the current row number.

We define the total number of rows (rows) as 4 in this example. You can adjust this value to change the height of the pyramid.

We initialize the variable numbers to 1. This variable keeps track of the current number to be printed in the pyramid.

We enter the outer while loop, which will execute as long as i is less than or equal to rows.

Inside the outer loop, we enter the first inner while loop. This loop is responsible for printing the necessary spaces at the beginning of each row.

The inner loop runs rows - i times, as the number of spaces decreases by 1 with each row.
In each iteration, it prints a space character.
After printing the spaces, we enter the second inner while loop. This loop is responsible for printing the numbers in each row.

The inner loop runs i times, as we want to print i copies of the current number.
In each iteration, it prints the current number ($numbers), followed by a space character.
After printing the spaces and numbers for the current row, we move to a new line using println() to start the next row on a new line.

We increment the numbers variable to move to the next number for the subsequent row.

Finally, we increment i to move to the next row and repeat the process until the outer loop condition (i <= rows) becomes false.*/




















