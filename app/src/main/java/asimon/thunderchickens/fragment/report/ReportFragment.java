package asimon.thunderchickens.fragment.report;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.androidannotations.annotations.EFragment;

import java.util.ArrayList;

import asimon.thunderchickens.R;
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

        getActivity().setTitle("Scheduled Activites");

        ArrayList<TaskItem> taskItems = new ArrayList();

        taskItems.add(new TaskItem(true, R.drawable.jorge, "Jorge  Santos", "Rm. 320", "Appointment at 8:30AM with doctor"));
        taskItems.add(new TaskItem(false, R.drawable.kathleen, "Kathleen Banks", "Rm. 329", "Early Riser"));
        taskItems.add(new TaskItem(false, R.drawable.walter, "Walter Brown", "Rm. 327", "Scheduled shower (prefers morning)."));
        taskItems.add(new TaskItem(false, R.drawable.stanley, "Stanley Johnson", "Rm. 321", "Stanley’s birthday today!"));
        taskItems.add(new TaskItem(false, R.drawable.lois, "Lois Mackenzie", "Rm. 324", "Woke up at 4:00. Did not sleep well..."));

        RecyclerView rvReport = (RecyclerView) view.findViewById(R.id.rvReport);
        rvReport.setHasFixedSize(true);
        rvReport.setLayoutManager(new LinearLayoutManager(getContext()));
        rvReport.setAdapter(new TaskListAdapter(getActivity(), taskItems));

        rvReport.addOnItemTouchListener(new RecyclerTouchListener(getActivity().getApplicationContext(), rvReport, new ClickListener() {
            @Override
            public void onClick(View view, int position) {

                Bundle bundle = new Bundle();

                Fragment fr = new ResidentReportFragment();
                fr.setArguments(bundle);
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frlt_fragment_container_home, fr);
                ft.addToBackStack(null);
                ft.commit();
            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
