package structural.adaptor.main;

import structural.adaptor.PhoneIfaces.LightningPhone;
import structural.adaptor.PhoneIfaces.MicroUsbphone;
import structural.adaptor.phoneimpl.Android;
import structural.adaptor.phoneimpl.Iphone;
import structural.adaptor.wrap.LightningToMicroUsbAdaptor;

public class AdaptormainDemo {
	public static void rechargeMicroUsbPhone(MicroUsbphone phone) {
		phone.useMicroUsb();
		phone.recharge();
	}

	public static void rechargeLightningPhone(LightningPhone phone) {
		phone.useLightning();
		phone.recharge();
	}

	public static void main(String[] args) {

				Android android = new Android();
				Iphone iPhone = new Iphone();
				
				boolean result = android instanceof MicroUsbphone;
				System.out.println(result);
				

				System.out.println("Recharging android with MicroUsb");
				rechargeMicroUsbPhone(android);

				System.out.println("Recharging iPhone with Lightning");
				rechargeLightningPhone(iPhone);

						
				System.out.println("Recharging iPhone with MicroUsb");
			    rechargeMicroUsbPhone(new LightningToMicroUsbAdaptor(iPhone));// call goes to  line#11
			}
		}


	