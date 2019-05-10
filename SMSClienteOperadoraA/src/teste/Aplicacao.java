package teste;

import br.com.smscliente.adapter.SMSAdapter;
import br.com.smscliente.model.Mensagem;
import br.com.smscliente.negocio.EnviadorSMSOperadoraA;
import com.operb.sms.SMSSenderOperadoraB;
import java.util.Scanner;

/**
 *
 * @author danigpam
 */
public class Aplicacao {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("DIGITE SEU NOME: ");
        System.out.println("=================");
        String nome = input.next();
        
        System.out.println("DIGITE O DESTINATARIO: ");
         System.out.println("=================");
        String destinatario = input.next();

        System.out.println("Digite O SEU MENSAGEM: ");
        String mensagem = input.next();

        System.out.println("ESCOLHA SUA OPERADORA: 1 - OPERADORA A OU 2 - OPERADORA B: ");  
        String operadora = input.next();
          System.out.println("=========================================================");
       
        
        Mensagem cont = new Mensagem(destinatario, nome, mensagem);
        
        if (operadora.equals("2")) {
            SMSAdapter adapter = new SMSAdapter();
            adapter.setProceso(new SMSSenderOperadoraB());
            adapter.enviarSMS(cont);
            return;
        }
        
       
        EnviadorSMSOperadoraA operador = new EnviadorSMSOperadoraA();
        operador.enviarSMS(cont);
    }
}
