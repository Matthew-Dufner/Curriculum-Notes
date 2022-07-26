package com.revature;

import com.revature.exceptions.CustomUncheckedException;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class ExceptionGenerator {

    public void getLostInAStackTrace() throws EOFException {
        this.step1();
    }

    private void step1() throws EOFException {
        this.step2();
    }
    private void step2() throws EOFException{
        this.step3();
    }
    private void step3() throws EOFException{
        this.throwEofException();
    }

    public void throwEofException() throws EOFException {
        throw new EOFException();
    }

    public void throwSomeException(String str) throws FileNotFoundException, MalformedURLException, EOFException{
        switch(str) {
            case "FNF":
                throw new FileNotFoundException("throwSomeException has thrown a FileNotFoundException because it was told: " + str);
            case "URL":
                throw new MalformedURLException("throwSomeException has thrown a MalformedUrlException because it was told: " + str);
            case "EOF":
                throw new EOFException("throwSomeException has thrown an EOFException because it was told: " + str);
        }
    }

    public void throwUncheckedException() {
        throw new CustomUncheckedException("Custom unchecked exception!");
    }
}
