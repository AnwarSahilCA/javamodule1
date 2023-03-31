package structural.adaptor.wrap;

import structural.adaptor.PhoneIfaces.LightningPhone;
import structural.adaptor.PhoneIfaces.MicroUsbphone;

public class LightningToMicroUsbAdaptor implements MicroUsbphone {
	private final LightningPhone lightningPhone;
	

	public LightningToMicroUsbAdaptor(LightningPhone lightningPhone) {
		super();
		this.lightningPhone = lightningPhone;
	}

	@Override
	public void recharge() {
		lightningPhone.recharge();
		// TODO Auto-generated method stub

	}

	@Override
	public void useMicroUsb() {
		System.out.println("MicroUsb connected");
        lightningPhone.useLightning();
		// TODO Auto-generated method stub

	}

}
