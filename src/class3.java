public class class3 extends class2{

    private Enum en;

    public class3(String name, int age, class1 high, Enum en) {
        super(age, high, name);
        this.en = this.en;
    }

    public Enum getEn() {
        return en;
    }

    public void someMethod(){
        System.out.println("Тут должен работать оверлоад");
    }
    public void someMethod(String s){
        System.out.println(s);
    }
}


class class4 extends class3{
    private String hobby;

    public class4(String name, int age, class1 high, Enum en) {
        super(name,age, high, en);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void someMethod(){
        System.out.println("Тут должен работать оверлоад!!!");
    }

}
