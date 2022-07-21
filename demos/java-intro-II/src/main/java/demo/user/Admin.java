package demo.user;

public class Admin {
    User user = new User();
    String defaultAccessVariable = "This is default access, note there is no keyword to make it so.";



    private void test() {
        user.test = 5;
    }

    public char methodScope() {
        System.out.println(defaultAccessVariable);
        return 'z';
    }

    public char methodScope(String str) {
        System.out.println(str);
        return 'z';
    }


}
