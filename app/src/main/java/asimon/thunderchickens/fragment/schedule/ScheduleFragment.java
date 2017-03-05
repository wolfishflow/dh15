package asimon.thunderchickens.fragment.schedule;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;

import java.util.ArrayList;

import asimon.thunderchickens.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by alansimon on 2017-03-04.
 */
@EFragment(R.layout.fragment_schedule)
public class ScheduleFragment extends Fragment {

    private final String TAG = "Schedule Fragment";

    @BindView(R.id.rvSchedule)
    RecyclerView rvSchedule;

    @AfterViews
    void setup() {


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, TAG);

        getActivity().setTitle("Morning Report");

        ArrayList<CardItem> listItemList = new ArrayList();
        listItemList.add(new CardItem("Stanley Johnson", "Rm. 321", "Stanley’s birthday today!", "Off-site dinner with son (Brian) at 4:00PM\n"));
        listItemList.add(new CardItem("Lois Mackenzie", "Rm. 324", "Woke up at 4:00. Did not sleep well...", ""));
        listItemList.add(new CardItem("Walter Brown", "Rm. 327", "Scheduled shower (prefers morning).", ""));
        listItemList.add(new CardItem("Jorge  Santos", "Rm. 320", "Appointment at 8:30AM with doctor", "Fever of 103 degrees at 5:00AM"));
        listItemList.add(new CardItem("Kathleen Banks", "Rm. 329", "No updates", ""));

        RecyclerView rvSchedule = (RecyclerView) view.findViewById(R.id.rvSchedule);
        rvSchedule.setHasFixedSize(true);
        rvSchedule.setLayoutManager(new LinearLayoutManager(getContext()));
        rvSchedule.setAdapter(new CardListAdapter(getActivity(), listItemList));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
