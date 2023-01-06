using System;

namespace classes
{
  /*
   * A class is used to bundle related data and methods to represent a custom data type.
   * It's a way of implementing the concept of encapsulation from object oriented programming.
   * Classes can have members, such as: fields, properties, methods, constructors and others.
   * Access to members of a class can be defined by the use of access modifiers (public, private, etc.).
   * Objects are unique instances of a class. Each have its own values for fields and properties, as well as
   * access to the methods defined in the body of the class.
   * Static fields, properties, methods, etc. are associated with the class itself and are used to define data   * and methods common to all instances of the class. These are accessed through direct reference to the class.
   */
  public class Person
  {
    // Fields are variables that store data in a class
    private string name;
    private int age;
    
    // Defining a static field
    private static string species;

    // Properties are responsible for defining how fields can be accessed and modified
    public string Name
    {
      get { return name; }
      private set { name = value; }
    }

    public int Age
    {
      get { return age; }
      set
      {
        if (value < 0)
        {
          Console.WriteLine("Invalid age value");
        }
        else
        {
          age = value;
        }
      }
    }

    // Defining a static property
    public static string Species
    {
      get { return species; }
      set { species = value; }
    }

    // Automatic properties can be used to define a field and a property simultaneously
    public string Address
    { get; set; }

    // A constructor is a method used to initialize fields/properties when a class is instantiated
    public Person(string name, int age, string address)
    {
      // 'this' keyword refers to an instance of the class (an object)
      this.Name = name;
      this.Address = address;
      this.Age = age;
    }

    // Constructors can also be overloaded
    public Person(string name, int age)
    {
      this.Name = name;
      this.Age = age;
      this.Address = "Unknown";
    }

    // And overloaded constructors can call another constructor
    public Person() : this("Bob", 35, "123 Main St.")
    {
      Console.WriteLine("Default values set for Person object.");
    }

    // A static constructor is called either when an object of the class is instantiated or
    // when a static member of the class is accessed. Static constructors cannot have access modifiers
    // and run only once per type
    static Person()
    {
      Species = "Homo Sapiens";
    }

    // Methods define custom behavior of a class
    public void SayName()
    {
      Console.WriteLine($"My name is {this.Name}!");
    }

    public void SayFavoriteSport()
    {
      Console.WriteLine("My favorite sport is basketball.");
    }

    // A static method is accessed from the class itself
    public static void SaySpecies()
    {
      Console.WriteLine($"I'm a member of the {Species} species.");
    }
  }

  // We can also define static classes. These cannot be instantiated.
  public static class Toolbox {}
}