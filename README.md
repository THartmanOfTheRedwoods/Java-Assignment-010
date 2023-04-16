# Java-Assignment-010 - Classes and Objects

## Part 1 - Analyze
* Add Comments to the Code below and label the following:
  1. Class name
  2. All **instance variables/fields** and their data-types
  3. The **Constructor** and the **Constructor Parameters**
  4. Where a **Student** object gets created.
  5. Where the **instance variables** value gets set and what its values are.
  6. All the instance methods for the class **Student**

```java
class Student{  //Class name Student
  private String name;  //instance variable
  private int rollNo;   //instance variable

  Student(String s, int r)  //constructor Student which requires the parameters of a string and an int to run
  {
    name = s;  //instance variable instantiation
    rollNo = r; //instance variable instantiation
  }

  void methodForDisplay()   //Method to display the instance variables
  {
    System.out.println(name+"'s Roll No: "+rollNo); //prints to terminal
  }

  public static void main(String[] args) { //main method
    Student obj1=new Student("Rambo",21);  //new object of Student is created
    obj1.methodForDisplay();  //calls on display method to display the newly created objects and new values of the instance variables
  }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.
* Static methods are methods that have a designated spot in the memory of a program. They dont require the creation of a new object to function, and are considered to be easily debuggable.
* Public methods are methods that require a new object to function. If you want to call a nonstatic method in the static main method, you must create a new object to allocate a new space for the memory of the variables/method so the program 'knows' where to look for the values and commands.
* My previous answers could be wrong in the reference to the location of memory, but in short, you cannot call a non static method in the main static method. You would first need to create a new object to be able to do so. I found this out in a very long term round about way that was frustrating at first.

## Part 3 - Dogs

* View the image below, and from the image, construct a Java file **Dog** that mirrors the diagrammed class and the 3 dog objects.
![Dog Class](images/ClassVSObject.png)

* Your class should be named **Dog**
* You should have **private** instance variables/fields for all the data members.
* You should have a **constructor** that sets the initial state of the data members via passed parameters.
    * Think about what data-types the fields and parameters will need!!!
* You should have 4 instance methods for eat, run, sleep, and name
* You should have a **main** method that creates the 3 Dog objects in the diagram.
* Make at least 2 of your methods functional (i.e. perform some action)!!!
    * For Example: method eat might take a class parameter named **Food** (i.e. another class) that has a field **weight**, and your eat method might reduce the weight in **Food**.

## Part 4 - Turn-In

* Commit your code and push it back to your account.
* Create a Pull request as you have been doing for all assignments.
* Paste the Pull request URL back into the Canvass assignment page for credit.
