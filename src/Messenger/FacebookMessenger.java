package Messenger;

public class FacebookMessenger extends ServicoDeMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo FACEBOOK");	
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo FACEBOOK");	
		
	}
	
}
