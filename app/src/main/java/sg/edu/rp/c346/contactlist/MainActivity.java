package sg.edu.rp.c346.contactlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;

    ArrayList<Contacts> alContactList;

    CustomAdapter caContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts = findViewById(R.id.listViewContacts);

        alContactList = new ArrayList<>();

        Contacts contact1 = new Contacts("Mary",65,65442334);
        alContactList.add(contact1);
        Contacts contact2 = new Contacts("Ken",65,97442437);
        alContactList.add(contact1);

        caContact = new CustomAdapter(this, R.layout.contacts_item, alContactList);

        lvContacts.setAdapter(caContact);


    }



}