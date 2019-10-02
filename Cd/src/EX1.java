/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Foysal
 */
import java.util.*;
public class EX1
{
public static void main(String args[])
{
  String s = null;
  int j = 0;
  double k = 0;
  ArrayList<Student> List=new ArrayList<Student>();
  Random r=new Random();
  for(int i=0;i<10;i++)
  {
      s="A"+i;
      j=r.nextInt(i)+160200;
      k=r.nextDouble()+3;
  Student s1=new Student(s,j,k); 
  List.add(s1);
  }
  for(Student u:List)
  {
      System.out.println(u);
  }
}
}