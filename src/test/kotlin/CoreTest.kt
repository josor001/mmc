import de.fhdo.hmmm.utility.model.*
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory


/**
 * Tests for using the Model Management Core classes describing a Microservice Architecture model.
 *
 * @author Jonas Sorgalla
 */
class CoreTest {

    val logger = LoggerFactory.getLogger(CoreTest::class.java)

    @Test
    fun testBidrectionalAssociationBetweenMicroserviceAndInterface() {
        val teamA = Team("Team A")
        val serviceA1 = Microservice("Microservice A1", teamA)
        val interfaceA1 = Interface("Interface A1", serviceA1)
        assertTrue(serviceA1.interfaces.contains(interfaceA1))
    }

}