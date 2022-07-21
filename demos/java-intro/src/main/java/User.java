public class User {
    private String firstName;
    private String lastName;
    private int age;

    private static int population = 0;

    public User() {
        population++;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        population++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //From this static method we can find out just how many User objects currently exist
    public static int getPopulation() {
        return population;
    }

    //Destructor, opposite of constructor, will be invoked right before the object is deleted from memory.
    //This feature of the Java language is being deprecated
    protected void finalize() {
        System.out.println("A User object is being destroyed...");
        population--;
    }

}
