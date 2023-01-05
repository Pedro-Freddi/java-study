using System;

namespace variables
{
  class Program
  {
    static void Main(string[] args)
    {
      /*
       * Variables in C# are strongly typed
       * Implicit conversion is allowed when it won't cause data loss 
       */

      // Numeric built-in value types
      byte oneByte = 128; // 1 byte; 0 to 255
      short shortNum = 2048; // 2 bytes; -32768 to 32768
      int integer = 15252; // 4 bytes; -2,147,483,648 to 2,147,483,647
      long longNum = 15855846844545487L; // 8 bytes; 	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
      float floatNum = 12.25f; // 4 bytes; ±1.5 x 10^−45 to ±3.4 x 10^38 (~6-9 digits precision)
      double doubleNum = 68765.85456456d; // 8 bytes; ±5.0 × 10^−324 to ±1.7 × 10^308 (~15-17 digits precision)
      decimal decimalNum = 58.9855548684642m; // 16 bytes; ±1.0 x 10^-28 to ±7.9228 x 10^28 (~28-29 digits precision)

      // Char built-in value type
      char singleChar = 'p'; // 2 bytes

      // Built-in reference types
      string stringExample = "This is a string";
      object obj = stringExample;

      // Boolean type
      bool booleanExample = true; // 1 byte

      // DateTime type
      DateTime date = new DateTime();

    }
  }
}