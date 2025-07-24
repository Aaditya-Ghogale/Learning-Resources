public class throwskeyworduse {
    public static void a() {
        try{
            b();
        }
        catch(Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void b() throws Exception {
        c();
    }

    public static void c() throws Exception {
        throw new Exception("Exception thrown from method c");
    }
    
    public static void main(String[] args) {
        a();
        System.out.println("Program continues after exception handling.");
    }
}

