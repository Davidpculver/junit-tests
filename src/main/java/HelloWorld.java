public class HelloWorld {
    public static String hello(){
//        System.out.println("No argument here.");
        return "Hello World!";
    }


    public static String hello(String name){
//        System.out.println("argument here.");
        if (name == null){
            throw new IllegalArgumentException("People cannot have a name of..");
        }
        return "Hello " + name + "!";
    }


}
