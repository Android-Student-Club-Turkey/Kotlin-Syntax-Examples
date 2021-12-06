package com.serkanalc.kotlinlesson

import java.util.*

fun main(){

    var randomNumber=(1..100).random()
    var heart = 5
    println("The game is easy, ı chose a number between 1 and 100 for you to guess. You have 5 hearts. \nIf you guess right before your hearts are gone, you win. If you don't I win\n")

    while(true){

        var entry = Scanner(System.`in`)
        print("Enter your guess: ")
        var entryNumber= entry.nextInt()


        if(heart==1){
            println("Your hearts are gone :( \nif you're wondering, the number I chose $randomNumber \nGame Over!")
            break
        }
        else{
            if(entryNumber==randomNumber){
                println("Congrats, your guess is right!")
                break
            }
            else{
                if(entryNumber<randomNumber){
                    println("Not right, guess a higher number")
                    heart-=1
                    println("Your remaining heart = $heart  \n")
                    continue
                }
                else if(entryNumber>randomNumber){
                    println("Not right, guess a lower number")
                    heart-=1
                    println("Your remaining heart = $heart  \n")
                    continue
                }
            }
        }
    }
}
