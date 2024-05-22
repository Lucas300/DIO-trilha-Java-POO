package Messenger;

public class MSNMessenger {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem!");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem!");
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
