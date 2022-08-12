public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox1 = new MagicBox<>(3);
        magicBox1.add("Шар");
        magicBox1.add("Кубик");
//        magicBox1.pick();
        magicBox1.add("Квадрат");
        System.out.println(magicBox1.pick());
        System.out.println(magicBox1.add("Круг"));

        MagicBox<Integer> magicBox2 = new MagicBox<>(4);
        magicBox2.add(10);
        magicBox2.add(38);
//        magicBox2.pick();
        magicBox2.add(455);
        System.out.println(magicBox2.add(113));
        System.out.println(magicBox2.add(99));
        System.out.println(magicBox2.pick());

    }
}
