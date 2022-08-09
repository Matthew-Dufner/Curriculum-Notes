package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PingServlet extends HttpServlet {



    @Override
    public void init() throws ServletException {
        System.out.println("ping servlet init()");
    }

    @Override
    public void destroy() {
        System.out.println("ping servlet destroy()");
    }

    /*
        This will take a simple GET request and respond with "Pong!" and status 202, indicating the request was accepted.
         */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.getWriter().print("Pong!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setStatus(500);
        resp.getWriter().println("exception caused");
        //int i = 1 / 0;//cause error - can't do this? Obvious error causes method not allowed?
        throw new ArithmeticException();
    }
}