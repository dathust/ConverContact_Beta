package com.wr.datpt.contactbeta.View.HomeView;

import android.Manifest;
import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.LongDef;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.wr.datpt.contactbeta.Adapter.ContactAdapter;
import com.wr.datpt.contactbeta.Adapter.SupportAdapter;
import com.wr.datpt.contactbeta.Controller.ConvertContact;
import com.wr.datpt.contactbeta.MainActivity;
import com.wr.datpt.contactbeta.Model.ContactModel;
import com.wr.datpt.contactbeta.Model.SupportModel;
import com.wr.datpt.contactbeta.R;
import com.wr.datpt.contactbeta.View.StartedScreen.StartedScreenActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DatPT on 03/07/2018.
 */

public class HomeViewActivity extends AppCompatActivity{

    public  static final int RequestPermissionCode  = 1 ;
    Cursor cursor ;
    Toolbar toolbar;
    ListView listViewContact;
    ImageView imageView;
    Button buttonGetContact, buttonConvert, buttonSupport;
    ProgressBar progressBar;
    List<ContactModel> contactList;
    ContactAdapter contactAdapter;
    SupportAdapter supportAdapter;
    String name_Contact, phone_Number;
    List<SupportModel> listSp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeview_layout);

        toolbar = findViewById(R.id.toolbar);
        listViewContact = findViewById(R.id.list_contact);
        buttonGetContact = findViewById(R.id.bt_get_contact);
        buttonConvert = findViewById(R.id.bt_convert_contact);
        buttonSupport = findViewById(R.id.bt_info);
        progressBar = findViewById(R.id.progressBar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        //
        EnableRuntimePermission();
        GetContactsIntoArrayList();
        contactAdapter = new ContactAdapter(HomeViewActivity.this, contactList);

        listViewContact.setAdapter(contactAdapter);

        buttonGetContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                GetContactsIntoArrayList();

                contactAdapter = new ContactAdapter(HomeViewActivity.this, contactList);

                listViewContact.setAdapter(contactAdapter);

                contactAdapter.notifyDataSetChanged();
            }
        });

        buttonSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                listSp = creatList();

                supportAdapter = new SupportAdapter(HomeViewActivity.this, listSp);

                listViewContact.setAdapter(supportAdapter);
                Log.d("link",listSp.get(1).getUrl());

                supportAdapter.notifyDataSetChanged();
            }
        });
        //

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(HomeViewActivity.this);
                builder.setTitle("Convert Contact");
                builder.setMessage("Bạn có muốn chuyển đổi đầu số không?");
                builder.setCancelable(false);
                builder.setPositiveButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(HomeViewActivity.this, "Chưa chuyển đổi", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        //convert(contactList);
                        new GetData().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
//                getContactId = new ArrayList<>();
//                getContactId = getContactId(contactList);
//                        GetContactsIntoArrayList();
//                        contactAdapter = new ContactAdapter(HomeViewActivity.this, contactList);
//
//                        listViewContact.setAdapter(contactAdapter);
//
//                        contactAdapter.notifyDataSetChanged();
                        Toast.makeText(HomeViewActivity.this, "Đã chuyển đổi", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void EnableRuntimePermission(){

        if (ActivityCompat.shouldShowRequestPermissionRationale(
                HomeViewActivity.this,
                Manifest.permission.READ_CONTACTS))
        {

            Toast.makeText(HomeViewActivity.this,"CONTACTS permission allows us to Access CONTACTS app", Toast.LENGTH_LONG).show();

        } else {

            ActivityCompat.requestPermissions(HomeViewActivity.this,new String[]{
                    Manifest.permission.READ_CONTACTS}, RequestPermissionCode);

        }
    }

    @Override
    public void onRequestPermissionsResult(int RC, String per[], int[] PResult) {

        switch (RC) {

            case RequestPermissionCode:

                if (PResult.length > 0 && PResult[0] == PackageManager.PERMISSION_GRANTED) {

                    Toast.makeText(HomeViewActivity.this,"Permission Granted, Now your application can access CONTACTS.", Toast.LENGTH_LONG).show();

                } else {

                    Toast.makeText(HomeViewActivity.this,"Permission Canceled, Now your application cannot access CONTACTS.", Toast.LENGTH_LONG).show();

                }
                break;
        }
    }

    public void GetContactsIntoArrayList(){
        contactList = new ArrayList<>();
        cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null, null, ContactsContract.Contacts.DISPLAY_NAME + " COLLATE LOCALIZED ASC");
        int i=0;
            while (cursor.moveToNext()) {
                i++;
                String  id;
                int type;
                id = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_ID));

                name_Contact = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));

                phone_Number = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

                type = cursor.getInt(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.TYPE));


                ContactModel contactModel = new ContactModel();

                contactModel.setId_Contact(id);
                contactModel.setName_Contact(name_Contact);
                contactModel.setNumber_Contact(phone_Number);
                contactModel.setType_Phone(type);

                contactList.add(contactModel);
            }

        cursor.close();

    }


    // chuyển đổi các đầu số
    public void convert(List<ContactModel> contactList){

        List<String> listContactId = new ArrayList<>();
        ConvertContact convertContact = new ConvertContact();

        for (int i=0; i<contactList.size(); i++){

            String  newNumber = convertContact.convertAheadNumber(contactList.get(i).getNumber_Contact());
            long id_Contact = Long.parseLong(contactList.get(i).getId_Contact());
            int type_Phone = contactList.get(i).getType_Phone();
            Log.d("//////////", newNumber);
            if (newNumber.length() > 3) {
                updateContactPhoneByName(id_Contact,type_Phone,newNumber);
            }

        }
    }
    //tao luong

    private class GetData extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... strings) {
            convert(contactList);
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progressBar.setVisibility(View.GONE);
            GetContactsIntoArrayList();
            contactAdapter = new ContactAdapter(HomeViewActivity.this, contactList);

            listViewContact.setAdapter(contactAdapter);

            contactAdapter.notifyDataSetChanged();
        }
    }

    public void convertContact(List<String> listOldNumber, List<String> listNewNumber){

    }

    private void updatePhoneNumber(ContentResolver contentResolver, long rawContactId, int phoneType, String newPhoneNumber)
    {
        // Create content values object.
        Log.d("zzzzzz","xxxxxxxx");
        ContentValues contentValues = new ContentValues();

        // Put new phone number value.
        contentValues.put(ContactsContract.CommonDataKinds.Phone.NUMBER, newPhoneNumber);

        // Create query condition, query with the raw contact id.
        StringBuffer whereClauseBuf = new StringBuffer();

        // Specify the update contact id.
        whereClauseBuf.append(ContactsContract.Data.RAW_CONTACT_ID);
        whereClauseBuf.append("=");
        whereClauseBuf.append(rawContactId);

        // Specify the row data mimetype to phone mimetype( vnd.android.cursor.item/phone_v2 )
        whereClauseBuf.append(" and ");
        whereClauseBuf.append(ContactsContract.Data.MIMETYPE);
        whereClauseBuf.append(" = '");
        String mimetype = ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE;
        whereClauseBuf.append(mimetype);
        whereClauseBuf.append("'");

        // Specify phone type.
        whereClauseBuf.append(" and ");
        whereClauseBuf.append(ContactsContract.CommonDataKinds.Phone.TYPE);
        whereClauseBuf.append(" = ");
        whereClauseBuf.append(phoneType);

        // Update phone info through Data uri.Otherwise it may throw java.lang.UnsupportedOperationException.
        Uri dataUri = ContactsContract.Data.CONTENT_URI;

        // Get update data count.
        int updateCount = contentResolver.update(dataUri, contentValues, whereClauseBuf.toString(), null);
    }

    private int  updateContactPhoneByName(long rawContactId,int typePhone, String newNumber)
    {
        int ret = 0;

        ContentResolver contentResolver = getContentResolver();

        // Get raw contact id by display name.
        //long rawContactId = getRawContactIdByName(givenName, familyName);



        Log.d("idddd:", rawContactId + "");

        // Update data table phone number use contact raw contact id.
        if(rawContactId > -1) {
            // Update mobile phone number.
            updatePhoneNumber(contentResolver, rawContactId, typePhone, newNumber);

            updatePhoneNumber(contentResolver, rawContactId, ContactsContract.CommonDataKinds.Phone.TYPE_WORK, newNumber);
            updatePhoneNumber(contentResolver, rawContactId, ContactsContract.CommonDataKinds.Phone.TYPE_CUSTOM, newNumber);
            updatePhoneNumber(contentResolver, rawContactId, ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE, newNumber);

            // Update work mobile phone number.
            updatePhoneNumber(contentResolver, rawContactId, ContactsContract.CommonDataKinds.Phone.TYPE_WORK_MOBILE, "8888888888888888");

            // Update home phone number.
            updatePhoneNumber(contentResolver, rawContactId, ContactsContract.CommonDataKinds.Phone.TYPE_HOME, "99999999999999999");

            ret = 1;
        }else
        {
            ret = 0;
        }

        return ret;
    }

    private List<SupportModel> creatList(){
        List<SupportModel> list= new ArrayList<>();

        list.add(new SupportModel(1,"Đánh giá","https://www.facebook.com"));
        list.add(new SupportModel(2,"Chia sẻ","https://www.google.com/"));
        list.add(new SupportModel(3,"Phản hồi","https://www.youtube.com/"));

        return list;
    }

}

