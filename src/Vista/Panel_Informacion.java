/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_VentanaPrincipal;

/**
 *
 * @author administrador
 */
public class Panel_Informacion extends javax.swing.JPanel {

    Controlador_FRM_VentanaPrincipal controlador;
    public Panel_Informacion() {
        initComponents();
        deshabilitarCampos();
    }
    public void agregarEventos(Controlador_FRM_VentanaPrincipal controlador)
    {
        this.jt_NumeroPrestamo.addActionListener(controlador);
        this.jt_NombreUsuario.addActionListener(controlador);
        this.jt_CedulaUsuario.addActionListener(controlador);
        this.jt_CodigoLibro.addActionListener(controlador);
    }
    public String devolverNumeroPrestamo()
    {
        return this.jt_NumeroPrestamo.getText();
    }
    public String[] devolverInformacion()
    {
        String informacion[]=new String[4];
        informacion[0]=this.jt_NumeroPrestamo.getText();
        informacion[1]=this.jt_NombreUsuario.getText();
        informacion[2]=this.jt_CedulaUsuario.getText();
        informacion[3]=this.jt_CodigoLibro.getText();
        return informacion;
    }
    public void deshabilitarCampos()
    {
        this.jt_NumeroPrestamo.setEnabled(true);
        this.jt_NumeroPrestamo.setText("");
        
        this.jt_NombreUsuario.setText("");
        this.jt_NombreUsuario.setEnabled(false);
        
        this.jt_CedulaUsuario.setText("");
        this.jt_CedulaUsuario.setEnabled(false);
        
        this.jt_CodigoLibro.setText("");
        this.jt_CodigoLibro.setEnabled(false);
                          
    }
    public void mostrarInformacion(String info[])
    {
        info[0]=this.jt_NombreUsuario.getText();
        info[1]=this.jt_CedulaUsuario.getText();
        info[2]=this.jt_CodigoLibro.getText();
      
        
    }
    public void habilitarEdicion()
    {
        this.jt_NombreUsuario.setEnabled(true);
        this.jt_CedulaUsuario.setEnabled(true);
        this.jt_CodigoLibro.setEnabled(true);
    }
    public void habilitarAgregar()
    {
       this.jt_NombreUsuario.setEnabled(true);
       this.jt_CedulaUsuario.setEnabled(true);
       this.jt_CodigoLibro.setEnabled(true); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NumeroPrestamo = new javax.swing.JLabel();
        jl_NombreUsuario = new javax.swing.JLabel();
        jl_CedulaUsuario = new javax.swing.JLabel();
        jl_CodigoLibro = new javax.swing.JLabel();
        jt_NumeroPrestamo = new javax.swing.JTextField();
        jt_NombreUsuario = new javax.swing.JTextField();
        jt_CedulaUsuario = new javax.swing.JTextField();
        jt_CodigoLibro = new javax.swing.JTextField();

        jl_NumeroPrestamo.setText("Número de Préstamo");

        jl_NombreUsuario.setText("Nombre de Usuario");

        jl_CedulaUsuario.setText("Cédula del Usuario");

        jl_CodigoLibro.setText("ISBN del Libro");

        jt_NumeroPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_NumeroPrestamoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_NumeroPrestamo)
                            .addComponent(jl_CedulaUsuario)
                            .addComponent(jl_CodigoLibro))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_CodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jl_NombreUsuario)))
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_NumeroPrestamo)
                    .addComponent(jt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_NombreUsuario)
                    .addComponent(jt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jl_CedulaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_CedulaUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_CodigoLibro)
                    .addComponent(jt_CodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_NumeroPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NumeroPrestamoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10)
        {
            this.controlador.buscar();
           
        }
    }//GEN-LAST:event_jt_NumeroPrestamoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CedulaUsuario;
    private javax.swing.JLabel jl_CodigoLibro;
    private javax.swing.JLabel jl_NombreUsuario;
    private javax.swing.JLabel jl_NumeroPrestamo;
    private javax.swing.JTextField jt_CedulaUsuario;
    private javax.swing.JTextField jt_CodigoLibro;
    private javax.swing.JTextField jt_NombreUsuario;
    private javax.swing.JTextField jt_NumeroPrestamo;
    // End of variables declaration//GEN-END:variables
}
