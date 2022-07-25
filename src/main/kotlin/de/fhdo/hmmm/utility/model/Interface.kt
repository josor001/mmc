package de.fhdo.hmmm.utility.model

class Interface(
    val name : String,
    //bidirectional link
    val provider: Microservice,
    var endpoint : String? = null,
    var communicationType : String? = null,
    val operations: MutableSet<Operation> = mutableSetOf()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Interface

        if (name != other.name) return false
        if (provider != other.provider) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + provider.hashCode()
        return result
    }
}
