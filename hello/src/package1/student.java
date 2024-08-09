package package1;

public class student {
	int rollno;
	int age;
public void display1() {
System.out.println("welcome to all of you");}
public void display2() {
System.out.println("automation is very easy");}

public static void main(String[] args)
{
	student s = new student();
	s.display1();
	s.display2();
	s.rollno=10;
	s.age=20;
	System.out.println("roll no " +s.rollno);
	System.out.println("age " +s.age);
}}



