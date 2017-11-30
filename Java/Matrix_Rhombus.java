package operacionesmatrices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException; //import the libraries
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ejercisio5 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Buferreds to write and read
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public Ejercisio5(String matriz[][], int m) throws IOException {

        for (int i = 1; i < matriz.length; i++) { //start the iterators in 1 to print the positions 00 01 02 ....
            for (int j = 1; j < matriz.length; j++) {
                if (i + j >= (m / 2) && i - 1 + (m / 2) >= j && j - 1 + (m / 2) >= i && i + j + 1 <= (m / 2) + m - 1) { //game with the positions of the iterators
                    matriz[i][j] = " "; //Change the numbers that are inside the rhombus to differentiate them
                } else {
                    matriz[i][j] = matriz[i][j]; //the numbers show outside the rhombus
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) { //print the array
            for (int j = 0; j < matriz.length; j++) {
                bw.write(matriz[i][j] + " ");
                bw.flush();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException {
        //numbers to use:
        //1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64
        bw.write("Exercise of matrix\n");
        bw.write(" ");
        bw.write("To form the rhombus figure the matrix must be larger than size 4 and it must be even\n");
        bw.write("Ingrese m que sera el tamaño de la matrix\n");
        bw.flush();

        int m = Integer.parseInt(br.readLine());//read M
        
        if (m % 2 == 0 && m >= 4) { //testing
            String matriz[][] = new String[m][m];//matrix of size m x m  
            String cadena;
            bw.write("\n");
            bw.write("Enter the numbers to fill the arrangement separated by commas\n");
            bw.flush();
            cadena = br.readLine();
            String matriz2[] = cadena.split(",");//delivery by commas

            int contador = 0; // will help me determine the position of the string array
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    //matriz[i][j] =  Integer.parseInt(matriz2[contador++]); convierto el strin en un int
                    matriz[i][j] = matriz2[contador++];
                }
            }

            bw.write("\n");
            bw.write("matrix original:\n");
            bw.flush();

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    bw.write(matriz[i][j] + " "); //print the numbers in matrix form
                    bw.flush();
                }
                bw.write("\n");
            }

            bw.write("\n");
            bw.write("Matrix in rhombus:\n");
            bw.flush();

            Ejercisio5 abrir = new Ejercisio5(matriz, m);

        } else {
            bw.write("\nIncrease the number and make it even\n");
            bw.flush();
        }
    }
}
