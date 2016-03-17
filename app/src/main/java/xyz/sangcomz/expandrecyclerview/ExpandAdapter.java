package xyz.sangcomz.expandrecyclerview;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sangcomz on 3/17/16.
 */
public class ExpandAdapter extends RecyclerView.Adapter<ExpandAdapter.ViewHolder> {

    ArrayList<Object> objects;

    ExpandAdapter(final GridLayoutManager gridLayoutManager) {
        objects.add(1);
        objects.add("aaa");
        objects.add("aaa");
        objects.add("aaa");
        objects.add("aaa");
        objects.add("aaa");
        objects.add(2);
        objects.add("bbb");
        objects.add("bbb");
        objects.add("bbb");
        objects.add("bbb");
        objects.add("bbb");


//        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                if (position == 0 || position == objects.size() + 1)
//                    return gridLayoutManager.getSpanCount();
//                else
//                    return isSection(position - 1) ? gridLayoutManager.getSpanCount() : 1;
//            }
//        });
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {

        //common
        View view;
        int viewType;

        //for section
        TextView sectionTextView;
//        ToggleButton sectionToggleButton;

        //for item
        TextView txtName;
        TextView txtGrade;

        public ViewHolder(View view, int viewType) {
            super(view);
            this.viewType = viewType;
            this.view = view;
//            if (viewType == VIEW_TYPE_ITEM) {
//                txtName = (TextView) view.findViewById(R.id.txt_name);
//                txtGrade = (TextView) view.findViewById(R.id.txt_grade);
//            } else {
//                sectionTextView = (TextView) view.findViewById(R.id.text_section);
////                sectionToggleButton = (ToggleButton) view.findViewById(R.id.toggle_button_section);
//            }
        }
    }

}
