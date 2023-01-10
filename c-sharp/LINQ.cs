using System;
using System.Linq;
using System.Collections.Generic;

namespace linq
{
  class Program
  {
    static void Main(string[] args)
    {
      /* LINQ stand for Language-Integrated Query.
       * LINQ is a set of language and framework features for writing structured, type-safe queries over local object collections and remote data sources.
       * It's centered on the concept of queries, the set of commands used to access and manipulate data.
       * LINQ queries return either a single value or an object of type IEnumerable<T>.
       */

       string[] animals = { "dog", "cat", "elephant", "crocodile", "fish" };

       // LINQ query syntax; from, where and select are called operators
       var shortAnimals = from n in animals
                          where n.Length < 5
                          select n;

       foreach (var animal in shortAnimals)
       {
         Console.WriteLine(animal); // dog, cat, fish
       }

       Console.WriteLine(shortAnimals.Count()); // 3

       // LINQ method syntax; Where() and Select() are called methods
       var longLoudAnimals = animals
                             .Where(n => n.Length > 5)
                             .Select(n => n.ToUpper());

       foreach (var animal in longLoudAnimals)
       {
         Console.WriteLine(animal); // ELEPHANT, CROCODILE
       }

       Console.WriteLine(longLoudAnimals.Count()); // 2
    }
  }
}