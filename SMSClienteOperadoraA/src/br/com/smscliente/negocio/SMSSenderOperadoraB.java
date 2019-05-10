package br.com.smscliente.negocio;

import com.operb.sms.SMSException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunocmc
 */
public class SMSSenderOperadoraB implements SMSSender
{
  public SMSSenderOperadoraB() {}
 
  @Override
  public void enviar(String origem, String destino, String mensagem) throws SMSException
  {
    System.out.println("ENVIANDO MENSAGEM PELA OPERADORA B");
    
    if ((origem == null) || (destino == null) || (mensagem == null) || (origem.equals("")) || (destino.equals("")) || (mensagem.equals(""))) {
      throw new SMSException();
    }
    
    System.out.println(" NOME " + origem + " DESTINO " + destino + "Mensagem: " + mensagem);
    System.out.println("MENSAGEM ENVIADA COM SUCCESSO!");
  }
}
