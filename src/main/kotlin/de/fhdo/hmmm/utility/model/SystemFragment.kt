package de.fhdo.hmmm.utility.model

/**
 * This class represents a fragment of a system model.
 * A [SystemFragment] presents a part of an overall system model from the
 * point of view of a certain team or teams.
 * Such a [SystemFragment] consists of multiple [Microservice]s as well as
 * [Contract]s between those services. The [SystemFragment] is identified by its [name].
 *
 * The sum of all fragment models of a system, across the various teams
 * in an organization, can be assembled into an overall system model.
 * Generally, a [SystemFragment] presents the view onto the different microservices
 * of the overall system from the viewpoint of single team, e.g., Team A.
 * Team A may know of various microservices that their owned services depend on, e.g.
 * their owned [Microservice] A depends on [Microservice] B which is owned by Team B.
 * However, dependencies of dependent services are, generally, hidden and, thus, not
 * part of the [SystemFragment], i.e., Team A does not know,
 * that [Microservice] B depends on a service C maintained by Team C.
 *
 * See our research article <a href="https://www.scitepress.org/Papers/2022/108372/">From Monolithic Models to Agile Micromodels</a>,
 * where we described the notion of SystemFragments under the label of 'Micromodels'.
 *
 * @author Jonas Sorgalla
 */
class SystemFragment(
    val name: String,
    val microservices: MutableSet<Microservice> = mutableSetOf(),
    val contracts: MutableSet<Contract> = mutableSetOf(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SystemFragment

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return "SystemFragment(name='$name', microservices=$microservices, contracts=$contracts)"
    }
}
