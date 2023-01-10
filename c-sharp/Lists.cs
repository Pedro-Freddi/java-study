using System;
using System.Collections.Generic;

namespace lists
{
  class Program
  {
    static void Main(string[] args)
    {
      /*
       * A list is an ordered data structure, similar to an array. Unlike arrays, though, lists don't have a fixed length.
       * Lists can hold elements of any data type and they have built-in methods to manipulate its elements.
       * Lists in C# are indexed, so adding and removing elements to the middle of a list causes index shifts.
       * Trying to access an index larger than the length of a list (or negative indexes) will cause an exception.
       */

       // Instantiating a list of strings with object initialization
       List<string> animals = new List<string> { "dog", "cat", "fish" };
       // Another way would be:
       // List<string> animals = new List<string>(); --> initializes an empty list

       // Adding elements to a list
       animals.Add("bird"); // A single element
       animals.AddRange(new string[] { "bat", "cow", "pig" }); // Multiple elements at once

       // Checking the length of a list
       Console.WriteLine(animals.Count); // 7
       
       // Removing elements from a list
       animals.Remove("fish"); // returns True if the element was removed

       // Checking if a value is in the list
       Console.WriteLine(animals.Contains("pig")); // True

       // Elements can be accessed and reassigned by their index
       string firstAnimal = animals[0]; // "dog"
       animals[1] = "dolphin";

       // Iterating through the list
       foreach (string animal in animals)
       {
        Console.WriteLine(animal);
       }

       // Clearing the list
       animals.Clear();
       Console.WriteLine($"List count: {animals.Count}");

       // Other useful methods: .InsertRange(), .RemoveRange(), .GetRange(), .Reverse(), .Sort();
       // Documentation: https://learn.microsoft.com/en-us/dotnet/api/system.collections.generic.list-1?view=net-7.0 

    }
  }
}