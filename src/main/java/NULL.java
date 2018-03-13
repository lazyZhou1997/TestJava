/**
 * 测试
 * 因为null值可以强制转换为任何java类类型，但null强制转换后是无效对象，其返回值还是为null
 * 而static方法的调用是和类名绑定的，不借助对象进行访问所以能正确输出。
 * 反过来，没有static修饰就只能用对象进行访问，使用null调用对象肯定会报空指针错了。
 */
public class NULL {

    //静态方法可以执行
    public static void haha(){
        System.out.println("haha");
    }

    //非静态方法会报空指针错误
    public void hh(){
        System.out.println("hh");
    }

    public static void main(String[] args) {

        //执行静态方法
        ((NULL)null).haha();
        //执行非静态方法
        ((NULL)null).hh();

    }
}
