package creationalPatterns;

import java.util.Optional;

public class connection1 {
	static connection1 connect;
	private connection1() {}
	static connection1 getconnection1() {
		Optional<connection1>opt1=Optional.ofNullable(connect);
		if(opt1.isPresent()) {
			return connect;
		}
		else 
			connect=new connection1();
			return connect;
	}
}
