package de.fhdo.hmmm.utility.model

class Microservice(
    val name: String,
    var type: EMicroserviceType? = null,
    var technology: String? = null,
    var description: String? = null,
    val interfaces: MutableSet<Interface> = mutableSetOf()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Microservice

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}