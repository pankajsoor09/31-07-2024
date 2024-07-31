package pack1;

import java.util.Random;

public class TestCompartment {
	public static void main(String[] args) {

		Compartment[] compartment = new Compartment[10];
		Random random = new Random();

		int num = 0;

		for (int i = 0; i < 10; i++) {
			num = random.nextInt(4);
			num++;
			if (num == 1) {
				compartment[i] = new FirstClass();
			}

			else if (num == 2) {
				compartment[i] = new Ladies();
			}

			else if (num == 3) {
				compartment[i] = new General();
			}

			else {
				compartment[i] = new Luggage();
			}

		}
		for (int i = 0; i < 10; i++) {
			compartment[i].notice();
			System.out.println();
		}
	}

}

/* 

public class TestCompartment{
  public static void main(String[] args) {
    
    Random random = new Random();            // Creating Random class obj to utilize the random methods
    
    Compartment compartment[] = new Compartment[10];
    
    for(int i = 0; i<10; i++) {
      
      int selectionNumber = random.nextInt(4)+1;
      
      switch(selectionNumber) {
      
      case 1: 
      {
        compartment[i] = new FirstClass();
      }
      break;
      
      case 2:
      {
        compartment[i] = new Ladies();
      }
      break;
      
      case 3: 
      {
        compartment[i] = new General();
      }
      break;
      
      case 4:
      {
        compartment[i] = new Luggage();
      }
      break;
      
      }
      }
    for(int j = 0; j<10; j++) {
      compartment[j].notice();
    }
    
  }
  
}
 */
