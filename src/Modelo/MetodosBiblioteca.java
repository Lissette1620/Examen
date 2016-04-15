/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author administrador
 */
public class MetodosBiblioteca {
    private ArrayList <Biblioteca> arrayBiblioteca;
    private String arregloInformacion[]=new String[3];
    
    public MetodosBiblioteca()
    {
        arrayBiblioteca=new ArrayList <Biblioteca>();
    }
    public void agregar(String informacion[])
    {
        Biblioteca temporal=new Biblioteca(informacion[0],informacion[1],informacion[2],informacion[3]);
        arrayBiblioteca.add(temporal);
               
    }
    public void informacion()
    {
        for(int contador=0; contador<arrayBiblioteca.size();contador++)
        {
            System.out.println(arrayBiblioteca.get(contador).getInformacion());
        }
    }
    public boolean consultar(String numeroPrestamo)
    {
        boolean existe=false;
        for(int contador=0; contador<arrayBiblioteca.size();contador++)
        {
            if(arrayBiblioteca.get(contador).getNumeroPrestamo().equals(numeroPrestamo))
            {
                arregloInformacion[0]=arrayBiblioteca.get(contador).getNombreUsuario();
                arregloInformacion[1]=arrayBiblioteca.get(contador).getCedulaUsuario();
                arregloInformacion[2]=arrayBiblioteca.get(contador).getCodigoLibro();
                existe=true;
                
            }
        }
        return existe;
    }
    public void modificar(String arreglo[])
    {
      for(int contador=0; contador<arrayBiblioteca.size();contador++)
        {
            if(arrayBiblioteca.get(contador).getNumeroPrestamo().equals(arreglo[0]))
            {
                arrayBiblioteca.get(contador).setNombreUsuario(arreglo[1]);
                arrayBiblioteca.get(contador).setCedulaUsuario(arreglo[2]);
                arrayBiblioteca.get(contador).setCodigoLibro(arreglo[3]);
            }
        }
    }
    public void eliminar(String arreglo[])
    {
       for(int contador=0; contador<arrayBiblioteca.size();contador++)
        {
            if(arrayBiblioteca.get(contador).getNumeroPrestamo().equals(arreglo[0]))
            {
                arrayBiblioteca.remove(contador);
            }
            
        }
    }
    public String[] informacionArreglo()
    {
       for(int contador=0; contador<arrayBiblioteca.size();contador++)
       {
            arrayBiblioteca.get(contador).getInformacion();
       } 
       return arregloInformacion;
    }
    
}
