package pihnastyi.design.chainofresponsibility.chain;

public abstract class MessagePrinter {
    private MessagePrinter nextMessagePrinter;

    public void setNextMessagePrinter(MessagePrinter nextMessagePrinter) {
        this.nextMessagePrinter = nextMessagePrinter;
    }

    public void doChain(String message) {
        execute(message);
        if (nextMessagePrinter != null) {
            nextMessagePrinter.doChain(message);
        }
    }

    abstract void execute(String message);
}
