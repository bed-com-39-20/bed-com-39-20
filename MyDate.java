import java.util.*;

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(){
        setDate(System.currentTimeMillis());
    }
    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public void setDate(long elapsedTime) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }

}