package main;

import controller.ProdutoController;
import model.ProdutoDAO;
import view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        ProdutoView view = new ProdutoView();
        ProdutoController controller = new ProdutoController(dao, view);

        view.setVisible(true);
    }
}
