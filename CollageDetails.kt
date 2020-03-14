package com.example.collageapplication

open class CollageDetails() :CollageInterface{

    val collageDetailArrayList = ArrayList<Collage>()
    var addStream:String = ""

    override fun addCollage() {
        println("Enter collage name :- ")
        val collageName = readLine().toString()

        println("Streams are :- ")
        println("1. Bca")
        println("2. Mca")
        println("3. Be")

        println("Enter your stream number:- ")
        val stream = readLine()!!.toInt()

        addStream = when(stream){
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

        collageDetailArrayList.add(Collage(collageName, addStream))
    }

    override fun displayCollage() {
        collageDetailArrayList.forEach {
            println("collage name :- "+it.collageName+" Stream :- "+it.stream)
        }
    }
}