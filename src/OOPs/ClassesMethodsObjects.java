package OOPs;

public class ClassesMethodsObjects {
    //Data can be initialized in 3 ways: a)Using Objects b)Using Methods c)Using constructor

    //Create all global variables which are non static
    int empid;
    String empname;
    Character empinit;

    //this method print all the values
    void display() {
        System.out.print(empid+" ");
        System.out.print(empname+" ");
        System.out.print(empinit+" ");
    }
    //for Using constructor
    ClassesMethodsObjects(int x, String Name, Character ch)
    {
        empid=x;
        empname=Name;
        empinit=ch;
    }

    //If using parameters name same as variable name use this keyword for ex: this.empid=empid;
    //for using method
  /*  void empdetails(int x, String Name, Character ch)
    {
        empid=x;
        empname=Name;
        empinit=ch;
    }*/

    public static void main(String[] args)
    {
        //Using Objects
        /*ClassesMethodsObjects cmo1 = new ClassesMethodsObjects();
        cmo1.empid = 1;
        cmo1.empinit = 'P';
        cmo1.empname = "Jeevan";
        cmo1.display();

        ClassesMethodsObjects cmo2=new ClassesMethodsObjects();
        cmo2.empid = 2;
        cmo2.empinit = 'L';
        cmo2.empname = "Ramesh";
        cmo2.display();*/

        //Using methods
        /*ClassesMethodsObjects cmo1=new ClassesMethodsObjects();
        cmo1.empdetails(1,"Jeevan",'P');
        cmo1.display();

        ClassesMethodsObjects cmo2=new ClassesMethodsObjects();
        cmo2.empdetails(2,"Ramesh",'S');
        cmo2.display();*/

        //Using Constructor
        ClassesMethodsObjects cmo1=new ClassesMethodsObjects(1,"Jeevan",'P');
        cmo1.display();

        ClassesMethodsObjects cmo2=new ClassesMethodsObjects(2,"Ramesh",'S');
        cmo2.display();
    }
}



