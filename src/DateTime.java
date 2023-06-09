/**
 * This class represents a date + time
 * Inherits from class Date
 */
public class DateTime extends Date {
    private int hour;
    private int minute;

    /**
     * Constructs a new DateTime object
     *
     * @param year year
     * @param month month
     * @param day day
     * @param hour hour
     * @param minute minute
     */
    public DateTime(int year, int month, int day, int hour, int minute) {
        super(year, month, day);
        if (hour < 0 || hour > 23) this.hour = 0;
        else this.hour = hour;
        if (minute < 0 || hour > 59) this.minute = 0;
        else this.minute = minute;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) this.hour = 0;
        else this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) this.minute = 0;
        else this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public void setMonth(int month) {
        super.setMonth(month);
    }

    @Override
    public String toString() {
        if (hour < 10) {
            if (minute < 10) {
                return super.toString() + " 0" + hour + ":0" + minute;
            } else return super.toString() + " 0" + hour + ":" + minute;
        } else return super.toString() + " " + hour + ":0" + minute;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof DateTime))
            return false;
        DateTime dt = (DateTime)obj;
        return super.equals(obj) && hour == dt.hour && minute == dt.minute
                && toString().length() == dt.toString().length() && hashCode() == dt.hashCode();
    }

    @Override
    public int hashCode() {
        return super.hashCode()*10000 + hour*100 + minute;
    }
}
