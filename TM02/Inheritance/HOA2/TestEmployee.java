class TestEmployee
{
   public static void main(String[] args)
   {
      Employee emp1 = new Employee();
      emp1.setName("Javed");
      emp1.setAnnualSalary(350000.00);
      emp1.setStartWorkYear(2020);
      emp1.setNatInsNum("NATINSNUM20201");
      System.out.println("Name : " + emp1.getName());
      System.out.println("Annual Salary : " + emp1.getAnnualSalary());
      System.out.println("Start Work Year : " + emp1.getStartWorkYear());
      System.out.println("National Insurance Number : " + emp1.getNatInsNum());
   }
}