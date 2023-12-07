package com.oscarcode10.exercisebank

class ATM {
    val oscar: User = User("oscar", "osca@a.a", "123", 0f)

    fun consign10(){
        oscar.consign(10000f)
    }

    fun withdrawals10(){
        oscar.withdrawals(10000f)
    }

    fun totalBalance(): String{
        return "${oscar.seeBalance()}"
    }
}