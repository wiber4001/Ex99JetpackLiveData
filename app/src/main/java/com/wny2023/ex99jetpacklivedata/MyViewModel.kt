package com.wny2023.ex99jetpacklivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyViewModel {
    //LiveData : ObservableXXX와 다르게 라이프사이클에 따라 효율적으로 UI갱신
    val name:MutableLiveData<String> = MutableLiveData("song") //Observable처럼 초기화가능
    val age:MutableLiveData<Int> =MutableLiveData(20)

    //1.1 데이터변경 콜백메소드
    fun changeName(){
        name.value="Robin" //setValue에 해당됨 :코틀린의 속성 property는 자체적으로 get/set을 포함함
        //ObservableXXX와 다르게 값을 변경해도 자동 갱신하지 않음
        //자동 갱신 방법 2가지
        //1. LiveData 변수를 관찰하는 observe()메소드를 통해서 관찰 및 UI갱신
        

    }

}