/*

    Create a class Student having variables:
	- name
	- RollNo
	- age
	
	- Create 3 objects of  class "Student".
	- assign  values for class members. 
    - Create 2 objects using Parameterized constructor
    - create 1 object using Default constructor. 
 
    - Display if the student is applicable for Leadership  


*/
class Student
{
    String name,rollno;
    int age;
    // default constructor;
    Student() {}

    // parameterised ocnstructor:
    Student(String n, String r, int a)
    {
        this.name=n;
        this.rollno=r;
        this.age=a;


        System.out.println("name=" +n);
        System.out.println("Age=" +a);
        System.out.println("Rollno=" +r);
    }

    public static void main(String[] args) {
        {
            Student s = new Student();

            //for Strings " " and for int 20
            Student s1 = new Student("Harshwardhan","21" , 20);

            Student s2 = new Student("Labhesh","34" , 21);

            if(s1.age >s2.age)
            {
                System.out.println("Harshwardhan has been selected as an Leader." +(s1.age));
            }
            else
            {
                System.out.println("Labhesh has been selected as an Good Leader" +(s2.age));

            }

        }
    }
    
}