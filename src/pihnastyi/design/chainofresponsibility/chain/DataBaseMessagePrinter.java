package pihnastyi.design.chainofresponsibility.chain;

public class DataBaseMessagePrinter extends MessagePrinter {
    @Override
    void execute(String message) {
        System.out.println("Print to db");
    }
}
