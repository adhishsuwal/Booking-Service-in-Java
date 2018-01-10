/**This is a class that lets users book different types of catering service.
 * Adhish Suwal
 * 17 December 2016 (a version number or a date)
 */
import java.util.*;
public class CateringService
{
   ArrayList<Catering> list = new ArrayList<Catering>();
   /** 
    * This is a public method that lets users add catering service to the array list. It adds objects of the previous class to the list.
    */
   public void addCatering(String compName, int pPlateRate, String caterType)
   {
    Catering catering = new Catering(compName,pPlateRate,caterType);
    list.add(catering);
   }
   /**
    * This is a public method that lets users remove objects from the array list.
    */
   public void removeCatering(int index)
   {
       if(index>=0 && index<list.size())
       {
           list.remove(index);
       }
       else
       {
           System.out.println("Sorry the index number is out of range. Please input a valid number.");
       }
   }
   /** 
    * This is a public method that lets users book the service from the array list.
    */
   public void bookCatering(int index,String custname,String custadd, String bookdate, int dishnum)
   {
       if(index>=0 && index<list.size())
       {
           Catering cater = list.get(index);
           cater.bookCatering(custname,custadd,bookdate,dishnum);
           list.set(index,cater);
       }
       else
       {
           System.out.println("Sorry the index number is out of range. Please input a valid number.");
       }
   }
   /**
    * This is a public method that lets users free the service in the array list.
    */
   public void freeCatering(int index)
   {
       if(index>=0 && index<list.size())
       {
           Catering cater = list.get(index);
           cater.freeCatering();
           list.set(index,cater);
       }
       else
       {
           System.out.println("Sorry the index number is out of range. Please input a valid number.");
        }
   }
   /**
    * This is a public method that lists all the available objects of the previous class in the array list.
    */
   public void listAvailable()
   {
       for(int i=0; i<list.size(); i++)
       {
           Catering cater = list.get(i);
           if(cater.availableStatus == true)
           {
               System.out.println(i);
               cater.descript();
            }
       }
   }
   /**
    * This is a public method that search objects of the previous class which are currently available. 
    */
   public void searchAvailable(int perPlateRate, String CateringType)
   {
       int counter = 0;
       for(int i=0; i<list.size(); i++)
       {
           Catering cater = list.get(i);
           boolean bln = cater.getAvailableStatus();
           String cateringType = cater.getCateringType();
           int rate = cater.getPerPlateRate();
           if(rate<=perPlateRate && bln == true && cateringType == cateringType)
           {
               counter++;
               System.out.println(i);
               cater.descript();
               break;
           }
           else
           {
               System.out.println("Sorry, could not find the value you searched. Please try again.");
           }
       }
   }
}   
