package pihnastyi.design.state;

import pihnastyi.design.state.run.FastRun;
import pihnastyi.design.state.run.SlowRun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        ContextRun contextRun = new ContextRun(new FastRun());
        contextRun.runStrategy();
        contextRun.setStateRun(new SlowRun());
        contextRun.runStrategy();
    }
}
