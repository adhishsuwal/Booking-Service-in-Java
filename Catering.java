/**
 * This is a class that lets users book catering service for a particular event such as a wedding ceremony.
 * 
 * Adhish Suwal
 * 15043052/1
 * 22 December 2015 (a version number or a date)
 */

public class Catering
{
    String companyName;
    int perPlateRate;
    int dishNum;
    String bookingDate;
    String cateringType;
    String customerName;
    String customerAddress;
    boolean availableStatus;
    public Catering(String compName, int pPlateRate, String caterType)
    {
        companyName = compName;
        perPlateRate = pPlateRate;
        bookingDate = " ";
        dishNum = 0;
        cateringType = caterType;
        customerName = " ";
        availableStatus = true;
    }
    /**It is a get method that returns the name of the company.*/
    public String getCompanyName()
    {
        return companyName;
    }
    /**It is a get method that returns the value of rate of the service according to the number of plates used in the occasion.*/
    public int getPerPlateRate()
    {
        return perPlateRate;
    }
    /**It is a get method that returns the value of the number of dishes wanted for the event.*/
    public int getDishNum()
    {
        return dishNum;
    }
    /**It is a get method that returns the date in which the service is going to be booked.*/
    public String getBookingDate()
    {
        return bookingDate;
    }
    /**It is a get method that returns the type of service needed for the occasion.*/
    public String getCateringType()
    {
        return cateringType;
    }
    /**It is a get method that returns the name of the customer who wants to book the service.*/
    public String getCustomerName()
    {
        return customerName;
    }
    /**It is a get method that returns the address of the customer.*/
    public String getCustomerAddress()
    {
        return customerAddress;
    }
    /**It is a get method that returns the value of the attribute that is a Boolean expression.*/
    public boolean getAvailableStatus()
    {
        return availableStatus;
    }
    /**It is a set method that changes the name of the customer who wants to book the service.*/
    public void setCustomerName(String custname)
    {
        customerName = custname;
    }
    /**It is a set method that changes the address of the customer wanting to book the service.*/
    public void setCustomerAddress(String custadd)
    {
        customerAddress = custadd;
    }
    /**It is a set method that changes the rate of the service according to the number of plates used.*/
    public void setPerPlateRate(int perPlateRt)
    {
        perPlateRate = perPlateRt;
    }
    /**It is a public method for booking the service and informs other customers whether the service is already booked or not.*/
    public void bookCatering(String custname,String custadd, String bookdate, int dishnum)
    {
        if(availableStatus == true)
        {
            customerName = custname;
            customerAddress = custadd;
            bookingDate = bookdate;
            dishNum = dishnum;
            availableStatus = false;
        }
        else
        {
            System.out.println("Sorry the service is already booked"+".");
        }
    }
    /**It is a public method that lets the service to be free and is ready to be booked by another customer.*/
    public void freeCatering()
    {
        if(availableStatus == false)
        {
            customerName = " ";
            customerAddress = " ";
            bookingDate = " ";
            dishNum = 0;
            availableStatus = true;
        }
        else
        {
            System.out.println("The service is free to be booked"+".");
        }
    }
    /**This is a method that shows the description of the scenario.*/
    public void descript()
    {
        System.out.println("Catering service is served by "+companyName+". The rate is "+perPlateRate+". The service type is "+cateringType+".");
    }
}    