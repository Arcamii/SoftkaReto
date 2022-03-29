package Concurso;

import javax.swing.JOptionPane;

public class Preguntas {
    
  int pregunta;
  int azar;
  
    public void primerNivel() {//Banco de preguntas y niveles de dificultad

        String primeras[] = {"¿Cuales son los colores primarios?\n1.Rojo, verde y naranja\n2.Amarillo, rojo y azul.\n3.	Negro, blanco y gris.\n4.Púrpura, amarillo y azul.\n5. Salir "
        ,"¿De qué color era el caballo blanco de Cristobal Colón?\n1.Marrón\n2.Blanco\n3.Negro\n4.Rojo\n5. Salir"
        ,"¿Cuánto es 2+3?\n1.6\n2.5\n3.8\n4.4\nn5. Salir"
        ,"¿Cuál es la capital de Colombia?\n1.Medellín\n2.Bogotá\n3.Cali\n4.Ibagué\n5. Salir",
        "¿Cuál deporte practica James Rodriguez?\n1.baseball\n2.futbol\n3.Basketball\n4.Rugby\n5. Salir"};
        azar = (int) (Math.random()*5);
        pregunta = Integer.parseInt(JOptionPane.showInputDialog("Primera pregunta \n" + primeras[azar]));
        
    
        }
    
    public void segundoNivel(){
        
        String segundas[] = {"¿Cuántas patas tiene la araña?\n1.5\n2.12\n3.6\n4.8\n5. Salir",
        "¿Qué instrumento óptico permite ver los astros de cerca?\n1.Lentes\n2.Microscopio\n3.Binoculares\n4.Telescopio\n 5. Salir",
        "¿Cuál es el libro sagrado del catolicismo?\n1.Corán\n2.Tipitaka\n3.Rig-Veda\n4.Biblia\n5. Salir",
        "¿Cuál es la moneda oficial de Estados Unidos?\n1.Dinar\n2.Bolivar\n3.Peso\n4.Dólar\n5. Salir",
        "¿Cual era el país de origen de Gabriel Garcia Marquez?\n1.Perú\n2.Ecuador\n3.Chile\n4.Colombia\n5. Salir"};
       azar = (int) (Math.random()*5);
       pregunta =Integer.parseInt(JOptionPane.showInputDialog("Segunda pregunta \n" + segundas[azar]));
        
    }
        
    public void tercerNivel(){
        
        String terceras[] = {"¿Donde está ubicada la torre Eiffel\n1.Colombia\n2.Francia\n3.Italia\n4.Inglaterra\n5. Salir",
        "¿Cómo se llama el proceso por el cual las plantas obtienen alimento?\n1.Digestión\n2.Fotosíntesis\n3.Absorción\n4.Desintegración\n5. Salir",
        "¿En cuál batalla murió Napoleon Bonaparte?\n1.En la primera\n2.En la última\n3.En la tercera\n4.En la cuarta\n5. Salir",
        "¿En qué país se usó la primera bomba atómica en combate?\n1.Estados Unidos\n2.Japón\n3.Canadá\n4.China\n5. Salir",
        "En que país se encuentra el estadio wembley?\n1.Colombia\n2.Reino unido\n3.Francia\n4.Italia\n5. Salir"};
       
        azar = (int) (Math.random()*5);
        pregunta = Integer.parseInt(JOptionPane.showInputDialog("Tercera pregunta \n" + terceras[azar]));
       
    }
        
    public void cuartoNivel(){
        
        String cuartas[] = {"¿En qué año se aprobó la constitución española?\n1.1972\n2.1978\n3.1975\n4.1976\n5. Salir",
        "¿Cual es el ave voladora mas grande en la actualidad?\n1.Águila\n2.Condor andino\n3.Colibrí\n4.Halcón\n5. Salir",
        "¿Cuantos corazones tienen los pulpos?\n1.Dos\n2.Tres\n3.Cuatro\n4.Uno\n5. Salir",
        "¿En que año se produce la revolución francesa?\n1.1792\n2.1789\n3.1780\n4.1799\n5. Salir",
        "¿Donde se celebraron los juegos olímpicos del 1992?\n1.Colombia\n2.España\n3.Portugal\n4.Brasil\n5. Salir"};
        
        azar = (int)(Math.random()*5);
        pregunta = Integer.parseInt(JOptionPane.showInputDialog("Cuarta pregunta \n" + cuartas[azar]));
        
    }
    
    public void quintoNivel(){
        
        String quintas[] = {"¿De qué país es originario el café?\n1.Etiopia\n2.Ecuador\n3.Colombia\n4.Guyana\n5. Salir",
        "¿Cuál es el metal mas caro del mundo?\n1.Platino\n2.Oro\n3.Hierro\n4.Diamante\n5. Salir",
        "¿Cuánto vale el numero pi?\n1.3.1416\n2.4.2058\n3.5.2365\n4.3.5819\n5. Salir",
        "¿Cómo se llama la energía contenida en el núcleo de los átomos?\n1.Energía nuclear\n2.Energía eólica\n3.Energía solar\n4.Energía eléctrica\n5. Salir",
        "¿Cuál es el único mamífero capaz de volar?\n1.Murciélago\n2.Tucán\n3.Ardilla voladora\n4.Halcón\n5. Salir"};
        
        azar = (int)(Math.random()*5);
        pregunta = Integer.parseInt(JOptionPane.showInputDialog("Quinta pregunta \n" + quintas[azar]));
                
      
    }
    }
