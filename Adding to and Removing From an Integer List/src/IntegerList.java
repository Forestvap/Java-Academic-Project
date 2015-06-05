
public class IntegerList {
		int[] list;
		private int elements;
		int number;
		
		public IntegerList (int size)
		{
			list = new int[size];
			number=size;
			
			
		}
		public void randomize()
		{for (int i = 0; i<list.length;i++)
			list[i]=(int)(Math.random()*100)+1;
		number = list.length;
		}
		public void print()
		{for (int i = 0; i <list.length;i ++)
			System.out.println (i + ":\t" + list[i]);
		
		}
		
		public void addElement (int newVal)
		{	
			if (elements + 1 > list.length)
				increaseSize();
			
			int [] newArray = new int [list.length + 1];
			for (int i=0;i<list.length;i++)
				newArray[i]=list[i];
			newArray[ newArray.length -1 ] = newVal;
			list = newArray;
	
		}
		
		private void increaseSize()
		{

		  int [] temp = new int [list.length*2];
		  for (int i=0;i<elements;i++)
		  
			  temp[i] = list[i];
		  
		  list = temp;	
		  number = list.length;
		 

		}
	}

