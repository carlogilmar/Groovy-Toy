class CRUDOperator{

  List<Student> storage = []

  List<Student> findAllStudents(){
    storage
  }

  def saveStudent( Student student ) {
    storage.add(student)
  }

  def saveAListOfStudents( List<Student> students ){
    students.each{ student ->
      storage << student
    }
  }
}
