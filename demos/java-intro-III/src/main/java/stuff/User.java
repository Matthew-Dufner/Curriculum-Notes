package stuff;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User() {

    }



    public User(String a, String b, int c) {
        this.firstName = a;
        this.lastName = b;
        this.age = c;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String s) {
        this.firstName = s;
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

    @Override
    public String toString() {
        return "stuff.User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
