
class ASThread extends Thread
{
	
	// get number of launched threads (at runtime)
	long numThreads;
	long threadId;
	
	Object[] objects = null;
	
	ASThread(long numThreads, Object[] objects){
		this.numThreads = numThreads;
		this.objects = objects;
	}
	

	private void getThreadID() {
	
		// get thread ID (modulo gives zero-based results)
		this.threadId = Thread.currentThread().getId() % numThreads;
	}	
	

  @Override public void run()
  {
	  
	  getThreadID(); // get thread ID
	  // *******************
	  
	  
	  
	  
  }



}