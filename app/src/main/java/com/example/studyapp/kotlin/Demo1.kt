package com.example.studyapp.kotlin

class Demo1 {


}

class Base {

    class InnerClass

}

typealias BaseInner = Base.InnerClass
fun main(){
    val msg :String = "Hello World"
    println( msg)

    val baseInner1 = Base.InnerClass()
    val baseInner2 = BaseInner()
    println(baseInner1.javaClass) //class test2.Base$InnerClass
    println(baseInner2.javaClass) //class test2.Base$InnerClass

    val str = "leavesC"
    println(str[1])
    for (c in str) {
        println(c)
    }
    val str1 = str + " hello"
    val intValue = 100
    //可以直接包含变量
    println("intValue value is $intValue") //intValue value is 100
    //也可以包含表达式
    println("(intValue + 100) value is ${intValue + 100}")   //(intValue + 100) value is 200
    val price = "${'$'}100.99"
    println(price)  //$100.99

    //包含给定元素的字符串数组
    val array1 = arrayOf("leavesC", "叶", "https://github.com/leavesC")

    array1[0] = "leavesC"
    println(array1[1])
    println(array1.size)

    //初始元素均为 null ，大小为 10 的字符数组
    val array2 = arrayOfNulls<String>(10)

    //创建从 “a” 到 “z” 的字符串数组
    val array3 = Array(26) { i -> ('a' + i).toString() }

    val any: Any = 100
    println(any.javaClass) //class java.lang.Integer
    val any1: Any? = null

    fun check(): Unit {

    }
    fun check1(){

    }
    val user = User("leavesC")
    val name = user.name ?: fail("no name")
    println(name) //leavesC

//    val user1 = User(null)
//    val name1 = user1.name ?: fail("no name")
//    println(name1.length) //IllegalStateException

    compute("","124")

    val names = arrayOf("leavesC", "leavesc", "叶")
    compute(* names)


    val a=10
    for (i in 0..a step 2){
        println(i)
    }


    1       //字面表达式，返回 1

//    ++1     //也属于表达式，自增会返回 2

    //与 Java 不同，kotlin 中的 if 是作为表达式存在的，其可以拥有返回值
    fun getLength(str: String?): Int {
        return if (str.isNullOrBlank()) 0 else str.length
    }

    val value = 2
    when (value) {
        in 4..9 -> println("in 4..9") //区间判断
        3 -> println("value is 3")    //相等性判断
        2, 6 -> println("value is 2 or 6")    //多值相等性判断
        is Int -> println("is Int")   //类型判断
        else -> println("else")       //如果以上条件都不满足，则执行 else
    }

    val list = listOf(1, 4, 10, 34, 10)
    for (value in list) {
        println(value)
    }
    val items = listOf("H", "e", "l", "l", "o")

    for (index in items.indices){
        println("${index}对应的值：${items[index]}")
    }

    for ((index,value) in items.withIndex()){
        println("index ；$index,value :$value")
    }

    fun5()

    for (index in 0 until 4){
        println(index)
    }

    items.isNullOrEmpty()

}
fun fun5() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) {
            //局部返回到匿名函数的调用者，即 forEach 循环
            return
        }
        println("value is $value")
    })
    println("function end")



}
data class User(val name: String?)

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}


//fun compute(age: Int, name: String = "leavesC") {
//
//}

//fun compute(name: String = "leavesC", age: Int, value: Int = 100) {}
//fun main() {


fun compute(vararg name: String){
    name.forEach { println(it) }
}

//fun compute(name: String, country: String) {
//    fun check(string: String) {
//        if (string.isEmpty()) {
//            throw IllegalArgumentException("参数错误")
//        }
//    }
//    check(name)
//    check(country)
//
//}
//}