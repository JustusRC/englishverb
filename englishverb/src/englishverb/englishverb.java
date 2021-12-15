import java.util.Scanner;

public class englishverb {

	public static void main(String[] args) {

		
		//Justus Contreras
		//P5.12
		//CS234
		
		  //Allows user to input
		
		
		Scanner pam = new Scanner (System.in);
		
          //Variable declaration
		  String verb, sp, tense;
		  
		  int person;
		  //Prompts user to enter a verb
		  System.out.print("Enter a regular English verb: ");
		  verb=pam.nextLine();
		  //Prompts user to enter what tense
		  System.out.print("Enter past, present, or future tense: ");
		  tense=pam.nextLine();
		  //Prompts user to enter pronoun
		  System.out.print("Enter singular or plural: ");
		  sp=pam.nextLine();
		  //Prompts user to enter what person
		  System.out.print("Enter (1) first person, (2) second person, (3), third person: ");
		  person=pam.nextInt();
		  //Output
	     System.out.println(getConjugate(verb,person,sp,tense));
		

		  
	}
	     //Static method (getPronoun) declaration
		  public static String getPronoun(int person, String sp)
		  {
			//Variable Declaration
			String per= "";
			
			  //If statement if user picks singular
			  if(sp.equals("singular"))
			  {   //If statement if user picks first person
				  if(person == 1)
					{
					per = "I";
					}
				    //else-if statement if user picks second person
					else if(person == 2)
					{
					per = "You";
					}
				  //else-if statement if user picks third
					else if(person == 3)
					{
					per = "He/She";
					}	
			  }
			  //If statement if user picks plural
				  if (sp.equals("plural"))
					{
					//If statement if user picks first person
						if(person == 1)
						{
						per = "We";
						}
						//If statement if user picks second person
						else if(person == 2)
						{
						per = "You";
						}
						//If statement if user picks third person
						else if(person == 3)
						{
						per = "They";
						}
					}
				  
				
				return per;
			  }
			  
		
		  
		  
		     //Static method (getConjugate) declaration
          public static String getConjugate(String verb, int person, String sp, String tense)
             {
				//Variable declaration
          	String conjugate = "", sentence = "";
          	//If user picks present or past
          	if(tense.equals("present") || tense.equals("past"))
          	{    //If user picks present and third person and singular
          		if(tense.equals("present") && person == 3 && sp.equals("singular"))
          		
          		conjugate = verb + "s";
          		
          		else 
          		{//Else if user picks present
          	    if(tense.equals("present"))
          	    	conjugate = verb;
          	    else if (tense.equals("past") && person == 1 && sp.equals("singular"))//If user picks past and first person and singular
          	    	conjugate= "was " + verb + "ing";
          	    else //If user doesn't pick the following above
          	    	conjugate= "were " + verb + "ing";
          		}
          	    }
          	if (tense.equals("future"))//If user picks future
          	{
          		conjugate= "will " + verb ;
          	}
             //Calls the getPronoun method to form a sentence
             sentence = getPronoun(person,sp) + " " +conjugate;
          	
              return sentence;
			}  
}
