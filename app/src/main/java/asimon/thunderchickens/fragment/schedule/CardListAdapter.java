package asimon.thunderchickens.fragment.schedule;

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

public class CardListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<CardItem> mItems;
    private Activity mActivity;

    public CardListAdapter(Activity activity, List<CardItem> items) {
        mItems = items;
        mActivity = activity;
    }


    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView mProfileView;
        TextView mNameView;
        TextView mRoomView;
        TextView mStatus1View;
        TextView mStatus2View;

        public CardViewHolder(View itemView) {
            super(itemView);
            mProfileView = (ImageView) itemView.findViewById(R.id.iv_profileIcon);
            mNameView = (TextView) itemView.findViewById(R.id.tv_patientName);
            mRoomView = (TextView) itemView.findViewById(R.id.tv_roomNumber);
            mStatus1View = (TextView) itemView.findViewById(R.id.tv_textStatus1);
            mStatus2View = (TextView) itemView.findViewById(R.id.tv_textStatus2);
        }

        public void bind(asimon.thunderchickens.fragment.schedule.CardItem item) {
            mProfileView.setImageResource(item.mImage);

            mNameView.setText(item.mName);
            mRoomView.setText(item.mRoom);

            mStatus1View.setText(item.mStatus1);
            mStatus2View.setText(item.mStatus2);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_carditem, parent, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        ((CardViewHolder) viewHolder).bind((CardItem) mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


}
