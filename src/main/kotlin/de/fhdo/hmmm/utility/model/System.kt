package de.fhdo.hmmm.utility.model

class System(
    val name: String,
    val microservices: MutableSet<Microservice> = mutableSetOf(),
    val contracts: MutableSet<Contract> = mutableSetOf(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as System

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}
