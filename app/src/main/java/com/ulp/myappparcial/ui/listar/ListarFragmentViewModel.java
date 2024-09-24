package com.ulp.myappparcial.ui.listar;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ulp.myappparcial.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class ListarFragmentViewModel extends AndroidViewModel {

    private MutableLiveData<List<Persona>> listaPersonas;

    public ListarFragmentViewModel(@NonNull Application application) {
        super(application);
        // Inicializa el MutableLiveData con una lista vacía
        listaPersonas = new MutableLiveData<>(new ArrayList<>());
    }

    public MutableLiveData<List<Persona>> getListaPersonas() {
        if (listaPersonas == null) { // Inicializar el MutableLiveData si es null
            listaPersonas = new MutableLiveData<>(new ArrayList<>());
        }
        return listaPersonas;
    }

    public void agregarPersona(Persona persona) {
        if (persona.getDni().isEmpty() || persona.getApellido().isEmpty() || persona.getNombre().isEmpty()) {
            Toast.makeText(getApplication(), "Los campos no pueden estar vacíos", Toast.LENGTH_SHORT).show();
        } else {
            List<Persona> personas = listaPersonas.getValue();
            if (personas != null) {
                personas.add(persona); // Agrega la nueva persona a la lista existente
                listaPersonas.setValue(personas); // Notifica a los observadores
            }
            Toast.makeText(getApplication(), "Persona guardada", Toast.LENGTH_SHORT).show();
        }
    }
}