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


public class WeekTwo extends AppCompatActivity {

    EditText startSun2, startMon2, startTues2, startWed2, startThurs2, startFri2, startSat2;
    EditText endSun2, endMon2, endTues2, endWed2, endThurs2, endFri2, endSat2;
    EditText jobSun2, jobMon2, jobTues2, jobWed2, jobThurs2, jobFri2, jobSat2;

    /*
    *   The first block of code creates the date at the top of the screen
    *   The second block creates EditTexts and will be used in several other methods
    *   loadSavedPreferences(); calls on the next method
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_two);

        //This sets dateView's text to the current Sunday's date
        TextView dateView = (TextView)findViewById(R.id.dateView);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        calendar.add(Calendar.DATE, 7);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd", Locale.US);
        //This sets dateView's text to the current Saturday's date
        Calendar calendarEnd = Calendar.getInstance();
        calendarEnd.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        calendarEnd.add(Calendar.DATE, 7);
        SimpleDateFormat simpleDateFormatEnd = new SimpleDateFormat("MM/dd/yyyy", Locale.US);

        dateView.setText("Date: " + new StringBuilder()
                .append(simpleDateFormat.format(calendar.getTime()))
                .append(" - ")
                .append(simpleDateFormatEnd.format(calendarEnd.getTime())));

        startSun2 = (EditText) findViewById(R.id.startSun2);
        endSun2 = (EditText) findViewById(R.id.endSun2);
        jobSun2 = (EditText) findViewById(R.id.jobSun2);
        startMon2 = (EditText) findViewById(R.id.startMon2);
        endMon2 = (EditText) findViewById(R.id.endMon2);
        jobMon2 = (EditText) findViewById(R.id.jobMon2);
        startTues2 = (EditText) findViewById(R.id.startTues2);
        endTues2 = (EditText) findViewById(R.id.endTues2);
        jobTues2 = (EditText) findViewById(R.id.jobTues2);
        startWed2 = (EditText) findViewById(R.id.startWed2);
        endWed2 = (EditText) findViewById(R.id.endWed2);
        jobWed2 = (EditText) findViewById(R.id.jobWed2);
        startThurs2 = (EditText) findViewById(R.id.startThurs2);
        endThurs2 = (EditText) findViewById(R.id.endThurs2);
        jobThurs2 = (EditText) findViewById(R.id.jobThurs2);
        startFri2 = (EditText) findViewById(R.id.startFri2);
        endFri2 = (EditText) findViewById(R.id.endFri2);
        jobFri2 = (EditText) findViewById(R.id.jobFri2);
        startSat2 = (EditText) findViewById(R.id.startSat2);
        endSat2 = (EditText) findViewById(R.id.endSat2);
        jobSat2 = (EditText) findViewById(R.id.jobSat2);
        loadSavedPreferences();
    }

    private void loadSavedPreferences() {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);

        startSun2.setText(sharedPreferences.getString("startSun2", ""));
        endSun2.setText(sharedPreferences.getString("endSun2", ""));
        jobSun2.setText(sharedPreferences.getString("jobSun2", ""));
        startMon2.setText(sharedPreferences.getString("startMon2", ""));
        endMon2.setText(sharedPreferences.getString("endMon2", ""));
        jobMon2.setText(sharedPreferences.getString("jobMon2", ""));
        startTues2.setText(sharedPreferences.getString("startTues2", ""));
        endTues2.setText(sharedPreferences.getString("endTues2", ""));
        jobTues2.setText(sharedPreferences.getString("jobTues2", ""));
        startWed2.setText(sharedPreferences.getString("startWed2", ""));
        endWed2.setText(sharedPreferences.getString("endWed2", ""));
        jobWed2.setText(sharedPreferences.getString("jobWed2", ""));
        startThurs2.setText(sharedPreferences.getString("startThurs2", ""));
        endThurs2.setText(sharedPreferences.getString("endThurs2", ""));
        jobThurs2.setText(sharedPreferences.getString("jobThurs2", ""));
        startFri2.setText(sharedPreferences.getString("startFri2", ""));
        endFri2.setText(sharedPreferences.getString("endFri2", ""));
        jobFri2.setText(sharedPreferences.getString("jobFri2", ""));
        startSat2.setText(sharedPreferences.getString("startSat2", ""));
        endSat2.setText(sharedPreferences.getString("endSat2", ""));
        jobSat2.setText(sharedPreferences.getString("jobSat2", ""));
    }

    public void saveData(){

        savePreferences("startSun2", startSun2.getText().toString());
        savePreferences("endSun2", endSun2.getText().toString());
        savePreferences("jobSun2", jobSun2.getText().toString());
        savePreferences("startMon2", startMon2.getText().toString());
        savePreferences("endMon2", endMon2.getText().toString());
        savePreferences("jobMon2", jobMon2.getText().toString());
        savePreferences("startTues2", startTues2.getText().toString());
        savePreferences("endTues2", endTues2.getText().toString());
        savePreferences("jobTues2", jobTues2.getText().toString());
        savePreferences("startWed2", startWed2.getText().toString());
        savePreferences("endWed2", endWed2.getText().toString());
        savePreferences("jobWed2", jobWed2.getText().toString());
        savePreferences("startThurs2", startThurs2.getText().toString());
        savePreferences("endThurs2", endThurs2.getText().toString());
        savePreferences("jobThurs2", jobThurs2.getText().toString());
        savePreferences("startFri2", startFri2.getText().toString());
        savePreferences("endFri2", endFri2.getText().toString());
        savePreferences("jobFri2", jobFri2.getText().toString());
        savePreferences("startSat2", startSat2.getText().toString());
        savePreferences("endSat2", endSat2.getText().toString());
        savePreferences("jobSat2", jobSat2.getText().toString());
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
                startSun2.setText("");
                endSun2.setText("");
                jobSun2.setText("");
                startMon2.setText("");
                endMon2.setText("");
                jobMon2.setText("");
                startTues2.setText("");
                endTues2.setText("");
                jobTues2.setText("");
                startWed2.setText("");
                endWed2.setText("");
                jobWed2.setText("");
                startThurs2.setText("");
                endThurs2.setText("");
                jobThurs2.setText("");
                startFri2.setText("");
                endFri2.setText("");
                jobFri2.setText("");
                startSat2.setText("");
                endSat2.setText("");
                jobSat2.setText("");
            }
        });
        alertDialogue.setNegativeButton("No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialogue.create().show();
    }

    public void switchDialog() {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        AlertDialog.Builder alertDialogue = new AlertDialog.Builder(this);
        alertDialogue.setTitle("Confirm Move...");
        alertDialogue.setMessage("Are you sure you want to move the content to week 1?");
        alertDialogue.setIcon(R.drawable.move);
        alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                editor.putString("startSun", startSun2.getText().toString()).apply();
                editor.putString("endSun", endSun2.getText().toString()).apply();
                editor.putString("jobSun", jobSun2.getText().toString()).apply();
                editor.putString("startMon", startMon2.getText().toString()).apply();
                editor.putString("endMon", endMon2.getText().toString()).apply();
                editor.putString("jobMon", jobMon2.getText().toString()).apply();
                editor.putString("startTues", startTues2.getText().toString()).apply();
                editor.putString("endTues", endTues2.getText().toString()).apply();
                editor.putString("jobTues", jobTues2.getText().toString()).apply();
                editor.putString("startWed", startWed2.getText().toString()).apply();
                editor.putString("endWed", endWed2.getText().toString()).apply();
                editor.putString("jobWed", jobWed2.getText().toString()).apply();
                editor.putString("startThurs", startThurs2.getText().toString()).apply();
                editor.putString("endThurs", endThurs2.getText().toString()).apply();
                editor.putString("jobThurs", jobThurs2.getText().toString()).apply();
                editor.putString("startFri", startFri2.getText().toString()).apply();
                editor.putString("endFri", endFri2.getText().toString()).apply();
                editor.putString("jobFri", jobFri2.getText().toString()).apply();
                editor.putString("startSat", startSat2.getText().toString()).apply();
                editor.putString("endSat", endSat2.getText().toString()).apply();
                editor.putString("jobSat", jobSat2.getText().toString()).apply();

                startSun2.setText("");
                endSun2.setText("");
                jobSun2.setText("");
                startMon2.setText("");
                endMon2.setText("");
                jobMon2.setText("");
                startTues2.setText("");
                endTues2.setText("");
                jobTues2.setText("");
                startWed2.setText("");
                endWed2.setText("");
                jobWed2.setText("");
                startThurs2.setText("");
                endThurs2.setText("");
                jobThurs2.setText("");
                startFri2.setText("");
                endFri2.setText("");
                jobFri2.setText("");
                startSat2.setText("");
                endSat2.setText("");
                jobSat2.setText("");
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
                Intent cal = new Intent(WeekTwo.this, MyCalendar.class);
                startActivity(cal);
                break;

            case R.id.clear2:
                clearDialog();
                break;

            case R.id.shiftWeek2:
                switchDialog();
                break;

            case R.id.save2:
                saveDialog();
                break;
        }
    }
}
