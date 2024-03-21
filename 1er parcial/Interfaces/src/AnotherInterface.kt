interface AnotherInterface {
    val prop: Int

    val propertyWithImplementatio: String
        get() = "foo"

    fun foo() {
        println(prop)
    }
}

/*class Child: MyInterface {
    override val prop: Int = 29
}*/