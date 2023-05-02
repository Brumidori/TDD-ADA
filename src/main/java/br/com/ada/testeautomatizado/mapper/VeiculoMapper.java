package br.com.ada.testeautomatizado.mapper;

import br.com.ada.testeautomatizado.dto.VeiculoDTO;
import br.com.ada.testeautomatizado.model.Veiculo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VeiculoMapper {

    @Autowired
    private ModelMapper mapper;

    public Veiculo veiculo(VeiculoDTO entradaDto){
        return mapper.map(entradaDto, Veiculo.class);
    }

    public VeiculoDTO dto(Veiculo veiculo){
        return mapper.map(veiculo, VeiculoDTO.class);
    }
}
