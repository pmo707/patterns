package pihnastyi.design.iterator;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        Iterator iterator = new MaksymCollection("Maksym", Arrays.asList("russian", "uk", "en")).getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
