package structural.adaptor.phoneimpl;

import structural.adaptor.PhoneIfaces.LightningPhone;

public class Iphone implements LightningPhone {
 boolean connector;
	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Charging started");
			System.out.println("Charging completed");
		}
		else
			System.out.println("Connect Lightning first");

	}

	@Override
	public void useLightning() {
		connector=true;
		System.out.println("Lightning connected");
		// TODO Auto-generated method stub

	}

}
