using System;

namespace interfaces
{
  /*
   * Interfaces define a contract of values and functionality that a class must implement.
   * They're useful to guarantee certain functionality across multiple classes.
   * Interfaces can define properties and methods required in a class, but not fields and constructors.
   * A class can implement multiple interfaces.
   */

   // An interface is declared with the 'interface' keyword and it's a convention to start its name with an 'I'
   interface IAnimal
   {
    // Properties
    string Name { get; }
    int Age { get; }
    double Weight { get; }
    bool IsReptile { get; }

    // Methods
    void MakeNoise();
    void Breathe();
   }

   // A class can declare that implements the interface with the colon syntax
   class Dog : IAnimal
   {
    // Must contain at least the properties and methods defined by the interface
    public string Name
    { get; }

    public int Age
    { get; }

    public double Weight
    { get; }

    public bool IsReptile
    { get; }

    public void MakeNoise()
    {
      Console.WriteLine("Mmmmmph... Mmmmmph...");
    }

    public void Breathe()
    {
      Console.WriteLine("Breathing in... Breathing out...");
    }

    // Can contain any other class members
    public Dog(string name, int age, double weight, bool isReptile)
    {
      this.Name = name;
      this.Age = age;
      this.Weight = weight;
      this.IsReptile = isReptile;
    }

    public void Bark()
    {
      Console.WriteLine("AU AU AU AU AU AU");
    }
   }
}