using System;

namespace strings
{
  class Program
  {
    static void Main(string[] args)
    {
      /*
       * Strings are sequences of characters

       * They have built-in methods such as:
       * .ToUpper() - converts all characters to uppercase
       * .ToLower() - converts all characters to lowercase
       * .IndexOf() - finds the index of a specified character or substring
       * .Substring() - retrieves part of a string starting on the specified index
       */

       string message = "Hello there";

       string scream = message.ToUpper(); // "HELLO THERE"
       string whisper = message.ToLower(); // "hello there"
       int index = message.IndexOf('o'); // 4
       string hello = message.Substring(0, 5); // "Hello"

       // The length of a string can be retrieved with the .Length property
       int length = message.Length; // 11

       // String concatenation can be performed with the '+' operator
       string anotherMessage = message + "! It's nice to meet you.";
       // or with string interpolation
       string interpolation = $"{message}! It's nice to meet you.";

       // Individual characters of a string can be accessed with bracket notation
       char firstChar = message[0]; // 'H'
       
    }
  }
}