/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_win22_wed;

/**
 *
 * @author Ronak
 */
public class PartTimeStudent extends Student {
    private int numCourse;
    
    public PartTimeStudent(String studentId,String studentName,int numCourse){
        super(studentId,studentName);//call the constructor of student class
        this.numCourse=numCourse;
    }
     
    public int getNumCourse() {
        return numCourse;
        
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
        
    }
    
}
