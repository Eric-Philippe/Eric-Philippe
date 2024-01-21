/**
 * Calcul PI avec la méthode de Gauss-Legendre
 * Eric PHILIPPE - 2024
 */

import java.util.Random;            import java.util.List;
public class EP { public            static void piD (int n){
int[] x = new int[n + 1];           int[] y = new int[n + 1];
int[] z=new int[n+1];int            c = 0 ; for ( int i = 0 ; 
    i <= n ;                            i++){x[i        ]=20;
    }for(int                            i=0;i<=n        ;i++)
    {int s=0                            ;for(int        j = n
    ;j>0;j--                            ){s=x[j]*10+c; y[j]=
    s / (j * 2- 1);s=s%                 (j*2-1); int v=j-1;
    x[j] = s;}s=x[0]*10                 +c;y[0]=
    s /10;s=                            s % 10 ;
    x[0] =s;                            z[i]= c;
    c=s;}int                            dd = 13;
    double m                            = 0.005;
    int year                            = 2003 ;
System.out.print("3.");            for( int i = 0; i    /** ## */
< n; i++) { System.out.            print(y[i]);int r
= 0 ; } }public static             void main ( String   /** || */
args[]) { piD(100);int             end =13_05_2003;}}  /**  || */