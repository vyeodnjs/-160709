package com.hanbit.user.myapp160709.contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hanbit.user.myapp160709.R;

import java.util.ArrayList;

/**
 * Created by 1027 on 2016-07-09.
 */
public class ContactAdapter extends BaseAdapter {
    private static ArrayList<ContactBean> list;
    private LayoutInflater inflater;
    private Integer[] imgs = {
            R.drawable.cupcake,
            R.drawable.donut,
            R.drawable.eclair,
            R.drawable.froyo,
            R.drawable.gingerbread,
            R.drawable.honeycomb,
            R.drawable.icecream,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lollipop
    };

    public ContactAdapter(Context context, ArrayList<ContactBean> list) {
        this.list = list;
        this.inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View v, ViewGroup g) {
        ViewHolder vh;
        if (v == null) {
            v = inflater.inflate(0,null);
            vh = new ViewHolder();
            vh.tvName = (TextView) v.findViewById(R.id.name);
            vh.tvPhone = (TextView) v.findViewById(R.id.phone);
            vh.photo = (ImageView) v.findViewById(R.id.photo);

            v.setTag(vh);
        } else {
            vh = (ViewHolder) v.getTag();
        }
        vh.tvName.setText(list.get(i).getName());
        vh.tvPhone.setText(list.get(i).getPhone());
        vh.photo.setImageResource(0);
        return null;
    }

    static class ViewHolder {
        TextView tvName;
        TextView tvPhone;
        ImageView photo;
    }
}
