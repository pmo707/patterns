package pihnastyi.design.command;

import java.util.ArrayList;
import java.util.List;

public class ContainerCommand {
    private List<TmpCommand> commands;

    public ContainerCommand() {
        commands = new ArrayList<>();
    }

    public void addCommand(TmpCommand command) {
        commands.add(command);
    }

    public List<TmpCommand> getCommands() {
        return commands;
    }

    public void setCommands(List<TmpCommand> commands) {
        this.commands = commands;
    }
}
