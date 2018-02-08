package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Espiral
{    
      
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            
            objetos = new City("Ciudad 3.txt");
	    objetos.showThingCounts(true);
            
           
            estudiante = new Robot(objetos,1, 0, Direction.EAST,30);
            
            
            
            
        }
}