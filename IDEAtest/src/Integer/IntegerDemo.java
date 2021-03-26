package Integer;

public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //过期
        Integer i1  =new Integer(100);
        Integer i2 = new Integer("100");

        Integer i11 = Integer.valueOf(100);
        Integer i22 = Integer.valueOf("100"); //字符串只能是数字
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i11);
        System.out.println(i22);


        //Int 转成 String
        int a = 100;
        String b = String.valueOf(a);
        System.out.println(b);

        //String 转成 int
        String c ="100";
        Integer d = Integer.valueOf(c);
        int e = d;

        //直接把string 转成int
        int y = Integer.parseInt(c);
        System.out.println(e);
    }
}
