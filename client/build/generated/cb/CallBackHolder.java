package cb;

/**
 * Generated from IDL interface "CallBack".
 *
 * @author JacORB IDL compiler V 3.6.1
 * @version generated at Apr 12, 2016 3:16:06 PM
 */

public final class CallBackHolder	implements org.omg.CORBA.portable.Streamable{
	 public CallBack value;
	public CallBackHolder()
	{
	}
	public CallBackHolder (final CallBack initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CallBackHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallBackHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CallBackHelper.write (_out,value);
	}
}
