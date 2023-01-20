package com.example.action.ch04

fun main(args: Array<String>) {
    //public (default), internal, protected, private
}

interface open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!!")
    protected fun whisper() = println("Let's talk!!")
}

// public이 internal을 노출
fun TalkativeButton.giveSpeech() {
    //ERR! private 멤버로 접근 불가
   // yell()
    //ERR! protected 멤버로 접근 불가
   // whisper()
}

