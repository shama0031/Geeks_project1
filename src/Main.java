public class Main {

    public static void main(String[] args) {
        class1 x = new class1("Beka",195);

        class2 y = new class2(19,x,"Beka");
        class3 s = new class3("Tima", 13, x,Enum.Grand);
        class4 z = new class4("Shama", 50, x, Enum.Father);

        System.out.println("Object A (Father):");
        System.out.println("Name: " + y.getName());
        System.out.println("Age: " + y.getHigh().toString());
        System.out.println("Complex Type Field: " + y.getHigh().getName() + " |" + y.getHigh().getName());
        System.out.println("Role: " + y.getHigh().toString());
        y.someMethod();
        s.someMethod();
        s.someMethod("d");
        z.someMethod();

    }

}
