using System;

namespace conditionals
{
  class Program
  {
    static void Main(string[] args)
    {
      /*
       * Logical operators:
       * AND (&&)
       * OR (||)
       * NOT (!)
       * XOR (^)
       *
       * Comparison operators:
       * Less than (<)
       * Greater than (>)
       * Less than or equal to (<=)
       * Greater than or equal to (>=)
       * Equal to (==)
       * Not equal to (!=)
       * 
       * Conditional statements
       * If...
       * Else if...
       * Else...
       * Switch
       * Ternary Operator
       */

       // Example usage of if...else if...else statements
       int x = 15;
       int y = 25;

       if (x > y) 
       {
        Console.WriteLine("X is greater than y.");
       }
       else if (y == 0)
       {
        Console.WriteLine("Y is zero.");
       }
       else
       {
        Console.WriteLine("None of the above conditions are true.");
       }

       // Example usage of switch statement
       string fruit = "banana";

       switch (fruit)
       {
        case "apple":
          Console.WriteLine("It's an apple!");
          break;
        case "orange":
          Console.WriteLine("It's an orange!");
          break;
        case "banana":
          Console.WriteLine("It's a banana!");
          break;
        default:
          Console.WriteLine("Is it even a fruit?");
          break;
       }

       // Example usage of the ternary operator
       string message;
       message = fruit == banana ? "It's a banana!" : "Not a banana."; 

    }
  }
}