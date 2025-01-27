public class wrapperclass {
    @SuppressWarnings({ "unused"})
    public static void main(String[] args) {
        //int a = 19;
        //int b = 20;
        //Integer num = 45;

        Integer a =10;
        Integer b =20;
        swap(a,b);
        System.out.println(a + " " + b);

        final A supreet = new A("Supreet Patel");
        supreet.name = "other name";
        
        //when a non primitive is final , you cannot reassign it.
        //supreet = new A("new object");

        A obj;
        for ( int i=0 ; i<100000000 ; i++){
            obj = new A ("Random name");
        }
    }

    //"final" is a keyword which helps in not modifying the value
    //always initialise while declaring it .
    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
    }

    @Override 
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
