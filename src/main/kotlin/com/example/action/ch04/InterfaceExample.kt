package com.example.action.ch04

fun main(args: Array<String>) {
    println(Button().click())
    println(Button().showOff())

    val button = ButtonB()
    button.showOff()
    button.setFocus(true)
    button.click()
}

interface Clickable {
    //간단한 interface 선언
    fun click()

    // interface 안에 본문이 있는 메서드 정의
    fun showOff() = println("I'm clickable!!") //default 구현이 있음. 정의를 생략할 수 있음
}

//간단한 interface 구현
class Button : Clickable {
    override fun click() = println("I was Clicked!!")
}

//동일한 method를 구현하는 다른 interface 정의
interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus .")
    fun showOff() = println("I'm focusable!!")
}

//상속한 인터페이스의 메서드 구현 호출
class ButtonB : Clickable, Focusable {
    override fun click() = println("I was clicked!!")

    /*
    주의 !!!!
    The class 'Button' must
    override public open fun showOff() because it inherits
    many implementations of it
     */
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}