
package com.obracheck.obracheck.service;

import com.obracheck.obracheck.model.Obra;
import com.obracheck.obracheck.repository.ObraRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ObraService {

    private final ObraRepository repository;

    public ObraService(ObraRepository repository) {
        this.repository = repository;
    }

    public List<Obra> listarTodas() {
        return repository.findAll();
    }

    public Obra buscarPorId(Long id) {
        return repository.findById(id)
            .orElseThrow(() ->
                new RuntimeException("Obra não encontrada")
            );
    }

    public Obra cadastrar(Obra obra) {
        return repository.save(obra);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }


public List<Obra> filtrar(
        String bairro,
        String status,
        String tipoObra,
        String orgao) {

    return repository.filtrarObras(
        bairro,
        status,
        tipoObra,
        orgao
    );
}

}
