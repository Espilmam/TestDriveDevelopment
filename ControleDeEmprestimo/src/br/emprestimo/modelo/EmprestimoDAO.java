package br.emprestimo.modelo;

import java.util.List;
import java.util.ArrayList;

public class EmprestimoDAO {
	
	List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public boolean adicionar(Emprestimo umEmprestimo) {
		
		return emprestimos.add(umEmprestimo);
	}

	public Emprestimo consulta(Emprestimo umEmprestimo) {

		for (Emprestimo emprestimo : emprestimos) {
			
			if (emprestimos.contains(umEmprestimo)) {
				
				return emprestimo;
			}
		}
		return null;
	}
}
