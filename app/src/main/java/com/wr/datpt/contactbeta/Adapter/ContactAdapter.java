package com.wr.datpt.contactbeta.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wr.datpt.contactbeta.Model.ContactModel;
import com.wr.datpt.contactbeta.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by DatPT on 03/07/2018.
 */

public class ContactAdapter extends BaseAdapter {

    Context context;

    List<ContactModel> contactList;
    List<ContactModel> listTmp;
    LayoutInflater inflater;

    public ContactAdapter (Context context, List<ContactModel> contactModelList){
        this.context = context;
        this.contactList = contactModelList;
        this.listTmp = new ArrayList<>();
        listTmp.addAll(contactModelList);
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int i) {
        return contactList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ContactModel contactModel = contactList.get(i);
        TextView txtName, txtPhone;
        if (view == null) {
            view = inflater.inflate(R.layout.custom_layout_contact, viewGroup, false);
        }

        txtName = view.findViewById(R.id.txtName);
        txtPhone = view.findViewById(R.id.txtPhone);

        txtName.setText(contactModel.getName_Contact().toString());
        txtPhone.setText(contactModel.getNumber_Contact().toString());
        return view;
    }
}
