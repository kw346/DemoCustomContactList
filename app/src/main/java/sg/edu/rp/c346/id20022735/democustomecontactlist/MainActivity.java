package sg.edu.rp.c346.id20022735.democustomecontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;
    ArrayList<Contact> alContactlist;
    CustomAdapter caContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts = findViewById(R.id.listViewContacts);
        alContactlist = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        alContactlist.add(item1);

        Contact item2 = new Contact("Ken", 65, 97442437, 'M');
        alContactlist.add(item2);


        caContact = new CustomAdapter(this,R.layout.row,alContactlist);
        lvContacts.setAdapter(caContact);
    }
}