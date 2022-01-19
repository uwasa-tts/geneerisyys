package example2;

class DemoClass<T> {
		// Tyyppiparametrille annettu t�ss� nimeksi T ("Type")
	   private T t;
	   
	   public void set(T t)
	   {
		   this.t = t;
	   }
	    
	   public T get()
	   {
		   return t;
	   }

	   @Override
	   public String toString() {
		   return "DemoClass [t=" + t + "]";
	   }
	}