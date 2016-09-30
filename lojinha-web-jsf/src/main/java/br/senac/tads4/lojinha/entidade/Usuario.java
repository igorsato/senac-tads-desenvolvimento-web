
package br.senac.tads4.lojinha.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author igor.osato
 */
public class Usuario implements Serializable{
    
    private Long id;
    private String nome;
    private String senha;
    private Sexo sexo;
    private List <String> interesses;
    private Date dtNascimento;
    private boolean receberOfertas = true;
    private String email;
    private String telefone;
    private Integer cpf;
    private Short cpfDv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List <String> getInteresses() {
        return interesses;
    }

    public void setInteresses(List <String> interesses) {
        this.interesses = interesses;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public boolean isReceberOfertas() {
        return receberOfertas;
    }

    public void setReceberOfertas(boolean receberOfertas) {
        this.receberOfertas = receberOfertas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Short getCpfDv() {
        return cpfDv;
    }

    public void setCpfDv(Short cpfDv) {
        this.cpfDv = cpfDv;
    }
    
    public static enum Sexo{
        FEMINIMO, MASCULINO;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", senha=" + senha + ", sexo=" + sexo + ", interesses=" + interesses + ", dtNascimento=" + dtNascimento + ", receberOfertas=" + receberOfertas + ", email=" + email + ", telefone=" + telefone + ", cpf=" + cpf + ", cpfDv=" + cpfDv + '}';
    }
    
}
