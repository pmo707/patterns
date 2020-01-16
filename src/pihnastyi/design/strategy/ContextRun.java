package pihnastyi.design.strategy;

import pihnastyi.design.strategy.run.StrategyRun;

public class ContextRun {
    private StrategyRun strategyRun;

    public ContextRun(StrategyRun strategy) {
        this.strategyRun = strategy;
    }

    public void runStrategy() {
        strategyRun.run();
    }
}
