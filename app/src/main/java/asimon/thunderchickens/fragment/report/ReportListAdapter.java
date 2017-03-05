package asimon.thunderchickens.fragment.report;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import asimon.thunderchickens.R;

/**
 * Created by alansimon on 2017-03-05.
 */

public class ReportListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<DividerItem> mItems;


    public class CardViewHolder extends RecyclerView.ViewHolder {
        View mRootView;
        ImageView mIcon;
        TextView mTitle, mDesc;

        public CardViewHolder(View itemView) {
            super(itemView);
            mRootView = itemView;
//            mIcon = (ImageView)itemView.findViewById(R.id.fragment_rbc_apps_header_item_image);
//            mTitle = (TextView)itemView.findViewById(R.id.fragment_rbc_apps_header_item_title);
//            mDesc = (TextView)itemView.findViewById(R.id.fragment_rbc_apps_header_item_desc);
        }

//        public void bind(final CardItem item) {
//            mIcon.setImageResource(item.mIconResId);
//            mTitle.setText(item.mTitle);
//            mDesc.setText(item.mDesc);
//
//            mRootView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });
//        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
