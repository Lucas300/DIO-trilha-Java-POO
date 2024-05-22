package Messenger;

import Messenger.apps.FacebookMessenger;
import Messenger.apps.MSNMessenger;
import Messenger.apps.ServicoDeMensagemInstantanea;
import Messenger.apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoDeMensagemInstantanea app = null;
		
		String appEscolhido = "tlg";
		
		if(appEscolhido.equals("msn")) {
			app = new MSNMessenger();
		}else if(appEscolhido.equals("fbm")) {
			app = new FacebookMessenger();
		}else if(appEscolhido.equals("tlg")) {
			app = new  Telegram();			
		}
		
		app.enviarMensagem();
		app.receberMensagem();
	}
}
