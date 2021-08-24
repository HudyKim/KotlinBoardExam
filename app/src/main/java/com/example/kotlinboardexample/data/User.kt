package com.example.kotlinboardexample.data

// Data class must have at least one primary constructor parameter
data class User(val id: String, val password: String, var name: String, var phone: Int){
    // lateinit: 나중에 초기화 해주겠다.
//    lateinit var password: String
//    lateinit var name: String
    // 기본 자료형은 lateinit 불가
//    var phone: Int = 0
    var token: Int = 0
    var push_word: String? = null
    // ????? 생성자에 존재하지 않는 프로퍼티에 값 어떻게 넣는지 보자
    // ????? Gson 사용이 자동으로 되는건가 보자

    // 이 후에 다른 data 클래스들 생성해주자. 확실하지 않으니.

}
