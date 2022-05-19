package com.vstl.javatraining;

 public class DataTypeConversion {
	
	//Integer to string//
	
	public void verifyStringRoomTemperature(int intTemp)  {
		
		String strTemp ="36";
		String strConvertedTemp = String.valueOf(intTemp);
		
		
		if(strConvertedTemp.equals(strTemp))  {
			System.out.println("The room temp is maximum");
		}
		
		else 
			
		{
			System.out.println("The room temp is minimum");
		}
		
	}
	
 
	//Integer to char
    
    public void verifyStudentsMarks(char charHighestMarks)  {
   	 int intScienceSubject=50;
   	
   	 int intArtsSubject=90;
   	 
   	 int highestStudentsMarks =intScienceSubject+intArtsSubject;
   	 char charConvertedHigestStudentsMarks =(char)highestStudentsMarks;
   	 
   	 
   	 if (charConvertedHigestStudentsMarks>highestStudentsMarks) {
   		 System.out.println("The science subject marks is highest");
   	 }		 
   		 else 
   		 {
   		System.out.println("The arts subject mark is lowest");	 
   			 
   		 }
   	 
    }
    
		
		  //Integer to double
      
     public void verifyTotalNumOfSchoolsInBelgaumDist(int integerSchools )  {
         double doubleSchools = 70;
      
     double doubleConvertedSchools = Double.valueOf(doubleSchools);
        
     if(doubleConvertedSchools > doubleSchools)  {
   	  
   	  System.out.println("The total number of schools in belagum district");
     }
   	  
   	  else
     {
   		  System.out.println("lowest schools");
     }

 }
     
     
       //String to Integer
        public void verifyCandidateJoinArmyAgeLimitEligibility(String strAge) {
       	   
       	 
       	 int intAge  =27;
       	 
       	 int intConvertedAge  = Integer.parseInt(strAge);
       	 
       	   if(intConvertedAge > intAge)  {
       		   System.out.println("Candidate is eligible for join army ");
       		   
       	   }
       	   else 
       	   {
       	System.out.println("Candidate is not eligible for join army");
        
        }
  }
       

 
 
		//double to string
 
      public void verifyBelgaumTemp(double doubleTemp)  {
    	doubleTemp =41;
    	double doubleConvertedTemp =Double.valueOf(doubleTemp);
    	
    	if(doubleConvertedTemp>doubleTemp)  {
    		
    		System.out.println("Temp is normal");
    		
    	}else {
    		System.out.println("Temp  is normal");
    	}
    	  
      }
      
 
      
            //String to double
     public void verifySslcpercentage(String strPercentage)  {
    	 
    	  String doublePercentage = "60.33";
    	  
    	  double doubleConvertedPercentage =Double.parseDouble(strPercentage);
    	  
    	   if(doubleConvertedPercentage > 60.33)  {
    		   
    		   System.out.println("pass");
    		   
    	   }
    	   else
    	   {
    		   System.out.println("pass ");
    	   }
     }
			
     	
		///string to boolean
 
    
    public void verifystatementsOneAndTwo(String strStatements)  {
    	  String booleanStatementsOne   ="true";
    	  String booleanStatementsTwo  ="false";
    	  
    	  boolean BooleanConvertedStatementOne = Boolean.parseBoolean(booleanStatementsOne);
    	  boolean BooleanConvertedStatementTwo = Boolean.parseBoolean(booleanStatementsTwo) ;
    	  
    	  System.out.println("The boolean Statements One is true  :" +BooleanConvertedStatementOne);
    	  System.out.println("The boolean Statements Two is false :" +BooleanConvertedStatementTwo);
         
 }
    
     				
 }			
		
		
		
	
	
	
	
	
	
	
	
	


