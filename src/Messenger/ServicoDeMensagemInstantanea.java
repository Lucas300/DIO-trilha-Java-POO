package Messenger;

public class ServicoDeMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
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

