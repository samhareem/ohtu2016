package ohtu;

public class Submission {
    private String student_number;
    private int week;
    private int hours;
    private boolean a1 = false;
    private boolean a2 = false;
    private boolean a3 = false;
    private boolean a4 = false;
    private boolean a5 = false;
    private boolean a6 = false;
    private boolean a7 = false;
    private boolean a8 = false;
    private boolean a9 = false;
    private boolean a10 = false;
    private boolean a11 = false;

    public String getStudent_number() {
        return student_number;
    }

    public int getWeek() { return week; }

    public int getHours() { return hours; }

    public boolean getA1() { return a1; }
    public boolean getA2() { return a2; }
    public boolean getA3() { return a3; }
    public boolean getA4() { return a4; }
    public boolean getA5() { return a5; }
    public boolean getA6() { return a6; }
    public boolean getA7() { return a7; }
    public boolean getA8() { return a8; }
    public boolean getA9() { return a9; }
    public boolean getA10() { return a10; }
    public boolean getA11() { return a11; }

    public void setA1(boolean newValue) { a1 = newValue; }
    public void setA2(boolean newValue) { a2 = newValue; }
    public void setA3(boolean newValue) { a3 = newValue; }
    public void setA4(boolean newValue) { a4 = newValue; }
    public void setA5(boolean newValue) { a5 = newValue; }
    public void setA6(boolean newValue) { a6 = newValue; }
    public void setA7(boolean newValue) { a7 = newValue; }
    public void setA8(boolean newValue) { a8 = newValue; }
    public void setA9(boolean newValue) { a9 = newValue; }
    public void setA10(boolean newValue) { a10 = newValue; }
    public void setA11(boolean newValue) { a11 = newValue; }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        return "Viikko " + week + ": tehtyjä tehtäviä yhteensä: " + totalTasks() + ", aikaa kului " + hours + " tuntia, tehdyt tehtävät: " + doneTasksString();
    }

    private int totalTasks() {
        int total = 0;
        if (a1) { total++; }
        if (a2) { total++; }
        if (a3) { total++; }
        if (a4) { total++; }
        if (a5) { total++; }
        if (a6) { total++; }
        if (a7) { total++; }
        if (a8) { total++; }
        if (a9) { total++; }
        if (a10) { total++; }
        if (a11) { total++; }
        return total;
    }

    private String doneTasksString() {
        StringBuilder ret = new StringBuilder();
        if (a1) { ret.append("1 "); }
        if (a2) { ret.append("2 "); }
        if (a3) { ret.append("3 "); }
        if (a4) { ret.append("4 "); }
        if (a5) { ret.append("5 "); }
        if (a6) { ret.append("6 "); }
        if (a7) { ret.append("7 "); }
        if (a8) { ret.append("8 "); }
        if (a9) { ret.append("9 "); }
        if (a10) { ret.append("10 "); }
        if (a11) { ret.append("11 "); }
        return ret.toString();
    }
    
}