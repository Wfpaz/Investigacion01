/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author bernardo
 */
public class Fondo extends javax.swing.JPanel {

    private String path;
    
public Fondo(String direccion, int width, int height) {
this.setSize(width, height); //se selecciona el tamaño del panel
this.path = direccion;
}

//Se crea un método cuyo parámetro debe ser un objeto Graphics

public void paint(Graphics grafico) {
Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

ImageIcon Img = new ImageIcon(ClassLoader.getSystemResource(path)); 

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

setOpaque(false);
super.paintComponent(grafico);
}
}