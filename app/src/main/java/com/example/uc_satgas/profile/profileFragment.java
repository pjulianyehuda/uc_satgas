package com.example.uc_satgas.profile;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.uc_satgas.R;
import com.example.uc_satgas.login.LoginFragment;


public class profileFragment extends Fragment {



    public profileFragment() {
        // Required empty public constructor
    }
    TextView account_nama, account_email;
    Button button_logout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);

        account_nama = view.findViewById(R.id.account_nama);
        account_email = view.findViewById(R.id.account_email);

        button_logout = view.findViewById(R.id.button_logout);

        button_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginFragment.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        return view;
    }
}