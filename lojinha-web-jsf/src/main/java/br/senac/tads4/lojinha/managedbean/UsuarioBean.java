
package br.senac.tads4.lojinha.managedbean;

import br.senac.tads4.lojinha.entidade.Usuario;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author igor.osato
 */
@Named(value = "usuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable{

    @Inject
    private CompraBean compraBean;
    
    private Usuario usuario = new Usuario();
    
    public UsuarioBean() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public List<String> getInteresse(){
        return Arrays.asList("Bolos", "Tortas", "Doces", "Outros");
    }
    
    public String salvar(){
        return "Lista.xhtml?faces-redirect=true";
    }
    
}
