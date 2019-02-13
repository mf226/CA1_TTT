package logic.exceptions;

import java.util.logging.Level;

public class OurException extends Exception {

    Level level;
    
    public OurException(String msg, Level level) {
        super(msg);
        this.level = level;
    }
}
