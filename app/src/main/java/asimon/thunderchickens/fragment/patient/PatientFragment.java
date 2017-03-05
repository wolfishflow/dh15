package asimon.thunderchickens.fragment.patient;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.androidannotations.annotations.EFragment;

import asimon.thunderchickens.R;

/**
 * Created by alansimon on 2017-03-04.
 */
@EFragment(R.layout.fragment_report)
public class PatientFragment extends Fragment{

    private final String TAG = "Patient Fragment";

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, TAG);
    }


}
