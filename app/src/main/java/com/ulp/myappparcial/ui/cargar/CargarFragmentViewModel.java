package com.ulp.myappparcial.ui.cargar;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.ulp.myappparcial.model.Persona;

public class CargarFragmentViewModel extends AndroidViewModel {

    public CargarFragmentViewModel(@NonNull Application application) {
        super(application);
    }

    public boolean cargarPersona(String documento, String apellido, String nombre, String edad) {
        if (documento.isEmpty() || apellido.isEmpty() || nombre.isEmpty() || edad.isEmpty()) {

            Toast.makeText(getApplication(), "Todos los campos deben estar completos", Toast.LENGTH_SHORT).show();
            return false;
        } else {

            Persona nuevaPersona = new Persona(documento, apellido, nombre, edad);
            MainActivity.listaPersona.add(nuevaPersona); // Asegúrate de que esta lista esté destinada a almacenar objetos Persona
            Toast.makeText(getApplication(), "Persona agregada", Toast.LENGTH_SHORT).show();
            return true;
        }
    }
}