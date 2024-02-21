import java.awt.print.Book

fun main() {
 var y= salutation("Alice")
 println(y)
 var x= remainder(num1 = 15, num2 = 30.0)
 println(x)

var z=sum(7667,6776,8877899,8888888)
 println(z)
var s=sentence("Iam a hardworking and understanding individual")
 println(s)




}
 fun  salutation( name :String):String{
  var  greetings="hello" +" "+ name
  return greetings



 } fun remainder(num1:Int,num2:Double):Double{

  var module=num1%num2
 return module

 }
fun sum(numa:Int,numb:Int,numc:Int,numd:Int): Int{
 var addition=numa+numb+numc+numd
 return  addition
}
fun sentence(text:String,):String{
 var statement= text
 return statement
}

