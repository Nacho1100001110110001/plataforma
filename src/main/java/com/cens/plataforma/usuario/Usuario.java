package com.cens.plataforma.usuario;

public class Usuario {
    private Long id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String email;
    private String password;
    private Integer idRol;
    
    public Usuario(Long id, String nombre, String apellidoP, String apellidoM, String email, String password,
            Integer idRol) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.email = email;
        this.password = password;
        this.idRol = idRol;
    }

    public Usuario(String nombre, String apellidoP, String apellidoM, String email, String password, Integer idRol) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.email = email;
        this.password = password;
        this.idRol = idRol;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM
                + ", email=" + email + ", password=" + password + ", idRol=" + idRol + "]";
    }

    
}
