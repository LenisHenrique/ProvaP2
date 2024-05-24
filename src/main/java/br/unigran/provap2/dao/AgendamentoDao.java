
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Agendamento;


public abstract class AgendamentoDao extends Dao{
    
    public abstract Agendamento buscarPorId(Long id);
    
}
