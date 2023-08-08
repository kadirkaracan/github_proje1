
public class main1 {

	public static void main(String[] args) {
		Worker worker1=new Worker();
		worker1.eat();
		worker1.pay();
		worker1.work();
		OutSourceWorker outSourceWorker=new OutSourceWorker();
		outSourceWorker.work();

	}

}
