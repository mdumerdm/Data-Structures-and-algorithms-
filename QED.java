/**
this program allows user to give quadratic equation and get roots  
ax^2+bx+c=0  is standard equation
**/


import java.lang.Math;
import java.util.Scanner;
class QE
{
double a, b, c;
// coefficients
QE( double a, double b, double c){
this.a = a;
this.b = b;
this.c = c;
}
public void roots()
{
if( a == 0.0 )
{ System.out.println("One root = " + (-c/b));
return;
}
double d = b*b - 4.0*a*c;
if(d < 0)
// Roots are imaginary
{
System.out.println("There are no real solutions."); return;
}
if(d == 0)
{
// Roots are equal
System.out.println("Two roots are equal: " + (-b /(2.0*a))); return;
}
// Roots are real
double x1 = (-b + Math.sqrt(d))/(2.0*a);
double x2 = (-b - Math.sqrt(d))/(2.0*a);
System.out.println("Roots are: " + x1 + ", " + x2);
}
}
//////////////////// QuadraticEquationDemo.java /////////////////
class QED
{
public static void main(String[] args)
{
Scanner scr = new Scanner(System.in);
System.out.print(" ENTER  a = ");
double a = scr.nextDouble();
System.out.print(" ENTER b = ");
double b = scr.nextDouble();
System.out.print(" ENTER c = ");
double c = scr.nextDouble();
QE qe = new QE(a, b, c);
qe.roots();
}
}