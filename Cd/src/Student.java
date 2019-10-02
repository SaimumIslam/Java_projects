
public class Student 
{
     String name;
  int roll;
  double cgpa;
  Student(String s,int i,double d)
  {
   this.name=s;
   this.roll=i;
   this.cgpa=d;
  }
  public String getName()
  {
    return this.name;
  }
  public void setName(String s)
  {
    this.name=s;
  }
  public String toString()
  {
      return name+" "+roll+" "+cgpa;
  }
  
}
