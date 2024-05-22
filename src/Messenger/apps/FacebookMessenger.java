package Messenger.apps;

public class FacebookMessenger extends ServicoDeMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo FACEBOOK");	
		validarConectadoInternet();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo FACEBOOK");	
		
	}
	
}
