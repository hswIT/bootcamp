# bootcamp

## sub-heading

### Week 1 Day 2
- Primitive (int, double, ...)
  - Higher/Lower level types
  - Math Operation
  - Comparison Operator

  level priority 
  (byte -> short -> int -> long)
  (float -> double)
  char
  boolean


- String
  - Operator
  - equals(), length(), charAt()
  
- If-else

### Week 4
- For "extends"
  - Attributes in Parent
    - if it is private, CANNOT inherit
    - if it is public, "this" is something like "alias", pointing back to "super"
  
  - Constructors in Parent 
    - Even it is public, CANNOT inherit
    - Instead, child class calls parent constructor by "super"

  - Methods in Parent
    - if it is public, "this" is something like "alias", pointing back to "super"
    - if it is private, child class CANNOT access by "super"
    - Child class can "override" the same method in parent class

- Inheritance
  - Parent Class can hold its own attribute
  - Parent Class itself can create object

- No matter it is individual class or extends, should override the following
  - equals()
  - hashCode()
  - toString()

- Polymorphism (Dynamic Polymorphism)
  - Compile time (Static Polymorphism)
    - The scope of the "reference" is determined by the type of reference, meaning ONLY the methods of the reference type are available
    - when re-assign the object to a lower level type of reference, the object behavior may be different
  - Run-time
    - method implementation belongs to object itself (but not the reference type)

## Java (APIE)
  - Abstract (Interface), Polymorphism, Inheritance, Encapsulation

### Interface (100% Abstraction) vs Inheritance (extends Parent Class)
- Difference
  - No attribute vs have attributes
  - No constructor vs have constructor (have to instantiate via the subclass constructor)
  - Implements >= 1 interface vs Extends ONLY 1 Parent Class
  - Methods are all abstract (before Java 8) vs Methods contain either or both abstract/concrete methods
  - Not support static variables vs Support ...
- Same
  - Support Static Final variables
  - Support Static methods (after Java 8)
  - Support Default/Inherit instance methods (after Java 8)



### REMARKS
- Parent p1 = new Child(); => upcasting, SAFE
- Child c1 = New Parent(); => downcasting, not 100% SAFE, c1(the instance of parent) may lack the properties and method to the Child
  - cannot assign or upcast a Parent object to the Child reference

### Week 5

## Data structure

  - HashMap vs List
    - HashMap.get() by key => for loop list, if value = key, return the object
      - HashMap<String, String> e.g. urlMap (i.e. "AAPL", "www.apple.com")
      - If we want to store more info about the "key" => HashMap<String, Company>
      - Retain key object is wrapper class or String (equals(), hashCode() is ready)
    - HashMap<Customer, List<Transaction>>
      - If key is custom object, be careful of equals() and hashCode() => put(), get()

### Java Terms in Chinese

    Class (類)
    object/instance (物件/實體/對象)
    instance method (實例方法)
    static method (靜態方法)
    interface (接口)
    implements (實現)
    Parent Class (父類)
    Child Class (子類)
    extends (继承)
    Polymorphism (多態)
    static variable (靜態變量)
