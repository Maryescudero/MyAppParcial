package com.ulp.myappparcial.ui.Salir;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

public class Dialogo {
    public static void mostrarDialogo(Context context) {
        new AlertDialog.Builder(context)
                .setMessage("¿Desea salir del explorador?")
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Cierra la aplicación
                        ((Activity) context).finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss(); // Cierra el diálogo
                    }
                })
                .show();
    }
}
