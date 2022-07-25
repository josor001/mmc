package de.fhdo.hmmm.utility.model

class Contract(
    val owner: Interface,
    val consumer: Microservice,
    var type : EMessagingType? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Contract

        if (owner != other.owner) return false
        if (consumer != other.consumer) return false

        return true
    }

    override fun hashCode(): Int {
        var result = owner.hashCode()
        result = 31 * result + consumer.hashCode()
        return result
    }
}
