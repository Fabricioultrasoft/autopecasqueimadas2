/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.visao;

import autopecas.logica.Produto;
import autopecas.visao.Cad_produto;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ruan
 */
public class TableModelProduto extends AbstractTableModel {
   private Cad_produto cadastro;
   private static final String[] COLUNAS ={"Codigo","Descricao","Fabricante","Quant"};

   public TableModelProduto(Cad_produto cadastro){
    
     this.cadastro = cadastro;

    }

    public int getRowCount() {
      // System.out.println(cadProdut.listaProdutoPesquisados.size());
        return cadastro.listaProdutoPesquisados.size();
    }
     @Override
    public String getColumnName(int column) {
        return COLUNAS[column];
    }


    public int getColumnCount() {
       return COLUNAS.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         Produto produto = cadastro.listaProdutoPesquisados.get(rowIndex);
        if (columnIndex == 0) {
            return produto.getCodigoProduto();
        }else if (columnIndex == 1){
            return produto.getNomeProduto();
        } else if (columnIndex == 2) {
                return produto.getReferencia();
        } else if (columnIndex == 3) {
                    return produto.getAplicacao();

                }else
                    return produto.getEstoqueProduto();
            }

    }

 


