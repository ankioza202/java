//Write a method that accepts a number as input and prints whether the number is odd or even using an if/else statement as well as a ternary expression.


class checkEvenOddNumber {
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);

// Even and Odd number using If and Else Block
        if (i % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("ODd number");
        }

// Even and Odd number using Ternary Expression	
        String s = i % 2 == 0 ? "Even number" : "Odd number";
        System.out.println(s);

    }
}