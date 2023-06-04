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

    public void setDay(int day) {
        if (day < 1 || day > 31) this.day = 1;
        else this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) this.month = 1;
        else this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        if (year > 3999 || year < -3999) this.year = 0;
        else this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        if (day < 10) {
            if (month < 10) {
                if (year < 0) {
                    if (year > -10) return "0" + day + "/0" + month + "/-000" + Math.abs(year);
                    else if (year > -100) return  "0" + day + "/0" + month + "/-00" + Math.abs(year);
                    else if (year > -1000) return "0" + day + "/0" + month + "/-0" + Math.abs(year);
                    else return "0" + day + "/0" + month + "/-" + Math.abs(year);
                } else if (year < 10) return "0" + day + "/0" + month + "/000" + year;
                else if (year < 100) return "0" + day + "/0" + month + "/00" + year;
                else if (year < 1000) return "0" + day + "/0" + month + "/0" + year;
                else return "0" + day + "/0" + month + "/" + year;
            } else return "0" + day + "/" + month + "/" + year;
        } else if (month < 10) {
            if (year < 0) {
                if (year > -10) return day + "/0" + month + "/-000" + Math.abs(year);
                else if (year > -100) return day + "/0" + month + "/-00" + Math.abs(year);
                else if (year > -1000) return day + "/0" + month + "/-0" + Math.abs(year);
                else return day + "/0" + month + "/-" + Math.abs(year);
            } else if (year < 10) return day + "/0" + month + "/000" + year;
            else if (year < 100) return day + "/0" + month + "/00" + year;
            else if (year < 1000) return day + "/0" + month + "/0" + year;
            else return day + "/0" + month + "/" + year;
        } else return day + "/" + month + "/" + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Date))
            return false;
        Date date = (Date)obj;
        return day == date.day && month == date.month && year == date.year
                && toString().length() == date.toString().length() && hashCode() == date.hashCode();
    }

    @Override
    public int hashCode() {
        return year*10000 + month*100 + day;
    }
}
