package InterThread1;

public class TestProducerConsumer { 

	public static void main(String[] args) {
		
	

		DataBuffer sharedObject = new DataBuffer();
		ProducerInteger producer = new ProducerInteger(sharedObject);
		ConsumerInteger consumer = new ConsumerInteger(sharedObject);
		
		producer.start();
		consumer.start();
		
	}

}
