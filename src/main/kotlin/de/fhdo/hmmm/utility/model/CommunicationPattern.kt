package de.fhdo.hmmm.utility.model


/**
 * This enumeration represents the communication pattern of a certain [Microservice]
 * and/or [Interface].
 * The communication patterns are extracted from the paper
 * "Deployment and communication patterns in microservice architectures: A systematic literature review." by Aksakalli et al.
 * Please note that the patterns are not disjoint and may overlap in their definition.
 *
 * @author Jonas Sorgalla
 */
enum class CommunicationPattern {
    SYNCHRONOUS,
    PUB_SUB,
    HTTP_AND_MSGQUEUE,
    MOM,
    ASYNCHRONOUS
}
