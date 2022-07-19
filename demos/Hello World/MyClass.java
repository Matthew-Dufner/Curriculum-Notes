//Single line comment
/*
 * Multi
 * Line
 * Comment
 */

/*
This is an encapsulation, a class is a logical bundling of data and behaviors.
 */
public class MyClass {
	//data
	private String message;
	private int num;
	private Object obj;


	//behaviors
	public static void printArgs(String[] identifier/* inline comment*/) {
		for(int i = 0; i < identifier.length; i++) {
			System.out.println(identifier[i]);
		}
	}


	private void doSomething(String str) {
		/*
		This is private, so it cannot be invoked from outside. This is something we are abstracting the
		"user" away from.
		 */
		System.out.println(str);
	}

	public MyClass() {
		this.doSomething("This is the no-args constructor");
	}

	public MyClass(String message, int num, Object obj) {
		this.message = message;
		this.num = num;
		this.obj = obj;
		this.doSomething("This is the all-args constructor");
	}

	public void setMessage(String message) {
		//get the new string value to here - that's the String parameter
		//assign that string to the message variable
		this.message = message;
	}

	public String getMessage() {
		//send the value back to the calling code - by returning
		//get the value ready
		return message;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public void overrideMe() {
		System.out.println("This is the original overrideMe method");
	}
}