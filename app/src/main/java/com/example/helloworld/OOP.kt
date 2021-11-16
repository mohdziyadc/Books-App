 package com.example.helloworld

//fun main(){
//   var car1 = Car("Mercedes", "ClA 45s")  //Object Creation in Kotlin
//   var m1 = MobilePhone("iOS","Apple","iPhone 12")
//   m1.chargeBattery(30)
//
//
//}
//
//class Car(name:String, model:String){
//    var year: Int? = null  //initialized to null
//    var cname: String? = null
//    private var c2 = "BMW"  //getters and setters for this var is private
//
//    init{
//    /*
//    init is imp to intialize the values, i.e,
//    if the code given below is not in an init block
//    it will throw an error. init automatically
//    uses the value from main function to intialize
//     */
//    /*
//    I cannot write name ="anything" in the class. It takes the value of name
//    as argument only from the main function.
//     */
//        this.cname = name;
//        println("$name $model")
//    }
//    //Secondary Constructor
//    constructor(name:String, model:String, year: Int):this(name, model){  //this() is used to send the parameters from the primary constructor
//        this.year = year
//                                                    //ig init is allowed in primary constructor only
//    }
//   fun myCar(){
//
//       println("$cname is $year years old")
//   }
//}
//
//
//class MobilePhone(osName:String, brand:String, model:String){ //Need to explicitly declare the variable type in the constructor
//    init{
//        println("OS =$osName \nbrand =$brand \nmodel = $model")
//    }
//
//    var battery = 21
//    fun chargeBattery(x:Int){
//        var charged = battery +x
//        println("Before charging: $battery \nCharge now: $charged \nHow much?: $x")
//    }
//}

//Inheritance



// Inheritance is one of the main concepts of
// Object Oriented Programming (OOP).
///It allows a class to inherit features
//(properties and methods) from another class and reuse them.
// The class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class , and the class whose features are
// inherited is called the Super class or Parent class
// or Base class.
// All the classes in Kotlin inherit from a class called Any. It corresponds to the Object class in Java.
// Every class that you create in Kotlin implicitly
// inherits from Any -

 class Person // Implicitly inherits from the default Parent class - Any
// The Any class contains three methods toString(),
// equals() and hashCode().
// All classes in Kotlin inherit these three methods
// from Any, and can override them in order to
// provide their own implementation.

 // Base class (Super class)
 open class Vehicle {
 }

/* Derived class (Sub class)
class Car: Vehicle() {
}
*/

// notice the keyword open. All classes in
// Kotlin are final by default (non-inheritable),
// so you need to use the open Keyword to make a
// class inheritable

/* Parent class
open class Car(val name: String,
               val brand: String) {
}*/

/* Child class (initializes the parent class)
class ElectricCar(name: String,
                  brand: String,
                  val batteryLife: Double) : Car(name, brand) {

}

// In case there is no primary Constructor
class ElectricCar : Car {
    val batteryLife: Double

    // Calls super() to initialize the Parent class
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }

    // Calls another constructor (which calls super())
    constructor(name: String, brand: String): this(name, brand, 0.0) {

    }
}

 */

//-------------------------------------
 /**
  * You can edit, run, and share this code.
  * play.kotlinlang.org
  */



 fun main(args: Array<String>){
    val a= ArrayList<Double>()
    var sum: Double =0.0
     a.add(2.3)
     a.add(5.6)
     a.add(6.5)
     a.add(7.2)
     a.add(3.14)
     for(i in a){
         sum += i
     }
     var avg = sum/a.size
     println(avg)
     val product = {a:Int, b:Int -> println(a*b)}
     product(10,69)


 }



