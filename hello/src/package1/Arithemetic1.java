package package1;

public class Arithemetic1 {
public int sum(int a, int b) {
	int c;
	c= a+b;
	System.out.println("the result of sum" +c);
	System.out.println("the result of sum" +c);
	return c;
}
public int sub(int a1, int b1) {
	int c1;
	c1= a1-b1;
	System.out.println("the result of sum" +c1);
	return c1;
}
public int multi(int a2, int b2) {
	int c2;
	c2= a2*b2;
	System.out.println("the result of sum" +c2);
	return c2;
	
}
public void div(int a3, int b3) {
	int result;
	result= a3/b3;
	System.out.println("the result of sum" +result);
	}
public static void main(String[] args)
{
	Arithemetic1 obj= new Arithemetic1();
	int sumresult1=obj.sum(10,2);
	int sumresult2=obj.sum(sumresult1,2);
	int subresult3=obj.sub(sumresult2,2);
	int multiresult1=obj.multi(subresult3,2);
	obj.div(multiresult1,2);
	}
}