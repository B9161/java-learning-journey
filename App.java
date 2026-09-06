import java.util.Scanner;
class AreaofTriangle{
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base");
double base= sc.nextDouble();
System.out.println("Enter the height");
double height=sc.nextDouble();
double AreaofTriangle= 0.5*base*height;
System.out.println("The Area of Triangle is =" +AreaofTriangle );
    }
}