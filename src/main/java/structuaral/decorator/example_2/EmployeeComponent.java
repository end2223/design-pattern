package structuaral.decorator.example_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface EmployeeComponent {

    String getName();

    void doTask();

    void join(Date date);

    void  terminate(Date date);

    default String formatDate(Date date){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }

    default void showBasicInformation(){
        System.out.println("============================");
        join(Calendar.getInstance().getTime());
        Calendar terminateDate = Calendar.getInstance();
        terminateDate.add(Calendar.MONTH, 6);
        terminate(terminateDate.getTime());
        System.out.println("============================");
    }
}
