package pihnastyi.design.state;

import pihnastyi.design.state.run.StateRun;

public class ContextRun {
    private StateRun stateRun;

    public ContextRun(StateRun strategy) {
        this.stateRun = strategy;
    }

    public void setStateRun(StateRun stateRun) {
        this.stateRun = stateRun;
    }

    public void runStrategy() {
        stateRun.run();
    }
}
