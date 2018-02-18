package thread;

public class ProducerConsumer {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue(3);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		producer.start();
		consumer.start();
	}
}
