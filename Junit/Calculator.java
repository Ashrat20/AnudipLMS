package junitpack;

public class Calculator 
{
    // Method for addition
    public static int add(int a, int b) 
    {
        return a + b;
    }

    // Method for subtraction
    public static int sub(int a, int b) 
    {
        return a - b;
    }

    // Method for multiplication
    public static int Mul(int a, int b) 
    {
        return a * b;
    }

    // Method for division
    public static int div(int a, int b) 
    {
        if (b == 0) 
        {
            // Throw an exception if attempting to divide by zero
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
