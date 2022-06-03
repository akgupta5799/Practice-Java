//Internal Evaluation-2 Que1

import java.util.Scanner;
public class MinMaxNorm {
	public static double[] minMaxNormalization(double[] inputData) {
		double M = inputData[0];
		for(int i=0;i<inputData.length;i++){
			if(inputData[i]>M)
				M = inputData[i];
		}
		double m = inputData[0];
		for(int i=0;i<inputData.length;i++){
			if(inputData[i]<m)
				m = inputData[i];
		}
		for(int i=0;i<inputData.length;i++){
			inputData[i]= (inputData[i]-m)/(M-m);
		}

		return inputData;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		double inputData[]= new double[size];
		System.out.println("Enter the value of array: ");

		for(int i=0;i<inputData.length;i++){
             inputData[i]=sc.nextDouble();   
		}

		inputData = minMaxNormalization(inputData);

		System.out.println("Normalized: ");

		for(int i=0;i<inputData.length;i++){
             System.out.print(inputData[i] + " ");   
		}
	}
}