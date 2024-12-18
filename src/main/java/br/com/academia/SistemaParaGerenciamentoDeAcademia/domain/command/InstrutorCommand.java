package br.com.academia.SistemaParaGerenciamentoDeAcademia.domain.command;

import br.com.academia.SistemaParaGerenciamentoDeAcademia.adapter.input.Instrutor.dto.AgendamentosDoDiaResponseDto;
import br.com.academia.SistemaParaGerenciamentoDeAcademia.port.input.IInstrutor;
import br.com.academia.SistemaParaGerenciamentoDeAcademia.port.output.IInstrutorRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrutorCommand implements IInstrutor {

    private static final Logger LOGGER = LoggerFactory.getLogger(InstrutorCommand.class);
    @Autowired
    IInstrutorRepository instrutorRepository;


    //------------------------------------------------------------------------------------------------------------------------------------//

    @Override
    public List<AgendamentosDoDiaResponseDto> listarAgendamentoDoDia(){
        LOGGER.info("Início do método listarAgendamentoDoDia da command para instrutor.");
       return instrutorRepository.listarAgendamentoDoDia();
    }

    //------------------------------------------------------------------------------------------------------------------------------------//

    @Override
    public List<AgendamentosDoDiaResponseDto> listarTreinosDeUmClienteEspecifico(String nome) {
        LOGGER.info("Início do método listarTreinosDeUmClienteEspecifico da command para instrutor.");
        return instrutorRepository.listarTreinosDeUmClienteEspecifico(nome);
    }

    //------------------------------------------------------------------------------------------------------------------------------------//

    @Override
    public List<AgendamentosDoDiaResponseDto> buscarHistoricoDeUmClienteEspecifico(String nome) {
        LOGGER.info("Início do método buscarHistoricoDeUmClienteEspecifico da command para instrutor.");
        return instrutorRepository.buscarHistoricoDeUmClienteEspecifico(nome);
    }

    //------------------------------------------------------------------------------------------------------------------------------------//

}
