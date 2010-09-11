/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.logica;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ruan
 */
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoProduto;
    private String nomeProduto;
    private String unidade;
    private String referencia;
    private String aplicacao;
    @Temporal(TemporalType.DATE)
    private Calendar dataCadastro;
   //ate aqui tem os campos na tela cad_produto
    private String produtoUltimanota;
    private double precoCusto;
    private double precoVenda;
    @Temporal(TemporalType.DATE)
    private Calendar ultimaCompraProduto;
    @Temporal(TemporalType.DATE)
    private Calendar ultimaVendaProduto;
    private int estoqueProduto;

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getProdutoUltimanota() {
        return produtoUltimanota;
    }

    public void setProdutoUltimanota(String produtoUltimanota) {
        this.produtoUltimanota = produtoUltimanota;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Calendar getUltimaCompraProduto() {
        return ultimaCompraProduto;
    }

    public void setUltimaCompraProduto(Calendar ultimaCompraProduto) {
        this.ultimaCompraProduto = ultimaCompraProduto;
    }

    public Calendar getUltimaVendaProduto() {
        return ultimaVendaProduto;
    }

    public void setUltimaVendaProduto(Calendar ultimaVendaProduto) {
        this.ultimaVendaProduto = ultimaVendaProduto;
    }
}
