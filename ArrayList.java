public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
  public boolean addItem (T item) {
	if ( currentItem == arList.length) {
		return false;
	}
	else {
		
	}
	arList[currentItem++]= item;
		return true;
		//The item to be added to the list.
		//return true if the item is successfully added to the list, false otherwise.
	
  }// end addItemas
  public String toString (){
	  StringBuilder s = new StringBuilder();
	  for (int i=0; i<currentItem; i++) {
		  s.append(arList[i].toString());
		  s.append (",");
	  }
	  if (s.length()>0) {
		  
	  }
	  return s.toString();
	  //Returns a string representation of the list. Each item in the list is represented 
	  	  
  }// end toString
	
}//end class
