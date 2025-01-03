package in.Demo;  

public class mian {
public static void main(String[] args) {
	Plane p =new Plane();
	PassengerPlane pp= new PassengerPlane();
	CargoPlane cp=new CargoPlane();
	Airport a=new Airport();
	a.allowplane (p);
	a.allowplane(pp);
	a.allowplane(cp);
	
}
}
