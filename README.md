# Java-Assignment-010 - Classes and Objects

## Part 1 - Analyze
* Add Comments to the Code below and label the following:
  1. Class name
  1  Student
  2. All **instance variables/fields** and their data-types
  2  name is a String and rollNo is an int
  3. The **Constructor** and the **Constructor Parameters**
  3  The constructor is Student(String s, int r);
  3  The parameters are in the parenthsis, it takes 2. One is String s and the other is int r. s is the instance variable name and r is the instance variable for rollNo
  4. Where a **Student** object gets created.
  4  In the main method. Student obj1=new Student("Rambo",21);
  5. Where the **instance variables** value gets set and what its values are.
  5  They will get set inside the constructor. name = s, and s is the parameter Student will take, and rollNo = r, the other parameter.
  6. All the instance methods for the class **Student**
  6  void methodForDisplay()

```java
class Student{
    private String name;
    private int rollNo;
   
    Student(String s, int r)
    {
   	    name = s;
   	    rollNo = r;
    }
   
    void methodForDisplay()
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        Student obj1=new Student("Rambo",21);
        obj1.methodForDisplay();
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.
* A public method is accessible from outside a class whereas a static method belongs to the class. A static method can be called without creating an object of the class

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
