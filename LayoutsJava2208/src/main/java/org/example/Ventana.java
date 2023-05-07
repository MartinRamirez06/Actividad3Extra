package org.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends Frame {
    private Label lbletiqueta1;
    private Label lbletiqueta2;
    private TextField txtcuadro1;
    private TextField txtcuadro2;
    private Button boton1;
    private FlowLayout layout;


    public Ventana(String title) throws HeadlessException {
        super(title);
        layout= new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        lbletiqueta1=new Label("Etiqueta 1");
        this.add(lbletiqueta1);
        txtcuadro1=new TextField(60);
        this.add(txtcuadro1);
        lbletiqueta2=new Label("Etiqueta 2");
        this.add(lbletiqueta2);
        txtcuadro2=new TextField(60);
        this.add(txtcuadro2);




        this.setSize(800, 600);
       //Para que se cierre correctamente
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
}
