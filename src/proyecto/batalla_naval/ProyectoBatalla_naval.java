//////Universidad UAM
//////Curso de Programacion 1
//////Profesor Leonardo Sandoval
//////Jose Alberto Miranda Cortes

//////Fecha de inicio 07/12/2021
///////////////////////////////////////////////////////////
/////Bitacora de modificacion
//////Modificado por JOSE ALBERTO MIRANDA
/////Se ajustaron valores y se crearon opciones de menu y try catch
///////////Modificado el 22/12/2021 hora 01:35 AM
///////////////////////////////////////////////////////////
///////Si este codigo es modificado tome en cuenta que la siguiente operacion consta de varias partes o metodos.
//////Por ende manejese con orden ya que si un valor es remplazado este puede ocacionar un error en el programa
package proyecto.batalla_naval;  


import javax.swing.JOptionPane;

public class ProyectoBatalla_naval {
    
           public static char[][] mar_azul = new char [7][7];
           public static char[][] mar_rojo = new char [7][7];
           
              static int portaavionesA = 5;  ///P    /////BARCOS DE JUGADOR 1 O AZUL
              static int submarinosA = 4;  ///S              
              static int acorazadoA = 6;  ///A              
              static int destructorA = 6; ///D
              
              static int portaavionesR = 5;  ///P     ////BARCOS DE JUGADOR 2 O ROJO  
              static int submarinosR = 4;  ///S              
              static int acorazadoR = 6;  ///A              
              static int destructorR = 6; ///D
              
              static int puntuacion_rojo = 0;
              static int puntuacion_azul = 0;              
              
            public static String jugador1= " ";     ///////nombre 1
            public static String jugador2= " ";     //////nombre 2
            
                public static char jugador_activo= 'x';
                
                ///////////////////Tablero rojo///////////////////
                
                public static void Nombres() {    //////agrega nombres
              jugador1 = JOptionPane.showInputDialog("Ingrese jugador1");            ///Ventana que solicita nombre
              jugador2 = JOptionPane.showInputDialog("Ingrese jugador2");            ///Ventana que solicita nombre
          }
              ///////////////////////////////////////////////
                public static String IniciarTablero_rojo() { ///////creacion del tablero del mar rojo
                    String Resultado = "";
               for (int i = 0; i < mar_rojo.length; i++) {  ///inicio for 
                 for (int j = 0; j < mar_rojo.length; j++) {
                     mar_rojo[i][j] = ('m');    //////agrega m en las casillas el tablero
                   }
               }     /////fin for
             return Resultado = "";
         }
          ///////////////////Fin de iniciar
                             
                //////////////Tablero azul////////
              public static String IniciarTablero_azul() { ///////creacion del tablero del mar azul
                  String Resultado = "";
               for (int i = 0; i < mar_azul.length; i++) {      /////inicio for
                 for (int j = 0; j < mar_azul.length; j++) {
                     mar_azul[i][j] = ('m');       //////imprime m en la matriz
                   }
               }               ////final for
             return Resultado = "";
         }
                ///////////fin iniciar azul
              
              public static int DisparoAcertado(int f_1, int c_1, int jugador) {
        int respuesta;
        if (jugador == 0) {         /////if para revisar si es jugador 1 o 2
            if (mar_azul[f_1][c_1] != ('X')) { 
            }
        }

        if (mar_azul[f_1][c_1] != ('m')) {     //////verifica si el tiro golpeo el mar azul
           }
        if (mar_azul[f_1][c_1] == ('P')) {     //////verifica si el tiro golpeo el portaaviones mar azul
            puntuacion_azul = puntuacion_azul + 1;
            return respuesta = 2;
        }
        if (mar_azul[f_1][c_1] == ('S')) { //    /////verifica si el tiro golpeo un submarino mar azul
            puntuacion_azul = puntuacion_azul + 1;
            return respuesta = 3;
        }
        if (mar_azul[f_1][c_1] == ('A')) {         /////verifica si el tiro golpeo un acorazado mar azul
            puntuacion_azul = puntuacion_azul + 1;
            return respuesta = 4;
        }
            if (mar_azul[f_1][c_1] == ('D')) {      /////verifica si el tiro golpeo un destructor mar azul
                puntuacion_azul = puntuacion_azul + 1;
                return respuesta = 5;
            } else if (mar_azul[f_1][c_1] == ('X') | (mar_azul[f_1][c_1]) == ('O')) {
                return respuesta = 0;
            } else {
                    if (mar_rojo[f_1][c_1] != ('X')) { 
                    } else {
                        return respuesta = 1;//
                    }

                    if (mar_rojo[f_1][c_1] != ('m')) {           //////verifica si el tiro golpeo el mar rojo  
                    }
                    if (mar_rojo[f_1][c_1] == ('P')) {          //////verifica si el tiro golpeo el portaaviones mar rojo
                        puntuacion_rojo = puntuacion_rojo + 1;
                        return respuesta = 2;
                    }
                    if (mar_rojo[f_1][c_1] == ('S')) {           ///////verifica si el tiro golpeo un submarino mar rojo
                        puntuacion_rojo = puntuacion_rojo + 1;
                        return respuesta = 3;
                    }
                    if (mar_rojo[f_1][c_1] == ('A')) {          /////verifica si el tiro golpeo un acorazado mar rojo
                        puntuacion_rojo = puntuacion_rojo + 1;
                        return respuesta = 4;
                    }
                    if (mar_rojo[f_1][c_1] == ('D')) { 
                                puntuacion_rojo = puntuacion_rojo + 1;
                                return respuesta = 5;
                     }else if (mar_rojo[f_1][c_1]== ('X')| (mar_rojo[f_1][c_1]) == ('O')){
                      return respuesta = 0;

                    } else {
                      return respuesta = 1;//
 
                        }
                    }
               }
                       
              public static void Disparo_JugadorRojo(){
     
 String XX = "", YY ="";
     int X, Y, acierto;
    boolean coordenada = false;
     
  XX=JOptionPane.showInputDialog(null,"Ingrese la coordenada X: " );     /////solicita coordenadas en x
   X=Integer.parseInt(XX);
     YY=JOptionPane.showInputDialog(null,"Ingrese la coordenada Y: " );   /////solicita coordenadas en y
     Y=Integer.parseInt(YY);
     //while (coordenada==false);{
         acierto = DisparoAcertado(X,Y,0);
         
         if(acierto==2){//cuando le pega al portaviones
             JOptionPane.showMessageDialog(null, "Impacto Coonfirmado en Poortaaviones enemigo","Daño inflingido",JOptionPane.PLAIN_MESSAGE);
                     mar_azul[X][Y]=('X');
                     portaavionesA--;
                     if(acierto==0){//entra al if cuando destruya el portaaviones  enemigo 
                         JOptionPane.showMessageDialog(null,"Se ha inflingido daño CRITICO!!!","Portaaviones enemigo hundido",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_rojo = puntuacion_rojo + 5;
                         }
                         Imprime_rojo();
                         
                         
            }else if (acierto==3){//cuando le pega aun submarino 
                JOptionPane.showMessageDialog(null, "Impacto coonfirmado en Submarino enemigo"," A realizado mucho daño!",JOptionPane.PLAIN_MESSAGE);
                mar_azul[X][Y]=('X');                     
                     submarinosA--;
            }

         if ( submarinosA ==2){// entra al if cuando se haya destruido el submarino enemigo
             JOptionPane.showMessageDialog(null,"Se ha inflingido daño CRITICO!!!","Submarino enemigo hundido",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_rojo = puntuacion_rojo + 2;
                       
        }else if (submarinosA==0)  {   ////no quedan submarinos
        JOptionPane.showMessageDialog(null, "Flota de submarinos hundida","Sigue asi!!!",JOptionPane.PLAIN_MESSAGE);    
        puntuacion_rojo = puntuacion_rojo + 4;
        //Mostrar_tablero(2);
        
        
   
        }
         if (acierto==4){//cuando le pega aun acorazado
            JOptionPane.showMessageDialog(null, "Impacto coonfirmado en acorazado enemigo"," A realizado mucho daño!",JOptionPane.PLAIN_MESSAGE);
                     mar_azul[X][Y]=('X');
                   
        }
         if ( acorazadoA ==3){// entra al if cuando se haya destruido el acorazado enemigo
             JOptionPane.showMessageDialog(null,"lo has logrado has destruir un acorazado enemigo"," acorazado destruido",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_rojo = puntuacion_rojo + 3;
                         
         }else if(acorazadoA==0){    ////entra en if cuando no quedan acorazados
              JOptionPane.showMessageDialog(null,"Flota de acorazados hundida","Sigue asi!!!",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_rojo = puntuacion_rojo + 3;
               
         }
         if(acierto==5){      //////entra en el if cuando golpea un destructor
             JOptionPane.showMessageDialog(null,"has logrado impactar un destructor enemigo"," A golpeado de lleno",JOptionPane.PLAIN_MESSAGE);
             mar_azul[X][Y]=('X');
             destructorA--;
         }
         if ( destructorA ==4){   /////entra en el if cuando se destruye un destructor
             JOptionPane.showMessageDialog(null,"un destructor enemigo menos"," buen trabajo!!!",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_rojo = puntuacion_rojo + 2;
                      
         }else if( destructorA ==2){   /////entra en el if cuando de destruye un destructor
             JOptionPane.showMessageDialog(null,"otro destructor hundido"," buen trabajo!!!",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_rojo = puntuacion_rojo + 2;
                         
         }else if(destructorA==0){
              JOptionPane.showMessageDialog(null,"Flota de destructores hundida","Gran trabajo!!!",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_rojo = puntuacion_rojo + 2;
 
        } 
         if (acierto==1){//al darle al mar 
            JOptionPane.showMessageDialog(null,"lo sentimos le diste al mar en la posición : (" + X +"," + Y +")" );
             
                     mar_azul[X][Y]=('O');
                    
         }//fin else 
       // }//fin while
      
 }
              
              public static void Disparo_JugadorAzul(){
     
 String XX = "", YY ="";
     int X, Y, acierto;
    boolean coordenada = false;
     
  XX=JOptionPane.showInputDialog(null," Ingrese la coordenada X: " );    /////solicita coordenadas en x
   X=Integer.parseInt(XX);
     YY=JOptionPane.showInputDialog(null,"Ingrese la coordenada Y: " );   /////solicita coordenadas en y
     Y=Integer.parseInt(YY);
     //while (coordenada==false);{
         acierto = DisparoAcertado(X,Y,0);
         
         if(acierto==2){  //entra al if cuando destruya el portaaviones  enemigo 
             JOptionPane.showMessageDialog(null, "Impacto Coonfirmado en Poortaaviones enemigo","Daño inflingido",JOptionPane.PLAIN_MESSAGE);
                     mar_rojo[X][Y]=('X');
                     portaavionesR--;
                     if(acierto==0){
                         JOptionPane.showMessageDialog(null,"Se ha inflingido daño CRITICO!!!","Portaaviones enemigo hundido",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_azul = puntuacion_azul + 5;
                         }
                         Imprime_azul();       
                         
            }else if (acierto==3){   //cuando le pega aun submarino 
                JOptionPane.showMessageDialog(null, "Impacto coonfirmado en Submarino enemigo"," A realizado mucho daño!",JOptionPane.PLAIN_MESSAGE);
                mar_rojo[X][Y]=('X');                     
                     submarinosR--;
            }

         if ( submarinosR ==2){    // entra al if cuando se haya destruido el submarino enemigo
             JOptionPane.showMessageDialog(null,"Se ha inflingido daño CRITICO!!!","Submarino enemigo hundido",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_azul = puntuacion_azul + 2;
                       
        }else if (submarinosR==0)  {  ////entra al if cuando no quedan submarinos
        JOptionPane.showMessageDialog(null, "Flota de submarinos hundida","Sigue asi!!!",JOptionPane.PLAIN_MESSAGE);    
        puntuacion_azul = puntuacion_azul + 4;       
        }
         if (acierto==4){   //cuando le pega a un acorazado entra al if
            JOptionPane.showMessageDialog(null, "Impacto coonfirmado en acorazado enemigo"," A realizado mucho daño!",JOptionPane.PLAIN_MESSAGE);
                     mar_rojo[X][Y]=('X');
                   
        }
         if ( acorazadoR ==3){     ////cuando se destruye un acorazado
             JOptionPane.showMessageDialog(null,"lo has logrado has destruir un acorazado enemigo"," acorazado destruido",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_azul = puntuacion_azul + 3;
                         
         }else if(acorazadoR==0){     //////entra en el if cuando se destruyen todos los azorazados
              JOptionPane.showMessageDialog(null,"Flota de acorazados hundida","Sigue asi!!!",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_azul = puntuacion_azul + 3;
               
         }
         if(acierto==5){      //////////entra al if cuando golpea un destructor
             JOptionPane.showMessageDialog(null,"has logrado impactar un destructor enemigo"," A golpeado de lleno",JOptionPane.PLAIN_MESSAGE);
             mar_rojo[X][Y]=('X');
             destructorR--;
         }
         if ( destructorR ==4){      ////entra al if cuando hunde un destructor
             JOptionPane.showMessageDialog(null,"un destructor enemigo menos"," buen trabajo!!!",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_azul = puntuacion_azul + 2;
                      
         }else if( destructorR ==2){   //////entra en el if cuando hunde otro destructor
             JOptionPane.showMessageDialog(null,"otro destructor hundido"," buen trabajo!!!",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_azul = puntuacion_azul + 2;
                         
         }else if(destructorR==0){       //////cuando no quedan destructores
              JOptionPane.showMessageDialog(null,"Flota de destructores hundida","Gran trabajo!!!",JOptionPane.PLAIN_MESSAGE);
                         puntuacion_azul = puntuacion_azul + 2;
 
        } 
         if (acierto==1){//al darle al mar 
            JOptionPane.showMessageDialog(null,"lo sentimos le diste al mar en la posición : (" + X +"," + Y +")" );
             
                     mar_rojo[X][Y]=('O');
                    
         }//fin else 
       
      
 }
              ////////Impresion azul
               
              public static void Imprime_azul () {
              String resultado = "" ;                                       //////string que contiene los resultados
              for (int i = 0; i< mar_azul.length;i++){                       /////ciclo for
             for (int j = 0; j< mar_azul.length;j++){
                 resultado += "      " + mar_azul[i][j];          //////se le da al string el valor de la matriz
             }
            resultado += "  \n" ;                                 ///////se ordenan los valores
         }    
                    
               JOptionPane.showMessageDialog(null,resultado);              ///////se da el resultado
    
    }
              
                  /////////imprime las posiciones rojo
          public static void Imprime_rojo () {
              String resultado = "" ;                                       //////string que contiene los resultados
              for (int i = 0; i< mar_rojo.length;i++){                       /////ciclo for
             for (int j = 0; j< mar_rojo.length;j++){
                 resultado += "      " + mar_rojo[i][j];          //////se le da al string el valor de la matriz
             }
            resultado += "  \n"  ;                                 ///////se ordenan los valores
         }    
                     
               JOptionPane.showMessageDialog(null,resultado);              ///////se da el resultado
    
    }    
                         
        public static boolean Disponibles_vA(int Fila_1, int Columna_1, int Tipo) {
        boolean respuesta = false;
        boolean espacio = false;
               /////ciclo para revisar la disponibilidad
        for (int cont_2 = 0; cont_2 < Tipo; cont_2++) {
            if (mar_azul[Fila_1][Columna_1] == ('m')) {
                espacio = true;
                Fila_1++;
            } else {
                return respuesta = false;
            }// fin del else 
        }// fin del for 
//}//for
        if (espacio == true) {
            return respuesta = true;
        } else {
            return respuesta = false;

        }// fin del else 
    }//fin del metodo disponibilidad
              
              public static boolean Disponibles_hA(int Fila_1, int Columna_1, int Tipo) {
        boolean respuesta = false;
        boolean espacio = false;
         /////ciclo para revisar disponibilidad
        for (int cont_2 = 0; cont_2 < Tipo; cont_2++) {
            if (mar_azul[Fila_1][Columna_1] == ('m')) {
                espacio = true;
                Columna_1++;
            } else {
                return respuesta = false;
            }// fin del else 
        }// fin del for 
//}//for
        if (espacio == true) {
            return respuesta = true;
        } else {
            return respuesta = false;

        }// fin del else 
    }
         
              public static boolean Disponibles_vR(int Fila_1, int Columna_1, int Tipo) {
        boolean respuesta = false;
        boolean espacio = false;
 /////ciclo para revisar disponibilidad
        for (int cont_2 = 0; cont_2 < Tipo; cont_2++) {
            if (mar_rojo[Fila_1][Columna_1] == ('m')) {
                espacio = true;
                Fila_1++;
            } else {
                return respuesta = false;
            }// fin del else 
        }// fin del for 

        if (espacio == true) {
            return respuesta = true;
        } else {
            return respuesta = false;

        }// fin del else 
    }
              
              public static boolean Disponibles_hR(int Fila_1, int Columna_1, int Tipo) {
        boolean respuesta = false;
        boolean espacio = false;
  /////ciclo para revisar disponibilidad
        for (int cont_2 = 0; cont_2 < Tipo; cont_2++) {
            if (mar_rojo[Fila_1][Columna_1] == ('m')) {
                espacio = true;
                Columna_1++;
            } else {
                return respuesta = false;
            }// fin del else 
        }// fin del for 
//}//for
        if (espacio == true) {
            return respuesta = true;
        } else {
            return respuesta = false;

        }// fin del else 
    }
              public static String PortaAvionesA() {        ///////ciclo para acomodar el portaaviones en la matriz
        String respuesta = null;
        int k = (int) ((Math.random() * 6));
        // int k = 6;
        System.out.println("cuanto vale el portaaviones: " + k);
        if (k > 4) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    mar_azul[i][k] = ('P');

                } // for de int de j 
            } // for de int de i 
        } else if ((k == 0) | (k < 4) | (k == 4)) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    mar_azul[k][i] = ('P');
                    break;
                }
            }
        }

        return respuesta;
    } 
              
 public static String SubMarinosA() {    ///////ciclo para ordenar el submarino en la matriz

        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("valor de sub :  " + Fila);
        System.out.println("valor de sub :  " + Columna);
        //int Fila = 5;
        //int Columna = 3;
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Columna >= 4)) {
                Columna = 3;

            }//fin del if 
            Disp = Disponibles_hA(Fila, Columna, 4);
            if (Disp == true) {//fin del if 
                for (int cont_2 = 0; cont_2 < 4; cont_2++) {
                    mar_azul[Fila][Columna] = ('S');
                    Columna++;
                }//final for 
                espacio = true;
            }// final del if
            else {
                Fila = (int) ((Math.random()* 6));
                Columna = (int) ((Math.random()* 6));
                System.out.println("Valor de k: " + Fila);
                System.out.println("Valor de k: " + Columna);
            }// final del else    
    }
        //final while
        return respuesta_1;
 }
    
public static String SubMarinos2A() {            //////ciclo para ordenar el submarino en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("valor de sub  2:  " + Fila);
        System.out.println("valor de sub   3" + Columna);
       
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila >= 4)) {
                Fila = 3;

            }//fin del if 
            Disp = Disponibles_vA(Fila, Columna, 4);
            if (Disp == true) {//fin del if 
                for (int cont_2 = 0; cont_2 < 4; cont_2++) {
                    mar_azul[Fila][Columna] = ('S');
                    Fila++;
                }//final for 
                espacio = true;
            }// final del if
            else {
                Fila = (int) ((Math.random()* 6));
                Columna = (int) ((Math.random()* 6));
                System.out.println("Valor de k: " + Fila);
                System.out.println("Valor de k: " + Columna);
            }// final del else 
        }//final while
        return respuesta_1;
    }   

    public static String Acorazado_1A() {           //////ciclo para ordenar el azorazado en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de acorazado v: " + Fila);
        System.out.println("Valor de acorazado v: " + Columna);
        //int Fila = 5;
        //int Columna =3
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Columna > 4)) {
                Columna = 4;
            }//final de if 
            Disp = Disponibles_hA(Fila, Columna, 3);
            if (Disp == true) { //inicio de if 

                for (int cont_2 = 0; cont_2 < 3; cont_2++) {
                    mar_azul[Fila][Columna] = ('A');
                    Columna++;
                }//for
                espacio = true;
            }//final if 
            else {//inicio de else
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado v: " + Fila);
                System.out.println("Valor de acorazado v: " + Columna);
            }// final del else 
        }//final de while
        return respuesta_1;
    }

    public static String Acorazado_2A() {              //////ciclo para ordenar el azorazado en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de acorazado v: " + Fila);
        System.out.println("Valor de acorazado v: " + Columna);
        //int Fila = 0;
        //int Columna = 6;
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila > 4)) {
                Fila = 4;
            }//final de if 
            Disp = Disponibles_vA(Fila, Columna, 3);
            if (Disp == true) { //inicio de if 

                for (int cont_2 = 0; cont_2 < 3; cont_2++) {
                    mar_azul[Fila][Columna] = ('A');
                    Fila++;
                }//for
                espacio = true;
            }//final if 
            else {//inicio de else
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado h: " + Fila);
                System.out.println("Valor de acorazado h: " + Columna);
                espacio = false;
            }// final del else 
        }//final de while
        return respuesta_1;
    }

    public static String Destructor_1A() {               //////ciclo para ordenar el destructor en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de destructor_1: " + Fila);
        System.out.println("Valor de destructor_1 " + Columna);
        //int Fila = 0;
        //int Columna = 6;
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila > 3)) {
                Fila = 3;
            }//final de if 
            Disp = Disponibles_vA(Fila, Columna, 2);
            if (Disp == true) { //inicio de if 

                for (int cont_3 = 0; cont_3 < 2; cont_3++) {
                    mar_azul[Fila][Columna] = ('D');
                    Columna++;
                }//for
                espacio = true;
            }//final if 
            else {//inicio de else
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado h: " + Fila);
                System.out.println("Valor de acorazado h: " + Columna);
                espacio = false;
            }// final del else 
        }//final de while
        return respuesta_1;
    }
    
    public static String Destructor_2A() {             //////ciclo para ordenar el destructor en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de destructor_1: " + Fila);
        System.out.println("Valor de destructor_1 " + Columna);
        //int Fila = 0;
        //int Columna = 6;
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila > 3)) {
                Fila = 3;
            }//final de if 
            Disp = Disponibles_hA(Fila, Columna, 2);
            if (Disp == true) { //inicio de if 

                for (int cont_3 = 0; cont_3 < 2; cont_3++) {
                    mar_azul[Fila][Columna] = ('D');
                    Fila++;
                }//for
                espacio = true;
            }//final if 
            else {//inicio de else
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado h: " + Fila);
                System.out.println("Valor de acorazado h: " + Columna);
                espacio = false;
            }// final del else 
        }//final de while
        return respuesta_1;
    }
    
    public static String Destructor_3A() {        //////ciclo para ordenar el destructor en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de destructor_1: " + Fila);
        System.out.println("Valor de destructor_1 " + Columna);
        //int Fila = 0;
        //int Columna = 6;
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila > 3)) {
                Fila = 3;
            }//final de if 
            Disp = Disponibles_vA(Fila, Columna, 2);
            if (Disp == true) { //inicio de if 

                for (int cont_3 = 0; cont_3 < 2; cont_3++) {
                    mar_azul[Fila][Columna] = ('D');
                    Columna++;
                }//for
                espacio = true;
            }//final if 
            else {//inicio de else
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado h: " + Fila);
                System.out.println("Valor de acorazado h: " + Columna);
                espacio = false;
            }// final del else 
        }//final de while
        return respuesta_1;
    }
      
    //.............................................//
    //.............................................//
    ////................MAR_ROJO..................//
    public static String PortaAvionesR() {             //////ciclo para ordenar el portaaviones en la matriz
        String respuesta = null;
        int k = (int) ((Math.random() * 6));
        // int k = 6;
        System.out.println("Valor de p : " + k);
        if (k > 4) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    mar_rojo[i][k] = ('P');

                } // for de int de j 
            } // for de int de i 
        } else if ((k == 0) | (k < 4) | (k == 4)) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    mar_rojo[k][i] = ('P');
                }
            }
        }

        return respuesta;
    } 
              
 public static String SubMarinosR() {           //////ciclo para ordenar el submarino en la matriz

        int Fila = (int) ((Math.random() * 5));
        int Columna = (int) ((Math.random() * 5));
        System.out.println("valor de sub :  " + Fila);
        System.out.println("valor de sub :  " + Columna);
        //int Fila = 5;
        //int Columna = 3;
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Columna >= 4)) {
                Columna = 3;

            }//fin del if 
            Disp = Disponibles_hR(Fila, Columna, 4);
            if (Disp == true) {//fin del if 
                for (int cont_2 = 0; cont_2 < 4; cont_2++) {
                    mar_rojo[Fila][Columna] = ('S');
                    Columna++;
                }//final for 
                espacio = true;
            }// final del if
        else {
                Fila = (int) ((Math.random()* 6));
                Columna = (int) ((Math.random()* 6));
                System.out.println("Valor de k: " + Fila);
                System.out.println("Valor de k: " + Columna);
            }// final del else 
        }//final while
        return respuesta_1;
    }
    
public static String SubMarinos2R() {              //////ciclo para ordenar el submarino en la matriz
        int Fila = (int) ((Math.random() * 5));
        int Columna = (int) ((Math.random() * 5));
        System.out.println("valor de sub  :  " + Fila);
        System.out.println("valor de sub   " + Columna);
        
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila >= 4)) {
                Fila = 3;

            }//fin del if 
            Disp = Disponibles_vR(Fila, Columna, 4);
            if (Disp == true) {//fin del if 
                for (int cont_2 = 0; cont_2 < 4; cont_2++) {
                    mar_rojo[Fila][Columna] = ('S');
                    Fila++;
                }//final for 
                espacio = true;
            }// final del if
            else {
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de k: " + Fila);
                System.out.println("Valor de k: " + Columna);
            }// final del else 
        }//final while
        return respuesta_1;
    }


    public static String Acorazado_1R() {                //////ciclo para ordenar el acorazado en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de acorazado v: " + Fila);
        System.out.println("Valor de acorazado v: " + Columna);
     
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Columna > 4)) {
                Columna = 4;
            }//final de if 
            Disp = Disponibles_hR(Fila, Columna, 3);
            if (Disp == true) { //inicio de if 

                for (int cont_2 = 0; cont_2 < 3; cont_2++) {
                    mar_rojo[Fila][Columna] = ('A');
                    Columna++;
                }//for
                espacio = true;
            }//final if 
            else {//inicio de else
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado v: " + Fila);
                System.out.println("Valor de acorazado v: " + Columna);
            }// final del else 
        }//final de while
        return respuesta_1;
    }

    public static String Acorazado_2R() {         //////ciclo para ordenar el acorazado en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de acorazado v: " + Fila);
        System.out.println("Valor de acorazado v: " + Columna);
        //int Fila = 0;
        //int Columna = 6;
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila > 4)) {
                Fila = 4;
            }//final de if 
            Disp = Disponibles_vR(Fila, Columna, 3);
            if (Disp == true) { //inicio de if 

                for (int cont_2 = 0; cont_2 < 3; cont_2++) {
                    mar_rojo[Fila][Columna] = ('A');
                    Fila++;
                }//for
                espacio = true;
            }//final if 
            else {//inicio de else
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado h: " + Fila);
                System.out.println("Valor de acorazado h: " + Columna);
                espacio = false;
            } 
        }
        return respuesta_1;
    }

    public static String Destructor_1R() {            //////ciclo para ordenar el destructor en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de destructor_1: " + Fila);
        System.out.println("Valor de destructor_1 " + Columna);
       
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila > 3)) {
                Fila = 3;
            }
            Disp = Disponibles_vR(Fila, Columna, 2);
            if (Disp == true) {  

                for (int cont_3 = 0; cont_3 < 2; cont_3++) {
                    mar_rojo[Fila][Columna] = ('D');
                    Fila++;
                }//for
                espacio = true;
            }
            else {
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado h: " + Fila);
                System.out.println("Valor de acorazado h: " + Columna);
                espacio = false;
            }
        }
        return respuesta_1;
    }
    
    public static String Destructor_2R() {            //////ciclo para ordenar el destructor en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de destructor_1: " + Fila);
        System.out.println("Valor de destructor_1 " + Columna);
        
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila > 3)) {
                Fila = 3;
            } 
            Disp = Disponibles_hR(Fila, Columna, 2);
            if (Disp == true) {

                for (int cont_3 = 0; cont_3 < 2; cont_3++) {
                    mar_rojo[Fila][Columna] = ('D');
                    Fila++;
                }//for
                espacio = true;
            }
            else {
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado h: " + Fila);
                System.out.println("Valor de acorazado h: " + Columna);
                espacio = false;
            }
        }
        return respuesta_1;
    }
    
        public static String Destructor_3R() {               //////ciclo para ordenar el destructor en la matriz
        int Fila = (int) ((Math.random() * 6));
        int Columna = (int) ((Math.random() * 6));
        System.out.println("Valor de destructor_1: " + Fila);
        System.out.println("Valor de destructor_1 " + Columna);
       
        String respuesta_1 = "";
        boolean espacio = false;
        boolean Disp;

        while (espacio == false) {
            if ((Fila > 3)) {
                Fila = 3;
            } 
            Disp = Disponibles_vR(Fila, Columna, 2);
            if (Disp == true) {  

                for (int cont_3 = 0; cont_3 < 2; cont_3++) {
                    mar_rojo[Fila][Columna] = ('D');
                    Fila++;
                }//for
                espacio = true;
            }
            else {
                Fila = (int) ((Math.random() * 6));
                Columna = (int) ((Math.random() * 6));
                System.out.println("Valor de acorazado h: " + Fila);
                System.out.println("Valor de acorazado h: " + Columna);
                espacio = false;
            }
        }
        return respuesta_1;
    }
       
      public static void main(String[] args) {
               boolean confirm;
          do {
        long startTime = System.nanoTime();   /////////inicia el tiempo de juego
          Nombres();                           ////invoca el metodo para ingresar los nombres de los jugadores
          JOptionPane.showMessageDialog(null, "Bienvenidos  " +jugador1+ "  y  "+jugador2+ "  al juego batalla naval \n "
                  + "Para ganar uno de los jugadores debe destrutir todos los barcos de su adversario \n !Suerte a ambos jugadores!!!", "INSTRUCCIONES", JOptionPane.INFORMATION_MESSAGE);
       
          IniciarTablero_azul();            /////invoca este metodo para dar inicio al tablero azul
           PortaAvionesA();  
           SubMarinosA();
           SubMarinos2A();
           Acorazado_1A();
           Acorazado_2A();                ////////estos metodos son para imprimir en la respectiva matriz sus unidades
           Destructor_1A();
           Destructor_2A();
           Destructor_3A();
          
          IniciarTablero_rojo();           ////////inicio del tablero rojo
           PortaAvionesR();  
           SubMarinosR();
           SubMarinos2R();
           Acorazado_1R();               ////////estos metodos son para imprimir en la respectiva matriz sus unidades
           Acorazado_2R();
           Destructor_1R();
           Destructor_2R();
           Destructor_3R();
           
           try {                            //////inicio del trycatch para buscar errores
          
          JOptionPane.showMessageDialog(null, "jugador "+jugador1+" este es tu tablero");
           Imprime_azul ();               /////indica que es turno del jugador 1 y le muestra el tablero
          
         JOptionPane.showMessageDialog(null, "jugador "+jugador2+" este es tu tablero");
           Imprime_rojo ();               /////indica que es turno del jugador 2 y le muestra el tablero
          
           JOptionPane.showMessageDialog(null, "INICIA EL JUEGO\n\n"      //////inicio del juego
                   +"Presten atencion a los disparos de su oponente\n\n"
                   +" GOOD LUCK, HAVE FUN!!!");
          
              do                        /////inicio de ciclo, hacer mientras los jugadores tengan unidades
                 {
                     JOptionPane.showMessageDialog(null, jugador1+" Este es tu tablero");    ///////muestra el tablero al jugador y solicita un disparo
          Imprime_azul ();
          Disparo_JugadorAzul();
            JOptionPane.showMessageDialog(null, jugador2+" Es tu turno para hacer sonar los cañones");     ///////muestra el tablero al jugador y solicita un disparo
                     JOptionPane.showMessageDialog(null, jugador2+" Este es tu tablero");
          Imprime_rojo (); 
          Disparo_JugadorRojo();
            JOptionPane.showMessageDialog(null, "Es el turno del otro jugador");
            
                 } while ((puntuacion_rojo < 23) || (puntuacion_azul < 23));              /////mientras tengan unidades
             if (puntuacion_rojo > puntuacion_azul) {
                 JOptionPane.showMessageDialog(null,"Felicidades"+jugador2+"eres el vencedor con puntaje de "+puntuacion_rojo);  /////gana jugador 2
             
            }else{   
          JOptionPane.showMessageDialog(null,"Felicidades"+jugador1+"eres el vencedor con puntaje de "+puntuacion_azul);   ///gana jugador 1
      }
              
                           } catch (NumberFormatException e){         /////inicio metodos catch
             JOptionPane.showMessageDialog(null, "ingrese unas coordenadas validas");
                           }
                             catch (ArithmeticException e) {  
             JOptionPane.showMessageDialog(null,"Dato ingresado no es valido");
                       }     /////fin catch
           
        long endTime = System.nanoTime();    //////tiempo de fin del juego
        long time = (endTime-startTime)/1000000000;         /////se saca cuantos minutos duro el juego
        
        JOptionPane.showMessageDialog(null, "Tiempo de juego ="+ time/60+ "  minutos" );   ////imprime los minutos de juego
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Desea volver a jugar?", "Seleccione", JOptionPane.YES_NO_OPTION);     /////pregunta si quiere volver a jugar
         if (respuesta == JOptionPane.YES_OPTION)    /////opcion si vuelve a iniciar todo
            {  ////inicio if                
                confirm=true;                               
            }  /////fin if
         if (respuesta == JOptionPane.NO_OPTION)   /////opcion no cierra el programa
        {         /////inicio if
            System.exit(0);
        }         /////fin if
      }while (confirm=true);
    }    //////////////////final main
    
}  ////////////final class









































