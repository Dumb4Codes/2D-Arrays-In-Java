
public class Z8_2DArrays {

	public static void main(String[] args) {
       
		// 2D arrays = An array of arrays
		
		
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Mustang";
		cars[0][1] = "Camaro";
		cars[0][2] = "Corvette";
		cars[1][0] = "Tesla";
		cars[1][1] = "F-150";
		cars[1][2] = "Ranger";
		cars[2][0] = "Raptor";
		cars[2][1] = "Chevy";
		cars[2][2] = "Ford";
		
		for(int i = 0; i<cars.length; i++) {
			System.out.println();
			for(int j = 0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
				
			}
		}
			
		// OR we can also write
		
		String[][] name = {
				           {"laptop", "Mouse", "keyboard"},
				           {"spray", "Headset", "Books"}
				           };
		for(int a = 0; a<name.length; a++) {
			System.out.println();
			for(int b = 0; b<name[a].length; b++) {
				System.out.print(name[a][b]+" ");
			}
		}

	}

}
