
package com.obracheck.obracheck.controller;

import com.obracheck.obracheck.model.Obra;
import com.obracheck.obracheck.service.ObraService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/obras")
@CrossOrigin(origins = "*")
public class ObraController {

    private final ObraService service;

    public ObraController(ObraService service) {
        this.service = service;
    }

    @GetMapping
    public List<Obra> listar() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public Obra buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Obra cadastrar(@RequestBody Obra obra) {
        return service.cadastrar(obra);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }


@GetMapping("/filtros")
public List<Obra> filtrar(
        @RequestParam(required = false) String bairro,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) String tipoObra,
        @RequestParam(required = false) String orgaoResponsavel) {

    return service.filtrar(
        bairro,
        status,
        tipoObra,
        orgaoResponsavel
    );
}

}
