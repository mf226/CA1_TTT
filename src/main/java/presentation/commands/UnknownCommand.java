package presentation.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.exceptions.OurException;

public class UnknownCommand implements ICommand {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws OurException {
        return "Error";
    }

}
