package targetSchedule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.Toast;
import com.example.TargetSchedule.R;

public class MyCalendar extends AppCompatActivity {

    CalendarView cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        cal = (CalendarView)findViewById(R.id.calendar);
        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth){
                Toast.makeText(getApplicationContext(), month + 1 + "/" + dayOfMonth + "/" + year, Toast.LENGTH_LONG).show();
            }
        });
    }
}
