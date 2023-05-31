public class Date {
    private int day;
    private int month;
    private  int year;

    public Date(int year, int month, int day) {
        if (year > 3999 || year < -3999) this.year = 0;
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
        String str;
        if (day < 10) {
            str = "0" + day;
            if (month < 10) {
                str += "/0" + month;
                if (year < 0) {
                    if (year > -10) return str += "/-000" + Math.abs(year);
                    else if (year > -100) return str += "/-00" + Math.abs(year);
                    else if (year > -1000) return str += "/-0" + Math.abs(year);
                    else return str += "/-" + Math.abs(year);
                } else if (year < 10) return str += "/000" + year;
                else if (year < 100) return str += "/00" + year;
                else if (year < 1000) return str += "/0" + year;
                else return str += "/" + year;
            } else return str += "/" + month + "/" + year;
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
