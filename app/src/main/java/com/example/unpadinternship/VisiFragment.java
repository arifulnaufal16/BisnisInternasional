package com.example.unpadinternship;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.unpadinternship.R;

public class VisiFragment extends Fragment {
    public  VisiFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_visi,container,false);
        WebView wv = (WebView)v.findViewById(R.id.f_visi);
        wv.loadUrl("file:///android_asset/visi.html");
        return v;
    }
}