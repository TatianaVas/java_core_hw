class HelloWorld {

    public static void main(String[] args){




       int a = 10;
        int b = 20;
        int c = 2;
        int r = (a+b)/c;

        a++;
        System.out.println(a++);
        a--;
        System.out.println(a--);


        int i = (a + b) / c;
        int q = a * b - c + (a + b) / 4;

        double d = div(a, b);
        System.out.println(d);

        String ss = "Hi";
        String s1 = ss + " man" + "!";
        System.out.println(s1);
        System.out.println(2+2+1+ "iukjsadhfaksdhf");
        System.out.println(" lkdjfahls" + 2 + 2 + 1);
        System.out.println("sdfasdf" + (2 + 2 + 1));

            int t = 15;
            if (t == 1) {
                System.out.println("Hello");
            } else {
                System.out.println("else");
            }
        boolean p = 10 < 11;
        p = 100 !=500;
        p = !p;

        System.out.println(p);


        printHelloWorld();
       byte byteVariable;
       byteVariable = 20;
     System.out.println(byteVariable);
        char charVar = 78;
        System.out.println(charVar);
        char charVar1 = 'Q';
        System.out.println(charVar1);

        boolean boolVar = true;

        float f = 10.0f / 3;
        double h = 10.0 / 3;
        System.out.println("Double: " + h);
        System.out.println("Float: " + f);
        String s = "Hello!";
        System.out.println(s);
        HelloWorld hw = new HelloWorld();


      //  double d = div(a:10, b:5);
        System.out.println(d);

    }

        public static double div(float a, float b) {
            double result = a / b;


            return result;
        }

    public static void printHelloWorld() {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }
}
