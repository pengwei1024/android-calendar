package com.apkfuns.androidcalendar.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.apkfuns.androidcalendar.CalendarView;
import com.apkfuns.androidcalendar.manager.CalendarManager;

import org.joda.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    private CalendarView mCalendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarManager manager = new CalendarManager(LocalDate.now(), CalendarManager.State.MONTH, LocalDate.now(), LocalDate.now().plusYears(1));

        mCalendarView = (CalendarView) findViewById(R.id.calendar);
        mCalendarView.init(manager);

        setTitle(mCalendarView.getManager().getHeaderText());
    }
}
