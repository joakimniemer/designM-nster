public class Main {
    public static void main(String[] args) {

        // Lazy initialization
        RootUser lazy = RootUser.getInstance();
        System.out.println(lazy.toString());

        // Public static finial Instance field
        System.out.println(RootUser2.INSTANCE.toString());

        // enum
        System.out.println(RootUser3.INSTANCE.toString());

    }
}
