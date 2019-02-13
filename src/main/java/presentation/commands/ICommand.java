package presentation.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.exceptions.OurException;

public interface ICommand {

    abstract String execute(HttpServletRequest request, HttpServletResponse response) throws OurException;
}
