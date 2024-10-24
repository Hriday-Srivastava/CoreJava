package my.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Refsingle {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
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
