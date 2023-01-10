using System;

namespace strings
{
  class Program
  {
    static void Main(string[] args)
    {
      /*
       * Strings are sequences of characters.
       *
       * They are technically a reference type, but their behavior reminds that of value types:
       * - String references point to the original object because they are immutable.
       * - Comparing strings with the equality operator (==) performs a value, not a referential, comparison.
       *
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

       // Example of string's behavior of value type. Strings are immutable objects.
       string s1 = "dog";
       string s2 = s1;
       s1 = "cat";
       Console.WriteLine(s1); // "cat"
       Console.WriteLine(s2); // "dog"

       // String value comparison
       string s3 = "bee";
       string s4 = "bee";
       Console.WriteLine(s3 == s4); // True

       // Strings can be unassigned, null or empty
       string s5; // Unassigned
       string s6 = null; // Null string
       string s7 = ""; // Empty string
       string s8 = String.Empty; // Also an empty string
       
       // There is a static string method from the String class to check for null or empty string
       Console.WriteLine(String.IsNullOrEmpty(s6)); // True
       Console.WriteLine(String.IsNullOrEmpty(s7)); // True
       Console.WriteLine(String.IsNullOrEmpty(s8)); // True
    }
  }
}