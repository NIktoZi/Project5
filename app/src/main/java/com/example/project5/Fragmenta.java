package com.example.project5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class Fragmenta extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmenta, container, false);
        Button goFragmetb = view.findViewById(R.id.go_fragmentb);
        goFragmetb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String exampleD = "Hello!";
                Bundle bundle = new Bundle();
                bundle.putString("example", exampleD);
                Navigation.findNavController(view).navigate(R.id.action_fragmenta_fragmentb, bundle);
            }
        });
        return view;
    }

}
