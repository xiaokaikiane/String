import org.junit.Test;

public class Conversion {//转换

    @Test
    public void test() {//基本数据类型(包装类型)与String之间的转换
        //String-->基本数据类型 调用包装类的静态方法:parseXxx(str)
        //基本数据类型-->String  调用String重载的valueOf(xxx);
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
        String s1 = String.valueOf(num);
        System.out.println(s1+" "+s1.getClass());
    }

    @Test
    public void test1() {//十进制转为其他进制
        int num = 11;
        System.out.println(Integer.toBinaryString(num));//转二进制
        System.out.println(Integer.toOctalString(num));//转8进制
        System.out.println(Integer.toHexString(num));//转16进制
    }

    @Test
    public void test2(){//其他进制转为10进制
        String s1="1011";
        String s2="13";
        String s3="b";
        System.out.println(Integer.parseInt(s1,2));//返回的是int型
        System.out.println(Integer.parseInt(s2,8));
        System.out.println(Integer.parseInt(s3,16));

        System.out.println(Integer.valueOf(s1,2));//返回的是Integer型
        System.out.println(Integer.valueOf(s2,8));
        System.out.println(Integer.valueOf(s3,16));
    }

}
