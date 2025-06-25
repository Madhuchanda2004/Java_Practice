/*Constructor Overloading*/

import java.util.Scanner;

class Abc
{	
	double volume;
	Abc(double s){
		volume=s*s*s;
		System.out.println("The volume of the cube is: "+volume);
	}
	Abc(double l, double b, double h){
		volume=l*b*h;
		System.out.println("The volume of the cuboid is: "+volume);
	}
}
class Volume
{public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the cube: ");
	double s1=sc.nextDouble();
	System.out.println("Enter the length and breadth and height of the cuboid: ");
	double l1=sc.nextDouble();
	double b1=sc.nextDouble();
	double h1=sc.nextDouble();

	Abc ob1=new Abc(s1);
	Abc ob2=new Abc(l1,b1,h1);
}
}
