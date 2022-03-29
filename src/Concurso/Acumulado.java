package Concurso;

import javax.swing.JOptionPane;

public class Acumulado {
    
    int puntos;
    
    public void puntos1(){
        JOptionPane.showMessageDialog(null, "Correcto.\nGanaste 5 puntos");
        puntos+=5;
        
    }
    
    public void puntos2(){
        JOptionPane.showMessageDialog(null, "Correcto. \nGanaste 10 puntos más");
        puntos+=10;
    }
    
    
    public void puntos3(){
        JOptionPane.showMessageDialog(null,"Correcto. \nGanaste 15 puntos más");
        puntos+=15;
        
    }
    
    public void puntos4(){
        JOptionPane.showMessageDialog(null, "Correcto. \nGanas 20 puntos más");
        puntos+=20;
    }
    
    public void puntos5(){
        JOptionPane.showMessageDialog(null, "Excelente. \nObtienes los últimos 25 puntos");
        puntos+=25;
    }
    
    public void fallo(){
        if (puntos<75) JOptionPane.showMessageDialog(null, "Fallaste. \nTu puntuación fue de:"+puntos);
        
       
    }
    
    public void alcanzado(){
        JOptionPane.showMessageDialog(null, "Gracias por participar.\nTu puntuación fue: "+puntos);
    }
    
    public void total(){
        if (puntos ==75) JOptionPane.showMessageDialog(null, "Felicidades, has alcanzado la máxima puntuación: "+puntos);
        
    }
}
