interface InterfaceChild : MyInterface {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}