
package operacionesmatrices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; //import of libraries
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Ejercisio2 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//buffereds to write and read
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
    public void mostrarM(int matriz[][],int m) throws IOException{

       int b = m-1; //this will be the limit where the array arrives
       int a=0; //this will be the starting point of the array
        for (int i = 0; i < matriz.lenght; i++) {
            for (int j = 0; j < matriz.lenght; j++) {
                if(m%m == i){//para el recorrido en java de la primera fila debe ser i= 0, 1
                    System.out.print(matriz[i][j]+" ");    
                }if((m+3)%m == b){//1, b para el recorrido de la derecha debe ir disminuyendo
                    System.out.print(matriz[i][j]+" ");
                }if((m+2)%m <=j){
                    System.out.print(matriz[i][j]+" ");
                }if((m+1)%m <= j){
                    System.out.print(matriz[i][j]+" ");
                }
                b--;
                m--;
            }
        }
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

        bw.write("matrix original\n");
        bw.flush();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                bw.write(matriz[i][j]+" ");
                bw.flush();
            }
            bw.write("\n");
        }
        
        //spiral travel
        bw.write("\n");
        bw.write("Matrix in spiral:\n");
        bw.flush();
        
        Ejercisio2 o = new Ejercisio2(); //builder
        o.mostrarM(matriz, m); //assigned the parameters
    }
}
