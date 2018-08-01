class CRUDOperator{


  List<Student> storage = []

  List<Student> findAllStudents(){
    storage
  }

  def saveStudent( Student student ) {
    storage.add(student)
  }

}
