
package br.senac.tads4.lojinha.managedbean;

import br.senac.tads4.lojinha.entidade.ProdutoQuantidade;
import br.senac.tads4.lojinha.entidade.Produto;
import br.senac.tads4.lojinha.entidade.Usuario;
import br.senac.tads4.lojinha.service.ProdutoService;
import br.senac.tads4.lojinha.service.fakeimpl.ProdutoServiceFakeImpl;
import br.senac.tads4.lojinha.util.Mensagem;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

/**
 *
 * @author fernando.tsuda
 */
@Named
@SessionScoped
public class CompraBean implements Serializable {
  
  private Set<ProdutoQuantidade> listaProdutos = 
	  new LinkedHashSet<ProdutoQuantidade>();

  
  private Usuario usuario = null;
  
  public CompraBean() {
  }
  
  public String adicionarProduto(long idProduto, int quantidade) {
    ProdutoService service = new ProdutoServiceFakeImpl();
    Produto p = service.obter(idProduto);
    
    ProdutoQuantidade pq = null;
    for (ProdutoQuantidade item : listaProdutos) {
      if (item.getProduto().equals(p)) {
	pq = item;
	break;
      }
    }
    if (pq == null) {
      pq = new ProdutoQuantidade(p, quantidade);
      listaProdutos.add(pq);
    } else {
      pq.setQuantidade(pq.getQuantidade() + quantidade);
    }
    
    // Montar mensagem a ser apresentada para usuario
    Flash mensagem = FacesContext.getCurrentInstance().getExternalContext().getFlash();
    mensagem.put("mensagem", new Mensagem("Produto " + p.getNome()  + " adicionado com sucesso", "success"));

    // Redirecionar para lista de produtos
    return "lista.xhtml?faces-redirect=true";
  }
  
  public int getQuantidadeItens() {
    return listaProdutos.size();
  }

    public Set<ProdutoQuantidade> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(Set<ProdutoQuantidade> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
  
  
}
