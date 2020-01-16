package pihnastyi.design.chainofresponsibility.chain;

public class ConsoleMessagePrinter extends MessagePrinter {
    @Override
    void execute(String message) {
        System.out.println("Print to console");
    }
}
