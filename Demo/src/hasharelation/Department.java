package hasharelation;

public class Department {
String dname;
Employee emp;
Department(String dname,Employee ref){
	this.dname=dname;
	this.emp=ref;
	
}
public String getDname() {
	return dname;
}
public Employee getEmpName() {
	return emp;
}

} 
