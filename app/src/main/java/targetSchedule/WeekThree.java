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


public class WeekThree extends AppCompatActivity {

    EditText startSun3, startMon3, startTues3, startWed3, startThurs3, startFri3, startSat3;
    EditText endSun3, endMon3, endTues3, endWed3, endThurs3, endFri3, endSat3;
    EditText jobSun3, jobMon3, jobTues3, jobWed3, jobThurs3, jobFri3, jobSat3;

    /*
    *   The first block of code creates the date at the top of the screen
    *   The second block creates EditTexts and will be used in several other methods
    *   loadSavedPreferences(); calls on the next method
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_three);

        //This sets dateView's text to the current Sunday's date
        TextView dateView = (TextView) findViewById(R.id.dateView);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        calendar.add(Calendar.DATE, 14);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd", Locale.US);
        //This sets dateView's text to the current Saturday's date
        Calendar calendarEnd = Calendar.getInstance();
        calendarEnd.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        calendarEnd.add(Calendar.DATE, 14);
        SimpleDateFormat simpleDateFormatEnd = new SimpleDateFormat("MM/dd/yyyy", Locale.US);

        dateView.setText("Date: " + new StringBuilder()
                .append(simpleDateFormat.format(calendar.getTime()))
                .append(" - ")
                .append(simpleDateFormatEnd.format(calendarEnd.getTime())));

        startSun3 = (EditText) findViewById(R.id.startSun3);
        endSun3 = (EditText) findViewById(R.id.endSun3);
        jobSun3 = (EditText) findViewById(R.id.jobSun3);
        startMon3 = (EditText) findViewById(R.id.startMon3);
        endMon3 = (EditText) findViewById(R.id.endMon3);
        jobMon3 = (EditText) findViewById(R.id.jobMon3);
        startTues3 = (EditText) findViewById(R.id.startTues3);
        endTues3 = (EditText) findViewById(R.id.endTues3);
        jobTues3 = (EditText) findViewById(R.id.jobTues3);
        startWed3 = (EditText) findViewById(R.id.startWed3);
        endWed3 = (EditText) findViewById(R.id.endWed3);
        jobWed3 = (EditText) findViewById(R.id.jobWed3);
        startThurs3 = (EditText) findViewById(R.id.startThurs3);
        endThurs3 = (EditText) findViewById(R.id.endThurs3);
        jobThurs3 = (EditText) findViewById(R.id.jobThurs3);
        startFri3 = (EditText) findViewById(R.id.startFri3);
        endFri3 = (EditText) findViewById(R.id.endFri3);
        jobFri3 = (EditText) findViewById(R.id.jobFri3);
        startSat3 = (EditText) findViewById(R.id.startSat3);
        endSat3 = (EditText) findViewById(R.id.endSat3);
        jobSat3 = (EditText) findViewById(R.id.jobSat3);
        loadSavedPreferences();
    }

    private void loadSavedPreferences() {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);

        startSun3.setText(sharedPreferences.getString("startSun3", ""));
        endSun3.setText(sharedPreferences.getString("endSun3", ""));
        jobSun3.setText(sharedPreferences.getString("jobSun3", ""));
        startMon3.setText(sharedPreferences.getString("startMon3", ""));
        endMon3.setText(sharedPreferences.getString("endMon3", ""));
        jobMon3.setText(sharedPreferences.getString("jobMon3", ""));
        startTues3.setText(sharedPreferences.getString("startTues3", ""));
        endTues3.setText(sharedPreferences.getString("endTues3", ""));
        jobTues3.setText(sharedPreferences.getString("jobTues3", ""));
        startWed3.setText(sharedPreferences.getString("startWed3", ""));
        endWed3.setText(sharedPreferences.getString("endWed3", ""));
        jobWed3.setText(sharedPreferences.getString("jobWed3", ""));
        startThurs3.setText(sharedPreferences.getString("startThurs3", ""));
        endThurs3.setText(sharedPreferences.getString("endThurs3", ""));
        jobThurs3.setText(sharedPreferences.getString("jobThurs3", ""));
        startFri3.setText(sharedPreferences.getString("startFri3", ""));
        endFri3.setText(sharedPreferences.getString("endFri3", ""));
        jobFri3.setText(sharedPreferences.getString("jobFri3", ""));
        startSat3.setText(sharedPreferences.getString("startSat3", ""));
        endSat3.setText(sharedPreferences.getString("endSat3", ""));
        jobSat3.setText(sharedPreferences.getString("jobSat3", ""));
    }

    public void saveData() {

        savePreferences("startSun3", startSun3.getText().toString());
        savePreferences("endSun3", endSun3.getText().toString());
        savePreferences("jobSun3", jobSun3.getText().toString());
        savePreferences("startMon3", startMon3.getText().toString());
        savePreferences("endMon3", endMon3.getText().toString());
        savePreferences("jobMon3", jobMon3.getText().toString());
        savePreferences("startTues3", startTues3.getText().toString());
        savePreferences("endTues3", endTues3.getText().toString());
        savePreferences("jobTues3", jobTues3.getText().toString());
        savePreferences("startWed3", startWed3.getText().toString());
        savePreferences("endWed3", endWed3.getText().toString());
        savePreferences("jobWed3", jobWed3.getText().toString());
        savePreferences("startThurs3", startThurs3.getText().toString());
        savePreferences("endThurs3", endThurs3.getText().toString());
        savePreferences("jobThurs3", jobThurs3.getText().toString());
        savePreferences("startFri3", startFri3.getText().toString());
        savePreferences("endFri3", endFri3.getText().toString());
        savePreferences("jobFri3", jobFri3.getText().toString());
        savePreferences("startSat3", startSat3.getText().toString());
        savePreferences("endSat3", endSat3.getText().toString());
        savePreferences("jobSat3", jobSat3.getText().toString());
    }

    private void savePreferences(String key, String value) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    @Override
    public void onBackPressed() {
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
                startSun3.setText("");
                endSun3.setText("");
                jobSun3.setText("");
                startMon3.setText("");
                endMon3.setText("");
                jobMon3.setText("");
                startTues3.setText("");
                endTues3.setText("");
                jobTues3.setText("");
                startWed3.setText("");
                endWed3.setText("");
                jobWed3.setText("");
                startThurs3.setText("");
                endThurs3.setText("");
                jobThurs3.setText("");
                startFri3.setText("");
                endFri3.setText("");
                jobFri3.setText("");
                startSat3.setText("");
                endSat3.setText("");
                jobSat3.setText("");
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
        alertDialogue.setMessage("Are you sure you want to move the content to week 2?");
        alertDialogue.setIcon(R.drawable.move);
        alertDialogue.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                editor.putString("startSun2", startSun3.getText().toString()).apply();
                editor.putString("endSun2", endSun3.getText().toString()).apply();
                editor.putString("jobSun2", jobSun3.getText().toString()).apply();
                editor.putString("startMon2", startMon3.getText().toString()).apply();
                editor.putString("endMon2", endMon3.getText().toString()).apply();
                editor.putString("jobMon2", jobMon3.getText().toString()).apply();
                editor.putString("startTues2", startTues3.getText().toString()).apply();
                editor.putString("endTues2", endTues3.getText().toString()).apply();
                editor.putString("jobTues2", jobTues3.getText().toString()).apply();
                editor.putString("startWed2", startWed3.getText().toString()).apply();
                editor.putString("endWed2", endWed3.getText().toString()).apply();
                editor.putString("jobWed2", jobWed3.getText().toString()).apply();
                editor.putString("startThurs2", startThurs3.getText().toString()).apply();
                editor.putString("endThurs2", endThurs3.getText().toString()).apply();
                editor.putString("jobThurs2", jobThurs3.getText().toString()).apply();
                editor.putString("startFri2", startFri3.getText().toString()).apply();
                editor.putString("endFri2", endFri3.getText().toString()).apply();
                editor.putString("jobFri2", jobFri3.getText().toString()).apply();
                editor.putString("startSat2", startSat3.getText().toString()).apply();
                editor.putString("endSat2", endSat3.getText().toString()).apply();
                editor.putString("jobSat2", jobSat3.getText().toString()).apply();

                startSun3.setText("");
                endSun3.setText("");
                jobSun3.setText("");
                startMon3.setText("");
                endMon3.setText("");
                jobMon3.setText("");
                startTues3.setText("");
                endTues3.setText("");
                jobTues3.setText("");
                startWed3.setText("");
                endWed3.setText("");
                jobWed3.setText("");
                startThurs3.setText("");
                endThurs3.setText("");
                jobThurs3.setText("");
                startFri3.setText("");
                endFri3.setText("");
                jobFri3.setText("");
                startSat3.setText("");
                endSat3.setText("");
                jobSat3.setText("");
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
                Intent cal = new Intent(WeekThree.this, MyCalendar.class);
                startActivity(cal);
                break;

            case R.id.clear3:
                clearDialog();
                break;

            case R.id.shiftWeek3:
                switchDialog();
                break;

            case R.id.save3:
                saveDialog();
                break;
        }
    }
}
