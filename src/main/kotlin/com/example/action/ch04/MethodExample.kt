package com.example.action.ch04

fun main(args: Array<String>) {

}

// 열린 method를 포함하는 열린 class 정의
open class RichButton: Clickable {
    fun disable() {} //기본 default는 final
    open fun animate() {} //하위 class에서 이 method를 override 해도 됨

    //override fun click() {} //기반 class나 interface override의 경우 기본적으로 open임
    final override fun click() {} //override 금지
}

//추상 class 정의
abstract class Animated {
    abstract fun animate()
    open fun stopAnimating(){}
    fun animateTwice(){}
}

class AA : Animated() {
    override fun animate() = println(" override animate!!")

    override fun stopAnimating() {
        println(" override stopAnimating")
    }
}