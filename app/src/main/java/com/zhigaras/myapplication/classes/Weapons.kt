package com.zhigaras.myapplication.classes

fun main() {
    
    val pistol = WeaponStore.buyPistol()
    val shotgun = Shotgun()
    
    val solder = Solder("Rocky")
    solder.shoot()
    solder.takeNewWeapon(shotgun)
    solder.shoot()
    
}

//
//abstract class Weapon {
//    abstract val ammo: Ammo
//
//    abstract fun fire()
//}
//
//class Pistol : Weapon() {
//    override val ammo: Ammo = Ammo.PISTOL_AMMO
//
//    override fun fire() {
//        println("pistol is shooting silent")
//    }
//}
//
//class Shotgun : Weapon() {
//    override val ammo: Ammo = Ammo.SHOTGUN_AMMO
//
//    override fun fire() {
//        println("shotgun is shooting loud")
//
//    }
//}
//
//enum class Ammo {
//    PISTOL_AMMO, SHOTGUN_AMMO
//}


abstract class Weapon {
    
    abstract val ammo: String
    fun fire() {
        println("Weapon is shooting $ammo")
    }
}

class Pistol : Weapon() {
    
    override val ammo: String = "pistol ammo"
    
    override fun toString(): String {
        return "Pistol"
    }
}

class Shotgun : Weapon() {
    
    override val ammo: String = "shotgun ammo"
    override fun toString(): String {
        return "Shotgun"
    }
}

class Solder(val name: String) {
    
    private var weapon: Weapon = Pistol()
    
    fun takeNewWeapon(newWeapon: Weapon) {
        weapon = newWeapon
    }
    
    fun shoot() {
        weapon.fire()
    }
    
    override fun toString(): String {
        return "Solder $name, weapon $weapon"
    }
    
    //метод для сравнения двух объектов
    override fun equals(other: Any?): Boolean {
        if (this === other) return true  //сравниваем два объекта по ссылке.
        if (other !is Solder) return false //смотрим, является ли рэмбо2 тоже экземпляром класса Солдат
        
        if (name != other.name) return false
        
        return true
    }
    
    override fun hashCode(): Int {
        return name.hashCode()
    }
}