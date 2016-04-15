/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosBiblioteca;
import Vista.FRM_VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author administrador
 */
public class Controlador_FRM_VentanaPrincipal implements ActionListener{
    MetodosBiblioteca metodosBiblioteca;
    FRM_VentanaPrincipal frm_VentanaPrincipal;
    
    public Controlador_FRM_VentanaPrincipal( FRM_VentanaPrincipal frm_VentanaPrincipal)
    {
        this.frm_VentanaPrincipal=frm_VentanaPrincipal;
        metodosBiblioteca=new MetodosBiblioteca();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals(("Agregar")))
        {
           
           metodosBiblioteca.agregar(frm_VentanaPrincipal.devolverInformacion());
           frm_VentanaPrincipal.mensage("Agregado con Éxito");
           frm_VentanaPrincipal.resetearGUI();
        }
        if(e.getActionCommand().equals(("Buscar")))
        {
           buscar(); 
        }
        if(e.getActionCommand().equals(("Modificar")))
        {
           metodosBiblioteca.modificar(frm_VentanaPrincipal.devolverInformacion());
           frm_VentanaPrincipal.mensage("Modificado con éxito");
           frm_VentanaPrincipal.resetearGUI();
        }
        if(e.getActionCommand().equals(("Eliminar")))
        {
            metodosBiblioteca.eliminar(frm_VentanaPrincipal.devolverInformacion());
            frm_VentanaPrincipal.mensage("Eliminado con éxito");
            frm_VentanaPrincipal.resetearGUI();
        
        }
    }
    public void buscar()
    {
        if(metodosBiblioteca.consultar(frm_VentanaPrincipal.agregarNumeroPrestamo()))
        {
           frm_VentanaPrincipal.mostrarInformacion(metodosBiblioteca.informacionArreglo());
           frm_VentanaPrincipal.devolverInformacion();
           frm_VentanaPrincipal.resetearGUI(); 
        } 
        else
        {
            
            frm_VentanaPrincipal.mensage("Número de préstamo no registrado");
            frm_VentanaPrincipal.habilitarAgregar();
            frm_VentanaPrincipal.resetearGUI();
                    
           
            
        }
            
    }
    
}
