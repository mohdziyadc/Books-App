package com.example.helloworld

fun main(){
    println("hello world")
    println("y tf is this so slow?")
    
    var age= 23
    when(age){

        in 13..17 -> println("you may drive now")
         18,21 -> println("vote bitch")
        !in 0..20 -> println("i watched u grow") // if the age is not in the range 0 to 20 it will execute this
        else -> {
            println("go die")
        }
    }
    /* for incrementing in a for loop
       .. can be used but to decrement downTo
       keyword must be used  and to decrement or
       decrement by n number of steps use step keyword*/
    for(i in 10 until 1 step 3){
        println(i)
    }
   var avg = avg(6.0,13.0)
    println(avg)

    var name: String= "Ziyad"
//    name = null //Compilation error
    var myname:String? = "Ziyad" //nullable--> can be intialized to null
//    myname = null //No scene

    //?: is the Elvis operator
    val name1 = myname ?: "Mwonjan" //if myname is null use "Mwonjan" otherwise use the value of myname
    println(name1)

    // !! - not null assertion--> what it does is convert a nullable type to non null type and throws a null pointer exception is the nullable type holds a null value
    println(myname!!.toLowerCase())

    //?. -> Safe call operator
    /* It performs a null check and also a
        method call in a single expression
    */
}

fun avg(a: Double, b:Double): Double{   //the : Int after the bracket signifies the return value
    return (a+b)/2
}
//Method is a function defined in a class