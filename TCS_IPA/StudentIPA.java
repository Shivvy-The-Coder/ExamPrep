
// Create a class Student with below attributes:

// rollNo - int
// name - String
// subject -  String
// grade - char
// date - String [DD/MM/YYYY]

// findStudentByGradeAndMonth method:
// This method will take an array of Student objects, char value as grade and int value as month for input
// parameters. The method will find out all students from the given grade and month.
// This method will return array of Student objects ascending order based on their rollNo if found.
// If there is no Student that matches then the method should return null.

// for findStudentByGradeAndMonth method:
// The main method should print Student name, subject and total student found[The length of the list], if the
// returned value is not null. If the returned value is null then it should print "No Student found".

// NOTE:
// For Taking char as input use sc.nextLine().charAt(0)
// To match/check the month you have to convert int month in the parameter to String.
// No need to count the Student array if return not null just print the array length.

package TCS_IPA;
import java.util.*;

class Student{
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;

    public Student(int rollNo, String name, String subject, char grade, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public char getGrade() {
        return grade;
    }

    public String getDate() {
        return date;
    }
}
public class StudentIPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();

            arr[i] = new Student(a,b,c,d,e);
        }
        char grade = sc.nextLine().charAt(0);
        int month = sc.nextInt(); sc.nextLine();

        Student[] result = findStudentByGradeAndMonth(arr,grade,month);
        if(result != null){
            for(int i = 0; i< result.length; i++){
                System.out.println(result[i].getName());
                System.out.println(result[i].getSubject());
            }
            System.out.println(result.length);
        }
        else{
            System.out.println("No Student found");
        }
    }
    public static Student[] findStudentByGradeAndMonth(Student[] arr, char grade, int month){
        Student[] arr2 = new Student[0];
        for(int i = 0; i < arr.length; i++){
            String[] mon = arr[i].getDate().split("/");
            if(arr[i].getGrade() == grade && Integer.parseInt(mon[1]) == month){
                arr2 = Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        for(int i = 0; i < arr2.length; i++){
            for(int j = i+1; j < arr2.length; j++){
                if(arr2[i].getRollNo() > arr2[j].getRollNo()){
                    Student temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        if(arr2.length > 0){
            return arr2;
        } else{
            return null;
        }
    }
}

// Input:
//        111
//        Arijit
//        Math
//        B
//        22/09/2023
//        101
//        Priyanka
//        English
//        A
//        30/03/2022
//        107
//        Shreosi
//        History
//        C
//        13/05/2022
//        105
//        Tatan
//        Physics
//        A
//        27/03/2022
//        A
//        3

// Output:
//     Priyanka
//     English
//     Tatan
//     Physics
//     2