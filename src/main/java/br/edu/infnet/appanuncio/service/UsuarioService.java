package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {

    private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();


    public static Usuario validar(String email, String senha){
        Usuario usuario = mapaUsuario.get(email);

        if (usuario != null && senha.equals(usuario.getSenha())){
            return usuario;
        }
        return null;
    }

    public static Collection<Usuario> obterLista(){
        return mapaUsuario.values();
    }


    public static void incluir (Usuario usuario){
        mapaUsuario.put(usuario.getEmail(), usuario);
        //AppImpressao.relatorio("Inclusão do usuário: "+usuario.getNome());

    }

    public static void excluir(String email){
        mapaUsuario.remove(email);
    }
}
