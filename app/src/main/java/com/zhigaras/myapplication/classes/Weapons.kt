package com.zhigaras.learnclasses

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
    
}

class Shotgun : Weapon() {
    
    override val ammo: String = "shotgun ammo"
    
}

class Solder(val name: String){
    
    var weapon: Weapon = Pistol()
    
    fun takeNewWeapon(newWeapon: Weapon) {
        weapon = newWeapon
    }
    
    fun shoot() {
        weapon.fire()
    }
}