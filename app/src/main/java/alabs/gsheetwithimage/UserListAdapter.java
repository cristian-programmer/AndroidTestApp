package alabs.gsheetwithimage;

/**
 * Created by ADJ on 8/8/2017.
 */


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;



public class UserListAdapter extends ArrayAdapter<String> {
    private String[] uId;
    private String[] uNames;
    private String[] uImages;
    private String[] uCell;
    private String[] uAdd;
    private Activity context;

    public UserListAdapter(Activity context, String[] uId, String[] uNames, String[] uCell, String [] uAdd ,String[] uImages) {
        super(context, R.layout.list_row, uId);
        this.context = context;
        this.uId = uId;
        this.uNames = uNames;
        this.uImages = uImages;
        this.uCell = uCell;
        this.uAdd = uAdd;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_row, null, true);
        TextView textViewId = (TextView) listViewItem.findViewById(R.id.tv_uid);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.tv_uname);
        TextView textViewCell = (TextView) listViewItem.findViewById(R.id.tv_cell);
        TextView textViewAdd = (TextView) listViewItem.findViewById(R.id.tv_add);
        ImageView iv = (ImageView)listViewItem.findViewById(R.id.imageView3);


        textViewId.setText(uId[position]);
        textViewName.setText(uNames[position]);
        textViewCell.setText(uCell[position]);
        textViewAdd.setText(uAdd[position]);
       // Uri uri = Uri.parse(uImages[position]);
        //Uri uri = Uri.parse("https://drive.google.com/uc?id=0B___GhMLUVtOY09SbDU5cDU2T1U");
       // draweeView.setImageURI(uri);

        Picasso.with(context).load(uImages[position]).into(iv);

        return listViewItem;
    }
}