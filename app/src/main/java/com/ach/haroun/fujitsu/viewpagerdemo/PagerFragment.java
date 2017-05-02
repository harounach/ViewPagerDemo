package com.ach.haroun.fujitsu.viewpagerdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PagerFragment extends Fragment {


    public PagerFragment() {
        // Required empty public constructor
    }

    public static PagerFragment newInstance(int sectionNumber){
        PagerFragment fragment = new PagerFragment();
        Bundle args = new Bundle();
        args.putInt("section_number", sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_pager, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.text_view_id);
        textView.setText(getString(R.string.section_format, getArguments().getInt("section_number")));
        return rootView;
    }

}
