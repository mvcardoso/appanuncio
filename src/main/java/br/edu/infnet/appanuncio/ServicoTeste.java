package br.edu.infnet.appanuncio;


import br.edu.infnet.appanuncio.model.domain.Servico;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class ServicoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
    System.out.println(">>>>>>Serviço<<<<<<");

    Servico s1 = new Servico();
    s1.id = 0001L;
    s1.descricaoCompleta = "Móveis planejados";
    s1.preco = 100.0;
    s1.tipoServico = "Marcenaria";
    s1.redeSocial = "instagram.com/marcenaria";
    s1.notaAvaliacao = 4.0;
    System.out.println(s1);

    Servico s2 = new Servico();
    s2.id = 0002L;
    s2.descricaoCompleta = "Serviço de pedreiro";
    s2.preco = 100.0;
    s2.tipoServico = "Pedreiro";
    s2.redeSocial = "instagram.com/pedreiro";
    s2.notaAvaliacao = 3.0;
    System.out.println(s2);

    Servico s3 = new Servico();
    s3.id = 0001L;
    s3.descricaoCompleta = "Manicure/Pedicure";
    s3.preco = 100.0;
    s3.tipoServico = "Estética";
    s3.redeSocial = "instagram.com/manicure";
    s3.notaAvaliacao = 4.0;
    System.out.println(s3);


    }
}