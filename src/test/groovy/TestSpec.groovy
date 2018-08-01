import spock.lang.Specification

class TestSpec extends Specification {

  CRUDOperator operator = new CRUDOperator()

  def "Validate operator"() {
    assert operator
  }

  def "Get a student"(){
    given: "a 👩‍🎓"
      Student student = new Student(name:"carlogilmar")
    when: "I want to get the student 👀"
    then: "The student should be there!😎 "
      assert student
  }

  def "Save a student in the CRUDOperator"(){
    given: "A student"
    Student carlo = new Student(name:"carlogilmar")
    when:"I want to save"
    operator.saveStudent( carlo )
    then:"I should get the student in the operator storage"
    operator.findAllStudents().size() == 1
  }

}
