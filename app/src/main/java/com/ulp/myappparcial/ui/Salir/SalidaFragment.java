package com.ulp.myappparcial.ui.Salir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.ulp.myappparcial.databinding.FragmentSalidaBinding;

public class SalidaFragment extends Fragment {

    private FragmentSalidaBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentSalidaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }
}
