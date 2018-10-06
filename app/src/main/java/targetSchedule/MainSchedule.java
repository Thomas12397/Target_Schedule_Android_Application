package targetSchedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.TargetSchedule.R;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainSchedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_target_schedule);
    }

    public void onClick(View v){

        switch(v.getId()){
            case R.id.weekOne:
                Intent week1 = new Intent(MainSchedule.this, WeekOne.class);
                startActivity(week1);
                break;

            case R.id.weekTwo:
                Intent week2 = new Intent(MainSchedule.this, WeekTwo.class);
                startActivity(week2);
                break;

            case R.id.weekThree:
                Intent week3 = new Intent(MainSchedule.this, WeekThree.class);
                startActivity(week3);
                break;

            case R.id.viewCal:
                Intent viewC = new Intent(MainSchedule.this, MyCalendar.class);
                startActivity(viewC);
                break;
        }
    }
}
