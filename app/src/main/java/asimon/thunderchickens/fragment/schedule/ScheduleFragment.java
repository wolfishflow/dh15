package asimon.thunderchickens.fragment.schedule;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.androidannotations.annotations.EFragment;

import java.util.ArrayList;

import asimon.thunderchickens.R;

/**
 * Created by alansimon on 2017-03-04.
 */
@EFragment(R.layout.fragment_report)
public class ScheduleFragment extends Fragment{

    private final String TAG = "Schedule Fragment";

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, TAG);

        ArrayList<ListItem> listItemList = new ArrayList();
        listItemList.add(new ListItem("Example 1"));
        listItemList.add(new ListItem("Example 2"));
        listItemList.add(new ListItem("Example 3"));
        ListAdapter mAdapter = new ListAdapter(getActivity(), listItemList);
    }

}
