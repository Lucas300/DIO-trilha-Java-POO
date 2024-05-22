package Messenger.apps;

public class Telegram  extends ServicoDeMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo TELEGRAM");	
		validarConectadoInternet();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Enviando mensagem pelo TELEGRAM");	
		
	}
	
}
