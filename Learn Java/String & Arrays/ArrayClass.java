class ArrayClass{
    public static void main(String[] args) {
     Student s = new Student("Aaditya",1);
     System.out.println(s); 
     
     Student sarray[]=new Student[3];
     sarray[0]=new Student("Aaditya, SDE",1);
     sarray[1]=new Student("Aaditya, devops",2);
     sarray[2]=new Student("Aaditya, AI ML",3);
        
    //above is a array for a class named Student
    //What it makes is a array of object references
    //So when we print the object reference it prints the address of the object in memory
    //To print the actual object we need to override the toString method in the Student class
    
    for(Student s2: sarray){
        System.out.println(s2);
    }}}
class Student extends Object {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }     
}

