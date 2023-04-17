package assignment2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text
.SimpleDateFormat;
class Program1{
	public static void main1(String[] args){
		
	LocalDate d = LocalDate.now();
	int day =d.getDayOfMonth();
	int month =d.getMonthValue();
	int year = d.getYear();
	System.out.println( day+ " / "+month+" / "+year);
	System.out.println( month+ " / "+day+" / "+year);
	System.out.println( year+ " / "+month+" / "+day);
}
	public static void main(String[] args)
    {
    LocalTime lt =  LocalTime.now();
    int hour = lt.getHour();
     int minute = lt.getMinute();
    int second = lt.getSecond();
    System.out.println( hour+":"+minute+":"+second );
    
    System.out.println(DateTimeFormatter.ofPattern("hh:mm:ss a").format(LocalTime.now())); 
    System.out.println( hour+":"+minute);

    
    
    }
	

}
