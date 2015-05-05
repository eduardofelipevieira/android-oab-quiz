package oab.questions.data;

import java.util.ArrayList;
import java.util.List;

import oab.questions.model.Answer;
import oab.questions.model.Exam;
import oab.questions.model.Question;
import oab.questions.model.Answer.Code;

public class Exam20143T1Builder {	
	public static Exam create() {
		return new Exam(0, "XV Exame de Ordem - 2014.3 - Tipo 1 Branca", createQuestions());
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
		questions.add(createQ12(Code.A));
		questions.add(createQ13(Code.C));		
		questions.add(createQ14(Code.A));
		questions.add(createQ15(Code.D));
		questions.add(createQ16(Code.B));
		questions.add(createQ17(Code.D));		
		questions.add(createQ18(Code.B));
		questions.add(createQ19(Code.D));		
		questions.add(createQ20(Code.A));
		/*questions.add(createQ21());		
		questions.add(createQ22());
		questions.add(createQ23());		
		questions.add(createQ24());
		questions.add(createQ25());		
		questions.add(createQ26());
		questions.add(createQ27());		
		questions.add(createQ28());
		questions.add(createQ29());		
		questions.add(createQ30());
		questions.add(createQ31());		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ11(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Age de tal maneira que uses a humanidade, tanto na tua pessoa como na pessoa de qualquer outro, "
				+ "sempre e simultaneamente como fim, e nunca como meio.", Code.A));
		answers.add(new Answer("Age exteriormente, de modo que o livre uso de teu arb�trio possa se conciliar com a liberdade de "
				+ "todos, segundo uma lei universal.", Code.B));
		answers.add(new Answer("Age como se a m�xima de tua a��o se devesse tornar, pela tua vontade, lei universal da natureza.", Code.C));
		answers.add(new Answer("Age de forma que conserves sempre a tua liberdade, ainda que tenhas de resistir � liberdade alheia.", Code.D));
		
		Question question = new Question("Na Doutrina do Direito, Kant busca um conceito puramente racional e que possa explicar o "
				+ "direito independentemente da configura��o espec�fica de cada legisla��o. Mais precisamente, seria o direito entendido "
				+ "como express�o de uma raz�o pura pr�tica, capaz de orientar a faculdade de agir de qualquer ser racional. Assinale a "
				+ "op��o que cont�m, segundo Kant, essa lei universal do direito.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ12(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("a lei n�o deve ser interpretada segundo a raz�o e os crit�rios valorativos daquele que deve aplic�-la, mas, "
				+ "ao contr�rio, este deve submeter-se completamente � raz�o expressa na pr�pria lei.", Code.A));
		answers.add(new Answer("o legislador � onipotente porque � representante democraticamente eleito pela popula��o, e esse processo "
				+ "representativo deve basear-se sempre no direito consuetudin�rio, porque este expressa o verdadeiro esp�rito do povo.", Code.B));
		answers.add(new Answer("uma vez promulgada a lei pelo legislador, o estado-juiz � competente para interpret�-la buscando aproximar a "
				+ "letra da lei dos valores sociais e das demandas populares leg�timas.", Code.C));
		answers.add(new Answer("a �nica for�a jur�dica legitimamente superior ao legislador � o direito natural; portanto, o legislador � "
				+ "soberano para tomar suas decis�es, desde que n�o violem os princ�pios do direito natural.", Code.D));
		
		Question question = new Question("Ao explicar as caracter�sticas fundamentais da Escola da Exegese, o jusfil�sofo italiano Norberto "
				+ "Bobbio afirma que tal Escola foi marcada por uma concep��o rigidamente estatal de direito. Como consequ�ncia disso, "
				+ "temos o princ�pio da onipot�ncia do legislador. Segundo Bobbio, a Escola da Exegese nos leva a concluir que",
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ13(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A perda do mandato do referido senador ser� decidida pelo Senado Federal, por maioria absoluta, mediante "
				+ "provoca��o da respectiva mesa ou de partido pol�tico representado no Congresso Nacional, assegurada a ampla defesa.", Code.A));
		answers.add(new Answer("N�o poder� o referido parlamentar perder o mandato, j� que o afastamento n�o ultrapassou cento e oitenta dias "
				+ "dentro da mesma sess�o legislativa.", Code.B));
		answers.add(new Answer("A perda do mandato do referido senador poder� ser declarada pela Mesa da Casa Legislativa de of�cio ou "
				+ "mediante provoca��o de qualquer dos seus membros, ou de partido pol�tico representado no Congresso Nacional, assegurada "
				+ "a ampla defesa.", Code.C));
		answers.add(new Answer("Caso o referido senador venha a renunciar ap�s submetido ao processo que vise ou possa levar � perda do "
				+ "seu mandato, haver� o arquivamento do processo pela perda do seu objeto.", Code.D));
		
		Question question = new Question("O senador 'X' ausentou-se das atividades do Senado Federal para tratar de assunto de interesse "
				+ "particular por cento e cinquenta dias ininterruptos e, diante desse fato, enfrenta representa��o para a perda do seu "
				+ "mandato, por n�o ter comparecido � ter�a parte das sess�es ordin�rias da Casa, que foram realizadas no per�odo em que "
				+ "esteve ausente. Nessa hip�tese, assinale a alternativa correta.",
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ14(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("� vedada a edi��o da Medida Provis�ria, pois a mat�ria j� havia sido disciplinada em projeto "
				+ "de lei aprovado pelo Congresso Nacional e pendente de san��o ou veto pelo Presidente da Rep�blica.", Code.A));
		answers.add(new Answer("A Medida Provis�ria narrada na quest�o n�o poderia ser editada, visto que � vedado pela Constitui��o "
				+ "Federal dispor sobre mat�ria or�ament�ria por meio dessa esp�cie legislativa.", Code.B));
		answers.add(new Answer("A Medida Provis�ria � juridicamente vi�vel, mas, se n�o for apreciada em at� sessenta dias contados "
				+ "da sua publica��o, entrar� em regime de urg�ncia, subsequentemente, em cada uma das Casas, ficando sobrestadas "
				+ "todas as demais delibera��es legislativas da Casas em que estiver tramitando, at� que se ultime a vota��o.", Code.C));
		answers.add(new Answer("A Medida Provis�ria � juridicamente vi�vel e prorrogar � por duas vezes, por igual per�odo, a sua vig�ncia "
				+ "se, no prazo de 45 dias contados de sua publica��o, n�o tiver a sua vota��o encerrada nas duas Casas do "
				+ "Congresso Nacional.", Code.D));
		
		Question question = new Question("O Presidente da Rep�blica edita Medida Provis�ria que disp�e sobre a inje��o extraordin�ria "
				+ "de verbas para o Fundo de Financiamento Estudantil (FIES). O tema, por�m, j� havia sido objeto de projeto de lei "
				+ "anteriormente aprovado pelo Congresso Nacional e remetido ao pr�prio Presidente da Rep�blica para san��o. Nessa linha, "
				+ "observado o regramento estabelecido pela Constitui��o Federal, assinale a afirmativa correta.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ15(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		
		answers.add(new Answer("o interessado que tenha tido a repercuss�o geral de seu recurso extraordin�rio reconhecida pelo STF.", Code.A));
		answers.add(new Answer("a seccional da Ordem dos Advogados do Brasil de qualquer estado da Federa��o.", Code.B));
		answers.add(new Answer("a Mesa de C�mara dos Vereadores de munic�pio que tenha interesse direto na s�mula.", Code.C));
		answers.add(new Answer("o Partido Pol�tico com representa��o no Congresso Nacional.", Code.D));
		
		Question question = new Question("O Supremo Tribunal Federal editou s�mula com efeito vinculante. Pedro, advogado, deseja pleitear "
				+ "o cancelamento da referida s�mula. Nos termos da Constitui��o Federal, considerando a legitima��o para propor aprova��o "
				+ "ou cancelamento de s�mula junto ao Supremo Tribunal Federal, Pedro poder� provocar o seguinte legitimado:", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ16(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("constitucional, por tratar de prote��o de direito fundamental.", Code.A));
		answers.add(new Answer("inconstitucional, por tratar de mat�ria de compet�ncia privativa da Uni�o.", Code.B));
		answers.add(new Answer("inconstitucional, por v�cio formal relacionado ao qu�rum m�nimo para vota��o.", Code.C));
		answers.add(new Answer("constitucional, por tratar de assunto de interesse local e ter sido aprovada por "
				+ "processo legislativo id�neo.", Code.D));
		
		Question question = new Question("No munic�pio de S�o Jos� dos Cavaleiros, 87% dos atendimentos m�dicos nas emerg�ncias "
				+ "hospitalares s�o decorr�ncias de acidentes automobil�sticos ocasionados pelo consumo de bebidas alco�licas. "
				+ "Uma vereadora do munic�pio, Sra. X, ciente das estat�sticas expostas, apresenta projeto de lei propondo que os "
				+ "cidad�os propriet�rios de ve�culos automotores, residentes no munic�pio, municiem seus ve�culos com equipamento "
				+ "que impe�a a partida do carro no caso de o condutor ter consumido �lcool. A C�mara Municipal, por voto de 2/3 "
				+ "dos vereadores, aprova a lei. Esta legisla��o deve ser considerada",
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ17(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Juan, cidad�o espanhol, casado com Beatriz, brasileira, ambos residentes em Barcelona.", Code.A));
		answers.add(new Answer("Anderson, cidad�o portugu�s, domiciliado no Brasil h� 360 dias.", Code.B));
		answers.add(new Answer("Louis, cidad�o franc�s, domiciliado em Bras�lia h� 14 anos, que est� em liberdade condicional, "
				+ "ap�s condena��o pelo crime de explora��o sexual de vulner�vel.", Code.C));
		answers.add(new Answer("Maria, 45 anos, cidad� russa, residente e domiciliada no Brasil desde seus 25 anos de idade, "
				+ "processada criminalmente por inj�ria, mas absolvida por senten�a transitada em julgado.", Code.D));
		
		Question question = new Question("A CRFB/88 identifica as hip�teses de caracteriza��o da nacionalidade para brasileiros natos e "
				+ "os brasileiros naturalizados. Com base no previsto na Constitui��o, assinale a alternativa que indica um caso "
				+ "constitucionalmente v�lido de naturaliza��o requerida para obten��o de nacionalidade brasileira.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ18(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A lei n�o pode retroagir, porque a situa��o versa sobre direitos indispon�veis de Pedro.", Code.A));
		answers.add(new Answer("A lei n�o pode retroagir para prejudicar a coisa julgada formada em favor de Pedro.", Code.B));
		answers.add(new Answer("A lei pode retroagir, pois n�o h� direito adquirido de Pedro diante de nova legisla��o.", Code.C));
		answers.add(new Answer("A lei pode retroagir, porque n�o h� ato jur�dico perfeito em favor de Pedro diante de pagamentos "
				+ "pendentes.", Code.D));
		
		Question question = new Question("Pedro promoveu a��o em face da Uni�o Federal e seu pedido foi julgado procedente, com efeitos "
				+ "patrimoniais vencidos e vincendos, n�o havendo mais recurso a ser interposto. Posteriormente, o Congresso Nacional aprovou "
				+ "lei, que foi sancionada, extinguindo o direito reconhecido a Pedro. Ap�s a publica��o da referida lei, a Administra��o "
				+ "P�blica federal notificou Pedro para devolver os valores recebidos, comunicando que n�o mais ocorreriam os pagamentos "
				+ "futuros, em decorr�ncia da norma em foco. Nos termos da Constitui��o Federal, assinale a op��o correta.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ19(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Ao Conselho de Defesa Nacional compete opinar sobre a decreta��o do estado de defesa, do estado de "
				+ "s�tio e da interven��o federal. Ao Conselho Nacional de Justi�a compete o controle da atua��o administrativa e "
				+ "financeira do Poder Judici�rio, do Poder Legislativo e do Poder Executivo.", Code.A));
		answers.add(new Answer("Ao Conselho de Defesa Nacional compete opinar sobre as quest�es relevantes para a estabilidade das "
				+ "institui��es democr�ticas. Ao Conselho da Rep�blica compete opinar sobre as hip�teses de declara��o de guerra "
				+ "e de celebra��o de paz.", Code.B));
		answers.add(new Answer("Ao Conselho Nacional de Justi�a compete o controle da atua��o administrativa e financeira do Poder "
				+ "Judici�rio, do Poder Legislativo e do Poder Executivo. Ao Conselho da Rep�blica compete opinar sobre as hip�teses "
				+ "de declara��o de guerra e de celebra��o de paz.", Code.C));
		answers.add(new Answer("Ao Conselho de Defesa Nacional compete opinar sobre as hip�teses de declara��o de guerra e de celebra��o "
				+ "de paz. Ao Conselho da Rep�blica compete pronunciar-se sobre interven��o federal, estado de defesa e estado de "
				+ "s�tio.", Code.D));
		
		Question question = new Question("O Presidente da Rep�blica, � luz da CRFB/88, disp�e de dois �rg�os de c�pula para consulta em "
				+ "determinados assuntos. Assinale a op��o que elenca corretamente esses �rg�os e suas atribui��es constitucionalmente definidas.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ20(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Sistema de visitas regulares de seus membros.", Code.A));
		answers.add(new Answer("Mutir�es judiciais.", Code.B));
		answers.add(new Answer("Medidas legislativas de parlamentares que integrem o Mecanismo.", Code.C));
		answers.add(new Answer("Cria��o e fortalecimento de defensorias p�blicas.", Code.D));
		
		Question question = new Question("Como forma de evitar a ocorr�ncia de viola��o de Direitos Humanos em estabelecimentos prisionais, "
				+ "o Brasil ratificou, em 2007, o Protocolo Facultativo � Conven��o contra a tortura e outros tratamentos ou penas cru�is, "
				+ "desumanos ou degradantes. Tal protocolo estabelece que cada Estado-Parte dever� designar ou manter, em n�vel dom�stico, "
				+ "um ou mais mecanismos preventivos nacionais. Por meio da Lei n� 12.847/13, o Brasil pretendeu atender � exig�ncia do "
				+ "Protocolo, ao criar o Mecanismo Nacional de Preven��o e Combate � Tortura. Quanto ao meio proposto tanto pelo Protocolo "
				+ "quanto pela Lei para alcan�ar a finalidade almejada, assinale a afirmativa correta.", 
				answers, "", "", correct);
		
		return question;
	}
}
