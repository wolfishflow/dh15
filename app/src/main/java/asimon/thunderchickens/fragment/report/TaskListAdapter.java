package asimon.thunderchickens.fragment.report;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import asimon.thunderchickens.R;

/**
 * Created by alansimon on 2017-03-05.
 */

public class TaskListAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<TaskItem> mItems;
    private Activity mActivity;

    public TaskListAdapter(Activity activity, List<TaskItem> items) {
        mItems = items;
        mActivity = activity;
    }


    public class TaskViewHolder extends RecyclerView.ViewHolder {
        ImageView mProfileView;
        TextView mNameView;
        TextView mRoomView;
        TextView mStatus1View;
        TextView mStatus2View;

        public TaskViewHolder(View itemView) {
            super(itemView);
            mProfileView = (ImageView) itemView.findViewById(R.id.iv_profileIcon);
            mNameView = (TextView) itemView.findViewById(R.id.tv_patientName);
            mRoomView = (TextView) itemView.findViewById(R.id.tv_roomNumber);
            mStatus1View = (TextView) itemView.findViewById(R.id.tv_textStatus1);
            mStatus2View = (TextView) itemView.findViewById(R.id.tv_textStatus2);
        }

        public void bind(TaskItem item) {
            mProfileView.setImageResource(item.mImage);

            mNameView.setText(item.mName);
            mRoomView.setText(item.mRoom);

            mStatus1View.setText(item.mStatus1);
            mStatus2View.setText(item.mStatus2);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new TaskViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        ((TaskViewHolder) viewHolder).bind(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
