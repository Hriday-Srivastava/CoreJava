/*	class A{  		}, class B{	A a=new A(); },  class C{	A a1=new A();	}, class D{ A a2=new A()}
 * 
 * Class B,C,and D are creating the object of A. Class B,C and D are using different reference of creating the object of A.
 * If all class i.e B,C and D want to use same reference or same object itself i.e class A has to stop the creation of the object
 * of A itself.
 * By other classes to stop the creation of object of class A , Class A has to use private constructor. like
 * 
 * 									class A{		private A(){}		}
 * 
 * If other class wants to use the object of A then in this condition there is no possibilities to create the object of A by other 
 * classes. That's why class A has to provide one method to share its object to others. For this, we have to take private reference 
 * variable a of class type A.
 * 
 * 
 * 									class A{ 
 * 													private static A a;
 * 													private A(){}
 * 													
 * 													public A gtInstance()
 * 													{
 * 														 a=new A(); return a;
 * 													}
 * 						
 * 											}
 * 
 * But in this snippet of the code, to access the gtInstance() method of class A, other classes have to require the object of A. 
 * But other classes can't create the object of A due to private constructor of A. That's why to access the gtInstance() method of 
 * class A, gtInstance() method must and should be static. like
 * 
 * 										class A
 * 										{
 * 											private static A a;
 * 											private A(){}
 * 
 * 											public static A gtInstance(){  a=new A(); return a;}
 * 										}
 * 
 * In this case of code every class that wants the object of class A can create object easily and every class has to create a 
 * new object of class A. Here, class A can't stop to create the object of itself. Other classes can create arbitory object of A. 
 * class A has no record to count how many of object is created by others. But in Singleton only one object creation is allowed 
 * in any condition. That's why class A has to keep record of object creation by checking condition. like
 * 
 * class A
 * {
 * 		private static A a;
 * 		private A(){	}
 * 
 * 		public static A gtInstance()
 * 		{
 * 				if(a==null)
 * 			    a=new A();
 * 				return a;
 * 		
 * 		}
 * }
 * 
 * NOTE : If a class has such type of method that crates the object of itself is called factory method.
 * 
 * But just appropriate snnipet of code will not work as Singleton in Multithreaded environment. Many thread can create multiple 
 * object simultaneously. That's why to prevent for accessing multi thread simultaneously we have to use synchronized keyword with
 * factory method i.e in other way we can say we use synchronized factory method.
 * 
 * class A 
 * {
 * 		private A a;
 * 		private a(){}
 * 
 * 		public static synchronized A gtInstance()
 * 		{
 * 			if(a==null)
 * 			a=new A();
 * 			return a;	
 * 		}
 * }
 * 
 * Synchronized with static keyword locks the class level lock. That's why multithreads can't access simultaneously . Synchronized
 * key word lock the entire Synchronized method of class level i.e static synchronized methods. If factory method is so lengthy in 
 * that case entire method will be lock. But object creation is so sort in that case entire method block rise performance issue.
 * that's why we go for Synchronized block not for Synchronized method.
 * 
 * class A
 * {
 * 		private static A a;
 * 		private A(){}
 * 		
 * 		public static A gtInstance()
 * 		{	
 * 						if(a==null)
 * 						{			
 * 								synchronized(A.class)
 * 								{		
 * 									 a=new A();
 * 									 return a;
 * 								}
 * 						}
 * }
 * 
 * But in this snippet of code also there may be chance of creating of multiple objects by multiple therads. Just assume that if one
 * thread enter into if condition block and just go to sleep mode but object creation is not done still and meanwhile another thread
 * checks the if condition and get a==null and second therad also enter into if condition block in this case multiple threads may
 * enter into if block and can create multiple objects. To prevent this situation we should go for Double-Check mechanism. like
 * 
 * class A
 * {
 * 		private static A a;
 * 		private A(){}
 * 	
 * 		public static A gtInstance()
 * 		{
 * 			if(a==null)
 * 			synchronize(A.class)
 * 			{
 * 				if(a==null)
 * 				{
 * 					a=new A();
 * 				}
 * 			}
 * 			return a;
 * 		}
 * }
 * 
 * In this snippet of code, multiple threads may enter in first if block but only one thread enter into synchronized block and lock
 * this block at class level. Unless first thread execute the whole block another thread doesn't enter into this synchronized block.
 * In this situation first thread create the object of A and after creating the object of A release the lock another thread get 
 * chance to enter into synchronized block with keeping class level lock and check another if condition a==null then condition is
 * false because object is already created by previous thread. Then second thread only return the object variable.
 * 
 * Appropriate story about creating singleton is called Lazy_Instantiation_Singleton mechanism. Because we create object only on
 * demand i.e when we need then create the object. In lazy instantiation we preserve the memory consumption.
 * 
 * In future class is our class is extended by another class to add the additional functionality like if we have to add version
 * of all classes and super class is implemented by cloneable interface in that case our singleton class can give another object
 * of same created object i.e copy of object we can get. That'why we have to prevent for getting another copy of object we have to 
 * optimized the code.
 * 
 *  If want to add some additional functionality to the all classes. Then we will have go to to each and every classes and add 
 *  additional method. That job is tedious job. Assume that we have to add version of class development in all the classes then 
 *  we don't need to go for all classes to write the method for version rather than it is simple way to create one another class or 
 *  abstract class and all classes extends with newly created classes. In this case, if newly created class is cloneable implemented
 *  class then and clone method is not overridden in that case using clone() method we can create object of Singleton class created
 *  object also. That's why we have to stop clonening of object we override the clone() method in our Singleton class. like
 *  
 *  class A
 *  {
 *  	private static A a=null;
 *  	private A(){	}
 *  
 *  	public static A gtInstance()
 *  	{
 *  		if(a==null)
 *  		{
 *  			synchronized(A.class)
 *  			{
 *  					if(a==null)
 *  					{
 *  						a=new A();
 *  					}
 *  			}
 *  		}
 *  	}
 *  
 *  	public Object clone() throws CloneNotSupportedException
 *  	{
 *  		return new CloneNotSupportedException("Copy of the object can't be created");
 *  	}
 *  	
 *  }
 *  
 *  But in this appropriate approach we can break the Singleton rule using reflection api mechanism. Generally Reflection api is 
 *  used by server, jvm. It is not control by user or programmer. But anyway our Singleton should not break even jvm or server.
 *  For this we have to create singleton object in annonymous inner class. Actually annonymous inner class is child class of within
 *  it's created. Reflection doen't get the name of annonymous inner class that's why there is no question for finding constructor 
 *  and finally there is no possibility to create object through reflection api also.
 *  
 *  class A
 *  {
 *  	private static A a=null;
 *  	private A(){	}
 *  
 *  	public static A gtInstance()
 *  	{
 *  		if(a==null)
 *  		{
 *  			synchronized(A.class)
 *  			{
 *  					if(a==null)
 *  					{
 *  						a=new A()
 *  						{
 *  								//annonymous inner class.
 *  						};
 *  					}
 *  			}
 *  		}
 *  	}
 *  
 *  	public Object clone() throws CloneNotSupportedException
 *  	{
 *  		return new CloneNotSupportedException("Copy of the object can't be created");
 *  	}
 *  	
 *  }
 *  
 *  If our singleton class gets Serialization behaviour in that case during de-serialization singleton rule is broken i.e a new object
 *  will be created. To stop it we have to use readResolve() method in Singleton class so that during dserialization our singleton
 *  rule can't be break. Actually readResolve() method is called by inputStram just before sending deserialized object to the caller.
 *  If readResolve() resolve method is not there in class in that inputstream directly send the deserialized object to the caller.
 *  If readReslove() method is there in the class in that case inputstream excutes simply readResove() method not send dererialized
 *  object directly to the caller.
 *  
 *  ANY-ACCESS-MODIFIER Object readResolve() throws ObjectStreamException;
		 *  
		 *  The readResolve method is called when ObjectInputStream has read an object from the stream and is preparing 
		 *  to return it to the caller. ObjectInputStream checks whether the class of the object defines the readResolve method. 
		 *  If the method is defined, the readResolve method is called to allow the object in the stream to designate the object 
		 *  to be returned. The object returned should be of a type that is compatible with all uses. If it is not compatible, 
		 *  a ClassCastException will be thrown when the type mismatch is discovered.
		 *  
      
      class A
 *  {
 *  	private static A a=null;
 *  	private A(){	}
 *  
 *  	public static A gtInstance()
 *  	{
 *  		if(a==null)
 *  		{
 *  			synchronized(A.class)
 *  			{
 *  					if(a==null)
 *  					{
 *  						a=new A()
 *  						{
 *  								//annonymous inner class.
 *  						};
 *  					}
 *  			}
 *  		}
 *  	}
 *  
 *  	public Object clone() throws CloneNotSupportedException
 *  	{
 *  		return new CloneNotSupportedException("Copy of the object can't be created");
 *  	}
 *  
 *  	public Object readResolve()
 *  	{
 *  		if(a==null)
 *  		a=A.gtInstance();
 *  		
 *  		return a;
 *  	}
 *  	
 *  }
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 * 
 * 
 * 
 * 
*/
package my.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton  implements Cloneable,Serializable
{		
		
		private static Singleton inst;
		private String s1,s2;

		private Singleton(String s1, String s2) 
		{
			synchronized(Singleton.class)  {
				
			
			if(inst!=null)
				throw new IllegalArgumentException("Duplicate object is not allowed");
			this.s1 = s1;
			this.s2 = s2;
			}
		}
		
		public static Singleton gtInstance(String s1,String s2)
		{
			
			System.out.println("method call");
			if(inst==null)
			{
				synchronized (Singleton.class) 
				{
						if(inst==null)
						//instance=new Singleton(s1, s2);
							inst=new Singleton("Hriday", "Kumar")
							{
							
							};
				}
			}
			return inst ;
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException 
		{
				throw new CloneNotSupportedException("Clone of object is not supported");
		}
		
		public Singleton readResolve()
		{
			if(inst==null)
				inst=Singleton.gtInstance("Virendra", "Kumar");
			
			return inst;
		}
		
		
		

		
		
		
		
		
		
}


public class SingletonTest 
{

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		Singleton single=Singleton.gtInstance("Hriday", "Kumar");
		System.out.println(single);
		
		//Prevent creation of object through Clonning processing
		Singleton single2=Singleton.gtInstance("Mahesh", "Kumar");
		System.out.println(single2);
		
		Singleton single3=null;
		
		/*
		 * try{single3=(Singleton)single2.clone();} catch(CloneNotSupportedException
		 * e){e.printStackTrace();}
		 */
		System.out.println(single3);
		
		//Prevent creation using Reflection API
		Singleton single4=null;
		Class c=Singleton.class;
		
		Constructor[]	 cons=c.getDeclaredConstructors();
		System.out.println(cons.length);int i=1;
		for(Constructor con:cons)
		{ if(i==2)
		{
			con.setAccessible(true);
		 single4=(Singleton) con.newInstance("Hriday","Kumar");
		}
		i++;
		}
		System.out.println(single4);
		
	}

}
