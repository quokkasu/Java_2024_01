
public class EX14 {
	public static void main(String args[]) {
  	//126 page
  	//다차원 배열
  	// new int[3][5] : 3행 5열의 이차원 행렬
  	//***********************************************
  	//이차원 배열의 한 줄(행)에는 일차원 배열임
  	//***************************************
  	//일차원 배열 변수는 일차원 배열의 주소를 저장함
  	
  	int[][] matrix = new int [5][3];
   
  	/*
  	 5명의 국어, 영어, 수학 점수를 저장한 이차원 배열
  	 */
  	matrix = new int [][] {
  												{100,100, 100},
  												{98, 72, 86},
  												{76, 98, 82},
  												{95, 88, 100},
  												{100, 76, 84}
  	};
  	System.out.println("matrix.length : " + matrix.length);
  	System.out.println("matrix[0].length : " + matrix[0].length);
  	System.out.println("matrix[1].length : " + matrix[1].length);
  	System.out.println("matrix[2].length : " + matrix[2].length);
  	System.out.println("matrix[3].length : " + matrix[3].length);
  	System.out.println("matrix[4].length : " + matrix[4].length);
  	System.out.println("matrix[3][[2] : " + matrix[3][2]);
  	System.out.println("matrix[3][1] : " + matrix[3][1]);
  	
  	/*
  	 				0 :						{100,100, 100},
  					1 :						{98, 72, 86},
  					2 :						{76, 98, 82},
  					3 :						{95, 88, 100},
  					4 :						{100, 76, 84}
  	 */
  	
  	
  	// matrix[0].length
  	
  	for(int out = 0; out < matrix.length; out++)
  		for(int in = 0; in < matrix[0].length; in++) {
  			System.out.print(matrix[0][in] + " ");
  		}
  	// 2차원 배열의 for문
  	for(int out = 0; out < matrix.length; out++)
  		for(int in = 0; in < matrix[out].length; in++) {
  			System.out.print(matrix[out][in] + " ");
  		}
  	
  	System.out.println("\n============================");
  
  	for(int i = 0; i < matrix[1].length; i++) {
  	System.out.print(matrix[1][i] + " ");
  	System.out.println("\n============================");
  	}
  	for(int i = 0; i < matrix[2].length; i++) {
  		System.out.print(matrix[2][i] + " ");
  		System.out.println("\n============================");
  	}
  	for(int i = 0; i < matrix[3].length; i++) {
  		System.out.print(matrix[3][i] + " ");
  		System.out.println("\n============================");
  	}
  	for(int i = 0; i < matrix[4].length; i++) {
  		System.out.print(matrix[4][i] + " ");
  		System.out.println("\n============================");
  	}

	}
}