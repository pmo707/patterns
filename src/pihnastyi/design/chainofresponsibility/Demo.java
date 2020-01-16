package pihnastyi.design.chainofresponsibility;

import pihnastyi.design.chainofresponsibility.chain.ConsoleMessagePrinter;
import pihnastyi.design.chainofresponsibility.chain.DataBaseMessagePrinter;
import pihnastyi.design.chainofresponsibility.chain.FileMessagePrinter;
import pihnastyi.design.chainofresponsibility.chain.MessagePrinter;

public class Demo {

    public static void main(String[] args) {
        MessagePrinter file = new FileMessagePrinter();
        MessagePrinter console = new ConsoleMessagePrinter();
        MessagePrinter db = new DataBaseMessagePrinter();

        file.setNextMessagePrinter(console);
        console.setNextMessagePrinter(db);

        file.doChain("test");

    }
}
