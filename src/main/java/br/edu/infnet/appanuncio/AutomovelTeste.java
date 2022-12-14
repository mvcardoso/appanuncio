package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.controller.AutomovelController;
import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.exceptions.KilometroInvalidoException;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import br.edu.infnet.appanuncio.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(3)
public class AutomovelTeste implements ApplicationRunner {

    @Autowired
    AutomovelService automovelService;

    @Override
    public void run(ApplicationArguments args)  {

        Usuario usuario = new Usuario();
        usuario.setId(1);

        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources\\";
        String arq = "automovel.txt";

        try {
            try {

                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null) {

                    try {

                        String[] campos = linha.split(";");

                        Automovel a1 = new Automovel();
                        a1.setId(new Integer(campos[0]));
                        a1.setDescricaoCompleta(campos[1]);
                        a1.setPreco(new Double(campos[2]));
                        a1.setMarca(campos[3]);
                        a1.setModelo(campos[4]);
                        a1.setKm(new Integer(campos[5]));
                        a1.setUsuario(usuario);
                        automovelService.incluir(a1);
                        System.out.println(a1.calcularPrecoComJuros());
                        linha = leitura.readLine();
                    } catch (KilometroInvalidoException e) {
                        System.out.println(">>>ERRO AUTOMOVEL<<<<" + e.getMessage());
                        linha = leitura.readLine();
                    }
                }
                leitura.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println(">>>ARQUIVO AUTOMOVEL N??O EXISTE<<<<" + e.getMessage());
            } catch (IOException e) {
                System.out.println("Problema no fechamento");
            }
        }
        finally {
            System.out.println("Funcionou");
        }

        System.out.println();

    }
}
