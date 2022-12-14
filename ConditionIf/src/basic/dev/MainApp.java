package basic.dev;
import java.util.Scanner;
public class MainApp {
	
		public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap so nguyen n: ");
			n = sc.nextInt();
			
			if( n >= 0 ) {
				System.out.println(n + " la so nguyen");
			}else {
				System.out.println(n + " la so am");
			}
		}
	}

 //Viết chương trình giải phương trình bậc 2 
import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao a = ");
		a = sc.nextDouble();
		System.out.println("Nhap vao b = ");
		b = sc.nextDouble();
		System.out.println("Nhap vao c = ");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			System.out.println("Nhập dữ liệu sai!");
		} else {
			if (delta < 0) {
				
				System.out.println("Phương trình vô nghiệm!");
			} else if (delta == 0) {
				
				x1 = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x1=x2=" + x1);
			} else {
				
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có nghiệm");
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			}
		}
	}
}

//Viết chương trình nhập vào 3 số a, b, c. Kiểm tra có phải là 3 cạnh của một tam giác không? 
import java.util.Scanner;

public class BaiTapJavaCoBan3 {
   public static void main(String[] args)
   {
      float a, b, c;
      System.out.println("Nhập vào 3 số:");
      Scanner sc = new Scanner(System.in);

      a = sc.nextFloat();
      b = sc.nextFloat();
      c = sc.nextFloat();

      if(a+b>c && b+c>a && c+a>b)
         System.out.println("Ba số đúng là 3 cạnh của 1 tam giác");
      else
         System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
   }
}
 
   
