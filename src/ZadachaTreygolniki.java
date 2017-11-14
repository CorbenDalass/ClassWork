import java.util.Random;

public class ZadachaTreygolniki {
    public static void main(String[] args) { ;
        Random random=new Random();
        int x1=random.nextInt(21)-10;
        int x2=random.nextInt(21)-10;
        int x3=random.nextInt(21)-10;
        int y1=random.nextInt(21)-10;
        int y2=random.nextInt(21)-10;
        int y3=random.nextInt(21)-10;
        float square=Math.abs ((((x1-x3)*(y2-y3))-((y1-y3)*(x2-x3))))*0.5f;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(square);
    }
}
