package Messenger;

public class FacebookMessenger{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger!");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger!");
	}
	@SuppressWarnings("unused")
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado a internet!");
	}
	@SuppressWarnings("unused")
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando historico da mensagem!");
	}
}
