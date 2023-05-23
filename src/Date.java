public class Date {
    private int day;
    private int month;
    private  int year;

    public Date(int year, int month, int day) {
        if (year > 9999 || year < -9999) this.year = 0;
        else this.year = year;
        if (month < 1 || month > 12) this.month = 1;
        else this.month = month;
        if (day < 1 || day > 31) this.day = 1;
        else this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) this.month = 1;
        else this.month = month;
    }

    @Override
    public String toString() {
        if (day < 10) {
            if (month < 10) {
                return "0" + day + "/0" + month + "/" + year;
            } else return "0" + day + "/" + month + "/" + year;
        } else return day + "/" + month + "/" + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Date))
            return false;
        return hashCode() == ((Date)obj).hashCode();
    }

    @Override
    public int hashCode() {
        return year*10000 + month*100 + day;
    }
}
