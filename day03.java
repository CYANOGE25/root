package day3;

public class day03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char alphabet = 'x';
		System.out.println(alphabet++);
		System.out.println(alphabet);
		

		
		
	     // 이항연산자 (피연산자 연산자 피연산자)
		 // 산술연산자 : 변수 + 변수 -> 처리된 결과 
		
		
		 int num_x = 100;
		 int num_y = 200;
		 
		 System.out.println(num_x + num_y);
		 System.out.println(num_x * num_y);
		 System.out.println(num_x / num_y);
		 //or System.out.println(num_x % num_y);
		 /*
		 
		 /*
		 if(num_x + num_y == 300) {
		     System.out.println(num_x +num_y);
		     }
		     */
		 
		 // 이항연산자_복함대입연산자
		 
		 
		 int y = 5;
		 // y += 1; = 6 
		 // y *= 2; = 10
		 y -= 2; // 3
		 
		 //3)이항연산자_관계연산자 : 크다 / 작다 / 길다 / 같거나작다 / 같거나 크다 
		 //결과값은 논리적인 판단이다.(true/false)
		 
		 int a = 10;
		 int b = 20;
		 System.out.println(a > b);
		 System.out.println(a <= b);
		 System.out.println(a == b);
		 System.out.println(a != b);
		 
		 
		 //이항연산자_논리연산자(비트연산자)
		 //boolean : 1byte :8bit 
		 boolean b1 = true;
		 boolean b2 = false;
		 boolean b3 = true;
 		 boolean b4 = false;
 		 
 		 System.out.println("###논리곱(AND)##");
 		 System.out.println(b1 && b2);
 		 System.out.println(b1 && b3);
 		 System.out.println(b2 && b4);
 		 
 		 System.out.println("###논리곱(OR)###");
 		 
 	
	}
}