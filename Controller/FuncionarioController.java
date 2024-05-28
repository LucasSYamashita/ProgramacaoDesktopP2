package br.unigran.Controller;

import br.unigran.entidades.Funcionario;
import br.unigran.persistence.FuncionarioDAO;

public class FuncionarioController {
        private FuncionarioDAO funcionarioDAO;

        public FuncionarioController() {
            funcionarioDAO = new FuncionarioDAO();
        }

        public void salvar(Funcionario funcionario) {
            funcionarioDAO.salvar(funcionario);
        }

        public Funcionario buscarPorId(Long id) {
            return funcionarioDAO.buscarPorId(id);
        }

        public void atualizar(Funcionario funcionario) {
            funcionarioDAO.atualizar(funcionario);
        }

        public void excluir(Long id) {
            funcionarioDAO.excluir(id);
        }

        public void fechar() {
            funcionarioDAO.fechar();
        }
}
