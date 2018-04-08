
public class method {
	public static void someMethod2() throws Exception
	{
		throw new Exception("Exception thrown in someMethod2");
	}
	
	public static void someMethod() throws Exception
	{
		try
		{
			someMethod2();
		}
		catch (Exception except)
		{
			throw new Exception("Exception thrown for someMethod", except);
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		try
		{
			someMethod();
		}
		catch(Exception except)
		{
			except.printStackTrace();
		}
	}
}
/*
 * java.lang.Exception: Exception thrown for someMethod
	at method.someMethod(method.java:16)
	at method.main(method.java:24)
Caused by: java.lang.Exception: Exception thrown in someMethod2
	at method.someMethod2(method.java:5)
	at method.someMethod(method.java:12)
	... 1 more
 *  
 *  */
 