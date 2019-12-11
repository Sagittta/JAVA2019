public class T1 {

    String name;
    int month;
    int day;
    String birth_optioin;
    String phone;
    int group1;
    int group2;
    int group3;
    int group4;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public String getBirth_optioin() {
        return birth_optioin;
    }
    public void setBirth_optioin(String birth_optioin) {
        this.birth_optioin = birth_optioin;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGroup1() {
        return group1;
    }
    public void setGroup1(int group1) {
        this.group1 = group1;
    }

    public int getGroup2() {
        return group2;
    }
    public void setGroup2(int group2) {
        this.group2 = group2;
    }

    public int getGroup3() {
        return group3;
    }
    public void setGroup3(int group3) {
        this.group3 = group3;
    }

    public int getGroup4() {
        return group4;
    }
    public void setGroup4(int group4) {
        this.group4 = group4;
    }

    @Override
    public String toString() {
        return "T1{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", day=" + day +
                ", birth_optioin='" + birth_optioin + '\'' +
                ", phone='" + phone + '\'' +
                ", group1=" + group1 +
                ", group2=" + group2 +
                ", group3=" + group3 +
                ", group4=" + group4 +
                '}';
    }
}
