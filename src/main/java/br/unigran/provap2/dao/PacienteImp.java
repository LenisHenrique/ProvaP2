/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Paciente;
import java.util.List;

/**
 *
 * @author Lenis
 */
public class PacienteImp extends PacienteDao{

    @Override
    public Paciente buscarId(Long id) {
        return (Paciente) pac.createNativeQuery("SELECT * FROM Paciente WHERE id = :id")
                .setParameter("id", id);
    }

    @Override
    public List<Paciente> listarPac() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
