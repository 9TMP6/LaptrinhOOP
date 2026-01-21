package buoi4;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0;
    }

    public void setYear(int year) {
        if (year >= 0)
            this.year = year;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31)
            return;
        switch (this.month) {
            case 2:
                if (isLeapYear(this.year) && day <= 29)
                    this.day = day;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day <= 30)
                    this.day = day;
                break;
            default:
                this.day = 31;
        }

    }

    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }
}
