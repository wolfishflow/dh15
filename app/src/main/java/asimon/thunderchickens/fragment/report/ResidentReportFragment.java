package asimon.thunderchickens.fragment.report;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import asimon.thunderchickens.R;
import asimon.thunderchickens.fragment.report.ResidentExpandAdapter;
import asimon.thunderchickens.fragment.report.ResidentItem;

/**
 * Created by alansimon on 2017-03-05.
 */

public class ResidentReportFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.task_resident_layout, container, false);

        ArrayList<ResidentItem> residentItems = new ArrayList<>();
        residentItems.add(new ResidentItem("Using Toilet"));
        residentItems.add(new ResidentItem("Grooming"));
        residentItems.add(new ResidentItem("Getting Dressed"));
        residentItems.add(new ResidentItem("Injuries"));

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new ResidentExpandAdapter(getActivity(), residentItems, recyclerView));

        return rootView;
    }


}
