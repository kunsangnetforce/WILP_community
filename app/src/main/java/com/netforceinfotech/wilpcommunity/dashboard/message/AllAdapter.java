package com.netforceinfotech.wilpcommunity.dashboard.message;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.netforceinfotech.wilpcommunity.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gowtham Chandrasekar on 31-07-2015.
 */
public class AllAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int SIMPLE_TYPE = 0;
    private static final int IMAGE_TYPE = 1;
    public static final int SHARE_INTENT = 190;
    private final LayoutInflater inflater;
    private List<AllData> itemList;
    private Context context;
    String team, matchid;
    ArrayList<Boolean> shareclicked = new ArrayList<>();
    ArrayList<Boolean> likeclicked = new ArrayList<>();
    ArrayList<Boolean> dislikeclicked = new ArrayList<>();


    public AllAdapter(Context context, List<AllData> itemList) {
        this.itemList = itemList;
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.matchid = matchid;
        this.team = team;

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.row_chat, parent, false);
        AllHolder viewHolder = new AllHolder(view);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

    }

    private void showMessage(String s) {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }


    @Override
    public int getItemCount() {
        //     return 10;
        return 10;
    }


}
