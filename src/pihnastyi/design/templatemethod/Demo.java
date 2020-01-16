package pihnastyi.design.templatemethod;

import pihnastyi.design.templatemethod.schedule.IvanScheduleDay;
import pihnastyi.design.templatemethod.schedule.MaksymScheduleDay;
import pihnastyi.design.templatemethod.schedule.TmpScheduleDay;

public class Demo {

    public static void main(String[] args) {
        TmpScheduleDay maksym = new MaksymScheduleDay();
        TmpScheduleDay ivan = new IvanScheduleDay();

        maksym.schedule();
        System.out.println("====================");
        ivan.schedule();
    }
}
