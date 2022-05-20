/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect1arreglosuni;

/**
 *
 * @author andys
 */
public class Proyect1ArreglosUni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int a[] = new int [100];
        int b[] = {1,2,3,4,5};
        char c[] = {'h','o','l','a','s'};
        double d[] = {10.3,34,5};
        String nombre = "Andrea";
        System.out.println(d[0]);
        System.out.println(d[1]);
        
        int i;
        for (i=1;i<100;i++)
        {
            a[i]=i;
            System.out.println(a[i]);
        }
        for(i=0;i<5;i++)
        {
            System.out.println(b[i]);
            System.out.println(c[i]);
        }
        System.out.println(nombre);
        //imprime el tamaño del arreglo
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);
        //trasnforma la cadena de caracteres a arreglo
    nombre.toCharArray();
    System.out.println(nombre.length());
        }
