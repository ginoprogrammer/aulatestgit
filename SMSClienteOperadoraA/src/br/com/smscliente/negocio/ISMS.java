
package br.com.smscliente.negocio;

import br.com.smscliente.model.Mensagem;


public interface ISMS {
    public boolean enviarSMS(Mensagem mensagem);
}
