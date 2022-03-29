package Concurso;

import javax.swing.JOptionPane;

public class Juego {
    
    public static void main(String [] Args){
        
        Preguntas Respuesta = new Preguntas();
        Preguntas Jugador = new Preguntas();
        Acumulado Puntuacion = new Acumulado();
        int empezar;
        
        
        empezar = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido/a\nDigite el número para la opción que desee\n1.Empezar      2.Salir"));
        
       
        if (empezar == 1)Respuesta.primerNivel();{
        if (empezar == 2)JOptionPane.showMessageDialog(null, "Gracias por participar");
        if (Respuesta.pregunta == 2)Puntuacion.puntos1();
        if (Respuesta.pregunta == 5)Puntuacion.alcanzado();
        if (Respuesta.pregunta==1 || Respuesta.pregunta==3 || Respuesta.pregunta==4)Puntuacion.fallo();
    }
     
        if (Respuesta.pregunta==2)Respuesta.segundoNivel();{
        if (Respuesta.pregunta == 4)Puntuacion.puntos2();
        if (Respuesta.pregunta == 5)Puntuacion.alcanzado();
        if (Respuesta.pregunta==1 || Respuesta.pregunta==3 || Respuesta.pregunta==2)Puntuacion.fallo();
    }
        if (empezar == 1)Respuesta.tercerNivel();
        if (Respuesta.pregunta == 2)Puntuacion.puntos3();
        if (Respuesta.pregunta == 5)Puntuacion.alcanzado();
        if (Respuesta.pregunta==1 || Respuesta.pregunta==3 || Respuesta.pregunta==4)Puntuacion.fallo();
        
        if (empezar == 1)Respuesta.cuartoNivel();
        if (Respuesta.pregunta == 2)Puntuacion.puntos4();
        if (Respuesta.pregunta == 5)Puntuacion.alcanzado();
        if (Respuesta.pregunta==1 || Respuesta.pregunta==3 || Respuesta.pregunta==4)Puntuacion.fallo();
        
        if (empezar == 1)Respuesta.quintoNivel();
        if (Respuesta.pregunta == 1)Puntuacion.puntos5();
        if (Respuesta.pregunta == 5)Puntuacion.alcanzado();
        if (Respuesta.pregunta==2 || Respuesta.pregunta==3 || Respuesta.pregunta==4)Puntuacion.fallo();
        if (Respuesta.pregunta==1)Puntuacion.total();
       
       
    }
}
