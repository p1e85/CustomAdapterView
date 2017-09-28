package com.example.customadapterview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterView extends BaseAdapter {
	String[] albums = {"Bleach", "In Utero", "Bleach", "In Utero", "Bleach", "In Utero", "Bleach", "In Utero", "Bleach", "In Utero"};
	Integer[] imageId = {R.drawable.bleach, R.drawable.in_utero};

	@Override
	public int getCount() {
		return albums.length;
	}

	@Override
	public Object getItem(int position) {
		if (position < getCount() && position >= 0)
			return albums[position];
		
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = LayoutInflater.from(parent.getContext());
		
		if (position % 2 == 0) {
			convertView = inflater.inflate(R.layout.custom_row, parent, false);
			ImageView im1 = (ImageView) convertView.findViewById(R.id.imageView1);
			im1.setImageResource(imageId[0]);
		} else {
			convertView = inflater.inflate(R.layout.custom_row, parent, false);
			ImageView im1 = (ImageView) convertView.findViewById(R.id.imageView1);
			im1.setImageResource(imageId[1]);
		}
			TextView tv1 = (TextView) convertView.findViewById(R.id.customRowTV);
			tv1.setText((String) getItem(position));
		return convertView;
	}

}
