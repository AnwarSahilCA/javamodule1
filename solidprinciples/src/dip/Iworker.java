package dip;

public interface Iworker {
 public void work();
}
class Worker1 implements Iworker{
	public void work() {
		//working
	}
}
class SuperWorker implements Iworker{
	public void work() {
		//...working much more
	}
}
class Manager1{
	Iworker worker;
	public void setWorker(Iworker w) {
	worker =w;
	}
	public void manager() {
		worker.work();
	}
	}

