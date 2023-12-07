package com.oscarcode10.exercisebank

class User(var name: String, var email: String, var pswd: String, var balanceAccount: Float) {
    fun show():String{
        return "Usuario $name"
    }

    fun login():String{
        if(email=="osca@a.a" && pswd=="123"){
            return "Puede ingresar"
        } else{
            return "No puede ingresar"
        }
    }

    fun consign(value:Float){
        this.balanceAccount += value
    }

    fun withdrawals(value:Float){
        this.balanceAccount -= value
    }

    fun seeBalance(): String {
        return "$name, su saldo es $balanceAccount"
    }
}