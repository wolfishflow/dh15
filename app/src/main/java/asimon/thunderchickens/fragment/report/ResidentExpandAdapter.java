package asimon.thunderchickens.fragment.report;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;

import net.cachapa.expandablelayout.ExpandableLayout;

import java.util.List;

import asimon.thunderchickens.R;

/**
 * Created by alansimon on 2017-03-05.
 */

public class ResidentExpandAdapter extends RecyclerView.Adapter<ResidentExpandAdapter.ViewHolder> {
    private static final int UNSELECTED = -1;

    private RecyclerView recyclerView;
    private int selectedItem = UNSELECTED;

    private List<ResidentItem> mItems;
    private Activity mActivity;

    public ResidentExpandAdapter(Activity activity, List<ResidentItem> items, RecyclerView rv) {
        mItems = items;
        mActivity = activity;
        recyclerView = rv;

    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ExpandableLayout expandableLayout;
        private TextView expandButton;
        private int position;

        public ViewHolder(View itemView) {
            super(itemView);

            expandableLayout = (ExpandableLayout) itemView.findViewById(R.id.expandable_layout);
            expandableLayout.setInterpolator(new OvershootInterpolator());
            expandButton = (TextView) itemView.findViewById(R.id.expand_button);

            expandButton.setOnClickListener(this);
        }

        public void bind(ResidentItem item) {

            expandButton.setText(item.mPItem1);

            expandButton.setSelected(false);
            expandableLayout.collapse(false);
        }

        @Override
        public void onClick(View view) {
            ViewHolder holder = (ViewHolder) recyclerView.findViewHolderForAdapterPosition(selectedItem);
            if (holder != null) {
                holder.expandButton.setSelected(false);
                holder.expandableLayout.collapse();
            }

            if (position == selectedItem) {
                selectedItem = UNSELECTED;
            } else {
                expandButton.setSelected(true);
                expandableLayout.expand();
                selectedItem = position;
            }
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

}