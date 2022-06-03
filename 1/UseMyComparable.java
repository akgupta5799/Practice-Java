public class UseMyComparable
{
	public static MyComparable[] sortObjects(MyComparable[] list)
	{
		for(int i=0; i < list.length; i++)
		{
			for(int j=0; j < list.length -i-1; j++)
			{
				Card obj = (Card)list[j];
				Card obj1 = (Card)list[j+1];
				if(obj.compareTo(obj1)==1)
				{
					Card temp = obj;
					list[j]=list[j+1];
					list[j+1] = temp;
				}
			}
		}
        return list;		
		
 
   }	
     
    public static void main(String[] args){
		Card card[] = new Card[5];
		card[0] = new Card(8,1);
		card[1] = new Card(180,2);
		card[2] = new Card(2,3);
		card[3] = new Card(12,4);
		card[4]  = new Card(4,5);
			
		MyComparable arr[] = sortObjects(card);
		System.out.println("Sorted suit ans rank :");
		for(int i =0; i<card.length; i++){
			Card obj = (Card) arr[i];
			System.out.println(obj.suit() +" "+ obj.rank());
		}

        		
     }	
}