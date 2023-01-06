using System;

namespace loops
{
  class Program
  {
    static void Main(string[] args)
    {
      /*
       * Loop structures
       *
       * while: executes while a given condition is true
       * do...while: executes an instruction once and repeats it while a given condition is true
       * for: repeats an instruction a given number of times using an iterator variable
       * foreach: used to iterate over collections (e.g. arrays)
       */

       // While loop usage example
       int x = 10;

       while (x > 0)
       {
        Console.WriteLine("Decrementing x...");
        x--;
        Console.WriteLine($"x is now {x}");
       }

       // Do...while loop usage example
       int y = 15;

       do
       {
        y -= 2;
       } while (y > 0);

       // For loop usage example
       for (int i = 1; i <= 100; i++)
       {
        Console.WriteLine($"Iteration number {i}");
       }

       // Foreach loop usage example
       int[] numbers = { 2, 5, 14, 4, 6 };

       foreach (int number in numbers)
       {
        Console.WriteLine(number);
       }

    }
  }
}