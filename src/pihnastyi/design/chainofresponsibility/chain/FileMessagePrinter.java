package pihnastyi.design.chainofresponsibility.chain;

public class FileMessagePrinter extends MessagePrinter {
    @Override
    void execute(String message) {
        System.out.println("Print to file");
    }
}
