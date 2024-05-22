package Messenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoDeMensagemInstantanea msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		
		System.out.println();
		ServicoDeMensagemInstantanea fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println();
		ServicoDeMensagemInstantanea te = new Telegram();
		te.enviarMensagem();
		te.receberMensagem();
	}
}
