using System;

namespace arrays
{
  class Program
  {
    static void Main(string[] args)
    {
      /*
       * Arrays are fixed length, ordered collections of values of the same type
       */

       // Declare and instantiate an array of integers on one line
       int[] numbers = { 5, 2, 1, 18, 15 };
       
       // Declare and instantiate an array of strings on different lines
       // Must use the "new" operator in this case
       string[] colors;
       colors = new string[] { "blue", "red", "green" };

       // We can also initialize an empty array of any size
       // It will contain default values (0 for numeric values and null for reference types)
       int[] emptyArray = new int[3]; // [0, 0, 0]

       // The size of an array can be retrieved with the .Length property
       int numbersSize = numbers.Length; // 5
       int colorsSize = colors.Length; // 3

       // Array elements can be accessed by their index with bracket notation
       // Index values range from 0 to length - 1
       int thirdNumber = numbers[2]; // 6
       int secondColor = colors[1]; // "red"

       // Array elements can also be modified by their index
       numbers[1] = 16; // numbers is now [5, 16, 1, 18, 15]
       colors[2] = "yellow"; // colors is now ["blue", "red", "yellow"]

       /*
        * Built-in array methods:
        * Array.Sort() - sorts the values in an array
        * Array.IndexOf() - returns the index of a specific value in the array
        * Array.Find() - returns the first occurrence of a specific value in the array
        * More methods: https://learn.microsoft.com/en-us/dotnet/api/system.array?view=net-7.0
        */

        int[] sortedNumbers = Array.Sort(numbers); // [1, 5, 15, 16, 18]
        int indexOf15 = Array.IndexOf(numbers, 15); // 2
        int greaterThan10 = Array.Find(numbers, (int num) => num > 10); // 15

    }
  }
}