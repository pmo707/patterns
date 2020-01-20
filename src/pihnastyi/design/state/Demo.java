package pihnastyi.design.state;

import pihnastyi.design.state.run.FastRun;
import pihnastyi.design.state.run.SlowRun;

public class Demo {

    public static void main(String[] args) {
        ContextRun contextRun = new ContextRun(new FastRun());
        contextRun.runStrategy();

        contextRun.setStateRun(new SlowRun());
        contextRun.runStrategy();
    }
}
