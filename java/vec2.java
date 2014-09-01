/**
 * @(#)Text1.java
 *
 *
 * @author 
 * @version 1.00 2014/8/13
 */
import java.util.*;

class vectores3
{
public static void main(String args[])
{
Scanner en=new S1canner(System.in);
int B[]=new int[100];
int con=0;
while(con<10)

{
B[con]=en.nextInt(); // asignación de valores mediante teclado
con++;
}
con=0;
System.out.println("los datos del vector son:");
while(con<10)
{
System.out.println(B[con]);
con++;
}
}
}