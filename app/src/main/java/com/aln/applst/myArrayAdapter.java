package com.aln.applst;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class myArrayAdapter extends ArrayAdapter<String> {
    String [] counrty;
    String [] cap;
    int [] arrpic;
    Context context;

    public myArrayAdapter(@NonNull Context context,int [] pic,String [] _country,String [] cap) {
        super(context, R.layout.layout_list);
        counrty=_country;
        this.cap =cap;
        arrpic =pic;
        this.context =context;

    }

    @Override
    public int getCount() {
        return counrty.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View v, @NonNull ViewGroup parent) {
        controlHolder ch =new controlHolder();
        if(v ==null){
            LayoutInflater inflat = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v =inflat.inflate(R.layout.layout_list,parent,false);
            ch.imgv =v.findViewById(R.id.imgv);
            ch.tvcountry =v.findViewById(R.id.tvcountry);
            ch.tvcap =v.findViewById(R.id.tvcap);
            v.setTag(ch);

        }else{
           ch = (controlHolder)v.getTag();
        }
        ch.imgv.setImageResource(arrpic[position]);
        ch.tvcountry.setText(counrty[position]);
        ch.tvcap.setText(cap[position]);
        return v;
    }
}
