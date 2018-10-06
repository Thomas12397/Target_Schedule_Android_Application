package targetSchedule;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.TargetSchedule.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class WeekOne extends AppCompatActivity {

    EditText startSun, startMon, startTues, startWed, startThurs, startFri, startSat;
    EditText endSun, endMon, endTues, endWed, endThurs, endFri, endSat;
    EditText jobSun, jobMon, jobTues, jobWed, jobThurs, jobFri, jobSat;

    /*
    *   The first block of code creates the date at the top of the screen
    *   The second block creates EditTexts and will be used in several other methods
    *   loadSavedPreferences(); calls on the next method
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_one);

        //This sets dateView's text to the current Sunday's date
        TextView dateView = (TextView)findViewById(R.id.dateView);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd", Locale.US);
        //This sets dateView's text to the current Saturday's date
        Calendar calendarEnd = Calendar.getInstance();
        calendarEnd.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        SimpleDateFormat simpleDateFormatEnd = new SimpleDateFormat("MM/dd/yyyy", Locale.US);

        dateView.setText("Date: " + new StringBuilder()
                .append(simpleDateFormat.format(calendar.getTime()))
                .append(" - ")
                .append(simpleDateFormatEnd.format(calendarEnd.getTime())));

        startSun = (EditText)findViewById(R.id.startSun);
        endSun = (EditText)findViewById(R.id.endSun);
        jobSun = (EditText)findViewById(R.id.jobSun);
        startMon = (EditText)findViewById(R.id.startMon);
        endMon = (EditText)findViewById(R.id.endMon);
        jobMon = (EditText)findViewById(R.id.jobMon);
        startTues = (EditText)findViewById(R.id.startTues);
        endTues = (EditText)findViewById(R.id.endTues);
        jobTues = (EditText)findViewById(R.id.jobTues);
        startWed = (EditText)findViewById(R.id.startWed);
        endWed = (EditText)findViewById(R.id.endWed);
        jobWed = (EditText)findViewById(R.id.jobWed);
        startThurs = (EditText)findViewById(R.id.startThurs);
        endThurs = (EditText)findViewById(R.id.endThurs);
        jobThurs = (EditText)findViewById(R.id.jobThurs);
        startFri = (EditText)findViewById(R.id.startFri);
        endFri = (EditText)findViewById(R.id.endFri);
        jobFri = (EditText)findViewById(R.id.jobFri);
        startSat = (EditText)findViewById(R.id.startSat);
        endSat = (EditText)findViewById(R.id.endSat);
        jobSat = (EditText)findViewById(R.id.jobSat);
        loadSavedPreferences();
    }

    private void loadSavedPreferences() {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);

        startSun.setText(sharedPreferences.getString("startSun", ""));
        endSun.setText(sharedPreferences.getString("endSun", ""));
        jobSun.setText(sharedPreferences.getString("jobSun", ""));
        startMon.setText(sharedPreferences.getString("startMon", ""));
        endMon.setText(sharedPreferences.getString("endMon", ""));
        jobMon.setText(sharedPreferences.getString("jobMon", ""));
        startTues.setText(sharedPreferences.getString("startTues", ""));
        endTues.setText(sharedPreferences.getString("endTues", ""));
        jobTues.setText(sharedPreferences.getString("jobTues", ""));
        startWed.setText(sharedPreferences.getString("startWed", ""));
        endWed.setText(sharedPreferences.getString("endWed", ""));
        jobWed.setText(sharedPreferences.getString("jobWed", ""));
        startThurs.setText(sharedPreferences.getString("startThurs", ""));
        endThurs.setText(sharedPreferences.getString("endThurs", ""));
        jobThurs.setText(sharedPreferences.getString("jobThurs", ""));
        startFri.setText(sharedPreferences.getString("startFri", ""));
        endFri.setText(sharedPreferences.getString("endFri", ""));
        jobFri.setText(sharedPreferences.getString("jobFri", ""));
        startSat.setText(sharedPreferences.getString("startSat", ""));
        endSat.setText(sharedPreferences.getString("endSat", ""));
        jobSat.setText(sharedPreferences.getString("jobSat", ""));
    }

    public void saveData(){
        savePreferences("startSun", startSun.getText().toString());
        savePreferences("endSun", endSun.getText().toString());
        savePreferences("jobSun", jobSun.getText().toString());
        savePreferences("startMon", startMon.getText().toString());
        savePreferences("endMon", endMon.getText().toString());
        savePreferences("jobMon", jobMon.getText().toString());
        savePreferences("startTues", startTues.getText().toString());
        savePreferences("endTues", endTues.getText().toString());
        savePreferences("jobTues", jobTues.getText().toString());
        savePreferences("startWed", startWed.getText().toString());
        savePreferences("endWed", endWed.getText().toString());
        savePreferences("jobWed", jobWed.getText().toString());
        savePreferences("startThurs", startThurs.getText().toString());
        savePreferences("endThurs", endThurs.getText().toString());
        savePreferences("jobThurs", jobThurs.getText().toString());
        savePreferences("startFri", startFri.getText().toString());
        savePreferences("endFri", endFri.getText().toString());
        savePreferences("jobFri", jobFri.getText().toString());
        savePreferences("startSat", startSat.getText().toString());
        savePreferences("endSat", endSat.getText().toString());
        savePreferences("jobSat", jobSat.getText().toString());
    }

    private void savePreferences(String key, String value) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(key, value);
        editor.apply();
    }

    @Override
    public void onBackPressed(){
        saveData();
        super.onBackPressed();
    }

    public void clearDialog() {
        AlertDialog.Builder alertDialogue = new AlertDialog.Builder(this);
        alertDialogue.setTitle("Confirm Clear...");
        alertDialogue.setMessage("Are you sure you want to clear the content?");
        alertDialogue.setIcon(R.drawable.delete_icon);
        alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                startSun.setText("");
                endSun.setText("");
                jobSun.setText("");
                startMon.setText("");
                endMon.setText("");
                jobMon.setText("");
                startTues.setText("");
                endTues.setText("");
                jobTues.setText("");
                startWed.setText("");
                endWed.setText("");
                jobWed.setText("");
                startThurs.setText("");
                endThurs.setText("");
                jobThurs.setText("");
                startFri.setText("");
                endFri.setText("");
                jobFri.setText("");
                startSat.setText("");
                endSat.setText("");
                jobSat.setText("");
            }
        });
        alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialogue.create().show();
    }

    public void saveDialog() {
        AlertDialog.Builder alertDialogue = new AlertDialog.Builder(this);
        alertDialogue.setTitle("Content Saved");
        alertDialogue.setIcon(R.drawable.save_icon);
        alertDialogue.setNeutralButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                saveData();
            }
        });
        alertDialogue.create().show();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dateView:
                Intent cal = new Intent(WeekOne.this, MyCalendar.class);
                startActivity(cal);
                break;

            case R.id.clear:
                clearDialog();
                break;

            case R.id.save:
                saveDialog();
                break;
        }
    }
}
