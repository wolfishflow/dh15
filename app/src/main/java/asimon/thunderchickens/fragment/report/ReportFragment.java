package asimon.thunderchickens.fragment.report;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.androidannotations.annotations.EFragment;

import java.util.ArrayList;
import java.util.List;

import asimon.thunderchickens.R;
import asimon.thunderchickens.fragment.schedule.CardItem;
import asimon.thunderchickens.fragment.schedule.CardListAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by alansimon on 2017-03-04.
 */
@EFragment(R.layout.fragment_report)
public class ReportFragment extends Fragment {

    private final String TAG = "Report Fragment";

    @BindView(R.id.rvReport)
    RecyclerView rvReport;


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, TAG);

        getActivity().setTitle("Morning Report");


        ArrayList<CardItem> listItemList = new ArrayList();
        listItemList.add(new CardItem(R.drawable.stanley,"Stanley Johnson", "Rm. 321", "Stanley’s birthday today!", "Off-site dinner with son (Brian) at 4:00PM\n"));
        listItemList.add(new CardItem(R.drawable.lois,"Lois Mackenzie", "Rm. 324", "Woke up at 4:00. Did not sleep well...", ""));
        listItemList.add(new CardItem(R.drawable.walter,"Walter  xxcvBrown", "Rm. 327", "Scheduled shower (prefers morning).", ""));
        listItemList.add(new CardItem(R.drawable.jorge,"Jorge  Santos", "Rm. 320", "Appointment at 8:30AM with doctor", "Fever of 103 degrees at 5:00AM"));
        listItemList.add(new CardItem(R.drawable.kathleen,"Kathleen Banks", "Rm. 329", "No updates", ""));


        RecyclerView rvReport = (RecyclerView) view.findViewById(R.id.rvReport);
        rvReport.setHasFixedSize(true);
        rvReport.setLayoutManager(new LinearLayoutManager(getContext()));
        rvReport.setAdapter(new CardListAdapter(getActivity(), listItemList));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
