package com.ulp.myappparcial.ui.listar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ulp.myappparcial.R;
import com.ulp.myappparcial.model.Persona;

import java.util.ArrayList;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolder> {

    private ArrayList<Persona> listaPersonas;
    private Context contexto;

    public PersonaAdapter(ArrayList<Persona> listaPersonas, Context contexto) {
        this.listaPersonas = listaPersonas;
        this.contexto = contexto;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_persona, parent, false); // Asegúrate de que el layout sea item_persona
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Persona persona = listaPersonas.get(position); // Obtiene el objeto Persona
        holder.tvNombre.setText(persona.getNombre());
        holder.tvApellido.setText(persona.getApellido());
        holder.tvDocumento.setText(persona.getDni());
        holder.tvEdad.setText(String.valueOf(persona.getEdad())); // Asumiendo que la edad es un entero
    }

    @Override
    public int getItemCount() {
        return listaPersonas.size(); // Cambiado de listaNotas a listaPersonas
    }

    // Clase interna para acceder a las propiedades del item
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNombre;
        public TextView tvApellido;
        public TextView tvDocumento;
        public TextView tvEdad;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvApellido = itemView.findViewById(R.id.tvApellido);
            tvDocumento = itemView.findViewById(R.id.tvDocumento);
            tvEdad = itemView.findViewById(R.id.tvEdad);
        }
    }
}
