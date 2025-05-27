class ops{
    public static void main(String args[]) {
        operations();
        System.out.println("arithmetic operations completed");
        operations2();
        System.out.println("logical operations completed");

        int a=10, b=5, c=20;

        if (a>b){
            System.out.println(a);
        } else if (b>c) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
        System.out.println("if-else completed");

        int result=(a>b)? a:(b>c)? b:c;
        System.out.println(result); // nested ternary operator
        System.out.println("ternary operator completed");


    }

    public static void operations(){
        int a=10,b=5;
        int sum=a+b;
        int diff=a-b;
        int prod=a*b;   
        int quot=a/b;
        int rem=a%b;
        System.out.println(sum +" "+diff+" "+prod+" "+quot+" "+rem); 
    }

    public static void operations2(){
        int a =10,b=5,c=5;
        System.out.println(a+" "+b+" "+c);

        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isEqual2 = (b == c);

        boolean not=!isEqual;

        System.out.println(isEqual + " " + isNotEqual + " " + isEqual2 + " " + not);

    }
}