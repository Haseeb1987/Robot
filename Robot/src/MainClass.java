
abstract interface ABC {
	public int num =10;
	public int abc =20;
	public static final int OK = 10;
	public void goNow();
	public abstract void gp();
}

interface GHI{
	int j = 9;
	void ghi();
};

abstract class DEF {
	public int why = 99;
	public static int zx= 999;
	public abstract void must();
	public void goAbstract(){
		System.out.println("this is abstract");
	}
}

abstract class XYZ extends DEF{
	public abstract void doIt();
}

abstract class Go extends XYZ{
	public abstract void doIt();
}

class Do extends Go{
	public void doIt(){}
	public void must(){}
}

class Instance {
	public int a = 100;
}

class Foo{
	Foo(){}
	public void foo(){
		System.out.println("foo is here now");
	}
}

class Moo{
	Moo(){}
	public void moo(){
		Foo f = new Foo();
		f.foo();
		if(f instanceof Object){
			System.out.println("Everything/Foo is an instanceof Object");
		}
	}
}

class OB{
	public void OB(){
		System.out.println("NOT a Constructor");
	}
	
	public void print(){
		System.out.println("OB");
	}
	
	public void printOB(){
		System.out.println("printOB");
	}
}

class Ref extends OB{
	public void print(){
		System.out.println("Ref");
	}
	
	public void printRef(){
		System.out.println("printRef");
	}
}

class Enum{
	enum Color {RED, YELLOW, GREEN; 
	public void colorFun(){
		System.out.println(Color.GREEN);
	}}
}

public class MainClass extends DEF implements ABC, GHI{
	
	/**
	 * @param args
	 * @throws ParseException 
	 */
	
	static int c;
	
	enum Color {RED, YELLOW, GREEN}
	
	public void gp(){
		int a =30;
	}
	
	public void ghi(){}
	
	public void goNow(){
		System.out.println("num :" + num + " abc :" + abc + " OK :" + OK);
	}
	
	public void excpt () throws ArithmeticException{
		int newnum=0;
		try {
			 newnum= 10/0;
		}
		catch(ArithmeticException ae){
			System.out.println("newnum :" + newnum + " " +ae);
		}
		catch(Exception e){}
		finally{
			System.out.println("Exception occur");
		}
	}
	
	public void must(){
		System.out.println("This was a must func");
	}
	
	public static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("A :" + a + " B:" +b);
	}
	
	public static void main(String[] args) {
//		RobotManager rob = new RobotManager();
//		String [] a1 = {"Ginny", "420"};
//		rob.main(a1); 
//		dd/MM/yyyy
		
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//		Date d = new Date();		
//		System.out.println(sdf.format(d));
		MainClass m = new MainClass();
		m.goNow();
		m.excpt();
		m.goAbstract();
		m.must();
		MainClass m2;
		int c1;
//		int e = 50;
		Moo moo = new Moo();
		moo.moo();
		
		Enum e = new Enum();
		
		OB b = new OB();
		Ref f = new Ref();
		OB obRef = new Ref();
//		Ref obR = new OB();
//		Ref obr = (Ref)new OB();
		
		b.print();
		f.print();
		obRef.print();
		obRef.printOB();
//		obRef.printRef();
		
		Instance i = new Instance();
		if(i instanceof Instance){
			System.out.println("i is an instanceof Instance");
		}
		
		if(e instanceof Object){
			System.out.println("Everything is an instanceof Object");
		}
		
		int a = 10;
		int b1 = a;
		b1 = 30;
		long abc = 31;
		System.out.println("a: " +a+ " b: " +b1+ " c:" + c+" abc :"+abc);
		
		swap(2,3);
	}
}
