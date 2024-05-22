package Messenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("FACEBOOK");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("TELEGRAM");
		Telegram te = new Telegram();
		te.enviarMensagem();
		te.receberMensagem();
	}
}
