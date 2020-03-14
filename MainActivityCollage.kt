package com.example.collageapplication

import java.lang.Exception

val collageData = CollageDetails()
val studentData = StudentDetails()

fun main() {
    var choice:Int

    try {
        loop@ while (true){

            println("1. Add collage detail")
            println("2. Add student detail")
            println("3. Search")
            println("4. Exit")

            println("Enter your choice")
            choice = readLine()!!.toInt()

            when(choice){
                1->{
                    collageData.addCollage()
                    collageData.displayCollage()
                }
                2->{
                    studentData.addStudent()
                    studentData.displaySTudent()
                }
                3->{
                    searchFunction()
                }
                4->{
                    break@loop
                }
            }
        }

    }catch (e:Exception){
        println(" Please enter valid number ")
    }
}

fun searchFunction(){
    var choice:Int

    try {

        loop@ while (true){
            println("1. Search by name")
            println("2. Search by enrolment")
            println("3. Search by stream")
            println("4. Search by eligibility")
            println("5. Exit")

            println("Enter your choice")
            choice = readLine()!!.toInt()

            when(choice){
                1->{
                    studentData.searchByName()
                }
                2->{
                    studentData.searchByEnrolment()
                }
                3->{
                    studentData.searchByStream()
                }
                4->{
                    studentData.searchByEligibility()
                }
                5->{
                    break@loop
                }
            }
        }

    }catch (e:Exception){
        println(" Please enter valid number ")
    }
}