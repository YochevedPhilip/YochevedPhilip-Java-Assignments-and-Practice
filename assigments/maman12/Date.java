
/**
 * Write a description of class Date here.
 *שאלה לגבי שיטת אחרי, אם אפשר להשתמש בעוד משהו 
 * @author (Yocheved Philip)
 * @version (208664433)
 */
public class Date{ 
    private int _day; 
    private int _month; 
    private int _year; 
    private final int DEFAULT_DAY=1; 
    private final int DEFAULT_MONTH=1; 
    private final int DEFAULT_YEAR=2024; 
    private final int JANUARY = 1;
    private final int FEBRUARY = 2;
    private final int MARCH = 3;
    private final int APRIL = 4;
    private final int MAY = 5;
    private final int JUNE = 6;
    private final int JULY = 7;
    private final int AUGUST = 8;
    private final int SEPTEMBER = 9;
    private final int OCTOBER = 10;
    private final int NOVEMBER = 11;
    private final int DECEMBER = 12;
    private final int FULL_MONTH_DAYS = 31;
    private final int SHORT_MONTH_DAYS = 30;
    private final int FEBRUARY_NORMAL_DAYS = 28;
    private final int FEBRUARY_LEAP_YEAR_DAYS = 29;

    /**
     * Date constructor - If the given date is valid - creates a new Date object, otherwise creates the date 01/01/2000.
     * @param day the day in the month
     * @param month the month in the year
     * @param year the year
     */

    public Date(int day, int month, int year) {
        this();
        if(isDateValid(day,month,year)) {
            this._day=day; 
            this._month=month; 
            this._year=year;  
        } else {
            
        }

    }
    /**
     * Default constructor
     */
    public Date() {
        this._day=DEFAULT_DAY; 
        this._month=DEFAULT_MONTH;
        this._year=DEFAULT_YEAR; 
    }

    /**
     * Copy constructor
     * @param other the other date to copy his attributes
     */
    public Date (Date other) {
        _day=other._day; 
        _month=other._month; 
        _year=other._year;

    } 

    /**
     * Gets the day
     * @return the day of this date
     */
    public int getDay(){
        return _day;
    }

    /**
     * Gets the month
     * @return the month of this date
     */
    public int getMonth(){
        return _month;
    }

    /**
     * Gets the year
     * @return the year of this date
     */
    public int getYear(){
        return _year; 
    } 

    /**
     * Sets the day (only if date remains valid)
     * @param dayToDet the new day value
     */
    public void setDay(int dayToSet){
        if(isDayValid(dayToSet, _month, _year)) {
            _day=dayToSet;
        }

    }

    /**
     * Sets the month (only if date remains valid)
     * @param monthToDet the new month value
     */
    public void setMonth(int monthToSet){
        if(isMonthValid(monthToSet)) {
            _month=monthToSet;
        }

    } 

    /**
     * Sets the year (only if date remains valid)
     * @param yearToDet the new year value
     */
    public void setYear(int yearToSet){
        if(isYearValid(yearToSet)) {
            _year=yearToSet;
        }

    } 

    /**
     * Checks if two dates are the same
     * @param other the date to compare this date to
     * @return true if the dates are the same
     */
    public boolean equals (Date other){
        return this._day==other._day&&this._month==other._month&&this._year==other._year;
    }

    /**
     * Checks if this date comes before another date
     * @param other  date to compare this date to
     * @return true if this date is before the other date
     */
    public boolean before (Date other){
        if(_year<other._year) {
            return true; 
        } else if(_year==other._year&&_month<other._month) {
            return true; 
        } else if(_year==other._year&&_month==other._month&&_day<other._day) {
            return true; 
        } 
        return false;
    } 

    /**
     * Checks if this date comes after another date
     * @param other date to compare this date to 
     * @return true if this date is after the other date
     */
    public boolean after (Date other){
        return other.before(this);
    } 

    /**
     * Calculates the difference in days between two dates
     * @param other the date to calculate the difference between 
     * @return the number of days between the dates (non negative value)
     */
    public int difference (Date other){
        return Math.abs(calculateDate(other._day, other._month, other._year)-calculateDate(this._day, this._month, this._year)); 
    } 

    /**
     * Returns a String that represents this date
     * @return a String that represents this date in the following format: day (2 digits) / month(2 digits) / year (4 digits) for example: 02/03/1998
     */
    public String toString(){
        String str; 
        if (this._day<=9) {
            str = "0"+_day+"/";
        } else {
            str = _day+"/";
        }
        if (_month<=9) {
            str += "0"+_month+"/";
        } else {
            str += _month+"/";
        }
        str += _year; 
        return str;
    }

    /**
     * Calculate the date of tomorrow
     * @return the date of tomorrow
     */
    public Date tomorrow() {
        if(_day!=maxDayForMonth(_month, _year)) {
            _day++; 
        } else {
            if(_month!=12) {
                _day=1;
                _month++; 
            } else {
                _day=1;
                _month=1; 
                _year++; 
            }}
        return this;
    }

    private int maxDayForMonth(int month, int year) {
        switch(month) {
            case JANUARY: 
            case MARCH:
            case MAY: 
            case JULY: 
            case AUGUST: 
            case OCTOBER: 
            case DECEMBER:    
                return FULL_MONTH_DAYS;
            case APRIL:
            case JUNE: 
            case SEPTEMBER: 
            case NOVEMBER: 
                return SHORT_MONTH_DAYS;
            case FEBRUARY: 
                if(isLeapYear(year)){
                    return FEBRUARY_LEAP_YEAR_DAYS;
                }
                else {
                    return FEBRUARY_NORMAL_DAYS;
                }
        } return -1; 
    }

    /**
     * @param day the day of the date
     * @param month the month of the date
     * @param year the year of the date
     * @return the number of days that have passed since the beginning of the Gregorian calendar 
     */
    private int calculateDate ( int day, int month, int year)
    {
        if (month < 3) {
            year--;
            month = month + 12;
        }
        return 365 * year + year/4 - year/100 + year/400 + ((month+1) * 306)/10 + (day - 62);
    }

    /**
     * @param y the year to check if leap 
     * @return returns true if y is a leap year, otherwise return false
     */
    private boolean isLeapYear (int y)
    {
        return (y%4==0 && y%100!=0) || (y%400==0) ? true : false;
    }

    private boolean isYearValid(int year) {
        return year>1000&&year<=9999;
    } 

    private boolean isMonthValid(int month) {
        return month>0&&month<=12;
    } 

    private boolean isDayValid(int day,int month,int year) {
        switch(month) {
            case JANUARY: 
            case MARCH:
            case MAY: 
            case JULY: 
            case AUGUST: 
            case OCTOBER: 
            case DECEMBER:    
                return (day > 0 && day <= FULL_MONTH_DAYS) ? true : false;
            case APRIL:
            case JUNE: 
            case SEPTEMBER: 
            case NOVEMBER: 
                return (day > 0 && day <= SHORT_MONTH_DAYS) ? true : false;
            case FEBRUARY: 
                if(isLeapYear(year)){
                    if(day>0&&day<=FEBRUARY_LEAP_YEAR_DAYS) {
                        return true;
                    } else {
                        return false; 
                    }
                } else {
                    if(day>0&&day<=FEBRUARY_NORMAL_DAYS) {
                        return true;
                    } else {
                        return false; 
                    }
                } 
            default:
                return false;
        }
    }

    private boolean isDateValid(int day,int month,int year) {
        return isYearValid(year)&&isMonthValid(month)&&isDayValid(day,month,year);
    }

}  

