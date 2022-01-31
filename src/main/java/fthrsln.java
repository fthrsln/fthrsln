class javaUygulama {

    long faktoriyel(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * faktoriyel(n - 1);
        }

    }

    public static void main(String[] args) {
        javaUygulama hesap = new javaUygulama();
        System.out.println(hesap.faktoriyel(7));

    }
}