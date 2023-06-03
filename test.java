public class test {
    public static void A(FI fi, String s) {
        fi.printlnMessage(s);
    }

    public static void main(String[] args) {
        A(x -> System.out.println(x), "abcd");
    }
}
