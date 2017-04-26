package com.example.yvtc.myh0426;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
    ListView lv;
    String str[]={"AAA","BBB","CCC"};
    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_a,container,false);

        lv = (ListView)v.findViewById(R.id.listView);

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_list_item_1,str);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = (TextView)getActivity().findViewById(R.id.textView);
                ImageView img = (ImageView)getActivity().findViewById(R.id.imageView);
                switch(position){
                    case 0:

                    case 1:
                        tv.setVisibility(View.VISIBLE);
                        img.setVisibility(View.GONE);
                        tv.setText(str[position]);
                        break;
                    case 2:
                        tv.setVisibility(View.GONE);
                        img.setVisibility(View.VISIBLE);
                        break;

                }


            }
        });
    }
}
