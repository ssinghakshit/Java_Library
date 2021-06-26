package allInOne;
import java.util.Scanner;

public class MyClass {
	Scanner obj = new Scanner(System.in);
	
	// To print maximum number between two numbers.
	public int MaxOfTwoNum(int a, int b) {
		return a>b?a:b;
	}
	
	// To print maximum number between 3 numbers.
	public int MaxOfThreeNum(int a, int b, int c) {
		return (a>b)?((a>c)?a:c):(b>c)?b:c; 
	}
	
	//trying
	
	//To print maximum number between 4 numbers.
	public int MaxOfFourNum(int a, int b, int c, int d) {
		return (a>b)?((a>c)?((a>d)?a:d):(c>d)?c:d):(b>c)?((b>d)?b:d):(c>d)?c:d;
	}
	
	//Here I am using vararge...to add numbers
	public int sum(int ...arr) {
		int result=0;
		for(int e:arr) {
			result+=e;
		}
		return result;
	}
	
	//To calculate factorial of given number.
	final public void Factorial(int a) {
		
		int fact=1;
		for(int i=1; i<=a; i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+a +": "+ fact);
	}
	
	//To print Fibonacci series up to given number.
	public void FibonacciSeries(int n) {
		int a=0,b=1;
		System.out.println("Fibonacci series up to "+n +" terms are : ");
		System.out.print(a+"\t"+b+ "\t");
		for(int i=2; i<n; i++) {
			int m;
			m= a+b;
			a=b;
			b=m;
			System.out.print(m+ "\t");
			
		}
		System.out.println();
		
	}
	
	//To check given number is Palindrom or not.
	public void PalindromNumber(int n) {
		int temp=n;
		
		int reverseNumber=0;
		
		while(temp>0) {
			int lastDigit= temp%10;
			reverseNumber= reverseNumber*10 + lastDigit;
			temp/=10;
		}
		if(reverseNumber==n)
			System.out.println(n+ " : is palindrom number");
		else
			System.out.println(n+ " : is not palindrom number");
	}
	
	//To check given number is prime or not.
	public boolean PrimeOrNot(int a) {
		boolean isPrime= true;
		for(int i=2; i*i<=a; i++) {
			if(a%i==0) {
				isPrime= false;
				break;
			}
		}
	 if(a<2) isPrime= false;
	 return isPrime;
//	 System.out.println(a+ " isPrime: "+ isPrime);
	}
	
	//To print power with given base and power.
	public int Power(int a, int b) {
		int power= a;
		for(int i=1 ;i<b; i++) {
			power*=a;
		}
		return power;
	}
	
	//To add two Matrix. Here you are giving size of matrix as an input.
	public void MatrixAdd(int r, int c) {
		System.out.println("Here,"+ r +" & "+c+" are size of both matrix.");
		
		int matrix1[][]= new int[r][c];
		int matrix2[][]= new int[r][c];
		
		System.out.println("Enter element of matrix 1: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				matrix1[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter element of matrix 2: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				matrix2[i][j]=obj.nextInt();
			}
		}
		int result[][]= new int[r][c];
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				result[i][j]= matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("\nResultant matrix is : ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(result[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	//To multiply given matrix. At the time of execution this class, You are giving size of matrix 1 as a data.
	//Further calculation is done as per your data.
	public void MatrixMult(int a, int b) {
		int c,d;
		Scanner obj= new Scanner(System.in);
		System.out.println("You have given size of first matrix as "+a+" rows and "+ b+" columns.");
		System.out.println("Enter dimension of second matrix: ");
		c= obj.nextInt();
		d=obj.nextInt();
		
		int matrix1[][]= new int[a][b];
		int matrix2[][]= new int[c][d];
		int result[][]= new int[a][d];
		
		if(b==c) {
			System.out.println("Enter data for first matrix: ");
			for(int i=0; i<a; i++) {
				for(int j=0; j<b; j++) {
					matrix1[i][j]= obj.nextInt();
				}
			}
			System.out.println("Enter element of matrix 2: ");
			for(int i=0; i<d; i++) {
				for(int j=0; j<c; j++) {
					matrix2[i][j]=obj.nextInt();
				}
			}
			for (int i = 0; i < a; i++)
	        {
	            for (int j = 0; j < d; j++)
	            {
	                result[i][j] = 0;
	                for (int k = 0; k < b; k++)
	                {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
			System.out.println("\n\nResultant matrix is : ");
			
			for(int i=0; i<a; i++) {
				for(int j=0; j<d; j++) {
					System.out.print(result[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Matrix multiplication is not possible.");
			System.out.println("Please read basic rule of matrix multiplication before using this program.\nThank You!");
		}
	}
	
	//To check whether two string is Anagram or not.
	//Here you will give two string as input and you will get result as per your input.
	public void IsAnagram(String m, String n) {
		
		String a=m.toLowerCase();
		String b=n.toLowerCase();
		boolean isAnagram= true;
		int al[]= new int[256];
		int bl[]= new int [256];
		
		for(char c: a.toCharArray()) {
			int index = (int)c;
			al[index]++;
		}
		for(char c: b.toCharArray()) {
			int index = (int)c;
			bl[index]++;
		}
		for(int i=0; i<256; i++) {
			if(al[i]!=bl[i]) {
				isAnagram= false;
				break;
			}
		}
		if(isAnagram) System.out.println(m+" "+n+" is Anagram.");
		else System.out.println(m+" "+n+" is not Anagram.");
	}
	
	//To check string is palindrome or not
	public void isPalindrom_string(String a) {
		String b="";
		boolean isPalindrom= false;
		int n=a.length();
		for(int i=n-1; i>=0; i--) {
			b+=a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) isPalindrom=true;     
		else isPalindrom=false;
		
		
		if(isPalindrom) System.out.println(a+" is palindrom.");
		else System.out.println(a+ " is not palindrom.");
		
	}
	
}
