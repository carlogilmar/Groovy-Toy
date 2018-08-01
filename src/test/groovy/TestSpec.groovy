import spock.lang.Specification

class TestSpec extends Specification {

  CRUDOperator operator = new CRUDOperator()

  def "Validate operator"() {
    assert operator
  }

}
