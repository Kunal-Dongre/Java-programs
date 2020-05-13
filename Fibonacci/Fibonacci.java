class Fibonacci
{
    public static void main(String args[]) {
        
        int a,b,c;
        a=0;
        b=1;
        System.out.println("The fibonacci series is:");
        System.out.println(a+" "+b);
        for(int i=0;i<=30;i++)
        {
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
            
        }
    }
}