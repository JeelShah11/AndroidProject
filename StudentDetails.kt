package com.example.collageapplication

class StudentDetails() :CollageDetails(){

    var studentEnrolment=0
    var studentName = ""
    var studentSpi = 0.0
    var studentStream = ""
    var studentArrayList = ArrayList<StudentDetails>()
    var addStudentStream = ""
    var studentSpiData=0.0

    constructor(studentEnrolment:Int,studentName:String,studentSpi:Double,studentStream:String):this()
    {
        this.studentEnrolment=studentEnrolment
        this.studentName = studentName
        this.studentSpi = studentSpi
        this.studentStream = studentStream
    }

    fun addStudent(){

        collageData.collageDetailArrayList.forEach {
            println(it.collageName)
        }

        println("Enter collage name :- ")
        val clgName = readLine().toString()

        for (x in collageData.collageDetailArrayList){
            if (clgName == x.collageName){

                println("Enter student enrolment :- ")
                val studentEnrolment = readLine()!!.toInt()

                println("Enter student name :- ")
                val studentName = readLine().toString()

                println("Enter student Spi :- ")
                val studentSpi = readLine()!!.toDouble()

                if (studentSpi in 1.0..10.0){
                    studentSpiData = studentSpi
                }
                else{
                    println("enter studentSpi between 1 to 10")
                    break
                }

                println("Streams are :- ")
                println("1. Bca")
                println("2. Mca")
                println("3. Be")

                println("Enter your stream number:- ")
                val stream = readLine()!!.toInt()

                addStudentStream = when(stream){
                    1->{
                        "Bca"
                    }
                    2->{
                        "Mca"
                    }
                    3->{
                        "Be"
                    }
                    else->{
                        "Bca"
                    }
                }

                if (studentSpiData == 0.0)
                {
                    break
                }
                else{
                    studentArrayList.add(StudentDetails(studentEnrolment,studentName,studentSpi,addStudentStream))
                }
            }
        }
    }

    fun displaySTudent(){
        studentArrayList.forEach {
            println("Enrolment Number :- " + it.studentEnrolment + " Name :- " + it.studentName +" Spi :- " +it.studentSpi +" Stream :- " + it.studentStream)
        }
    }

    fun searchByName(){

        println("Enter your name :- ")
        val name = readLine().toString()

        for (x in studentArrayList){
            if (name.equals(x.studentName)){
                println("Enrolment Number :- " + x.studentEnrolment + " Name :- " + x.studentName +" Spi :- " +x.studentSpi +" Stream :- " + x.studentStream)

            }
            else{
                println("$name is not in the list")
            }
        }
    }

    fun searchByEnrolment(){

        println("Enter your enrolment :- ")
        val enrolment = readLine()!!.toInt()

        for (x in studentArrayList){
            if (enrolment.equals(x.studentEnrolment)){
                println("Enrolment Number :- " + x.studentEnrolment + " Name :- " + x.studentName +" Spi :- " +x.studentSpi +" Stream :- " + x.studentStream)

            }
            else{
                println("$enrolment is not in the list")
            }
        }
    }

    fun searchByStream(){
        println("Enter your stream :- ")
        val stream = readLine()!!.toString()

        for (x in studentArrayList){
            if (stream.equals(x.studentStream)){
                println("Enrolment Number :- " + x.studentEnrolment + " Name :- " + x.studentName +" Spi :- " +x.studentSpi +" Stream :- " + x.studentStream)

            }
            else{
                println("$stream is not in the list")
            }
        }
    }

    fun searchByEligibility(){
        var choice:Int

        loop@ while (true){
            println("1. less then 5 spi list")
            println("2. grater then 6 and less then 7 spi list")
            println("3. grater then 7 spi list")
            println("4. Exit")

            println("enter your choice")
            choice = readLine()!!.toInt()

            when(choice){
                1->{
                    for (x in studentArrayList){
                        if (x.studentSpi in 1.0..5.0){
                            println("Enrolment Number :- " + x.studentEnrolment + " Name :- " + x.studentName +" Spi :- " +x.studentSpi +" Stream :- " + x.studentStream)
                        }
                    }
                }
                2->{
                    for (x in studentArrayList){
                        if (x.studentSpi in 5.1..7.0){
                            println("Enrolment Number :- " + x.studentEnrolment + " Name :- " + x.studentName +" Spi :- " +x.studentSpi +" Stream :- " + x.studentStream)
                        }
                    }
                }
                3->{
                    for (x in studentArrayList){
                        if (x.studentSpi in 7.0..10.0){
                            println("Enrolment Number :- " + x.studentEnrolment + " Name :- " + x.studentName +" Spi :- " +x.studentSpi +" Stream :- " + x.studentStream)
                        }
                    }
                }
                4->{
                    break@loop
                }
            }
        }
    }
}