public class swap {

    public static int min(int a, int b, int c, int d) {


        int m = min(a,b);
          if (m < c)
              m = m;
          else
              m = c;

          if (m < d)
              m = m;
          else
              m = d;
          return m;

        //напишите тут ваш код
    }

    public static int min(int a, int b) {

        int y;
        if (a < b)
            y = a;
        else
            y = b;

        return y;
        //напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }

}
