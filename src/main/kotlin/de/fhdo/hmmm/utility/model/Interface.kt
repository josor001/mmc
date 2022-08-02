package de.fhdo.hmmm.utility.model

class Interface(
    val name : String,
    //bidirectional link
    provider: Microservice,
    var endpoint : String? = null,
    var communicationType : String? = null,
    val operations: MutableSet<Operation> = mutableSetOf()
) {
    //Custom Getter/Setter to set bidirectional association
    // looks messy. However, Kotlin does NOT call the setter
    // through the primary constructor, therefore, we need this unsexy init{} thing...
    var provider: Microservice = provider
    set(service) {
        field = service
        service.interfaces.add(this)
    }
    init {
        this.provider = provider
    }


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

    override fun toString(): String {
        return "Interface(name='$name', endpoint=$endpoint, communicationType=$communicationType, operations=$operations, provider=omittedDueToCyclicAssociation)"
    }
}
