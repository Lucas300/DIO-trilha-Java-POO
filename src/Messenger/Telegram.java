package Messenger;

public class Telegram {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegran!");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram!");
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
