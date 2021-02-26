import java.util.*;

class Consumer implements Runnable
{
	List<Integer> item_queue = null;

	public Consumer(List<Integer> item_queue)
	{
		super();
		this.item_queue=item_queue;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				consume();
			}
			catch(InterruptedException exception)
			{
				
			}
		}
	}

	public void consume() throws InterruptedException
	{
		synchronized(item_queue)
		{
			while(item_queue.isEmpty())
			{
				System.out.println("Queue is empty..");
				System.out.println("waiting for the producer to produce the amount");
				item_queue.wait();
			}
		}

		synchronized(item_queue)
		{
			Thread.sleep(1000);
			System.out.println("Consumer consumed amount " + item_queue.remove(0));
			item_queue.notify();
		}
	}
}

class Producer implements Runnable
{
	List<Integer> item_queue = null;
	final int MAX_SIZE = 4;
	private int amount = 1;
	
	public Producer(List<Integer> item_queue)
	{
		super();
		this.item_queue = item_queue;
	}

	
	public void run()
	{
		while(true)
		{
			try
			{
				if(amount<100)
				{
					 amount += amount;
					  produce(amount);
				}
				 
				else
					  System.exit(0);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public void produce(int amount) throws InterruptedException
	{
		synchronized(item_queue)
		{
			while(item_queue.size() == MAX_SIZE)
			{
				System.out.println("Queue is full..\n");
				System.out.println("Waiting for consumer to consume.\n");
				item_queue.wait();
			}
		}

		synchronized(item_queue)
		{
			System.out.println("Producer produced amount " + amount);
			item_queue.add(amount);
			Thread.sleep(10);
			item_queue.notify();
		}
	}
}


public class ProducerConsumer 
{ 
	public static void main(String[] args) 
	{ 
		List<Integer> item_queue = new LinkedList<Integer>();

		Thread t1 = new Thread(new Producer(item_queue));
		Thread t2 = new Thread(new Consumer(item_queue));
		
		t1.start();
		t2.start();
	
	} 
} 

