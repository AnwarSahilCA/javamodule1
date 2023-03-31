package structural.adaptor.phoneimpl;

import structural.adaptor.PhoneIfaces.MicroUsbphone;

public class Android implements MicroUsbphone {
	private boolean connector;

	@Override
	public void recharge() {
		if(connector)
		{
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		}
		else
			System.out.println("connect microusb first");
	
		// TODO Auto-generated method stub

	}

	@Override
	public void useMicroUsb() {
		connector=true;
		System.out.println("microUSb connected");
		// TODO Auto-generated method stub

	}

}
