
public abstract class Test{

    public String nonAbstractMethodOne(String param1,String param2){
        String param = param1 + param2;
        return param;
    }

    public static void nonAbstractMethodTwo(String param){
        System.out.println("Value of param is "+param);
    }
}