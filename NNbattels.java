public class NNbattels{
	public static void main(String[] args){
		int bnumbers=99;
		String battelsword="бутылок";
		String battelword="бутылка";	
		String buf="";
		while(bnumbers>0)

		{	if((bnumbers % 10)==1 || bnumbers==1)
	        {
			buf=battelword;
		    }
		    else if((bnumbers % 10)==2)
		    {

		    	buf="бутылки";
		    }
		      else if((bnumbers % 10)==3)
		    {

		    	buf="бутылки";
		    }
		      else if((bnumbers % 10)==4)
		    {

		    	buf="бутылки";
		    }
		else{
			buf=battelsword;
	        }
			System.out.println(bnumbers+" "+buf+" пива на стене");
			System.out.println(bnumbers+" "+buf+" пива!");
			System.out.println("Возьми одну, пусти по кругу");
							
						
			
			bnumbers-=1;

		}	
		System.out.println("Больше нет бутылок пива на стене");
	}
}