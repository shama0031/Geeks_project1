public class class2 {
    private int age;
    private String name;
    private class1 high;

    public class2(int age, class1 high,String name) {
        this.age = age;
        this.high = high;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public class1 getHigh() {
        return high;
    }


    public void someMethod() {
    }
}
