package asimon.thunderchickens;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

import asimon.thunderchickens.fragment.ProblemFragment_;
import asimon.thunderchickens.fragment.ProfileFragment_;
import asimon.thunderchickens.fragment.ReportFragment_;
import asimon.thunderchickens.fragment.ScheduleFragment_;

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
                     fr = new ReportFragment_();
                     fm = getFragmentManager();
                     ft = fm.beginTransaction();
                     ft.replace(R.id.frlt_fragment_container_home, fr);
                     ft.commit();
                 } else if (tabId == R.id.tab_problems) {
                     fr = new ProblemFragment_();
                     fm = getFragmentManager();
                     ft = fm.beginTransaction();
                     ft.replace(R.id.frlt_fragment_container_home, fr);
                     ft.commit();
                 } else if (tabId == R.id.tab_schedule) {
                     fr = new ScheduleFragment_();
                     fm = getFragmentManager();
                     ft = fm.beginTransaction();
                     ft.replace(R.id.frlt_fragment_container_home, fr);
                     ft.commit();
                 } else if (tabId == R.id.tab_patients) {
                     fr = new ProfileFragment_();
                     fm = getFragmentManager();
                     ft = fm.beginTransaction();
                     ft.replace(R.id.frlt_fragment_container_home, fr);
                     ft.commit();
                 }
             }
         }

        );

    }


}
