import spock.lang.Specification

class MainTest extends Specification {

  Util util = new Util()

  def "Test something"() {
    when:
      def numbers = util.giveMeAList()
    then:
      numbers.size > 0
  }

}
