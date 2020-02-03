
public class RobotManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(args.length);
		Robot rob;
		int argl = args.length;
		if(argl <= 1){
			System.out.println("There must be 2 arguments");
			System.out.println("Example : Robot Manager");
			System.exit(0);
		}else{
			for(int i= 0; i < argl; i++){
				rob = new Robot();
				rob.setName(args[i]);
				rob.sayHelloTo(args[0]); 
			}
		}
	}

}
