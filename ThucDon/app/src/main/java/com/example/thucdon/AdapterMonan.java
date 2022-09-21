package com.example.thucdon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMonan extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Monan> arraylist;

    public AdapterMonan(Context context, int layout, List<Monan> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        Monan monan = arraylist.get(position);

        TextView textV = convertView.findViewById(R.id.name);
        TextView textV1 = convertView.findViewById(R.id.gia);
        ImageView imageV = convertView.findViewById(R.id.imagehinh);

        textV.setText(monan.getTenmon());
        textV1.setText(monan.getGia());
        imageV.setImageResource(monan.getHinh());

        return convertView;
    }
}
