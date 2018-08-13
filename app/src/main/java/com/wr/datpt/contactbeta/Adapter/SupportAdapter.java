package com.wr.datpt.contactbeta.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wr.datpt.contactbeta.Model.SupportModel;
import com.wr.datpt.contactbeta.R;

import java.util.ArrayList;
import java.util.List;

public class SupportAdapter extends BaseAdapter{


    Context context;

    List<SupportModel> spList;
    List<SupportModel> listTmp;
    LayoutInflater inflater;

    public SupportAdapter (Context context, List<SupportModel> contactModelList){
        this.context = context;
        this.spList = contactModelList;
        this.listTmp = new ArrayList<>();
        listTmp.addAll(contactModelList);
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return spList.size();
    }

    @Override
    public Object getItem(int i) {
        return spList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final SupportModel spModel = spList.get(i);
        TextView txtName, txtLink;
        TextView textUrl = new TextView(context);
        if (view == null) {
            view = inflater.inflate(R.layout.support_layout, viewGroup, false);
        }

        txtName = view.findViewById(R.id.txtRate);

        txtName.setText(spModel.getName());
        txtName.setMovementMethod(LinkMovementMethod.getInstance());
        //Linkify.addLinks(textUrl,Linkify.WEB_URLS);
        txtName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse(spModel.getUrl()));
                context.startActivity(browserIntent);
            }
        });
        return view;
    }
}
