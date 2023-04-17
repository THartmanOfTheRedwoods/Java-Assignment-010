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
// 1. class name = Student
class Student{
    
    // 2. instance variables- a string called 'name' and an integer called 'rollNo'
    private String name;
    private int rollNo;
   
    // 3. This is the Constructor with params s (string) and r (int)
    Student(String s, int r)
    {
   	    name = s;
   	    rollNo = r;
    }
   
    // 6a. All the instance methods for the class **Student**
    void methodForDisplay()
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }
    
    // 4. Where a **Student** object gets created.
  // 5. Where the **instance variables** value gets set, "name" : "Rambo", "rollNo" : 21
  // 6b. All the instance methods for the class **Student**
    public static void main(String[] args) {
        Student obj1=new Student("Rambo",21);
        obj1.methodForDisplay();
    }
}
```

## Part 2 - Public VS Static

* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.
  * a static method is a method where you don't have instance variables. Non-static (and public) methods do have instance variables. The use cases may vary, for instance if you have a method that is going to be used in the same context and most information will not change to be able to run it (other than arguments)-- you would probably go with a static method. But if you have a method that needs to change some information depending on the specific object, then you would use a non-static public method with instance variables. 

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
