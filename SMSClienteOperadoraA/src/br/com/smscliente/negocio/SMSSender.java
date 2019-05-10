/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smscliente.negocio;

import com.operb.sms.SMSException;

/**
 *
 * @author alunocmc
 */
public abstract interface SMSSender
{
  public abstract void enviar(String param1, String param2, String param3) throws SMSException;
}
