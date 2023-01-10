package com.example.action.ch02

/**
 * fun: 함수 선언시 사용
 * parameters: 파라미터 명칭 다음에 타입을 기입
 * function: 함수를 반드시 클래스안에 넣지 않아도 동작
 * semicolon: 세미콜론을 붙이지 않아도 됨
 */
fun main(args: Array<String>) {
    println("Hello! World")

    //print maxConvertToBlockBody function
    println(maxConvertToBlockBody(1, 2))

    //print maxConvertToExpressionBody function
    println(maxConvertToExpressionBody(3, 4))
}

/**
 * 식이 블럭인 함수
 * 반환 타입을 명시하고, return문으로 값을 반환해야 함
 */
fun maxConvertToBlockBody(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/**
 * 식이 본문인 함수
 * 반환 타입 생략가능
 * 컴파일러가 타입을 분석하여 구성요소의 타입을 정해주는 '타입추론' 형태
 */
fun maxConvertToExpressionBody(a: Int, b: Int) = if (a > b) a else b

/**
 * 변수
 */
fun variable() {
    val question = "삶, 우주, 그리고 모든 것에 대한 궁긍적인 질문"
    val answer = 42
    val answerType: Int = 42
    val yearsToCompute = 7.5e6

    // answerType = 24 >> ERROR!!

    //val는 반드시 한번만 초기화 되어야 한다! 불변
    val message: String
    message = if(true) {
        "TRUE"
    } else {
        "FALSE"
    }

    //val 객체 내부값은 변경될 수 있다!
    val langs = arrayListOf("Java")
    langs.add("Kotlin")



}