
import model.ResponsavelTarefa;
import model.SituacaoTarefa;
import model.PrioridadeTarefa;
import model.Tarefa;

import java.util.Date;

import dao.TarefaDAO;

public class Main {

	public static void main(String[] args) throws Exception {

		TarefaDAO cad = new TarefaDAO();
		Tarefa taf = new Tarefa();
		Date deadline = new Date(23/12/2023);
		
		taf.setTitulo("teste2");
		taf.setDescricao(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
		taf.setResponsavel(ResponsavelTarefa.FABIA);
		taf.setPrioridade(PrioridadeTarefa.ALTA);
		taf.setSituacao(SituacaoTarefa.EM_ANDAMENTO);
		taf.setDeadline(deadline);
		
		cad.cadastrarTarefa(taf);
		
	}
}