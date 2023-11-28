package com.cens.plataforma.registro;



public class RegistroRequest {
    private final String nombre;
    private final String apellidoP;
    private final String apellidoM;
    private final String password;
    private final String email;
    public RegistroRequest(String nombre, String apellidoP, String apellidoM, String password, String email) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.password = password;
        this.email = email;
    }
    @Override
    public String toString() {
        return "RegistroRequest [nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM
                + ", password=" + password + ", email=" + email + "]";
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidoP() {
        return apellidoP;
    }
    public String getApellidoM() {
        return apellidoM;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellidoP == null) ? 0 : apellidoP.hashCode());
        result = prime * result + ((apellidoM == null) ? 0 : apellidoM.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RegistroRequest other = (RegistroRequest) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellidoP == null) {
            if (other.apellidoP != null)
                return false;
        } else if (!apellidoP.equals(other.apellidoP))
            return false;
        if (apellidoM == null) {
            if (other.apellidoM != null)
                return false;
        } else if (!apellidoM.equals(other.apellidoM))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }
}
