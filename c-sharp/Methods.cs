using System;

namespace methods
{
  class Program
  {
    /*
     * Methods are reusable blocks of code that perform a specific task
     */

    // This is the main method, which is called when the program starts
    static void Main(string[] args)
    {
      // Other methods can be called within the main method to provide functionality to the program
      int a = 15;
      int b = 30;
      int c = 45;

      int sum = SumNumbers(a, b); // Stores the returned value (45) in the variable named "sum"
      int sum2 = SumNumbers(a, b, c); // Called an overloaded method

      string message = GetMessage("Hello There"); // Called a method without providing the optional parameter
      string secondMessage = GetMessage(punctuation: "!", msg: "Hello again"); // Passing named arguments to a method

      // Calling a method that returns multiple values
      int indexOfDog;
      bool containsDog = IndexOfDog("Is there a dog?", out indexOfDog); // returns true and assigns the value 11 to indexOfDog

      // Expression-bodied methods are called the same way
      bool even = isEven(b); // true

      // Anonymous methods can be created with lambda expressions
      int[] numbers = {0, 5, 45, 150};
      bool hasBigNum = Array.Exists(numbers, (int num) => num > 100);
      // Parameter type can be dropped if the type can be inferred: (num) => num > 100
      // Parentheses around the parameter can be dropped if there is only one param: num => num > 100

    }

    // A method's signature is composed of: access modifier, return type, method name, parameters
    static int SumNumbers(int x, int y)
    {
      return x + y;
    }

    // Method overloading: methods can have the same name but different signatures
    static int SumNumbers(int x, int y, int z)
    {
      return x + y + z;
    }

    // A method can have optional parameters with default values
    static string GetMessage(string msg, string punctuation = ".")
    {
      return msg + punctuation;
    }

    // Out parameters can be used to return multiple values
    static bool IndexOfDog(string msg, out int index)
    {
      index = msg.ToLower().IndexOf("dog");
      return index != -1;
    }

    // One-line methods can be defined with expression-bodied definitions
    static bool isEven(int num) => num % 2 == 0; // curly braces and return keyword were dropped

  }
}