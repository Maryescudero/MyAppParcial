package com.ulp.myappparcial.model;

public class Persona {

        private String dni;
        private String apellido;
        private String nombre;
        private int edad;

        public Persona(String dni, String apellido, String nombre, int edad) {
            this.dni = dni;
            this.apellido = apellido;
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getDni() { return dni; }
        public String getApellido() { return apellido; }
        public String getNombre() { return nombre; }
        public int getEdad() { return edad; }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


