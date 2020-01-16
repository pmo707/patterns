package pihnastyi.design.strategy;

import pihnastyi.design.strategy.run.FastRun;

public class Demo {

    public static void main(String[] args) {
        ContextRun contextRun = new ContextRun(new FastRun());
        contextRun.runStrategy();
    }
}
