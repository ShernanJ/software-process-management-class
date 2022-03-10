/** Code for writing test cases using JUnit or NUnit.
*@author Kamal, 2021
*/
public class Year {

  
  public static boolean isLeap (int year)
    {
       

        
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}