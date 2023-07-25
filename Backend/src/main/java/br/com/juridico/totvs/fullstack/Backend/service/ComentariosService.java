package br.com.juridico.totvs.fullstack.Backend.service;

import br.com.juridico.totvs.fullstack.Backend.domain.Pais;
import br.com.juridico.totvs.fullstack.Backend.service.dto.PaisCreateUpdateDTO;
import br.com.juridico.totvs.fullstack.Backend.service.dto.PaisDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComentariosService {
    public ComentariosDTO create(ComentariosCreateUpdateDTO comentariosCreateUpdateDTO);
    public ComentariosDTO update(Long id, ComentariosCreateUpdateDTO comentariosCreateUpdateDTO);
    public void delete(Long id);
    public ComentariossDTO getComentariosbyId(Long id)
    public List<ComentariosDTO> getAllComentarios();
}
