package com.androideity.pestanas;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Pestana3 extends ListActivity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] eurocopa = getResources().getStringArray(R.array.eurocopa);
        setListAdapter(new ArrayAdapter(this, R.layout.pestana3, eurocopa));
    }
}
