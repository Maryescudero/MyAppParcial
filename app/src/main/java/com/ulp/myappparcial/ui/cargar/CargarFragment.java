package com.ulp.myappparcial.ui.cargar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ulp.myappparcial.MainActivity;
import com.ulp.myappparcial.databinding.FragmentCargarBinding;
import com.ulp.myappparcial.model.Persona;
import com.ulp.myappparcial.ui.listar.ListarFragmentViewModel;

public class CargarFragment extends Fragment {

    private FragmentCargarBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentCargarBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btCargar.setOnClickListener(v -> {
            // Obtener los datos
            String documento = binding.tvDocumento.getText().toString().trim();
            String apellido = binding.tvApellido.getText().toString().trim();
            String nombre = binding.tvNombre.getText().toString().trim();
            String edad = binding.tvEdad.getText().toString().trim();

            // Valida
            if (TextUtils.isEmpty(documento) || TextUtils.isEmpty(apellido) ||
                    TextUtils.isEmpty(nombre) || TextUtils.isEmpty(edad)) {
                // Muestra error
                if (TextUtils.isEmpty(documento)) {
                    binding.tvDocumento.setError("El documento no puede estar vacío");
                }
                if (TextUtils.isEmpty(apellido)) {
                    binding.tvApellido.setError("El apellido no puede estar vacío");
                }
                if (TextUtils.isEmpty(nombre)) {
                    binding.tvNombre.setError("El nombre no puede estar vacío");
                }
                if (TextUtils.isEmpty(edad)) {
                    binding.tvEdad.setError("La edad no puede estar vacía");
                }
            } else {
                Persona nuevaPersona = new Persona(documento, apellido, nombre, edad);
                ((MainActivity) getActivity()).agregarPersona(nuevaPersona); // Llama al método en MainActivity
                // Limpiar
                binding.tvDocumento.setText("");
                binding.tvApellido.setText("");
                binding.tvNombre.setText("");
                binding.tvEdad.setText("");
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
