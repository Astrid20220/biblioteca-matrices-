
package testingclasematrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Astrid
 */
public class arreglos {

    public int [][] RellenarMatriz(){
    int f=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de filas de la matriz"));   
    int c=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de columnas de la matriz"));
        
int[][] matriz = new int [f][c];
     Scanner entrada = new Scanner(System.in);
System.out.println("Introducción de datos ");
      for(int i=0; i<f; i++){
   for(int j=0; j<c; j++){
   System.out.print("Escribe el valor de la casilla ["+i+"]["+j+"]: ");
      matriz[i][j] = entrada.nextInt();
            }
                  }
   return matriz;
    }
    
    public int [][] RellenarMatrizA(){
    int fA=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de filas de la matriz -A-"));   
    int cA=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de columnas de la matriz -A-"));
        
 int[][] matriz = new int [fA][cA];
    Scanner entrada = new Scanner(System.in);
System.out.println("\nIntroducción de datos ");
        for(int i=0; i<fA; i++){
     for(int j=0; j<cA; j++){
         System.out.print("Escribe el valor de la casilla ["+i+"]["+j+"]: ");
            matriz[i][j] = entrada.nextInt();
     }
        }
 return matriz;
    }

    public int [][] RellenarMatrizb(){
 int fB=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la matriz -B-"));   
    int cB=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la matriz -B-")); 
        
     int[][] matriz = new int [fB][cB];
    Scanner entrada = new Scanner(System.in);
    System.out.println("\nIntroducción de datos ");
   for(int i=0; i<fB; i++){
       for(int j=0; j<cB; j++){
      System.out.print("Escribe el valor de la casilla ["+i+"]["+j+"]: ");
    matriz[i][j] = entrada.nextInt();
      }
   }
 return matriz;
    }
    
    
    public  void imprimirMatriz(int[][]m){
 System.out.println("=== Matriz ===");
   for(int i=0; i<m.length; i++){
  for(int j=0; j<m[0].length; j++){
  System.out.print(m[i][j]+" ");
      }
   System.out.println();
   }
    }
  public  int [][] sumMatrices(int[][]m1, int[][]m2){
  int f=m1.length;   
int c=m2[0].length;
        
  if(f!=c){
            System.exit(1);
        }
        
 int[][]m3 = new int[f][c];
System.out.println("----- Resultado de la suma de matrices -----");
  for(int i=0; i<f; i++){
      for(int j=0; j<c; j++){
  m3[i][j] = m1[i][j] + m2[i][j];
            }
  }
    return m3; 
  }
    
public int[][] multiMatrices ( int[][] m1, int[][] m2) {
       if(m1[0].length != m2.length){
  System.out.println("Las matrices no son multiplicables");
 System.exit(1);
        }
        
  System.out.println("Resultado de la multiplicación");
         int[][] m3 = new int[m1.length][m2[0].length];
    for (int i= 0; i<m3.length; i++)
  for (int j=0; j<m3[0].length; j++)
     for (int k=0; k<m2.length; k++)
   m3[i][j] = m3[i][j] + m1[i][k] * m2[k][j];
  return m3;
   
    }
  
    public int[] RellenarArreglo(){
 int A = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del arreglo"));
 int[] arreglo = new int[A];
 Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce datos al arreglo");
  for(int i=0; i<A; i++){
    System.out.print("Introduce el valor No."+(i+1)+" del arreglo: ");
  arreglo[i] = entrada.nextInt();
           }
return arreglo;
    }
    
public void imprimirArreglo(int[]a){
  System.out.print("Datos del arreglo: ");
 for(int i=0; i<a.length; i++){
      System.out.print(a[i]+ " ");
  }
    }
  public int[][] comparacionArreglo(int[]a, int[][]m){
   int F = m.length;
    int C = m[0].length;
   int[][] comparacion = new int [F][C];
 System.out.println("-----Comparacion-----");
  for(int i=0; i<F; i++){
     for(int j=0; j<C; j++){ 
  if(m[i][j]==a[i]){
   comparacion[i][j] = m[i][j];
                  }
    }
             }
  return comparacion;
    }
    
   
    public int[][] RellenarIrregular(){
 int R = Integer.parseInt(JOptionPane.showInputDialog("Inroduzca el numero de renglones"));
        
 int[][] datos = new int [R][]; //declaracion matriz irregular
for(int i=0; i<R; i++){
  int C = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de columnas para el renglon numero "+ (i+1)));
     datos[i] = new int[C];
               }
         Scanner entrada = new Scanner(System.in);//almacenar valores
  System.out.println("Introduccion de datos ");
for(int i=0; i<datos.length; i++){
  for(int j=0; j<datos[i].length; j++){
     System.out.println("Escribe el valor de la casilla ["+i+"]["+j+"]: ");
   datos[i][j] = entrada.nextInt();
                }
   }
 return datos;
          }
      public void matrizIrregular(int [][]a){
 System.out.println("Contenido de la matriz datos: ");
  for (int i=0; i<a.length; i++){
    for(int j=0; j<a[i].length;j++)
    System.out.print(a[i][j]+ "  ");
            System.out.println();
                        
                     
 } 
 
    }
 public void traspuesta(int a[][]){
  int aux;
  for(int i=0; i<a.length; i++){
     for(int j=0; j<i; j++){
   aux = a[i][j];
      a[i][j] = a[j][i];
   a[j][i] = aux;
            }
              }
  }
    public void busquedalineal(int a[], int b){
         System.out.println("Comenzando busqueda"); 
   for(int i = 0; i<a.length; i++){
if(a[i] == b){
   System.out.println("Se encontro el elemento " + b);
            }
 }
       
    }
  public void busquedaBinaria(){   
 Scanner entra = new Scanner(System.in);
        
int numero[] = new int[8];
         System.out.println("Escribe 8 nùmeros");
   for( int i=0; i<8; i++){
  System.out.print("Escribe el numero de la posicion " +(i+1));
     numero[i] = entra.nextInt();
        }
    System.out.println("Ahora ingresa tu numero a buscar");
   int numBuscar = entra.nextInt();
      int n=numero.length, inf=0, centro=0;
        int sup=n-1;
    boolean elemento=false;
   while(inf<=sup){
      centro=(sup+inf)/2;
    if(numero[centro]==numBuscar){
      elemento=true;
 break;
            }
     else if(numBuscar<numero[centro]){
       sup=centro-1;
            }
     else{
        inf=centro+1;
            }
        }
  if(elemento=true){
      System.out.println("se ha encontrado tu numero, estaba en la posicion "+(centro+1));
   }else{
     System.out.println("Lo siento no se encontro tu numero");
        }

    }
  public void eliminarElemento(int a[]){
   for(int i=0; i<a.length; i++){
       for(int j=0; j<a.length; j++){
    if(i != j){
        if(a[i] == a[j]){
           a[j]=0;
           a[i]=0;
          }
                }
    }
    }
   for(int i=0; i<a.length; i++){
    System.out.println("["+a[i]+"]");
        }
    }
  public void moda(int[]a){
     for(int i = 0; i<a.length; i++){
  for(int x = i + 1; x<a.length; x++){
                if(a[i] == a[x]){
   System.out.println("Nuestra moda es : " + a[i]);
                    
        }
                
                  }
  }
    }
    
 public void elementoMAyor(int a[]){
     int menor, mayor;
   menor=mayor=a[0];
   for(int j=1; j<a.length; j++){
            if(a[j]>mayor){
      mayor=a[j];
                 }
   if(a[j]<menor){
           menor=a[j];
            }
   }
        
        System.out.println("elemento mayor: "+mayor);
        System.out.println("elemento menor: "+menor);
    }
  public void Shell(int[] mat) {
	for(int incre=mat.length/2; incre>0; incre=(incre==2) ? 1: (int)Math.round(incre/2.2)) {
      for(int i=incre; i<mat.length; i++) {
          for(int j=i; j >= incre && mat[j-incre] > mat[j]; j -= incre) {
      int temp= mat[j];
         mat[j]= mat[j - incre];
            mat[j - incre] = temp;
		}
                         } }
    }
  public int[] bubble(int[] arreglo){
 int auxiliar;
  int[] arregloOrdenado;
    for(int i = 0; i < arreglo.length-1; i++){
      for(int j = 0;j < arreglo.length-1;j++)
        {
  if(arreglo[j] > arreglo[j+1]){
      auxiliar = arreglo[j];
  arreglo[j] = arreglo[j+1];
       arreglo[j+1] = auxiliar;
    }   
             }
      }
  arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
    
}
