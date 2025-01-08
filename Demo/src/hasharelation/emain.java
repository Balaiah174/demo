package hasharelation;

public class emain {
public static void main(String[] args) {
	Employee e = new Employee("balaiah");
	Department d= new Department("civil",e);
	System.out.println(d.getDname());
	System.out.println(d.getEmpName());
}
}
