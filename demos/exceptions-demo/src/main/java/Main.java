import com.revature.AutoClosingThing;
import com.revature.ExceptionGenerator;
import com.revature.exceptions.CustomUncheckedException;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        ExceptionGenerator generator = new ExceptionGenerator();

        try {
            generator.throwEofException();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try{
            generator.throwSomeException("EOF");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Let's see a more involved stack trace...");


        try {
            generator.throwUncheckedException();
        } catch (CustomUncheckedException e) {
            e.printStackTrace();
        }



        try {
            generator.getLostInAStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }


        try(AutoClosingThing thing = new AutoClosingThing()) {
            System.out.println("thing is open? " + thing.isOpen());
        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
