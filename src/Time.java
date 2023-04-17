/**
 *
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

public class Time {

    private int day;
    private int hour;
    private int minute;
    private int second;


    public Time() {

        this.hour = 0;
        this.minute = 0;
        this.second = 0;

    }

    public Time(int day, int hour, int minute, int second) {

        this.day = 0;
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void addTime(int second) {

        this.second += second;

        while (this.second >= 60) {

            this.minute += 1;
            this.second -= 60;

        }

        while (this.minute >= 60) {

            this.hour += 1;
            this.minute -= 60;

        }

        while (this.hour > 24) {

            this.day += 1;
            this.hour -= 24;

        }

    }

    public void addTime(int minute, int second) {

        this.second += second;
        this.minute += minute;

        while (this.second >= 60) {

            this.minute += 1;
            this.second -= 60;

        }

        while (this.minute >= 60) {

            this.hour += 1;
            this.minute -= 60;

        }

        while (this.hour > 24) {

            this.day += 1;
            this.hour -= 24;

        }

    }

    public void addTime(int hour, int minute, int second) {

        this.second += second;
        this.minute += minute;
        this.hour += hour;

        while (this.second >= 60) {

            this.minute += 1;
            this.second -= 60;

        }

        while (this.minute >= 60) {

            this.hour += 1;
            this.minute -= 60;

        }

        while (this.hour > 24) {

            this.day += 1;
            this.hour -= 24;

        }

    }

    public void addTime(int day, int hour, int minute, int second) {

        this.second += second;
        this.minute += minute;
        this.hour += hour;
        this.day += day;

        while (this.second >= 60) {

            this.minute += 1;
            this.second -= 60;

        }

        while (this.minute >= 60) {

            this.hour += 1;
            this.minute -= 60;

        }

        while (this.hour > 24) {

            this.day += 1;
            this.hour -= 24;

        }

    }

    public String toString() {
        return "Day: " + this.day + "\t Time: " + this.hour + ":" + this.minute + ":" + this.second;
    }

}
