package de.fhdo.hmmm.utility.model

class Microservice(
    val name: String,
    val owner: Team,
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
        if (owner != other.owner) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + owner.hashCode()
        return result
    }

    override fun toString(): String {
        return "Microservice(name='$name', owner=$owner, type=$type, technology=$technology, description=$description, interfaces=$interfaces)"
    }

}