package Interface;

public class flipcart {
payment opt;
flipcart(payment p){
	opt=p;
}
	public void checkout(double amnt) {
		opt.makepayment(amnt);
	}
	
	
}
