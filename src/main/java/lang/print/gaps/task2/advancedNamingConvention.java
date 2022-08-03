package lang.print.gaps.task2;

public class advancedNamingConvention {
    private static final int adultAge = 18;

    private int age;
    private int phoneNumber;

    void callToFriend() {
        //some code
        System.out.println("Friend");
    }

    void callByNumber(int Number) {
        //some code
        System.out.println("Phone number");
    }

    public advancedNamingConvention(int age, int phoneNumber) {
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
        return "advancedNamingConvention{" +
                "age=" + age +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
