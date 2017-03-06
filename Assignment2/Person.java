// Class to model a Person
// Used for inheritance only so its abstract
public abstract class Person{
	// Instance Variables
	protected String name;
		
	// Constructor 1
   public Person(){
      this.name=new String();
   }
			
	// Constructor 2
   public Person(String name){
		this.name=name;
	}
			
	// getName() method
	public String getName(){
	   return name;
	}

	// toString() method
	public String toString(){
	   return name;
	}
			
	// equals() method
	public boolean equals(Person personIn){
	   if(name.equals(personIn.name))
			return true;
		else
		   return false;
	}
}
			