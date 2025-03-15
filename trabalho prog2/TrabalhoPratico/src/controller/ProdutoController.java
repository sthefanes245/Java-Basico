package controller;

import model.*;
import view.ProdutoView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProdutoController {
    private ProdutoDAO dao;
    private ProdutoView view;

    public ProdutoController(ProdutoDAO dao, ProdutoView view) {
        this.dao = dao;
        this.view = view;

        view.addAdicionarListener(new AdicionarListener());
        view.addListarListener(new ListarListener());
        view.addPesquisarListener(new PesquisarListener());
        view.addExcluirListener(new ExcluirListener());
    }

    class AdicionarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String nome = view.getNome();
                double preco = Double.parseDouble(view.getPreco());
                int quantidade = Integer.parseInt(view.getQuantidade());
                String especifico = view.getEspecifico();
                Produto produto;

                if (view.getTipoProduto().equals("Alimento")) {
                    produto = new ProdutoAlimento(nome, preco, quantidade, especifico);
                } else {
                    produto = new ProdutoEletronico(nome, preco, quantidade, especifico, "Modelo");
                }

                dao.adicionarProduto(produto);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Erro: Insira valores numéricos válidos para preço e quantidade.");
            }
        }
    }

    class ListarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder sb = new StringBuilder();
            for (Produto p : dao.listarProdutos(true)) {
                sb.append(p.getDescricao()).append("\n");
            }
            view.setDisplayText(sb.toString());
        }
    }

    class PesquisarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Produto produto = dao.buscarProduto(view.getNome());
            if (produto != null) {
                view.setDisplayText(produto.getDescricao());
            } else {
                view.setDisplayText("Produto não encontrado.");
            }
        }
    }

    class ExcluirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Produto produto = dao.buscarProduto(view.getNome());
            if (produto != null) {
                dao.excluirProduto(produto);
                view.setDisplayText("Produto excluído.");
            } else {
                view.setDisplayText("Produto não encontrado.");
            }
        }
    }
}
