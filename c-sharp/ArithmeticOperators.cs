using System;

namespace arithmetic_operators
{
  class Program
  {
    static void Main(string[] args)
    {
      /*
       * Arithmetic operators:
       * Addition: +
       * Subtraction: - 
       * Multiplication: *
       * Division: / 
       * Modulo: %
       * Increment: ++
       * Decrement: --
       * Operator & reassigment shorthand: +=, -=, *=, /=, %=
       */

       int x = 25;
       int y = 12;
       double z = 10.5;

       // Division of integers rounds the result towards zero
       int divideInt = x / y; // 2

       // Division with a floating point number returns a floating point
       double divideDouble = x / z; // 2.38095238095238

       // Modulo returns the remainder of a division
       int remainder = x % y; // 1

       /*
        * Built-in methods for other mathematical operations:
        * Math.Abs(): returns the absolute value of a number
        * Math.Sqrt(): returns the square root of a number
        * Math.Floor(): rounds a floating point down to the nearest whole number
        * Math.Ceiling(): rounds a floating point up to the nearest whole number
        * Math.Min(): finds the smallest number between two numbers
        * Math.Max(): finds the largest number between two numbers
        * More methods: https://learn.microsoft.com/en-us/dotnet/api/system.math?view=net-7.0
        */

        double w = 64.0;
        double a = 20.75;

        double sqrt = Math.Sqrt(64); // 8
        double roundDown = Math.Floor(a); // 20
        double roundUp = Math.Ceiling(a); // 21
        
    }
  }
}