
package Harold.p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; //import of libraries
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ejercisio2 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//buffereds to write and read
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
    public void mostrarM(int matriz[][],int m) throws IOException{
        int x = 0,y=0,recorrido =0,n=0;
        while (n < m*m) {
            switch (recorrido) {
                case 0: // Recorrido de izquierda a derecha
                    for (int i = x; i < matriz[0].length - y; i++) 
                        System.out.print("-" + matriz[x][i]);n++;      
                    recorrido++;break; 
                case 1: //Recorrido de arriba abajo
                    for (int i = x + 1; i < matriz.length - x; i++) 
                        System.out.print("-" + matriz[i][matriz[0].length - 1 - y]);n++;
                    recorrido++;break;
                case 2: //Recorrido de derecha a izquierda
                    for (int i = matriz[0].length - 2 - y; i >= y; i--) 
                        System.out.print("-" + matriz[matriz.length - 1 - x][i]);n++;
                    recorrido++;break;
                case 3: //Recorrido de abajo a arriba
                    for (int i = matriz.length - 2 - x; i >= x + 1; i--) 
                        System.out.print("-" + matriz[i][y]);n++;
                    recorrido = 0;
                    x++;y++;//Se aumentan las filas y las columnas para un subnivel en el espiral
                    break;
            }
        }
        bw.write("\n");bw.flush();
    }

    public static void main(String[] args) throws IOException {
       Random rd = new Random(); //I define the random
       bw.write("Exercie of matrix\n");
       bw.write("Enter m which is the size of the matrix\n");
       bw.flush();

       int m = Integer.parseInt(br.readLine());//read M
       int matriz [][]= new int [m][m];//matrix of size m x m
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(50); //generate random numbers from 0 to 50
            }
        }

        bw.write("matrix original\n"); bw.flush();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                bw.write(matriz[i][j]+" ");
                bw.flush();
            }
            bw.write("\n");
        }
       
        bw.write("\nMatrix in spiral:\n"); bw.flush();
        
        Ejercisio2 o = new Ejercisio2(); //builder
        o.mostrarM(matriz, m); //assigned the parameters
    }
}
