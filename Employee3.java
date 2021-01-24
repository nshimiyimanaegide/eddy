class Employee {
int id;
double salary;
String name;
Address add;
Employee(int id,double salary,String name,Address add){
this.id=id;
this.salary=salary;
this.name=name;
this.add=add; }
void display() {
System.out.println("NAME:"+name);
System.out.println("ID:"+id);
System.out.println("SALARY:"+salary);
System.out.println("STATE:"+add.state);
System.out.println("CITY:"+add.city);
System.out.println("COLLEGE: "+add.college);
}
public static void main(String[] args) {
Address a=new Address("Rulindo","Rwanda","IPRC Tumba");
Employee e=new Employee(100,1000,"KABERA",a);
e.display();
}}