package asimon.thunderchickens;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import asimon.thunderchickens.fragment.patient.PatientFragment_;
import asimon.thunderchickens.fragment.report.ReportFragment_;
import asimon.thunderchickens.fragment.schedule.ScheduleFragment_;

/**
 * Created by alansimon on 2017-03-04.
 */
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    private final String TAG = "Main Activity";

    private Fragment fr;
    private FragmentManager fm;
    private FragmentTransaction ft;

    private Bundle savedInstanceState;
    //private static GlobalState globalState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedInstanceState = savedInstanceState;
    }

    @AfterViews
    void setVars() {
        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
             @Override
             public void onTabSelected(@IdRes int tabId) {
                 if (tabId == R.id.tab_home) {
                     //If home is selected, head to reports
                     fr = new ScheduleFragment_();
                     fm = getFragmentManager();
                     ft = fm.beginTransaction();
                     ft.replace(R.id.frlt_fragment_container_home, fr);
                     ft.commit();
                 }  else if (tabId == R.id.tab_schedule) {
                     //If schedule is selected, head to schedules
                     fr = new ReportFragment_();
                     fm = getFragmentManager();
                     ft = fm.beginTransaction();
                     ft.replace(R.id.frlt_fragment_container_home, fr);
                     ft.commit();
//                 } else if (tabId == R.id.tab_problems) {
//                     //If problems is selected, head to problems
//                     fm = getFragmentManager();
//                     ft = fm.beginTransaction();
//                     ft.replace(R.id.frlt_fragment_container_home, fr);
//                     ft.commit();
                 } else if (tabId == R.id.tab_patients) {
                     //If patients is selected, head to patients
                     fr = new PatientFragment_();
                     fm = getFragmentManager();
                     ft = fm.beginTransaction();
                     ft.replace(R.id.frlt_fragment_container_home, fr);
                     ft.commit();
                 }
             }
         }

        );

        //Default to ReportFragment

        Fragment fr = new ScheduleFragment_();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frlt_fragment_container_home, fr);
        ft.commit();

    }

    @Override
    public void onBackPressed() {
        int count = getFragmentManager().getBackStackEntryCount();

        if (count == 0) {
            new AlertDialog.Builder(this)
                    .setTitle("Exit?")
                    .setMessage("Are you sure you want to exit right now?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
        } else {
            getFragmentManager().popBackStack();
        }
    }
}
