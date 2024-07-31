/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author carlo
 */
public class Cliente extends persona {
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
    public void agregar (){
    System.out.println("Nit: " + getNit () );
    System.out.println("Nombres: " + this.getNombres() );
    System.out.println("Apellidos: " + this.getApellidos() );
    System.out.println("direccion " + this.getDireccion() );
    System.out.println("Telefono: " + this.getTelefono());
    System.out.println("Fecha de nacimiento: " + this.getFecha_nacimiento() );
    }
}
