import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HelloWorld {
	//The 4 pillars of OOP: "A PIE"
	//Abstraction - hiding complex implementation details, exposing simple interface
	//Polymorphism - taking many forms - overriding, overloading, sub-type polymorphism
	//Inheritance - receive data and behaviors from another (parent) encapsulation
	//Encapsulation - bundling of data and behaviors into a single logical unit (the class)

/*
This is our main method, this is where program execution starts. The main method "signature" always looks like this.
It is always public, always static, always has a return type of void. The main method must be called "main" and
always contains a single array of Strings in the parameter list. A java program almost always has a main method,
and may actually contain several. (only one is actually used at runtime)
 */
	public static void main(String[] args) {

		//Here we create a hello world string and print it to the console
		String message = "Hello, World!";
		System.out.println(message);

		/*
		Here we invoke the printArgs static method from the MyClass class. We pass the args array
		from the main method parameter list.
		 */
		MyClass.printArgs(args);

		/*
		Here we are creating objects from our class. You can think of a class as a template, and objects are
		individual instances built out of that template. We end up with three objects of type MyClass. The first
		two use the no-args constructor, the third uses the all-args constructor.
		 */
		MyClass myClass = new MyClass();
		MyClass emptyMyClass = new MyClass();
		MyClass fullMyClass = new MyClass("Message string", 1, new Object());

		/*
		This next line does not work, because the message field is private. Instead, we use
		getters/setters to manipulate state.
		 */
		//myArgs.message = "Here is our message.";

		/*
		Here I am using the setter method to store this string in the myClass object's message field.
		It is considered good practice to adhere to the concept of encapsulation, that is a class should be
		in charge of manipulating its own state. Hence, we use the public getters/setters instead of
		trying to manipulate those fields directly.
		 */
		myClass.setMessage("Here is our message.");


		/*
		Below we see that the two objects contain different data, different state. The empty one contains
		nothing, as we used the no-args constructor and never sent any data to the object.
		The full one, however, has all the things we passed to the all-args constructor.
		 */
		System.out.println("emptyArgs message: " + emptyMyClass.getMessage());
		System.out.println("fullArgs message: " + fullMyClass.getMessage());



		/*
		This is an object of MySubClass, which is a child class of MyClass. (We could also say that
		MyClass is the super-class, and MySubClass is a sub-class.)
		MySubClass inherits all of the data and behavior from MyClass, and then adds some new stuff.
		MySubClass has a field called fl which contains a float value. The parent class doesn't have this.
		Meanwhile MySubClass doesn't have its own fields and methods for "message", "num", and "obj".
		These get inherited from the parent.
		 */
		MySubClass mySubClass = new MySubClass("String", 2, myClass, 5.5f);
		System.out.println(mySubClass.getMessage());
		System.out.println(mySubClass.getFl());
		mySubClass.overrideMe();


		/*
		Sub-type polymorphism is where you store an object in a reference of a parent type. MySubClass inherits from
		MyClass, so MySubClass
		 */
		MyClass polyRef = new MyClass("Polymorphic thingamajig", -55, new String("object"));
		System.out.println(polyRef.getMessage());
		polyRef = new MySubClass("subclass thingamajig", 99, new Object(), 5.5f);
		//This next line does not work, you can create a ref to a parent and store a child there, but not vice versa
		//MySubClass newSubClass = new MyClass();

		List<String> myList = new ArrayList<>();
		List<String> anotherList = new LinkedList<>();

		myList.add("string");
		myList.clear();
		myList.isEmpty();

		anotherList.add("string");
		anotherList.clear();
		anotherList.isEmpty();



		System.out.println("That's all folks!");
	}

}