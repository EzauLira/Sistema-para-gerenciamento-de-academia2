package br.com.academia.SistemaParaGerenciamentoDeAcademia.domain.exception;

public class NegocioException extends RuntimeException {

    public NegocioException(String mensagem){
        super(mensagem);
    }

}
