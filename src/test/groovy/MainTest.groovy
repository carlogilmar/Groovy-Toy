import spock.lang.Specification

class MainTest extends Specification {

    def "Test something"() {
      given:
        Util util = new Util()
      when:
        def numbers = util.giveMeAList()
      then:
        numbers.size == 0
    }

}
