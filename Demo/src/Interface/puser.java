package Interface;

public class puser {
public static void main(String[] args) {
	creditcard c= new creditcard();
	flipcart f=new flipcart(c);
	f.checkout(1000);
}
}
