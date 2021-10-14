package com.example.studyapp.kotlin



    fun main(){
        //基本数据类型
        val intValue_1: Int = 200
        //包装类
        val intValue_2: Int? = intValue_1
        val intValue_3: Int? = intValue_1
        //== 比较的是数值相等性，因此结果是 true
        println(intValue_2 == intValue_3)
        //=== 比较的是引用是否相等，因此结果是 false  100的时候是相等的包装对象的复用问题
        println(intValue_2 === intValue_3)



        val str = "leavesC"
        println(str[1])
        for (c in str) {
            println(c)
        }
        val str1 = str + " hello"
        println(str1)


        val intValue = 100
        //可以直接包含变量
        println("intValue value is $intValue") //intValue value is 100
        //也可以包含表达式
        println("(intValue + 100) value is ${intValue + 100}")   //(intValue + 100) value is 200

        val price = "${'$'}100.99"
        println(price)  //$100.99

        val array1= arrayOf("a","b","c")
//        array1[0]="a";
        println(array1[0])
        println(array1[1])
        println(array1.size)
        val arrayOfNulls = arrayOfNulls<String>(10)


    }
