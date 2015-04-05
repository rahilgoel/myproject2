package com.example.pilot;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MembersFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
	int position=getArguments().getInt("position");
	String[] members=getResources().getStringArray(R.array.members);
	View v=inflater.inflate(R.layout.fragment_layout, container,false);
	TextView tv=(TextView) v.findViewById(R.id.tv_content);
	tv.setText(members[position]);
	getActivity().getActionBar().setTitle(members[position]);
	return v;
		
	}
	
	

}
