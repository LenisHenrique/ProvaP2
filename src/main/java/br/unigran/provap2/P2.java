
package br.unigran.provap2;

import br.unigran.provap2.dao.DentistaDao;
import br.unigran.provap2.dao.PacienteDao;
import br.unigran.provap2.dao.PacienteImp;
import br.unigran.provap2.model.Dentista;
import br.unigran.provap2.model.Paciente;

public class P2 {
    public static void main(String[] args) {
        System.out.println("oioioioi");
        
        Paciente p = new Paciente();
        PacienteDao dao = new PacienteImp();
        dao.salvar(p);
        dao.atualizar(Long.MIN_VALUE);
        
    }
}
