
package student_win22_wed;

public class StudentList {
      public static void main(String[] args) {
          Student[] studentList = new Student[3];
          studentList[0] = new Student("s1","Ronak Sheth");
          studentList[1] = new Student("s2","John Doe");
          studentList[2] = new Student("s3","abc");
          
          for(int i =0; i<studentList.length ;i++){
              System.out.print(studentList[i].getStudentId());
              System.out.print(" ");
              System.out.println(studentList[i].getStudentName());
          }
          
      }
    
}
