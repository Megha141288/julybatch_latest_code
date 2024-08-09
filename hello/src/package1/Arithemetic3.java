package package1;

public class Arithemetic3 {
	public int div(int a, int b){
	int c= a/b;
	System.out.println(" The Result of div " +c);
	System.out.println(" The Result of div " +c);
	return c;
	}
	public int sub(int a1, int b1){
		int c1= a1-b1;
		System.out.println(" The Result of sub " +c1);
		return c1;
		}
	public int multi(int a2, int b2){
		int c2= a2*b2;
		System.out.println(" The Result of multi " +c2);
		return c2;
		}
	public void sum(int a3, int b3){
		int c3= a3+b3;
		System.out.println(" The Result of sum " +c3);
	}
	public static void main(String[] args)
	{
		Arithemetic3 obj= new Arithemetic3();
		int divresult=obj.div(10, 2);
		int subresult=obj.sub(divresult, 2);
		int multiresult=obj.multi(subresult, 2);
		int subresult2=obj.sub(multiresult, 2);
		obj.sum(subresult2, 2);
	}}
