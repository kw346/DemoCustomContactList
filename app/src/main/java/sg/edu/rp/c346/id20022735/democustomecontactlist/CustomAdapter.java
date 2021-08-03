package sg.edu.rp.c346.id20022735.democustomecontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;


    public CustomAdapter(Context context,int resource,ArrayList<Contact>objects){
        super(context,resource,objects);

        parent_context=context;
        layout_id=resource;
        contactList=objects;
}
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater=(LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView=inflater.inflate(layout_id,parent,false);

        TextView tvName=rowView.findViewById(R.id.name);
        TextView tvCode=rowView.findViewById(R.id.councode);
        TextView tvNum = rowView.findViewById(R.id.no);
        ImageView ivGen = rowView.findViewById(R.id.imageView);

        Contact currentItem=contactList.get(position);

        tvName.setText(currentItem.getName());
        tvCode.setText("+ " + currentItem.getCountryCode());
        tvNum.setText(currentItem.getPhoneNum()+ "");
        // they accept specific set of integer oni

            if (currentItem.getGender() == 'F'){
                ivGen.setImageResource(R.drawable.female);
            }
            else if (currentItem.getGender() == 'M'){
                ivGen.setImageResource(R.drawable.male);
            }



        return rowView;
    }
}
