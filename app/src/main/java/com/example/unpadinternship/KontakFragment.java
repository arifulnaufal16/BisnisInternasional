package com.example.unpadinternship;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.unpadinternship.R;

public class KontakFragment extends Fragment {

    public  KontakFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_kontak,container,false);
        WebView wv = (WebView)v.findViewById(R.id.f_kontak);
        wv.loadUrl("file:///android_asset/kontak.html");
        return v;
    }

}