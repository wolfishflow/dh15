package asimon.thunderchickens.fragment.problem;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.androidannotations.annotations.EFragment;

import asimon.thunderchickens.R;

/**
 * Created by alansimon on 2017-03-05.
 */
@EFragment(R.layout.fragment_report)
public class ProblemFragment extends Fragment{

    private final String TAG = "Problem Fragment";

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, TAG);
    }

}
