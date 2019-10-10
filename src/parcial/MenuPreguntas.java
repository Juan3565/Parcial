package parcial;

import javax.swing.JOptionPane;

public class MenuPreguntas {
        public static void main(String [] args){
            Parcial MenuPreguntas = new Parcial();
        
    do{
    private int opcion;
{
    try{
        
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion"
        
        + "\n1.¿Què es un commi?"
        + "\n2.¿Què es un push?"
        + "\n3.¿Què es un pull?"
        + "\n4.¿Què es una clase?"
        + "\n5.¿Què es un objeto?"
        + "\n6. Nombre Estudiante"
        + "\n7. Fecha"
        + "\n8. Salir"));        
        
          }catch(Exception ex){
              
    JOptionPane.showMessageDialog(null,"Ingrese los valores numericos");
                
        
    }
    switch(opcion){
        case 1:
            JOptionPane.showMessageDialog(null,"se refiere, en el contexto de la ciencia de la computación y la gestión de datos, a la idea de confirmar un conjunto de cambios provisionales de forma permanente. Un uso popular es al final de una transacción de base de datos");
            break;
            
        case 2:
            JOptionPane.showMessageDialog(null,"es una forma de comunicación a través de internet en la que la petición de envío tiene origen en el servidor, por oposición a la tecnología pull, en la que la petición tiene origen en el cliente.");
            break;
            
        case 3:
            JOptionPane.showMessageDialog(null,"es una lista ordenada o estructura de datos que permite almacenar y recuperar datos, siendo el modo de acceso a sus elementos de tipo LIFO");
            break;
            
        case 4:
            JOptionPane.showMessageDialog(null,"es un modelo que define un conjunto de variables  métodos apropiados para operar con dichos datos ");
            break;
            
        case 5:
            JOptionPane.showMessageDialog(null,"un objeto es una unidad dentro de un programa de computadores que consta de un estado y de un comportamiento, que a su vez constan respectivamente de datos almacenados y de tareas realizables durante el tiempo de ejecución.");
            break;
            
        case 6:
            JOptionPane.showMessageDialog(null,"Juan camilo Hermosa");
            break;
            
        case 7:
            JOptionPane.showMessageDialog(null,"10/10/2019");
            break;
            
        case 8:
            JOptionPane.showMessageDialog(null,"SALIR");
            break;
         
            
   }while(opcion>0 && opcion <=8);
}
}
    
    
    