import java.util.*;

public class RevisionExercise {
    public static void main(String[] args) {
      
//SELVITÄ MITÄ HITTOA TUOSSA tempArray ja amountOfNumbers kohdassa tapahtuu.
        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfNumbers = askInfo(tempArray);
       
        int[] realArray = new int[amountOfNumbers];
        copyInfo(realArray, tempArray);
      
        setArray(realArray);
        
        printArray(realArray);
    }


	private static int askInfo(int[] input){
		Scanner reader = new Scanner(System.in);
		int[] array = input;
		int[] newArray;
		int num;
		int ammount = 0;
		//array receiving input has capasity of 100 and we keep record of the number of inputs that are given.
		for (int i=0; i < array.length; ++i) {
			System.out.print((i+1)+". number: ");
			num = reader.nextInt();
			if(num != 0){
			array[i] = num;
			ammount = ammount+1;
			}
			else
				break;
			
		}
		
		//New array receives exact size with input given length and gets values from previous array.
		
		newArray=new int[ammount];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i]=array[i];
            //System.out.println(newArray [i]);
        }
		
		return newArray.length;
	}
	
	private static void copyInfo(int real[],int temp[]){
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i]!=0){
				real[i]=temp[i];
			}
			else
				break;
        }
		/*
		for(int i = 0; i < real.length; i++) {
            System.out.println(real [i]);
		}
		*/
		
	}

	private static void setArray(int array[]){
		for (int i = 0; i < array.length-1; ++i) {
			for (int j=i+1; j < array.length; ++j) {
				if (array[i] < array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	
	
	public static void printArray(int[] realArray ) {
        System.out.println("\nOrdered array: ");
        for(int i = 0; i < realArray .length; i++) {
            System.out.println(realArray [i]);
        }
    }
}