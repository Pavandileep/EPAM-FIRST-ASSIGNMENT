
public class ChildrensNewYearGifts 
{
	int noOfSweets;
	int noOfChoco;
	Sweets sweet[];
	Chocolates choco[];
	
	ChildrensNewYearGifts(int noOfSweets,int noOfChoco,int weightOfSweets[],int price_of_sweets[],int weightOfChoco[],int price_of_choco[])
	{
		this.noOfSweets=noOfSweets;
		this.noOfChoco=noOfChoco;
		sweet=new Sweets[noOfSweets];
		choco=new Chocolates[noOfChoco];
		int i;	
		
		for(i=0;i<noOfSweets;i++)
		{
			sweet[i]=new Sweets();
			sweet[i].assign(weightOfSweets[i],price_of_sweets[i]);
		}
		
		
		for(i=0;i<noOfChoco;i++)
		{
			choco[i]=new Chocolates();
			choco[i].assign(weightOfChoco[i],price_of_choco[i]);
		}
		
	}

}
