package com.obracheck.repository;

import com.obracheck.config.model.Obra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Long> {

    @Query("""
        SELECT o FROM Obra o
        WHERE (:bairro IS NULL OR
               LOWER(o.bairro) LIKE LOWER(CONCAT('%', :bairro, '%')))
        AND (:status IS NULL OR o.status = :status)
        AND (:tipoObra IS NULL OR o.tipoObra = :tipoObra)
        AND (:orgao IS NULL OR
             o.orgaoResponsavel = :orgao)
    """)
    List<Obra> filtrarObras(
        @Param("bairro") String bairro,
        @Param("status") String status,
        @Param("tipoObra") String tipoObra,
        @Param("orgao") String orgao
    );
}

//Ele permite pesquisar obras utilizando vários filtros ao mesmo tempo. 
// Por exemplo, o usuário pode selecionar Boa Viagem e Em andamento para encontrar somente as obras que correspondem aos dois critérios.