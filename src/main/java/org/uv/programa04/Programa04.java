/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa04;

/**
 *
 * @author LilyE
 */
public class Programa04 {

    public static void main(String[] args) {
        DAOEmpleado daoEmpleado = new DAOEmpleado();
        Empleado emp = new Empleado();
        emp.setClave(04);
        emp.setNombre("Angel");
        emp.setDireccion("Av Margaritas");
        emp.setTelefono("44844");
        
        daoEmpleado.create(emp);
    }
}
