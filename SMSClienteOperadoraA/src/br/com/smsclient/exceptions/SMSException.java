/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smsclient.exceptions;

/**
 *
 * @author alunocmc
 */
public class SMSException extends Exception
{
  public SMSException() {}
  
  @Override
  public String getMessage()
  {
    return "Não foi possível enviar a mensagem, verifique todos os campos fornecidos";
  }
}
