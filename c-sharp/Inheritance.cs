using System;

namespace inheritance
{
  /*
   * Inheritance is the ability of a class to inherit members of another class.
   * It provides a way to reduce code duplication and organize the hierarchy of classes.
   * Nomenclature: a subclass (or derived class) inherits from a superclass (or base class).
   * Each class can only inherit from one class.
   * Abstract classes cannot be instantiated.
   * We can restrict access to a superclass and its subclasses using the 'protected' access modifier.
   */
   public abstract class Person
   {
    public string Name 
    { get; protected set; }

    public int Age
    { get; protected set; }

    public Person(string name, int age)
    {
      this.Name = name;
      this.Age = age;
    }

    public void HaveBirthday()
    {
      this.Age++;
    }

    // Define a method with the 'virtual' keywork so that subclasses can override it if they need to
    public virtual void SayName()
    {
      Console.WriteLine($"My name is {this.Name}.");
    }

    // Define an abstract method that subclasses must implement
    public abstract void DoWork();

   }

   // Colon syntax is used to declare that a class inherits from another class
   public class Paintor : Person
   {
    public string FavoriteArtist
    { get; private set; }

    // Use colon syntax with base() to access the superclass' constructor
    public Paintor(string name, int age, string favoriteArtist) : base(name, age)
    {
      this.FavoriteArtist = favoriteArtist;
    }

    // Use the 'override' keyword to declare that we're overriding a method of the superclass
    public override void SayName()
    {
      Console.WriteLine($"Hi there! My name is {this.Name} and I'm a paintor.");
    }

    public override void DoWork()
    {
      Console.WriteLine("Painting... painting...");
    }
    
   }
}