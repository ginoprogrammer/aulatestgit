/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smscliente.adapter;

import br.com.smscliente.model.Mensagem;
import br.com.smscliente.negocio.ISMS;
import com.operb.sms.SMSException;
import com.operb.sms.SMSSenderOperadoraB;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunocmc
 */
public class SMSAdapter implements ISMS {
    
    private SMSSenderOperadoraB enviandomensagem;

    @Override
    public boolean enviarSMS(Mensagem mensagem) {
        try {
            this.enviandomensagem.enviar(mensagem.getOrigem(), mensagem.getDestino(), mensagem.getTexto());
            return true;
        } catch (SMSException ex) {
            Logger.getLogger(SMSAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    public void setProceso(SMSSenderOperadoraB enviandomensagem) {
        this.enviandomensagem = enviandomensagem;
    }   
}
