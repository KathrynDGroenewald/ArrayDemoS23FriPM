
package arraysdemos23fripm;

//Comment added 1:29pm
//friday 
public class studentList {
    public static void main(String[] args){
        Student s1 = new Student("s1","ronak");
        Student[] studentList = new Student[3];
        
        studentList[0]=s1;
        studentList[1]=new Student("s2","abc");
        studentList[2]=new Student("s3","def");
        
        for(int i =0;i<studentList.length;i++){
            System.out.println(studentList[i].getsName());
        }
    }//end of main
}//end of class
