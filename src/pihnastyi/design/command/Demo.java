package pihnastyi.design.command;

public class Demo {
    public static void main(String[] args) {
        ContainerCommand containerCommand = new ContainerCommand();
        containerCommand.addCommand(new CommandOne());
        containerCommand.addCommand(new CommandTwo());

        for (TmpCommand t : containerCommand.getCommands()) {
            t.execute();
        }
    }
}
