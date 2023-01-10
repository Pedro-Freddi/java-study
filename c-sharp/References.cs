using System;

namespace references
{
  class Program
  {
    static void Main(string[] args)
    {
      /*
       * Data types in C# can be value types or reference types.
       * Variables of value types store the actual value in memory. E.g. int, bool, char, etc.
       * Variables of reference types store a reference (a memory location address) that points
       * to the actual object in memory. E.g. classes, interfaces, etc.
       */

       // Comparing variables of value types with the equality operator
       int a = 10;
       int b = 10;
       Console.WriteLine(a == b); // True

       // Comparing variables of reference types with the equality operator
       Animal a1 = new Animal("Steve");
       Animal a2 = new Animal("Steve");
       Console.WriteLine(a1 == a2); // False
       // Referential comparison actually compares the memory location addresses, not the objects

       // Assigning multiple references to the same reference type
       Animal a3 = a1;
       Console.WriteLine(a3 == a1); // True
       // Variables a1 and a3 point to the same object in memory
       a3.Name = "Spot";
       Console.WriteLine(a1.Name); // Prints "Spot"
       Console.WriteLine(a3.Name); // Prints "Spot"

       // Referring to a subclass using a superclass type
       // This is an example of Polymorphism, a concept of object oriented programming
       // Polymorphism is the ability to present the same interface for differing data types
       Animal dog = new Dog("Beethoven", 5);
       dog.MakeNoise(); // Prints "I say Au Au" -> MakeNoise() was overriden in Dog class
       // Methods available are determined by the reference type, not the object itself
       // dog.Bark(); --> This would cause an error because the Animal class does not have a Bark() method


       // Null and Unassigned references
       Animal anotherDog = null; // this is a null reference, an empty value
       Animal yetAnotherDog; // this is an unassigned reference, a variable that was not set to any value
       Console.WriteLine(anotherDog == null); // True
       // Console.WriteLine(yetAnotherDog == null); Error --> use of an unassigned variable

       /*
        * The Object Class
        * All classes inherit from the Object class and thus can be stored in a variable with the Object
        * reference type. This also means that every class has access to members of the Object class,
        * like the .Equals() and .ToString() methods. These can be overriden as well.
        */
        Object o1 = a1;
        Object o2 = a;
        Console.WriteLine(a.Equals(b)); // True
        Console.WriteLine(a1.Equals(a3)); // True
        Console.WriteLine(o1.Equals(a3)); // True
    }

    class Animal
    {
      public string Name
      { get; set; }

      public Animal(string name)
      {
        this.Name = name;
      }

      public virtual void MakeNoise()
      {
        Console.WriteLine("What noise do I even make?");
      }
    }

    class Dog : Animal
    {
      public int Age
      { get; set; }

      public Dog(string name, int age = 1) : base(name)
      {
        this.Age = age;
      }

      public override void MakeNoise()
      {
        Console.WriteLine("I say Au Au");
      }

      public void Bark()
      {
        Console.WriteLine("Au Au Au");
      }
    }
  }
}