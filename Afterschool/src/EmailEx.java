
public class EmailEx extends Message {

	
		
	private String title ;
	
	
	
	public EmailEx(String receiverName, String message, String senderName, String title) {
		super(receiverName, message, senderName);
		this.title = title;
	}



	public void sendmessage()	{
		System.out.println("이메일을 보낸다");
		
	
		
		
		
		
	}
	



}
