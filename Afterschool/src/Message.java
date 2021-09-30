
public class Message {
	
private String receiverName;
private String message ;
private String senderName;


public void sendMessage() {
	System.out.println("º¸³½´Ù");
}


public Message(String receiverName, String message, String senderName) {
	super();
	this.receiverName = receiverName;
	this.message = message;
	this.senderName = senderName;
}


public String getReceiverName() {
	return receiverName;
}


public void setReceiverName(String receiverName) {
	this.receiverName = receiverName;
}


public String getMessage() {
	return message;
}


public void setMessage(String message) {
	this.message = message;
}


public String getSenderName() {
	return senderName;
}


public void setSenderName(String senderName) {
	this.senderName = senderName;
}






}
