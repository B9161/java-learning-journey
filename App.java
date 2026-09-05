import java.util.Scanner;
class StudentInfo{
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age");
int age=sc.nextInt();
sc.nextLine();
System.out.println("Enetr the name");
String name=sc.nextLine();
System.out.println("The age is =" +age);
System.out.println("The name is =" +name);
    }

}