class Employee extends Person
{
   double annualSalary;
   int startWorkYear;
   String natInsNum;
   // Constructor for initialising the class variables
   Employee()
   {
      name = "Currently no name entered";
      annualSalary = 0.0;
      startWorkYear = -1;
      natInsNum = "Not Applicable";
   }
   
   // Setters for setting the value of variables
   void setName(String name)
   {
      this.name = name;
   }
   
   void setAnnualSalary(double annualSalary)
   {
      this.annualSalary = annualSalary;
   }
   
   void setStartWorkYear(int startWorkYear)
   {
      this.startWorkYear = startWorkYear;
   }
   
   void setNatInsNum(String natInsNum)
   {
      this.natInsNum = natInsNum;
   }
   
   //Getters for getting values
     
  String getName()
  {
   return name;
  }
  
  double getAnnualSalary()
  {
   return annualSalary;
  }
  
  int getStartWorkYear()
  {
   return startWorkYear;
  }
  
  String getNatInsNum()
  {
   return natInsNum;
  }

}