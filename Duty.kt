class Duty (Work: String, experience: Int, salary: Int, duty: String) {


    var Work: String = Work
        private set
    private var experience: Int = experience
        private set
    private var duty: String = duty
        private set
    private var salary: Int = salary
        private set
    override fun toString(): String {
        return "Work position='$Work', experience=$experience, salary=$salary, duty='$duty')"
    }
}
