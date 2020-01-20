package pihnastyi.structural.adapter.car;

import pihnastyi.structural.adapter.child.Child;

public class WrapperChild implements Car {
    private Child child;

    public WrapperChild(Child child) {
        this.child = child;
    }

    @Override
    public void wash() {
        child.play();
    }
}
