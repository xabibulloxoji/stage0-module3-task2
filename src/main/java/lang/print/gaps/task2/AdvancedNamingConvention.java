package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    public static final int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;

    void callToFriend() {
        //some code
    }

    void callByNumber(int Number) {
        //some code
    }

    public AdvancedNamingConvention(int age, int phoneNumber) {
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AdvancedNamingConvention{" +
                "age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
