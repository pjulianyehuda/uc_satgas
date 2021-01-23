package com.example.uc_satgas.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.uc_satgas.MainActivity;
import com.example.uc_satgas.R;
import com.example.uc_satgas.satgas.satgasFragment;
import com.example.uc_satgas.splash.splashFragment;
import com.google.android.material.textfield.TextInputLayout;


public class LoginFragment extends Fragment {

    EditText login_email;
    EditText login_passwd;
    Button login_button;
    String email="", passwd="";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_login,container, false);

        login_button = view.findViewById(R.id.login_button);
        login_email = view.findViewById(R.id.login_email);
        login_passwd = view.findViewById(R.id.login_passwd);


        login_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                NavDirections actions = LoginFragmentDirections.actionLoginFragmentToSatgasFragment();
                Navigation.findNavController(view).navigate(actions);
                Toast.makeText(requireActivity(),  "Success", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}