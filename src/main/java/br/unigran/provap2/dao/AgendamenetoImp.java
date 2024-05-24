/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Agendamento;

/**
 *
 * @author Lenis
 */
public class AgendamenetoImp extends AgendamentoDao{

    @Override
    public Agendamento buscarPorId(Long id) {
        return (Agendamento) pac.createNativeQuery("SELECT ");
    }
    
    
    
}
