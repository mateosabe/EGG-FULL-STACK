
package EJERCICIOS_DE_APRENDIZAJE;

/**
 *
 * @author PROPIETARIO
 */
public class Ejercicio18 {

   
    public static void main(String[] args) {
     /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
     traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
     cambiando sus filas por columnas (o viceversa).*/
     Integer[][] matrizA = new Integer[4][4];
     Integer[][] matrizB = new Integer[4][4];
        llenarMatriz(matrizA);
        mostrarMatrizA(matrizA);
        System.out.println(" ");
        traspuestaMatrizA(matrizA, matrizB);
        System.out.println(" ");
        mostrarTraspuestaMatrizA(matrizB);
    }
    public static void llenarMatriz(Integer[][]matrizA){
        for(int i=0;i<matrizA.length;i++){
            for(int j=0;j<matrizA.length;j++){
                matrizA[i][j] = (int)(Math.random()*10+1);
            }
        }
    }
    public static void mostrarMatrizA(Integer[][]matrizA){
        for(int i=0;i<matrizA.length;i++){
            for(int j=0;j<matrizA.length;j++){
                System.out.print(matrizA[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void traspuestaMatrizA(Integer[][]matrizA,Integer[][]matrizB){
        for(int i=0;i<matrizA.length;i++){
            for(int j=0;j<matrizA.length;j++){
              matrizB[i][j] = matrizA[j][i];
            }
        }
    }
    public static void mostrarTraspuestaMatrizA(Integer[][]matrizB){
        for(int i=0;i<matrizB.length;i++){
            for(int j=0;j<matrizB.length;j++){
                System.out.print(matrizB[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
