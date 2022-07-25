package de.fhdo.hmmm.utility.model

class Operation(
    val name : String,
    var endpoint : String? = null,
    var returnValue : String? = null,
    val parameters : MutableSet<Parameter> = mutableSetOf()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Operation

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}
