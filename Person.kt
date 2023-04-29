@JvmInline
value class Fio (val fio: String)

class Person (val fio: Fio, val age: Int, val floor: String){
    var passport: Passport? = null
    var duties: MutableList<Duty>? = mutableListOf()


    constructor(fio: Fio, age: Int,floor: String, passport: Passport): this(fio,age, floor){
        this.passport = passport
    }

    constructor(fio: Fio, age: Int, floor: String, passport: Passport, duties: MutableList<Duty>): this(fio,age, floor, passport){
        this.duties = duties
    }

    fun addDuty(duty: Duty){
        duties?.add(duty)
    }

    fun deleteDuty(Workposition: String) {
        println("you duty: $Workposition , you removed from this duty:)")
        duties?.removeAll { it.Work == Workposition }
    }

    init {
        if (age < 18){
            duties = null
        }
    }

    override fun toString(): String {
        return "Person $fio, age=$age, floor='$floor', passport $passport ,\n\n duties=$duties"
    }

}