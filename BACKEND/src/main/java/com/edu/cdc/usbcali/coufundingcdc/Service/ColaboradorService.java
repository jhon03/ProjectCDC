package com.edu.cdc.usbcali.coufundingcdc.Service;

import com.edu.cdc.usbcali.coufundingcdc.DTO.ColaboradorDTO;
import com.edu.cdc.usbcali.coufundingcdc.Domain.Colaborador;

import java.util.List;

public interface ColaboradorService {

    public Colaborador crearColaborador(ColaboradorDTO colaboradorDTO) throws Exception;

    public Colaborador findBynumeroIdentificacion(String numeroIdentificacion) throws Exception;

    public Colaborador findById(int idCol) throws Exception;
    public Colaborador actualizarColaborador(ColaboradorDTO colaboradorDTO) throws Exception;
    public void eliminarColaborador(Integer idCol) throws Exception;


    public List<Colaborador> findByNumeroIdentificacionLike(String numeroIdentificacion) throws Exception;

    public List<Colaborador> findAll();
}
