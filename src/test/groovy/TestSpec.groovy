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

  def "Save a list of students"(){
    given:
      Student student1 = new Student(name:"pepe1", age:20, email:"pepe1@me.com", school:"ESCOM")
      Student student2 = new Student(name:"pepe2", age:21, email:"pepe2@me.com", school:"FI")
      Student student3 = new Student(name:"pepe3", age:18, email:"pepe3@me.com", school:"UPIICSA")
    when:
      operator.saveAListOfStudents( [student1, student2, student3] )
    then:
      operator.findAllStudents().size() == 5
  }

}
