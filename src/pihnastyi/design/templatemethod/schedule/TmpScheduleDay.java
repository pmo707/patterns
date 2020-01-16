package pihnastyi.design.templatemethod.schedule;

public abstract class TmpScheduleDay {

    public void morning() {
        System.out.println("morning");
    }

    public abstract void dinner();

    public void evening() {
        System.out.println("evening");
    }

    public void schedule() {
        morning();
        dinner();
        evening();
    }
}
