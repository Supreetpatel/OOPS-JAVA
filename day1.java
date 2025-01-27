public class day1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // store 5 roll nos
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        // data of 5 students: (roll no , name , marks)
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //creating a class
        Student[] students = new Student[5];

        //just declaring
        //Student supreet;
        //supreet = new Student();

        //class is a named group of properties and functions. It is a template of object  and an object is an instances of class.

        Student supreet = new Student(13,"Supreet Patel", 85.9f );
        Student rahul = new Student(24,"Rahul", 98.9f);

        //supreet.rollno = 13;
        //supreet.name = "Supreet";
        //supreet.marks = 88.9f;
        //supreet.changeName("Shubhangi");
        //supreet.greeting();
        
        System.out.println(supreet.rollno);
        System.out.println(supreet.name);
        System.out.println(supreet.marks);

        Student random = new Student(supreet);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something is being cooked";
        System.out.println(two.name);
    }

    // create a class
    // for every single student
    static class Student {
        int rollno;
        String name;
        float marks = 90;

        //we need a way to add the values of the above properties object by object .
        //we need one by one to access every object
        void greeting () {
            System.out.println("Hello! My name is " +this.name);
        }
        void changeName(String newName) {
            name = newName;
        }
        Student (Student other) {
            //"this" keyword is being replaced with "supreet" class.
            this.name = other.name;
            this.rollno = other.rollno;
            this.marks = other.marks;
        }

        // Removed duplicate constructor
        Student () {
           //this is how you call a constructor from another constructor.
           //internally it is something like: new Student() 
           this(13,"default person",100.00f) ;
        }

        //Student arpit = new Student(17,"Arpit",89.7);
        //Here , this wiil be replaced with Arpit
        Student (int rollno, String name, float marks) {
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }
    }
}
