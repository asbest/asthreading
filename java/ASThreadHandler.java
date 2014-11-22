
public class ASThreadHandler {

	/**

		launchASThreads launches numThreads Threads with the same code from implemented ASThread. Objects can be passed over
	
	 */
	
	

	static Thread[] launchASThreads(int numThreads, Object[] objects) {
		
		Thread[] threads = new Thread[numThreads];
		
		for (int threadID=0; threadID < numThreads; threadID++) {
			threads[threadID] = new ASThread(numThreads, objects);

			threads[threadID].start();
			try {
				threads[threadID].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return threads;

}
