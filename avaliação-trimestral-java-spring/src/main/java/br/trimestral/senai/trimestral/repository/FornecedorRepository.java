package br.trimestral.senai.trimestral.repository;

import br.trimestral.senai.trimestral.model.Fornecedor;

public interface FornecedorRepository {
    public Fornecedor findByNome(String nome);
    public Fornecedor findByEmail(String email);
    public Fornecedor findByTelefone(String telefone);

}
