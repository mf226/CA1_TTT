package presentation;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import presentation.commands.*;

public abstract class CommandController {

    private static HashMap<String, ICommand> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put("ReplaceThis", new UnknownCommand());
    }

    public static ICommand from(HttpServletRequest request) {
        String commandName = request.getParameter("command");
        if (commands == null) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand());
    }

}