import java.util.Scanner;
import java.util.ArrayList;

public class Arrays
{
	public static void main(String[] args) {
	   one();
	   two();
	   three();
	   four();
	   five();
	   six();
	   seven();
	   eight();
	   nine();
	   ten();
	}
	
	public static void one() {
	     System.out.println("--1--");
	     Scanner obj=new Scanner(System.in);
	     int n=obj.nextInt();
		 int[] arr=new int[n];
		 for(int i=0;i<arr.length;i++){
		     arr[i]=obj.nextInt();
		 }
		 for(int i=arr.length-1;i>=0;i--){
		     System.out.println(arr[i]);
		 }
	}
	public static void two(){
	     System.out.println("--2--");
	     Scanner obj=new Scanner(System.in);
	     int n=obj.nextInt();
		 int[] arr=new int[n];
		 double sum=0,count=0,product=1;
		 for(int i=0;i<arr.length;i++){
		     arr[i]=obj.nextInt();
		 }
		 for(int i=0;i<arr.length;i++){
		     sum+=arr[i];
		     product*=arr[i];
		     count++;
		 }
		 System.out.printf("Sum: %f Product: %f Avg: %f",sum,product,sum/count);
	}
	public static void three(){
	     System.out.println("--3--");
	     Scanner obj=new Scanner(System.in);
	     int n=obj.nextInt();
		 int[] arr=new int[n];
		 int[] even=new int[n];
		 int count=0;
		 for(int i=0;i<arr.length;i++){
		     arr[i]=obj.nextInt();
		 }
		 for(int i=0;i<arr.length;i++){
		     if(arr[i]%2==0){
		         even[count]=arr[i];
		         count++;
		     }
		 }
		 for(int i=0;i<count;i++){
		     System.out.println(even[i]);
		 }
	}
		public static void four(){
		 System.out.println("--4--");
	     Scanner obj=new Scanner(System.in);
	     int n=obj.nextInt();
		 int[] arr=new int[n];
		 int[] three=new int[n];
		 int[] five=new int[n];
		 int threeCount=0,fiveCount=0;
		 for(int i=0;i<arr.length;i++){
		     arr[i]=obj.nextInt();
		 }
		 for(int i=0;i<arr.length;i++){
		     if(arr[i]%3==0){
		         three[threeCount]=arr[i];
		         threeCount++;
		     }
		 }
		  for(int i=0;i<arr.length;i++){
		     if(arr[i]%5==0){
		         five[fiveCount]=arr[i];
		         fiveCount++;
		     }
		 }
		 System.out.println("Three");
		 for(int i=0;i<threeCount;i++){
		     System.out.println(three[i]);
		 }
		 System.out.println("Five");
		  for(int i=0;i<fiveCount;i++){
		     System.out.println(five[i]);
		 }
	}
	public static void five(){
		System.out.println("--5--");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] arr=new int[n];
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			int count=0;
			if(list.contains(arr[i])){
				continue;
			}
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.printf("%d:%d\n",arr[i],count);
			list.add(arr[i]);
		}
	}
	public static void six(){
	     System.out.println("--6--");
	     Scanner obj=new Scanner(System.in);
	     int n=obj.nextInt();
		 int[] arr=new int[n];
		 double sum=0,count=0,product=1;
		 for(int i=0;i<arr.length;i++){
		     arr[i]=obj.nextInt();
		 }
		 int min=arr[0],max=arr[0];
		 for(int i=0;i<arr.length;i++){
		     if(arr[i]<min){
		         min=arr[i];
		     }
		     if(arr[i]>max){
		         max=arr[i];
		     }
		 }
		 System.out.printf("min:%d max:%d",min,max);
	}
	public static void seven(){
	    System.out.println("--7--");
	    Scanner obj=new Scanner(System.in);
	    int[] arr1=new int[10];
	    int[] arr2=new int[10];
	    int[] resultArr=new int[10];
	    System.out.println("First array:");
	     for(int i=0;i<arr1.length;i++){
		     arr1[i]=obj.nextInt();
		 }
		  System.out.println("Second array:");
		  for(int i=0;i<arr2.length;i++){
		     arr2[i]=obj.nextInt();
		 }
		 for(int i=0;i<arr1.length;i++){
		     resultArr[i]=arr1[i]+arr2[i];
		 }
		  System.out.println("Result array:");
		  for(int element:resultArr){
		  System.out.println(element);
		  }
	}
	public static void eight(){
	     System.out.println("--8--");
	      Scanner obj=new Scanner(System.in);
	     int n=obj.nextInt();
		 int[] arr=new int[n];
		 int count=0;
		 boolean isPrime=true;
		 for(int i=0;i<arr.length;i++){
		     arr[i]=obj.nextInt();
		 }
		 for(int i=0;i<arr.length;i++){
		     for(int j=2;j<arr[i]/2;j++){
		         if(arr[i]%j==0){
		             isPrime=false;
		         }
		     }
		     if(isPrime){
		         count++;
		     }
		     isPrime=true;
		 }
		 System.out.println("Prime numbers count:");
		 System.out.println(count);
	}
	public static void nine(){
	   System.out.println("--9--");
	    Scanner obj=new Scanner(System.in);
	     int n=obj.nextInt();
		 int[] arr=new int[n];
		 for(int i=0;i<arr.length;i++){
		     int curN=obj.nextInt();
		     if(curN%2==0){
		     arr[i]=0;
		     }else{
		         arr[i]=curN;
		     }
		 }
		 System.out.println("Print array:");
		 for(int element:arr){
		     System.out.println(element);
		 }
	}
		public static void ten(){
		    System.out.println("--10--");
	        Scanner obj=new Scanner(System.in);
	        int[] arr=new int[10];
	        int[] resultArr=new int[5];
	        int count=0;
	       for(int i=0;i<arr.length;i++){
		     arr[i]=obj.nextInt();
		   }
		   for(int i=0;i<arr.length;i+=2){
		       int curNum=arr[i];
		       int nextNum=arr[i+1];
		       resultArr[count]=curNum+nextNum;
		       count++;
		   }
		  System.out.println("Print result:");
		  for(int element:resultArr){
		      System.out.println(element);
		  }
		}
}
