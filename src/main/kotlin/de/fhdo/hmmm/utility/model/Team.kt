package de.fhdo.hmmm.utility.model

class Team(
    val name : String,
    val members: MutableSet<Member> = mutableSetOf()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Team

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "Team(name='$name', members=$members)"
    }
}