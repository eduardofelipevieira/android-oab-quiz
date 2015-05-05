package oab.questions.data;

import java.util.ArrayList;
import java.util.List;

import oab.questions.model.Answer;
import oab.questions.model.Exam;
import oab.questions.model.Question;
import oab.questions.model.Answer.Code;

public class ExamEthicsBuilder {	
	public static Exam create() {
		return new Exam(0, "�tica", createQuestions());
	}
	
	private static List<Question> createQuestions() {
		ArrayList<Question> questions = new ArrayList<Question>();
		
		questions.add(createQ1(Code.C));		
		questions.add(createQ2(Code.C));
		questions.add(createQ3(Code.B));		
		questions.add(createQ4(Code.A));
		questions.add(createQ5(Code.B));		
		questions.add(createQ6(Code.D));
		questions.add(createQ7(Code.C));		
		questions.add(createQ8(Code.C));
		questions.add(createQ9(Code.B));		
		questions.add(createQ10(Code.A));
		
		questions.add(createQ11(Code.B));		
		questions.add(createQ12(Code.B));
		questions.add(createQ13(Code.A));		
		questions.add(createQ14(Code.D));
		questions.add(createQ15(Code.A));
		questions.add(createQ16(Code.B));
		questions.add(createQ17(Code.D));		
		questions.add(createQ18(Code.D));
		questions.add(createQ19(Code.D));		
		questions.add(createQ20(Code.C));
		
		questions.add(createQ21(Code.B));		
		questions.add(createQ22(Code.B));
		questions.add(createQ23(Code.D));		
		questions.add(createQ24(Code.A));
		questions.add(createQ25(Code.C));		
		questions.add(createQ26(Code.B));
		questions.add(createQ27(Code.B));		
		questions.add(createQ28(Code.B));
		questions.add(createQ29(Code.B));		
		questions.add(createQ30(Code.C));
		
		/*questions.add(createQ31());		
		questions.add(createQ32());
		questions.add(createQ33());		
		questions.add(createQ34());
		questions.add(createQ35());		
		questions.add(createQ36());
		questions.add(createQ37());		
		questions.add(createQ38());
		questions.add(createQ39());		
		questions.add(createQ40());
		questions.add(createQ41());		
		questions.add(createQ42());
		questions.add(createQ43());		
		questions.add(createQ44());
		questions.add(createQ45());		
		questions.add(createQ46());
		questions.add(createQ47());		
		questions.add(createQ48());
		questions.add(createQ49());		
		questions.add(createQ50());
		questions.add(createQ51());		
		questions.add(createQ52());
		questions.add(createQ53());		
		questions.add(createQ54());
		questions.add(createQ55());		
		questions.add(createQ56());
		questions.add(createQ57());		
		questions.add(createQ58());
		questions.add(createQ59());		
		questions.add(createQ60());
		questions.add(createQ61());		
		questions.add(createQ62());
		questions.add(createQ63());		
		questions.add(createQ64());
		questions.add(createQ65());		
		questions.add(createQ66());
		questions.add(createQ67());		
		questions.add(createQ68());
		questions.add(createQ69());		
		questions.add(createQ70());
		questions.add(createQ71());		
		questions.add(createQ72());
		questions.add(createQ73());		
		questions.add(createQ74());
		questions.add(createQ75());		
		questions.add(createQ76());
		questions.add(createQ77());		
		questions.add(createQ78());
		questions.add(createQ79());		
		questions.add(createQ80());*/
		
		return questions;
	}
	
	private static Question createQ1(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A incompatibilidade com a advocacia persiste aposentadoria do cargo efetivo.", Code.A));
		answers.add(new Answer("O afastamento tempor�rio do cargo afastamento tempor�rio do cargo que gera a incompatibilidade "
				+ "permite inscri��o provis�ria.", Code.B));
		answers.add(new Answer("A incompatibilidade permanece mesmo que ocorra o afastamento tempor�rio do cargo.", Code.C));
		answers.add(new Answer("O afastamento do cargo incompat�vel permite a inscri��o ap�s um per�odo de tr�s anos.", Code.D));
		
		Question question = new Question("Abelardo � magistrado vinculado ao Tribunal de Justi�a do Estado K e requer licen�a "
				+ "para tratamento de quest�es particulares, pelo prazo de tr�s anos, o que foi deferido. Como, antes de assumir o "
				+ "referido cargo, era advogado regularmente inscrito nos quadros da OAB, requer o seu reingresso, comprovando o "
				+ "afastamento das fun��es judicantes. Nos termos do Estatuto da Advocacia, assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ2(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("deve submeter-se � determina��o da ger�ncia jur�dica.", Code.A));
		answers.add(new Answer("deve apresentar seu parecer ao conjunto de advogados para decis�o", Code.B));
		answers.add(new Answer("pode recusar-se a propor a a��o diante do parecer anterior.", Code.C));
		answers.add(new Answer("pode opor-se e postular assessoria da OAB.", Code.D));
		
		Question question = new Question("Fred, jovem advogado, � contratado para prestar servi�os na empresa BBO Ltda., que possui uma "
				+ "assessoria jur�dica composta por cinco profissionais do Direito, orientados por uma ger�ncia jur�dica. "
				+ "Ap�s cinco meses de intensa atividade, � concitado a formular parecer sobre determinado tema jur�dico de "
				+ "interesse da empresa, tarefa que realiza, sendo seu entendimento subscrito pela ger�ncia. Ap�s dez meses do "
				+ "referido evento, o tema � reapresentado por um dos diretores da empresa, que, em viagem realizada para outro "
				+ "estado, havia consultado um outro advogado. Diante dos novos argumentos, o gerente determina que Fred, o advogado "
				+ "parecerista, mesmo sem ter mudado de opini�o, apresente peti��o inicial em confronto com o entendimento anteriormente "
				+ "preconizado. No caso, nos termos do C�digo de �tica da Advocacia, o advogado", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ3(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("devolver os honor�rios antecipados sem abater os custos do escrit�rio.", Code.A));
		answers.add(new Answer("prestar contas ao cliente de forma pormenorizada.", Code.B));
		answers.add(new Answer("arquivar os documentos no escrit�rio como forma de garantia.", Code.C));
		answers.add(new Answer("realizar contrato vinculando o cliente ao escrit�rio.", Code.D));
		
		Question question = new Question("Bernardo recebe comunica��o do seu cliente Eduardo de que este "
				+ "havia desistido da causa que apresentara anteriormente, por motivo de viagem a trabalho, "
				+ "no exterior, em decorr�ncia de transfer�ncia e promo��o na sua empresa. Houve elabora��o "
				+ "da peti��o inicial, contrato de presta��o de servi�os e recebimento adiantado de custas e "
				+ "honor�rios advocat�cios. Nesse caso, nos termos do C�digo de �tica da Advocacia, deve o advogado", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ4(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A pretens�o punitiva quanto �s prescreve em cinco anos, contados da data da constata��o "
				+ "oficial do fato, interrompendo processo disciplinar ou pela notifica��o v�lida do representado.", Code.A));
		answers.add(new Answer("A pretens�o punitiva das infra��es disciplinares prescreve em tr�s anos, contados da data "
				+ "da constata��o oficial do fato, interrompendo-se pela instaura��o de processo disciplinar ou pela "
				+ "notifica��o v�lida do representado", Code.B));
		answers.add(new Answer("A pretens�o punitiva das infra��es disciplinares � imprescrit�vel.", Code.C));
		answers.add(new Answer("A pretens�o punitiva das infra��es disciplinares prescreve em cinco anos, contados da data "
				+ "da constata��o oficial do fato, n�o havendo previs�o legal de marco interruptivo de tal prazo "
				+ "prescricional.", Code.D));
		
		Question question = new Question("Sobre a prescri��o da pretens�o punitiva das infra��es disciplinares, "
				+ "assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ5(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A elei��o de Conselheiro Federal da OAB � indireta e secreta.", Code.A));
		answers.add(new Answer("O Conselheiro Federal da OAB integra uma das chapas concorrentes para as elei��es seccionais.", Code.B));
		answers.add(new Answer("A indica��o para o Conselho Federal � realizada pelo Col�gio de Presidentes da OAB.", Code.C));
		answers.add(new Answer("O Conselheiro Federal � indicado livremente pelas Seccionais da OAB.", Code.D));
		
		Question question = new Question("Messias � advogado com mais de trinta anos de atua��o profissional e "
				+ "deseja colaborar para o aperfei�oamento da advocacia. O Presidente da Seccional onde possui "
				+ "inscri��o principal sugere que ele participe da pol�tica associativa e lance sua candidatura a "
				+ "Conselheiro Federal. Observadas as regras do Estatuto da OAB, assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ6(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("T�cio pode ajuizar tal a��o, pois, embora n�o tivesse celebrado o contrato com o cliente, "
				+ "recebeu poderes de Caio para atuar na causa.", Code.A));
		answers.add(new Answer("T�cio pode ajuizar tal a��o, pois ingressou na causa antes da prola��o da senten�a, sendo, "
				+ "assim, igualmente respons�vel pelo �xito.", Code.B));
		answers.add(new Answer("T�cio n�o pode ajuizar tal a��o porque, como Caio e T�cio n�o requereram o destaque dos "
				+ "honor�rios contratuais, ele n�o tem mais direito a receb�-los.", Code.C));
		answers.add(new Answer("T�cio n�o pode ajuizar tal a��o porque o advogado substabelecido com reserva de poderes n�o pode "
				+ "cobrar honor�rios sem a interven��o daquele que lhe conferiu o substabelecimento.", Code.D));
		
		Question question = new Question("O advogado Caio atuava representando os interesses do autor em determinada "
				+ "a��o indenizat�ria h� alguns anos. Antes da prola��o da senten�a, substabeleceu, com reserva, os "
				+ "poderes que lhe haviam sido outorgados pelo cliente, ao advogado T�cio. Ao final, o pedido foi "
				+ "julgado procedente e o cliente de Caio e T�cio recebeu a indeniza��o pleiteada, mas n�o repassou aos "
				+ "advogados os honor�rios de �xito contratados, estipulados em 30%. Caio, para evitar desgaste, preferiu "
				+ "n�o cobrar judicialmente os valores devidos pelo cliente. T�cio, n�o concordando com a op��o de Caio, "
				+ "decidiu, � revelia deste �ltimo, ingressar com a a��o cab�vel, valendo-se, para tanto, do contrato de "
				+ "honor�rios celebrado entre Caio e o cliente. A partir do caso apresentado, assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ7(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("O advogado pode postular contra texto expresso de lei.", Code.A));
		answers.add(new Answer("O advogado deve aconselhar o cliente a procurar o Minist�rio P�blico para propor a��o contra a lei.", Code.B));
		answers.add(new Answer("O advogado pode se opor � norma expressa, aduzindo a sua inconstitucionalidade.", Code.C));
		answers.add(new Answer("O advogado deve indicar ao cliente a desist�ncia da a��o, por n�o portar solu��o para o problema.", Code.D));
		
		Question question = new Question("Ant�nio recebe Paulo, um antigo cliente do escrit�rio de advocacia onde presta servi�os. "
				+ "Ap�s a entrevista, o preenchimento de relat�rio com os dados pessoais do cliente e a requisi��o dos documentos "
				+ "necess�rios, Ant�nio an�lise final dois dias depois da entrevista com o cliente e verifica que existe norma legal "
				+ "que contraria, expressamente, a pretens�o apresentada. Sobre o caso, observadas as regras do Estatuto da OAB, assinale "
				+ "a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ8(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A advogada deveria optar por um dos clientes na primeira consulta.", Code.A));
		answers.add(new Answer("O lit�gio envolve interesses irremediavelmente conflitantes, o que exige a op��o do advogado.", Code.B));
		answers.add(new Answer("A concilia��o purga o confronto de interesses entre os clientes da advogada.", Code.C));
		answers.add(new Answer("O eventual acordo entre os litigantes, no caso, deveria ser feito por outro advogado.", Code.D));
		
		Question question = new Question("F�tima � advogada de Carla em processo proposto em face da empresa LL Servi�os An�nimos, por "
				+ "contrato n�o cumprido. Posteriormente, F�tima patrocina os interesses de Leon�dio em a��o de responsabilidade civil, "
				+ "apresentada em face de Ov�dio. Pelos descaminhos do destino, Carla e Leon�dio estabelecem sociedade que, dois anos ap�s "
				+ "a sua constitui��o, vem a ser dissolvida. Com os �nimos exaltados, Carla e Leon�dio procuram sua advogada de confian�a, "
				+ "F�tima, diante dos servi�os de qualidade prestados anteriormente. Com sua rara habilidade persuasiva, a advogada "
				+ "consegue compor os interesses em conflito. Sobre o caso apresentado, observadas as regras do Estatuto da OAB e do C�digo "
				+ "de �tica e Disciplina da OAB, assinale a op��o correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ9(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Apenas o Conselho Seccional do estado X ter� poder para punir Jo�o disciplinarmente.", Code.A));
		answers.add(new Answer("Apenas o Conselho Seccional do estado Y ter� poder para punir Jo�o disciplinarmente.", Code.B));
		answers.add(new Answer("Apenas o Conselho Federal ter� poder para punir Jo�o disciplinarmente.", Code.C));
		answers.add(new Answer("Os Conselhos Seccionais dos estados X e Y ter�o poderes concorrentes para punir Jo�o disciplinarmente.", Code.D));
		
		Question question = new Question("O advogado Jo�o, inscrito na Seccional do estado X, cometeu grave infra��o �tica ao atuar em "
				+ "determinada causa no estado Y. Assinale a op��o que indica o Conselho Seccional com poder de punir disciplinarmente o "
				+ "advogado infrator.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ10(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("� poss�vel manter o nome do s�cio falecido, desde que prevista tal possibilidade no ato constitutivo da sociedade.", Code.A));
		answers.add(new Answer("� poss�vel manter o nome do s�cio falecido, independentemente de previs�o no ato constitutivo da sociedade.", Code.B));
		answers.add(new Answer("� absolutamente vedada a manuten��o do nome do s�cio falecido na raz�o social da sociedade.", Code.C));
		answers.add(new Answer("� poss�vel manter, pelo prazo m�ximo de seis meses, o nome do s�cio falecido.", Code.D));
		
		Question question = new Question("Os advogados X de Souza, Y dos Santos e requereram o registro de sociedade de advogados denominada "
				+ "Souza, Santos e Andrade Sociedade de Advogados. Tempos depois, X de Souza vem a falecer, mas os demais s�cios decidem "
				+ "manter na sociedade o nome do advogado falecido. Sobre a hip�tese, assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ11(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("O advogado pode afastar-se do processo em que atua sem comunica��o ao cliente.", Code.A));
		answers.add(new Answer("A ren�ncia deve ser notificada ao cliente pelos advogados mandat�rios.", Code.B));
		answers.add(new Answer("A ren�ncia aos poderes conferidos no mandato depender� do cliente do escrit�rio.", Code.C));
		answers.add(new Answer("A ren�ncia ao mandato, sem respeitar o prazo legal, implica abandono da causa.", Code.D));
		
		Question question = new Question("Matheus � estagi�rio vinculado ao escrit�rio Renato e Associados. No exerc�cio da sua atividade, por ordem do "
				+ "advogado supervisor, o estagi�rio acompanha o cliente diretor da sociedade Tamoa� S/A. Por motivos alheios � vontade do estagi�rio, "
				+ "que se disse inocente de qualquer deslize, o diretor veio a se desentender com Matheus, e, por for�a desse evento, o escrit�rio resolve "
				+ "renunciar ao mandato conferido pela pessoa jur�dica. Nos termos do Estatuto da Advocacia, sobre o caso descrito, assinale a afirmativa correta.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ12(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("constituem documentos p�blicos a servirem como prova em Ju�zo.", Code.A));
		answers.add(new Answer("s�o presumidas confidenciais, n�o podendo ser reveladas a terceiros.", Code.B));
		answers.add(new Answer("podem ser publicizadas, de acordo com a prud�ncia do advogado.", Code.C));
		answers.add(new Answer("devem ser mantidas em sigilo at� o perecimento do advogado.", Code.D));
		
		Question question = new Question("Andrea e Luciano trocam missivas intermitentes, cujo conte�do diz respeito a processo judicial em que a primeira "
				+ "� autora, e o segundo, seu advogado. A parte contr�ria, ciente da troca de informa��es entre eles, requer ao Ju�zo que esses documentos "
				+ "sejam anexados aos autos do processo em que litigam. Sob a perspectiva do C�digo de �tica e Disciplina da Advocacia, as comunica��es "
				+ "epistolares trocadas entre advogado e cliente",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ13(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("O magistrado decidiu corretamente, pois, de acordo com o EAOAB, � direito do advogado n�o ser recolhido preso, "
				+ "antes de senten�a transitada em julgado, sen�o em sala de Estado-maior e, na sua falta, em pris�o domiciliar.", Code.A));
		answers.add(new Answer("O magistrado n�o decidiu corretamente, pois o advogado, assim como qualquer outro cidad�o que tenha conclu�do "
				+ "curso superior, tem direito a ser recolhido preso em pris�o especial, mas n�o em sala de estado-maior, que apenas � garantida "
				+ "a magistrados e membros do Minist�rio P�blico.", Code.B));
		answers.add(new Answer("O magistrado decidiu corretamente, devendo o advogado permanecer em pris�o domiciliar, mesmo havendo sala de "
				+ "Estado Maior, ap�s eventual tr�nsito em julgado de sua condena��o.", Code.C));
		answers.add(new Answer("O magistrado n�o decidiu corretamente, pois o advogado apenas tem direito a n�o ser recolhido preso, antes de "
				+ "senten�a transitada em julgado, em sala de estado-maior e, na sua falta, em pris�o domiciliar, quando o crime que lhe esteja "
				+ "sendo imputado decorra do exerc�cio regular da profiss�o de advogado.", Code.D));
		
		Question question = new Question("O advogado Ant�nio de Souza encontra-se preso cautelarmente, em cela comum, por for�a de decreto de pris�o preventiva "
				+ "proferido no �mbito de a��o penal a que responde por suposta pr�tica de reiteradas fraudes contra a Previd�ncia. O advogado de Ant�nio "
				+ "requereu ao magistrado que decretou a pris�o a transfer�ncia de seu cliente para sala de estado-maior. Como n�o havia sala de estado-maior "
				+ "dispon�vel na localidade, o magistrado determinou que Ant�nio deveria permanecer em pris�o domiciliar at� que houvesse sala de estado-maior "
				+ "dispon�vel. Sobre a decis�o do magistrado, assinale a op��o correta.",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ14(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Maria n�o deve ser punida porque, ao tempo em que os fatos foram levados ao conhecimento da OAB, ela j� n�o mais "
				+ "exercia cargo incompat�vel com a advocacia.", Code.A));
		answers.add(new Answer("Maria n�o deve ser punida porque o cargo de Oficial de Justi�a n�o � incompat�vel com o exerc�cio da advocacia, n�o "
				+ "tendo Maria, portanto, feito prova falsa de requisito para inscri��o na OAB.", Code.B));
		answers.add(new Answer("Maria deve ser punida com a pena de suspens�o, pelo prazo de trinta dias.", Code.C));
		answers.add(new Answer("Maria deve ser punida com a pena de exclus�o dos quadros da OAB.", Code.D));
		
		Question question = new Question("Ao requerer sua inscri��o nos quadros da OAB, Maria assinou e apresentou declara��o em que afirmava n�o exercer cargo "
				+ "incompat�vel com a advocacia. No entanto, exercia ela ainda o cargo de Oficial de Justi�a no Tribunal de Justi�a do seu Estado. Pouco tempo "
				+ "depois, j� bem sucedida como advogada, pediu exonera��o do referido cargo. No entanto, um desafeto seu, tendo descoberto que Maria, ao ingressar "
				+ "nos quadros da OAB, ainda exercia o cargo de Oficial de Justi�a, comunicou o fato � entidade, que abriu processo disciplinar para apura��o da "
				+ "conduta de Maria, tendo ela sido punida por ter feito falsa prova de um dos requisitos para a inscri��o na OAB. De acordo com o EAOAB, assinale "
				+ "a op��o que indica a penalidade que deve ser aplicada a Maria.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ15(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		
		answers.add(new Answer("A prefeita exerce fun��o incompat�vel com a advocacia.", Code.A));
		answers.add(new Answer("O secret�rio municipal pode atuar em a��es contra o munic�pio.", Code.B));
		answers.add(new Answer("A prefeita deve pedir autoriza��o para exercer a advocacia.", Code.C));
		answers.add(new Answer("O secret�rio municipal pode atuar em pleitos contra o Estado federado.", Code.D));
		
		Question question = new Question("Cl�udia, advogada, inicialmente transitou pelo direito privado, com assun��o de causas individuais e coletivas. Ao ser "
				+ "contratada por uma associa��o civil, deparou com quest�es mais pertinentes ao direito p�blico e, por for�a disso, realizou novos estudos e contatou "
				+ "colegas mais experientes na mat�ria. Ao aprofundar suas rela��es jur�dicas, tamb�m iniciou participa��o pol�tica na defesa de temas essenciais � "
				+ "cidadania. Por for�a disso, Cl�udia foi eleita prefeita do munic�pio X em elei��o bastante disputada, tendo vencido seu oponente, o tamb�m advogado "
				+ "Pradel, por apenas cem votos. Eleita e empossada, motivada pelo sentido conciliat�rio, convidou seu antigo oponente para ocupar cargo em comiss�o "
				+ "na Secretaria Municipal de Fazenda. A partir da hip�tese apresentada, observadas as regras do Estatuto da OAB, assinale a op��o correta.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ16(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Armando poderia se retirar do recinto, pois o advogado tem o direito de n�o aguardar por mais de trinta minutos para a "
				+ "realiza��o de ato judicial.", Code.A));
		answers.add(new Answer("Armando n�o poderia se retirar do recinto, pois a autoridade que presidiria o ato judicial do qual Armando participaria "
				+ "estava presente.", Code.B));
		answers.add(new Answer("Armando n�o poderia se retirar do recinto, pois a prerrogativa por ele invocada n�o � v�lida para audi�ncias criminais.", Code.C));
		answers.add(new Answer("Armando poderia se retirar do recinto, pois n�o deu causa ao atraso da audi�ncia.", Code.D));
		
		Question question = new Question("�s 15h15, o advogado Armando aguardava, no corredor do f�rum, o in�cio de uma audi�ncia criminal designada para as "
				+ "14h30. A primeira audi�ncia do dia havia sido iniciada no hor�rio correto, �s 13h30, e a audi�ncia da qual Armando participaria era a segunda "
				+ "da pauta daquela data. Armando � avisado por um serventu�rio de que a primeira audi�ncia havia sido interrompida por uma hora para que o "
				+ "acusado, que n�o se sentira bem, recebesse atendimento m�dico, e que, por tal motivo, todas as demais audi�ncias do dia seriam iniciadas "
				+ "com atraso. Mesmo assim, Armando informa ao serventu�rio que n�o iria aguardar mais, afirmando que, de acordo com o EAOAB, tem direito, ap�s "
				+ "trinta minutos do hor�rio designado, a se retirar do recinto onde se encontre aguardando preg�o para ato judicial. A partir do caso apresentado, "
				+ "assinale a op��o correta.",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ17(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Marcos teve sua prerrogativa profissional violada, pois � direito do advogado e do estagi�rio inscrito na OAB dirigir-se "
				+ "diretamente ao magistrado nas salas e gabinetes de trabalho, independentemente de hor�rio previamente marcado, observando-se a "
				+ "ordem de chegada.", Code.A));
		answers.add(new Answer("Marcos n�o teve sua prerrogativa profissional violada, pois apenas deve dirigir-se diretamente ao magistrado quando os "
				+ "advogados que atuam na causa estiverem impossibilitados de faz�-lo, sendo a atua��o do estagi�rio subsidi�ria em rela��o � atua��o "
				+ "do advogado.", Code.B));
		answers.add(new Answer("Marcos n�o teve sua prerrogativa profissional violada, pois apenas o advogado tem direito de dirigir-se diretamente ao "
				+ "magistrado nas salas e gabinetes de trabalho, independentemente de hor�rio previamente marcado, observando-se a ordem de chegada. Ao "
				+ "contr�rio, Marcos praticou ato excedente � sua habilita��o e, em raz�o disso, ficar� impedido, posteriormente, de obter sua inscri��o "
				+ "definitiva como advogado.", Code.C));
		answers.add(new Answer("Marcos n�o teve sua prerrogativa profissional violada, pois apenas o advogado tem direito de dirigir-se diretamente ao "
				+ "magistrado nas salas e gabinetes de trabalho, independentemente de hor�rio previamente marcado, observando-se a ordem de chegada. Ao "
				+ "contr�rio, Marcos praticou ato excedente � sua habilita��o e deve ser punido com pena de censura.", Code.D));
		
		Question question = new Question("O estagi�rio Marcos trabalha em determinado escrit�rio de advocacia e participou ativamente da elabora��o de determinada "
				+ "pe�a processual que estava para ser analisada pelo magistrado da Vara em que o processo tramitava, assinando, ao final, a peti��o, em conjunto "
				+ "com alguns advogados do escrit�rio. Como conhecia muito bem a causa, resolveu falar com o magistrado com o objetivo de ressaltar, de viva voz, "
				+ "alguns detalhes relevantes. Quando o magistrado percebeu que estava recebendo o estagi�rio do escrit�rio, e n�o um dos advogados que atuava na "
				+ "causa, informou ao estagi�rio que n�o poderia tratar com ele sobre o processo, solicitando que os advogados viessem em seu lugar, se entendessem "
				+ "necess�rio. Marcos, muito aborrecido, afirmou que faria uma representa��o contra o magistrado, por entender que suas prerrogativas profissionais "
				+ "foram violadas. A respeito da conduta de Marcos, assinale a op��o correta.",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ18(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A advogada deve aceitar a imposi��o do cliente por ser inerente ao mandato.", Code.A));
		answers.add(new Answer("A advogada deve aceitar a indica��o de um advogado para atuar conjuntamente no processo.", Code.B));
		answers.add(new Answer("A advogada deve acolher o comando, por ser natural na vida forense a colabora��o.", Code.C));
		answers.add(new Answer("A advogada n�o � obrigada a aceitar a imposi��o de seu cliente no caso.", Code.D));
		
		Question question = new Question("Mara � advogada atuante, tendo especializa��o na �rea c�vel. Procurada por um cliente da �rea empresarial, ela"
				+ " aceita o mandato. Ocorre que seu cliente possui, em sua empresa, um departamento jur�dico com numerosos advogados e um gerente. Por "
				+ "indica��o deles, o cliente determina que Mara inclua, no mandato que lhe foi conferido, os advogados da empresa, para atua��o conjunta. "
				+ "Com base no caso apresentado, observadas as regras do Estatuto da OAB e do C�digo de �tica e Disciplina da OAB, assinale a op��o correta.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ19(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Ana ter� o dever de depor, pois o bem jur�dico administra��o da justi�a � mais relevante do que o bem jur�dico inviolabilidade "
				+ "dos segredos.", Code.A));
		answers.add(new Answer("Ana ter� o dever de depor, pois foi desobrigada por seu excliente do dever de guardar sigilo sobre os fatos de que tomou "
				+ "conhecimento quando atuou como advogada da XYZ Ltda.", Code.B));
		answers.add(new Answer("Ana ter� o dever de depor, pois n�o integra mais o departamento jur�dico da empresa XYZ Ltda., tendo cessado, portanto, seu "
				+ "dever de guardar sigilo.", Code.C));
		answers.add(new Answer("Ana n�o ter� o dever de depor, pois o advogado tem o direito de se recusar a depor, como testemunha, sobre fato relacionado � "
				+ "pessoa de quem foi ou seja advogado, mesmo quando solicitado pelo cliente.", Code.D));
		
		Question question = new Question("A advogada Ana integrou o departamento jur�dico da empresa XYZ Ltda. e, portanto, participava de reuni�es internas, com "
				+ "s�cios e diretores, e externas, com clientes e fornecedores, tendo acesso a todos os documentos da sociedade, inclusive aos de natureza cont�bil, "
				+ "conhecendo assim, diversos fatos e informa��es relevantes sobre a empresa. Alguns anos ap�s ter deixado os quadros da XYZ Ltda., Ana recebeu "
				+ "intima��o para comparecer a determinada audi�ncia e a prestar depoimento, como testemunha arrolada pela defesa, no �mbito de a��o penal em que um "
				+ "dos s�cios da empresa figurava como acusado do crime de sonega��o fiscal. Ao comparecer � audi�ncia, Ana afirmou que n�o prestaria depoimento sobre "
				+ "os fatos dos quais tomou conhecimento enquanto integrava o jur�dico da XYZ Ltda. O magistrado que presidia o ato ressaltou que seu depoimento havia "
				+ "sido solicitado pelo pr�prio s�cio da empresa, que a estaria, portanto, desobrigando do dever de guardar sigilo. Sobre a quest�o apresentada, "
				+ "observadas as regras do Estatuto da OAB e do C�digo de �tica e Disciplina da OAB, assinale a op��o correta.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ20(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Sim. Considera-se imoderado qualquer an�ncio profissional mediante remessa de correspond�ncia a uma coletividade.", Code.A));
		answers.add(new Answer("Sim. Ao advogado � vedado o envio de correspond�ncia a clientes, salvo para tratar de temas que sejam de "
				+ "interesse desses �ltimos.", Code.B));
		answers.add(new Answer("N�o. Armando poderia ter enviado a correspond�ncia em quest�o, pois estava apenas comunicando a altera��o de "
				+ "seu endere�o.", Code.C));
		answers.add(new Answer("N�o. A publicidade por meio de correspond�ncia � permitida em qualquer caso e para comunicar qualquer tipo de "
				+ "informa��o.", Code.D));
		
		Question question = new Question("O advogado Armando alterou o endere�o de seu escrit�rio e, para comunicar tal altera��o, enviou correspond�ncia a "
				+ "grande n�mero de pessoas, notadamente, seus clientes e outros advogados. Observadas as regras do Estatuto da OAB e do C�digo de �tica e "
				+ "Disciplina da OAB, Armando realizou publicidade irregular?",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ21(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("prescindir do conhecimento do cliente por ser ato privativo.", Code.A));
		answers.add(new Answer("ser comunicado ao cliente de modo inequ�voco.", Code.B));
		answers.add(new Answer("ser realizado por tempo determinado.", Code.C));
		answers.add(new Answer("implicar na devolu��o dos honor�rios pagos antecipadamente pelo cliente.", Code.D));
		
		Question question = new Question("O advogado Carlos pretende substabelecer os poderes que lhe foram conferidos pelo seu cliente Eduardo, sem reserva de "
				+ "poderes, pois pretende realizar uma longa viagem, sem saber a data do retorno, n�o pretendendo manter compromissos profissionais. Nos termos "
				+ "das normas do C�digo de �tica, tal ato deve",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ22(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Prescreve em dois anos a a��o de cobran�a de honor�rios de advogado, contando-se o prazo do vencimento do contrato, "
				+ "se houver.", Code.A));
		answers.add(new Answer("Prescreve em cinco anos a a��o de cobran�a de honor�rios de advogado, contando-se o prazo do tr�nsito em julgado da "
				+ "decis�o que os fixar.", Code.B));
		answers.add(new Answer("Prescreve em dois anos a a��o de cobran�a de honor�rios de advogado, contando-se o prazo da ultima��o do servi�o "
				+ "extrajudicial.", Code.C));
		answers.add(new Answer("Prescreve em cinco anos a a��o de cobran�a de honor�rios de advogado, contando-se o prazo da decis�o que os fixar, "
				+ "independentemente do seu tr�nsito em julgado.", Code.D));
		
		Question question = new Question("Sobre o prazo para ajuizamento de a��o de cobran�a de honor�rios de advogado, assinale a op��o correta.",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ23(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Jos� tem direito a receber a integralidade dos honor�rios contratuais e de sucumb�ncia, como se tivesse atuado na "
				+ "causa at� o final, uma vez que foi substitu�do por vontade da cliente e n�o sua.", Code.A));
		answers.add(new Answer("Jos� n�o tem direito a receber honor�rios, porque n�o atuou na causa at� o seu fim.", Code.B));
		answers.add(new Answer("Jos� tem direito a receber honor�rios contratuais, mas n�o tem direito a receber honor�rios de sucumb�ncia.", Code.C));
		answers.add(new Answer("Jos� tem direito a receber honor�rios contratuais, bem como honor�rios de sucumb�ncia, calculados proporcionalmente, "
				+ "em face do servi�o efetivamente prestado.", Code.D));
		
		Question question = new Question("Maria, ap�s v�rios anos de tramita��o de a��o indenizat�ria em que figurava como autora, decidiu substituir Jos�, "
				+ "advogado que at� ent�o atuava na causa, por Jo�o, amigo da fam�lia, que n�o cobraria honor�rios de nenhuma esp�cie de Maria. Ao final da "
				+ "a��o, quando Maria finalmente recebeu os valores que lhe eram devidos, a t�tulo de indeniza��o, foi procurada por Jos�, que desejava receber "
				+ "honor�rios pelos servi�os advocat�cios prestados at� o momento em que foi substitu�do. Sobre a hip�tese sugerida, assinale a afirmativa correta.",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ24(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Conselho Seccional da OAB.", Code.A));
		answers.add(new Answer("Conselho Federal da OAB.", Code.B));
		answers.add(new Answer("Presidente do Conselho Federal da OAB.", Code.C));
		answers.add(new Answer("Presidente do Tribunal de �tica da OAB.", Code.D));
		
		Question question = new Question("Maria da Silva, advogada, apresenta requerimento ao Presidente da Seccional da OAB tendo o seu pleito sido indeferido. "
				+ "Nos termos do Estatuto da Advocacia, cabe recurso ao", 
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ25(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		
		answers.add(new Answer("� reuni�o com seu cliente, respons�vel pela empresa.", Code.A));
		answers.add(new Answer("desacompanhado, com procura��o com poderes ad juditia.", Code.B));
		answers.add(new Answer("� reuni�o, com mandato outorgado com poderes especiais.", Code.C));
		answers.add(new Answer("ao local sem a presen�a do cliente e sem mandato.", Code.D));
		
		Question question = new Question("Agnaldo � advogado na �rea de Direito de Empresas, tendo como uma de suas clientes a sociedade Cobradora Eficiente "
				+ "Ltda., que consegue realizar os seus atos de cobran�a com rara efici�ncia. Por for�a de sua atividade, a sociedade � convidada a participar de "
				+ "reuni�o com a Associa��o dos Consumidores Unidos e envia o seu advogado para dialogar com a referida institui��o. Consoante o Estatuto da "
				+ "Advocacia, deve o advogado comparecer", 
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ26(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("vinte minutos do hor�rio designado.", Code.A));
		answers.add(new Answer("trinta minutos do hor�rio designado.", Code.B));
		answers.add(new Answer("quarenta minutos do hor�rio designado.", Code.C));
		answers.add(new Answer("cinquenta minutos do hor�rio designado.", Code.D));
		
		Question question = new Question("Abel, por for�a de suas atividades como advogado, comparece � audi�ncia designada para ocorrer �s 13 horas. Aguarda algum "
				+ "tempo, mas n�o recebe qualquer not�cia do in�cio dos trabalhos forenses. Nesse caso, consoante o Estatuto da Advocacia, protocolizando comunica��o "
				+ "em ju�zo, pode retirar-se do recinto passados",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ27(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Compete ao Conselho Federal da OAB representar, em ju�zo ou fora dele, os interesses coletivos ou individuais "
				+ "dos advogados.", Code.A));
		answers.add(new Answer("Compete ao Conselho Federal da OAB editar seu regimento interno e o regimento interno das Seccionais da OAB.", Code.B));
		answers.add(new Answer("Compete ao Conselho Federal da OAB julgar, em grau de recurso, as quest�es decididas pelos Conselhos Seccionais, nos casos "
				+ "previstos no EAOAB e no regulamento geral.", Code.C));
		answers.add(new Answer("Compete ao Conselho Federal da OAB velar pela dignidade, independ�ncia, prerrogativas e valoriza��o da advocacia.", Code.D));
		
		Question question = new Question("A respeito da compet�ncia do Conselho Federal da OAB, assinale a op��o incorreta.",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ28(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("realizar propaganda, mesmo moderada, da sua atividade.", Code.A));
		answers.add(new Answer("ofertar servi�os profissionais que impliquem exposi��o de clientela.", Code.B));
		answers.add(new Answer("apresentar o seu curr�culo profissional em p�blico.", Code.C));
		answers.add(new Answer("distribuir cart�es de visita com seu endere�o profissional.", Code.D));
		
		Question question = new Question("A advogada Maria Vivian procura apresentar os seus servi�os profissionais como de excelente qualidade, utilizando a "
				+ "estrat�gia aprendida em tempos em que atuava no teatro, quando finalizava a pe�a pedindo indica��o aos amigos, se tivesse aprovado o espet�culo "
				+ "e, caso negativo, indicasse aos inimigos. A par disso, organiza um sistema sofisticado de divulga��o de material de propaganda, informando o n�mero "
				+ "de vit�rias obtido em v�rias causas com temas pr�prios das causas de massa. Nos termos do C�digo de �tica da Advocacia, o advogado n�o pode", 
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ29(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("N�o. Juarez n�o pode aceitar a causa, pois est� impedido de exercer a advocacia contra a Fazenda P�blica que o "
				+ "remunera.", Code.A));
		answers.add(new Answer("Sim. Juarez poder� aceitar a causa, pois o impedimento de exerc�cio da advocacia contra a Fazenda P�blica que "
				+ "remunera os advogados que s�o servidores p�blicos n�o inclui a hip�tese de docentes de cursos jur�dicos.", Code.B));
		answers.add(new Answer("Sim. Juarez poder� aceitar a causa, pois n�o h� nenhum tipo de impedimento para o exerc�cio da advocacia por "
				+ "servidores p�blicos.", Code.C));
		answers.add(new Answer("N�o. Juarez n�o poder� aceitar a causa, pois exerce o cargo de professor universit�rio, que � incompat�vel com o "
				+ "exerc�cio da advocacia.", Code.D));
		
		Question question = new Question("Juarez da Silva, advogado, professor adjunto de Direito Administrativo em determinada Universidade Federal, foi procurado, "
				+ "na qualidade de advogado, por um grupo de funcion�rios p�blicos federais que desejavam ajuizar determinada a��o contra a Uni�o. Pode Juarez aceitar "
				+ "a causa, advogando contra a Uni�o?",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ30(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Valdir n�o pode revelar o segredo que lhe foi confiado por Andr�, pois o advogado deve sempre guardar sigilo sobre o "
				+ "que saiba em raz�o do seu of�cio.", Code.A));
		answers.add(new Answer("Valdir poderia revelar o segredo que lhe foi confiado por Andr�, mas apenas no caso de ser intimado como testemunha "
				+ "em a��o penal eventualmente deflagrada para a apura��o do homic�dio que viesse a ser efetivamente praticado.", Code.B));
		answers.add(new Answer("Valdir pode revelar o segredo que lhe foi confiado por Andr�, em raz�o de estar a vida da ex-esposa deste �ltimo "
				+ "em risco.", Code.C));
		answers.add(new Answer("Valdir n�o pode revelar o segredo que lhe foi confiado por Andr�, mas tem obriga��o legal de impedir que o homic�dio "
				+ "seja praticado, sob pena de se tornar part�cipe do crime.", Code.D));
		
		Question question = new Question("Valdir representa os interesses de Andr� em a��o de div�rcio em que est�o em discuss�o diversas quest�es relevantes, inclusive "
				+ "de cunho financeiro, como, por exemplo, o pensionamento e a partilha de bens. Irritado com as exig�ncias de sua ex-esposa, Andr� revela a Valdir que "
				+ "pretende contratar algu�m para assassin�-la. Deve Valdir comunicar o segredo revelado por seu cliente �s autoridades competentes?",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
}
