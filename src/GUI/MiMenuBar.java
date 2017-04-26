/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Jesús
 */
public class MiMenuBar extends JPanel{
    //Componentes
    private JMenuBar barraMenu;
    private JMenu JMenuPerfil;
    private JMenu JMenuCarrera;
    private JMenu JMenuMCarrera;
    private JMenu JMenuCorredores;
   
    //Constructor
    public MiMenuBar(){
        inicializar();
        }
    
    private void inicializar(){
        barraMenu=new JMenuBar();
        JMenuPerfil = new JMenu("Mi Perfil");
        JMenuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPerfilMouseClicked(evt);
            }
        });
        JMenuMCarrera = new JMenu("Mis Carreras");
        JMenuMCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMCarreraMouseClicked(evt);
            }
        });
        JMenuCorredores = new JMenu("Corredores");
        JMenuCorredores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCorredoresMouseClicked(evt);
            }
        });
        JMenuCarrera = new JMenu("Carreras");
        JMenuCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCarrerasMouseClicked(evt);
            }
        });
        barraMenu.add(JMenuPerfil);
        barraMenu.add(JMenuMCarrera);
        barraMenu.add(JMenuCarrera);
        barraMenu.add(JMenuCorredores);
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }
    
    //METODOS PARA LOS EVENTOS DE JMENU
    private void jMenuPerfilMouseClicked(java.awt.event.MouseEvent evt) {                                         
        System.out.println("HAS PULSADO PERFIL");
    }
    private void jMenuMCarreraMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("Has pulsado mis carreras");
    }
    private void jMenuCarrerasMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("Has pulsado en carreras");
    }
    private void jMenuCorredoresMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.println("Has pulsado en carredores");
    }
    
}
