import java.util.*;
class dailyFitness
{
public static void main(String args[])
{
double k1,h1,weight,bmi;
int age,s,h,k;
String name;
Scanner s1=new Scanner(System.in);
System.out.println("****.......$$...Welcome...$$......***************");
System.out.println("Please Enter your Details");
System.out.print("Name:");
name=s1.nextLine();
System.out.print("Age:");
age=s1.nextInt();
System.out.println("Enter your Height:");
System.out.print("Feet:");
k=s1.nextInt();
System.out.print("Inches:");
h=s1.nextInt();
s=12*k+h;
System.out.println("Enter your weight(In kgs):");
weight=s1.nextDouble();
h1=s*(0.0254);
bmi=((weight)/(h1*h1));
System.out.println("**********Mr."+name+"***Age:"+age+"******************");
System.out.println("**********Your Body Mass Index I*******");
System.out.println("**********"+bmi+"**********************");
if(bmi>30)
System.out.println("..........->You are Obese...");
else if(bmi<18.5)
System.out.println("...........->You are Underweight..");
else if(bmi>=18.5&&bmi<=24.9)
System.out.println("...........->You are Normal weight...");
else 
System.out.println("...........->You are Over weight..");
 

}
}