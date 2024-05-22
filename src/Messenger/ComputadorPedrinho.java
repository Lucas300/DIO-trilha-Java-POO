package Messenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println();
		
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		System.out.println();
		
		Telegram te = new Telegram();
		te.enviarMensagem();
		te.receberMensagem();
	}
}
