package p1;

public class LoginDAO {
public boolean is validuser(String Id,String Password)
{
	if(Id.equals("niit")&&Password.equals("niit123"))
	{
		return true;
	}
	else
	{
		return false;
	}
	}
}
