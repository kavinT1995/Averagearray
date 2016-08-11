# Averagearray
public class Average {
	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of array");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		System.out.println("Enter the array element");
		int[] array=new int[size];
		for(int i=0;i<size;i++){
			array[i]=s.nextInt();
		}
		int length=array.length/2; 
		int first[]=new int[length];
		int second[]=new int[(array.length-length)];
		
			for(int i=0;i<length;i++){
				first[i]=array[i];
				}
			int j=0;
			for(int i=length;i<array.length;i++){
				second[j]=array[i];
				j++;
			}
			int firstsum=0;
			int secondsum=0;
			for(int i=0;i<first.length;i++){
				firstsum+=first[i];
			}
			for(int i=0;i<second.length;i++){
				secondsum+=second[i];
			}
			System.out.println("firstarraysum:"+firstsum);
			System.out.println("secondarraysum:"+secondsum);
			System.out.println("firstarraylength:"+first.length);
			System.out.println("secondarraylength"+second.length);
			if(firstsum/first.length==secondsum/second.length){
				System.out.println("Same possible");
			}
			else
				System.out.println("notSame notpossible");
		}
		
}
