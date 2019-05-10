/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smscliente.negocio;

import br.com.smscliente.model.Mensagem;

/**
 *
 * @author wolley
 */
public class EnviadorSMSOperadoraA implements ISMS {



    @Override
    public boolean enviarSMS(Mensagem sms) {
       if(!sms.getDestino().isEmpty() && !sms.getOrigem().isEmpty() && !sms.getTexto().isEmpty()){
            System.out.println("PROTOCOLO: OPERADORA A");
            System.out.println("DE " + sms.getOrigem());
            System.out.println("PARA " + sms.getDestino());
            System.out.println("MENSAGEM: " + sms.getTexto());
            System.out.println("MENSAGEM ENVIADA COM SUCESSO!");
            return true;
        }
        
        System.out.println("MENSAGEM NAO ENVIADA PELA OPERADORA A.");
        return false;
    }
    
}
