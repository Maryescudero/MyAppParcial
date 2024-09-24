package com.ulp.myappparcial.ui.listar;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ulp.myappparcial.R;
import com.ulp.myappparcial.databinding.FragmentListarBinding;

public class ListarFragment extends Fragment {

    private FragmentListarBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentListarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Configurar el RecyclerView
        binding.idLista.setLayoutManager(new LinearLayoutManager(getContext()));

        // Asegúrate de que listaPersona no es nula
        if (MainActivity.listaPersona != null) {
            PersonaAdapter personaAdapter = new PersonaAdapter(MainActivity.listaPersona, getContext());
            binding.idLista.setAdapter(personaAdapter);
        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}