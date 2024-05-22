package Messenger.apps;

public abstract  class  ServicoDeMensagemInstantanea {
	public abstract  void enviarMensagem();
	public abstract  void receberMensagem();
	
	
	//protected para as classes filhas acessarem
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
}

