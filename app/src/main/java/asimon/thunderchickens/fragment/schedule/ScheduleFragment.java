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

        ArrayList<CardItem> listItemList = new ArrayList();
        listItemList.add(new CardItem("Example 1"));
        listItemList.add(new CardItem("Example 2"));
        listItemList.add(new CardItem("Example 3"));

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
