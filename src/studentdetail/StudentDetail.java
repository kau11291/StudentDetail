/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetail;




/**
 *
 * @author User
 */
public class StudentDetail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student[] list = new Student[3];
       Student s1 = new Student();
       s1.setName("john");
       s1.setAge(19);
        Student s2 = new Student();
       s2.setName("jain");
       s2.setAge(19);
        Student s3 = new Student();
       s3.setName("peter");
       s3.setAge(19);
       list[0]= s1;
       list[1]= s2;
       list[2]= s3;
        for (Student list1 : list) {
            System.out.println(list1.getName() + "" + list1.getAge());
        }
    }
    
}
