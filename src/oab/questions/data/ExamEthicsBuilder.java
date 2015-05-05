package oab.questions.data;

import java.util.ArrayList;
import java.util.List;

import oab.questions.model.Answer;
import oab.questions.model.Exam;
import oab.questions.model.Question;
import oab.questions.model.Answer.Code;

public class ExamEthicsBuilder {	
	public static Exam create() {
		return new Exam(0, "Ética", createQuestions());
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
		answers.add(new Answer("O afastamento temporário do cargo afastamento temporário do cargo que gera a incompatibilidade "
				+ "permite inscrição provisória.", Code.B));
		answers.add(new Answer("A incompatibilidade permanece mesmo que ocorra o afastamento temporário do cargo.", Code.C));
		answers.add(new Answer("O afastamento do cargo incompatível permite a inscrição após um período de três anos.", Code.D));
		
		Question question = new Question("Abelardo é magistrado vinculado ao Tribunal de Justiça do Estado K e requer licença "
				+ "para tratamento de questões particulares, pelo prazo de três anos, o que foi deferido. Como, antes de assumir o "
				+ "referido cargo, era advogado regularmente inscrito nos quadros da OAB, requer o seu reingresso, comprovando o "
				+ "afastamento das funções judicantes. Nos termos do Estatuto da Advocacia, assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ2(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("deve submeter-se à determinação da gerência jurídica.", Code.A));
		answers.add(new Answer("deve apresentar seu parecer ao conjunto de advogados para decisão", Code.B));
		answers.add(new Answer("pode recusar-se a propor a ação diante do parecer anterior.", Code.C));
		answers.add(new Answer("pode opor-se e postular assessoria da OAB.", Code.D));
		
		Question question = new Question("Fred, jovem advogado, é contratado para prestar serviços na empresa BBO Ltda., que possui uma "
				+ "assessoria jurídica composta por cinco profissionais do Direito, orientados por uma gerência jurídica. "
				+ "Após cinco meses de intensa atividade, é concitado a formular parecer sobre determinado tema jurídico de "
				+ "interesse da empresa, tarefa que realiza, sendo seu entendimento subscrito pela gerência. Após dez meses do "
				+ "referido evento, o tema é reapresentado por um dos diretores da empresa, que, em viagem realizada para outro "
				+ "estado, havia consultado um outro advogado. Diante dos novos argumentos, o gerente determina que Fred, o advogado "
				+ "parecerista, mesmo sem ter mudado de opinião, apresente petição inicial em confronto com o entendimento anteriormente "
				+ "preconizado. No caso, nos termos do Código de Ética da Advocacia, o advogado", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ3(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("devolver os honorários antecipados sem abater os custos do escritório.", Code.A));
		answers.add(new Answer("prestar contas ao cliente de forma pormenorizada.", Code.B));
		answers.add(new Answer("arquivar os documentos no escritório como forma de garantia.", Code.C));
		answers.add(new Answer("realizar contrato vinculando o cliente ao escritório.", Code.D));
		
		Question question = new Question("Bernardo recebe comunicação do seu cliente Eduardo de que este "
				+ "havia desistido da causa que apresentara anteriormente, por motivo de viagem a trabalho, "
				+ "no exterior, em decorrência de transferência e promoção na sua empresa. Houve elaboração "
				+ "da petição inicial, contrato de prestação de serviços e recebimento adiantado de custas e "
				+ "honorários advocatícios. Nesse caso, nos termos do Código de Ética da Advocacia, deve o advogado", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ4(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A pretensão punitiva quanto às prescreve em cinco anos, contados da data da constatação "
				+ "oficial do fato, interrompendo processo disciplinar ou pela notificação válida do representado.", Code.A));
		answers.add(new Answer("A pretensão punitiva das infrações disciplinares prescreve em três anos, contados da data "
				+ "da constatação oficial do fato, interrompendo-se pela instauração de processo disciplinar ou pela "
				+ "notificação válida do representado", Code.B));
		answers.add(new Answer("A pretensão punitiva das infrações disciplinares é imprescritível.", Code.C));
		answers.add(new Answer("A pretensão punitiva das infrações disciplinares prescreve em cinco anos, contados da data "
				+ "da constatação oficial do fato, não havendo previsão legal de marco interruptivo de tal prazo "
				+ "prescricional.", Code.D));
		
		Question question = new Question("Sobre a prescrição da pretensão punitiva das infrações disciplinares, "
				+ "assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ5(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A eleição de Conselheiro Federal da OAB é indireta e secreta.", Code.A));
		answers.add(new Answer("O Conselheiro Federal da OAB integra uma das chapas concorrentes para as eleições seccionais.", Code.B));
		answers.add(new Answer("A indicação para o Conselho Federal é realizada pelo Colégio de Presidentes da OAB.", Code.C));
		answers.add(new Answer("O Conselheiro Federal é indicado livremente pelas Seccionais da OAB.", Code.D));
		
		Question question = new Question("Messias é advogado com mais de trinta anos de atuação profissional e "
				+ "deseja colaborar para o aperfeiçoamento da advocacia. O Presidente da Seccional onde possui "
				+ "inscrição principal sugere que ele participe da política associativa e lance sua candidatura a "
				+ "Conselheiro Federal. Observadas as regras do Estatuto da OAB, assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ6(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Tício pode ajuizar tal ação, pois, embora não tivesse celebrado o contrato com o cliente, "
				+ "recebeu poderes de Caio para atuar na causa.", Code.A));
		answers.add(new Answer("Tício pode ajuizar tal ação, pois ingressou na causa antes da prolação da sentença, sendo, "
				+ "assim, igualmente responsável pelo êxito.", Code.B));
		answers.add(new Answer("Tício não pode ajuizar tal ação porque, como Caio e Tício não requereram o destaque dos "
				+ "honorários contratuais, ele não tem mais direito a recebê-los.", Code.C));
		answers.add(new Answer("Tício não pode ajuizar tal ação porque o advogado substabelecido com reserva de poderes não pode "
				+ "cobrar honorários sem a intervenção daquele que lhe conferiu o substabelecimento.", Code.D));
		
		Question question = new Question("O advogado Caio atuava representando os interesses do autor em determinada "
				+ "ação indenizatória há alguns anos. Antes da prolação da sentença, substabeleceu, com reserva, os "
				+ "poderes que lhe haviam sido outorgados pelo cliente, ao advogado Tício. Ao final, o pedido foi "
				+ "julgado procedente e o cliente de Caio e Tício recebeu a indenização pleiteada, mas não repassou aos "
				+ "advogados os honorários de êxito contratados, estipulados em 30%. Caio, para evitar desgaste, preferiu "
				+ "não cobrar judicialmente os valores devidos pelo cliente. Tício, não concordando com a opção de Caio, "
				+ "decidiu, à revelia deste último, ingressar com a ação cabível, valendo-se, para tanto, do contrato de "
				+ "honorários celebrado entre Caio e o cliente. A partir do caso apresentado, assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ7(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("O advogado pode postular contra texto expresso de lei.", Code.A));
		answers.add(new Answer("O advogado deve aconselhar o cliente a procurar o Ministério Público para propor ação contra a lei.", Code.B));
		answers.add(new Answer("O advogado pode se opor à norma expressa, aduzindo a sua inconstitucionalidade.", Code.C));
		answers.add(new Answer("O advogado deve indicar ao cliente a desistência da ação, por não portar solução para o problema.", Code.D));
		
		Question question = new Question("Antônio recebe Paulo, um antigo cliente do escritório de advocacia onde presta serviços. "
				+ "Após a entrevista, o preenchimento de relatório com os dados pessoais do cliente e a requisição dos documentos "
				+ "necessários, Antônio análise final dois dias depois da entrevista com o cliente e verifica que existe norma legal "
				+ "que contraria, expressamente, a pretensão apresentada. Sobre o caso, observadas as regras do Estatuto da OAB, assinale "
				+ "a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ8(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A advogada deveria optar por um dos clientes na primeira consulta.", Code.A));
		answers.add(new Answer("O litígio envolve interesses irremediavelmente conflitantes, o que exige a opção do advogado.", Code.B));
		answers.add(new Answer("A conciliação purga o confronto de interesses entre os clientes da advogada.", Code.C));
		answers.add(new Answer("O eventual acordo entre os litigantes, no caso, deveria ser feito por outro advogado.", Code.D));
		
		Question question = new Question("Fátima é advogada de Carla em processo proposto em face da empresa LL Serviços Anônimos, por "
				+ "contrato não cumprido. Posteriormente, Fátima patrocina os interesses de Leonídio em ação de responsabilidade civil, "
				+ "apresentada em face de Ovídio. Pelos descaminhos do destino, Carla e Leonídio estabelecem sociedade que, dois anos após "
				+ "a sua constituição, vem a ser dissolvida. Com os ânimos exaltados, Carla e Leonídio procuram sua advogada de confiança, "
				+ "Fátima, diante dos serviços de qualidade prestados anteriormente. Com sua rara habilidade persuasiva, a advogada "
				+ "consegue compor os interesses em conflito. Sobre o caso apresentado, observadas as regras do Estatuto da OAB e do Código "
				+ "de Ética e Disciplina da OAB, assinale a opção correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ9(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Apenas o Conselho Seccional do estado X terá poder para punir João disciplinarmente.", Code.A));
		answers.add(new Answer("Apenas o Conselho Seccional do estado Y terá poder para punir João disciplinarmente.", Code.B));
		answers.add(new Answer("Apenas o Conselho Federal terá poder para punir João disciplinarmente.", Code.C));
		answers.add(new Answer("Os Conselhos Seccionais dos estados X e Y terão poderes concorrentes para punir João disciplinarmente.", Code.D));
		
		Question question = new Question("O advogado João, inscrito na Seccional do estado X, cometeu grave infração ética ao atuar em "
				+ "determinada causa no estado Y. Assinale a opção que indica o Conselho Seccional com poder de punir disciplinarmente o "
				+ "advogado infrator.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ10(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("É possível manter o nome do sócio falecido, desde que prevista tal possibilidade no ato constitutivo da sociedade.", Code.A));
		answers.add(new Answer("É possível manter o nome do sócio falecido, independentemente de previsão no ato constitutivo da sociedade.", Code.B));
		answers.add(new Answer("É absolutamente vedada a manutenção do nome do sócio falecido na razão social da sociedade.", Code.C));
		answers.add(new Answer("É possível manter, pelo prazo máximo de seis meses, o nome do sócio falecido.", Code.D));
		
		Question question = new Question("Os advogados X de Souza, Y dos Santos e requereram o registro de sociedade de advogados denominada "
				+ "Souza, Santos e Andrade Sociedade de Advogados. Tempos depois, X de Souza vem a falecer, mas os demais sócios decidem "
				+ "manter na sociedade o nome do advogado falecido. Sobre a hipótese, assinale a afirmativa correta.", 
				answers, "", "Exame XV 2014.3 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ11(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("O advogado pode afastar-se do processo em que atua sem comunicação ao cliente.", Code.A));
		answers.add(new Answer("A renúncia deve ser notificada ao cliente pelos advogados mandatários.", Code.B));
		answers.add(new Answer("A renúncia aos poderes conferidos no mandato dependerá do cliente do escritório.", Code.C));
		answers.add(new Answer("A renúncia ao mandato, sem respeitar o prazo legal, implica abandono da causa.", Code.D));
		
		Question question = new Question("Matheus é estagiário vinculado ao escritório Renato e Associados. No exercício da sua atividade, por ordem do "
				+ "advogado supervisor, o estagiário acompanha o cliente diretor da sociedade Tamoaí S/A. Por motivos alheios à vontade do estagiário, "
				+ "que se disse inocente de qualquer deslize, o diretor veio a se desentender com Matheus, e, por força desse evento, o escritório resolve "
				+ "renunciar ao mandato conferido pela pessoa jurídica. Nos termos do Estatuto da Advocacia, sobre o caso descrito, assinale a afirmativa correta.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ12(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("constituem documentos públicos a servirem como prova em Juízo.", Code.A));
		answers.add(new Answer("são presumidas confidenciais, não podendo ser reveladas a terceiros.", Code.B));
		answers.add(new Answer("podem ser publicizadas, de acordo com a prudência do advogado.", Code.C));
		answers.add(new Answer("devem ser mantidas em sigilo até o perecimento do advogado.", Code.D));
		
		Question question = new Question("Andrea e Luciano trocam missivas intermitentes, cujo conteúdo diz respeito a processo judicial em que a primeira "
				+ "é autora, e o segundo, seu advogado. A parte contrária, ciente da troca de informações entre eles, requer ao Juízo que esses documentos "
				+ "sejam anexados aos autos do processo em que litigam. Sob a perspectiva do Código de Ética e Disciplina da Advocacia, as comunicações "
				+ "epistolares trocadas entre advogado e cliente",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ13(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("O magistrado decidiu corretamente, pois, de acordo com o EAOAB, é direito do advogado não ser recolhido preso, "
				+ "antes de sentença transitada em julgado, senão em sala de Estado-maior e, na sua falta, em prisão domiciliar.", Code.A));
		answers.add(new Answer("O magistrado não decidiu corretamente, pois o advogado, assim como qualquer outro cidadão que tenha concluído "
				+ "curso superior, tem direito a ser recolhido preso em prisão especial, mas não em sala de estado-maior, que apenas é garantida "
				+ "a magistrados e membros do Ministério Público.", Code.B));
		answers.add(new Answer("O magistrado decidiu corretamente, devendo o advogado permanecer em prisão domiciliar, mesmo havendo sala de "
				+ "Estado Maior, após eventual trânsito em julgado de sua condenação.", Code.C));
		answers.add(new Answer("O magistrado não decidiu corretamente, pois o advogado apenas tem direito a não ser recolhido preso, antes de "
				+ "sentença transitada em julgado, em sala de estado-maior e, na sua falta, em prisão domiciliar, quando o crime que lhe esteja "
				+ "sendo imputado decorra do exercício regular da profissão de advogado.", Code.D));
		
		Question question = new Question("O advogado Antônio de Souza encontra-se preso cautelarmente, em cela comum, por força de decreto de prisão preventiva "
				+ "proferido no âmbito de ação penal a que responde por suposta prática de reiteradas fraudes contra a Previdência. O advogado de Antônio "
				+ "requereu ao magistrado que decretou a prisão a transferência de seu cliente para sala de estado-maior. Como não havia sala de estado-maior "
				+ "disponível na localidade, o magistrado determinou que Antônio deveria permanecer em prisão domiciliar até que houvesse sala de estado-maior "
				+ "disponível. Sobre a decisão do magistrado, assinale a opção correta.",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ14(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Maria não deve ser punida porque, ao tempo em que os fatos foram levados ao conhecimento da OAB, ela já não mais "
				+ "exercia cargo incompatível com a advocacia.", Code.A));
		answers.add(new Answer("Maria não deve ser punida porque o cargo de Oficial de Justiça não é incompatível com o exercício da advocacia, não "
				+ "tendo Maria, portanto, feito prova falsa de requisito para inscrição na OAB.", Code.B));
		answers.add(new Answer("Maria deve ser punida com a pena de suspensão, pelo prazo de trinta dias.", Code.C));
		answers.add(new Answer("Maria deve ser punida com a pena de exclusão dos quadros da OAB.", Code.D));
		
		Question question = new Question("Ao requerer sua inscrição nos quadros da OAB, Maria assinou e apresentou declaração em que afirmava não exercer cargo "
				+ "incompatível com a advocacia. No entanto, exercia ela ainda o cargo de Oficial de Justiça no Tribunal de Justiça do seu Estado. Pouco tempo "
				+ "depois, já bem sucedida como advogada, pediu exoneração do referido cargo. No entanto, um desafeto seu, tendo descoberto que Maria, ao ingressar "
				+ "nos quadros da OAB, ainda exercia o cargo de Oficial de Justiça, comunicou o fato à entidade, que abriu processo disciplinar para apuração da "
				+ "conduta de Maria, tendo ela sido punida por ter feito falsa prova de um dos requisitos para a inscrição na OAB. De acordo com o EAOAB, assinale "
				+ "a opção que indica a penalidade que deve ser aplicada a Maria.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ15(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		
		answers.add(new Answer("A prefeita exerce função incompatível com a advocacia.", Code.A));
		answers.add(new Answer("O secretário municipal pode atuar em ações contra o município.", Code.B));
		answers.add(new Answer("A prefeita deve pedir autorização para exercer a advocacia.", Code.C));
		answers.add(new Answer("O secretário municipal pode atuar em pleitos contra o Estado federado.", Code.D));
		
		Question question = new Question("Cláudia, advogada, inicialmente transitou pelo direito privado, com assunção de causas individuais e coletivas. Ao ser "
				+ "contratada por uma associação civil, deparou com questões mais pertinentes ao direito público e, por força disso, realizou novos estudos e contatou "
				+ "colegas mais experientes na matéria. Ao aprofundar suas relações jurídicas, também iniciou participação política na defesa de temas essenciais à "
				+ "cidadania. Por força disso, Cláudia foi eleita prefeita do município X em eleição bastante disputada, tendo vencido seu oponente, o também advogado "
				+ "Pradel, por apenas cem votos. Eleita e empossada, motivada pelo sentido conciliatório, convidou seu antigo oponente para ocupar cargo em comissão "
				+ "na Secretaria Municipal de Fazenda. A partir da hipótese apresentada, observadas as regras do Estatuto da OAB, assinale a opção correta.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ16(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Armando poderia se retirar do recinto, pois o advogado tem o direito de não aguardar por mais de trinta minutos para a "
				+ "realização de ato judicial.", Code.A));
		answers.add(new Answer("Armando não poderia se retirar do recinto, pois a autoridade que presidiria o ato judicial do qual Armando participaria "
				+ "estava presente.", Code.B));
		answers.add(new Answer("Armando não poderia se retirar do recinto, pois a prerrogativa por ele invocada não é válida para audiências criminais.", Code.C));
		answers.add(new Answer("Armando poderia se retirar do recinto, pois não deu causa ao atraso da audiência.", Code.D));
		
		Question question = new Question("Às 15h15, o advogado Armando aguardava, no corredor do fórum, o início de uma audiência criminal designada para as "
				+ "14h30. A primeira audiência do dia havia sido iniciada no horário correto, às 13h30, e a audiência da qual Armando participaria era a segunda "
				+ "da pauta daquela data. Armando é avisado por um serventuário de que a primeira audiência havia sido interrompida por uma hora para que o "
				+ "acusado, que não se sentira bem, recebesse atendimento médico, e que, por tal motivo, todas as demais audiências do dia seriam iniciadas "
				+ "com atraso. Mesmo assim, Armando informa ao serventuário que não iria aguardar mais, afirmando que, de acordo com o EAOAB, tem direito, após "
				+ "trinta minutos do horário designado, a se retirar do recinto onde se encontre aguardando pregão para ato judicial. A partir do caso apresentado, "
				+ "assinale a opção correta.",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ17(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Marcos teve sua prerrogativa profissional violada, pois é direito do advogado e do estagiário inscrito na OAB dirigir-se "
				+ "diretamente ao magistrado nas salas e gabinetes de trabalho, independentemente de horário previamente marcado, observando-se a "
				+ "ordem de chegada.", Code.A));
		answers.add(new Answer("Marcos não teve sua prerrogativa profissional violada, pois apenas deve dirigir-se diretamente ao magistrado quando os "
				+ "advogados que atuam na causa estiverem impossibilitados de fazê-lo, sendo a atuação do estagiário subsidiária em relação à atuação "
				+ "do advogado.", Code.B));
		answers.add(new Answer("Marcos não teve sua prerrogativa profissional violada, pois apenas o advogado tem direito de dirigir-se diretamente ao "
				+ "magistrado nas salas e gabinetes de trabalho, independentemente de horário previamente marcado, observando-se a ordem de chegada. Ao "
				+ "contrário, Marcos praticou ato excedente à sua habilitação e, em razão disso, ficará impedido, posteriormente, de obter sua inscrição "
				+ "definitiva como advogado.", Code.C));
		answers.add(new Answer("Marcos não teve sua prerrogativa profissional violada, pois apenas o advogado tem direito de dirigir-se diretamente ao "
				+ "magistrado nas salas e gabinetes de trabalho, independentemente de horário previamente marcado, observando-se a ordem de chegada. Ao "
				+ "contrário, Marcos praticou ato excedente à sua habilitação e deve ser punido com pena de censura.", Code.D));
		
		Question question = new Question("O estagiário Marcos trabalha em determinado escritório de advocacia e participou ativamente da elaboração de determinada "
				+ "peça processual que estava para ser analisada pelo magistrado da Vara em que o processo tramitava, assinando, ao final, a petição, em conjunto "
				+ "com alguns advogados do escritório. Como conhecia muito bem a causa, resolveu falar com o magistrado com o objetivo de ressaltar, de viva voz, "
				+ "alguns detalhes relevantes. Quando o magistrado percebeu que estava recebendo o estagiário do escritório, e não um dos advogados que atuava na "
				+ "causa, informou ao estagiário que não poderia tratar com ele sobre o processo, solicitando que os advogados viessem em seu lugar, se entendessem "
				+ "necessário. Marcos, muito aborrecido, afirmou que faria uma representação contra o magistrado, por entender que suas prerrogativas profissionais "
				+ "foram violadas. A respeito da conduta de Marcos, assinale a opção correta.",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ18(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A advogada deve aceitar a imposição do cliente por ser inerente ao mandato.", Code.A));
		answers.add(new Answer("A advogada deve aceitar a indicação de um advogado para atuar conjuntamente no processo.", Code.B));
		answers.add(new Answer("A advogada deve acolher o comando, por ser natural na vida forense a colaboração.", Code.C));
		answers.add(new Answer("A advogada não é obrigada a aceitar a imposição de seu cliente no caso.", Code.D));
		
		Question question = new Question("Mara é advogada atuante, tendo especialização na área cível. Procurada por um cliente da área empresarial, ela"
				+ " aceita o mandato. Ocorre que seu cliente possui, em sua empresa, um departamento jurídico com numerosos advogados e um gerente. Por "
				+ "indicação deles, o cliente determina que Mara inclua, no mandato que lhe foi conferido, os advogados da empresa, para atuação conjunta. "
				+ "Com base no caso apresentado, observadas as regras do Estatuto da OAB e do Código de Ética e Disciplina da OAB, assinale a opção correta.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ19(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Ana terá o dever de depor, pois o bem jurídico administração da justiça é mais relevante do que o bem jurídico inviolabilidade "
				+ "dos segredos.", Code.A));
		answers.add(new Answer("Ana terá o dever de depor, pois foi desobrigada por seu excliente do dever de guardar sigilo sobre os fatos de que tomou "
				+ "conhecimento quando atuou como advogada da XYZ Ltda.", Code.B));
		answers.add(new Answer("Ana terá o dever de depor, pois não integra mais o departamento jurídico da empresa XYZ Ltda., tendo cessado, portanto, seu "
				+ "dever de guardar sigilo.", Code.C));
		answers.add(new Answer("Ana não terá o dever de depor, pois o advogado tem o direito de se recusar a depor, como testemunha, sobre fato relacionado à "
				+ "pessoa de quem foi ou seja advogado, mesmo quando solicitado pelo cliente.", Code.D));
		
		Question question = new Question("A advogada Ana integrou o departamento jurídico da empresa XYZ Ltda. e, portanto, participava de reuniões internas, com "
				+ "sócios e diretores, e externas, com clientes e fornecedores, tendo acesso a todos os documentos da sociedade, inclusive aos de natureza contábil, "
				+ "conhecendo assim, diversos fatos e informações relevantes sobre a empresa. Alguns anos após ter deixado os quadros da XYZ Ltda., Ana recebeu "
				+ "intimação para comparecer a determinada audiência e a prestar depoimento, como testemunha arrolada pela defesa, no âmbito de ação penal em que um "
				+ "dos sócios da empresa figurava como acusado do crime de sonegação fiscal. Ao comparecer à audiência, Ana afirmou que não prestaria depoimento sobre "
				+ "os fatos dos quais tomou conhecimento enquanto integrava o jurídico da XYZ Ltda. O magistrado que presidia o ato ressaltou que seu depoimento havia "
				+ "sido solicitado pelo próprio sócio da empresa, que a estaria, portanto, desobrigando do dever de guardar sigilo. Sobre a questão apresentada, "
				+ "observadas as regras do Estatuto da OAB e do Código de Ética e Disciplina da OAB, assinale a opção correta.", 
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ20(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Sim. Considera-se imoderado qualquer anúncio profissional mediante remessa de correspondência a uma coletividade.", Code.A));
		answers.add(new Answer("Sim. Ao advogado é vedado o envio de correspondência a clientes, salvo para tratar de temas que sejam de "
				+ "interesse desses últimos.", Code.B));
		answers.add(new Answer("Não. Armando poderia ter enviado a correspondência em questão, pois estava apenas comunicando a alteração de "
				+ "seu endereço.", Code.C));
		answers.add(new Answer("Não. A publicidade por meio de correspondência é permitida em qualquer caso e para comunicar qualquer tipo de "
				+ "informação.", Code.D));
		
		Question question = new Question("O advogado Armando alterou o endereço de seu escritório e, para comunicar tal alteração, enviou correspondência a "
				+ "grande número de pessoas, notadamente, seus clientes e outros advogados. Observadas as regras do Estatuto da OAB e do Código de Ética e "
				+ "Disciplina da OAB, Armando realizou publicidade irregular?",
				answers, "", "Exame XIV 2014.2 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ21(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("prescindir do conhecimento do cliente por ser ato privativo.", Code.A));
		answers.add(new Answer("ser comunicado ao cliente de modo inequívoco.", Code.B));
		answers.add(new Answer("ser realizado por tempo determinado.", Code.C));
		answers.add(new Answer("implicar na devolução dos honorários pagos antecipadamente pelo cliente.", Code.D));
		
		Question question = new Question("O advogado Carlos pretende substabelecer os poderes que lhe foram conferidos pelo seu cliente Eduardo, sem reserva de "
				+ "poderes, pois pretende realizar uma longa viagem, sem saber a data do retorno, não pretendendo manter compromissos profissionais. Nos termos "
				+ "das normas do Código de Ética, tal ato deve",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ22(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Prescreve em dois anos a ação de cobrança de honorários de advogado, contando-se o prazo do vencimento do contrato, "
				+ "se houver.", Code.A));
		answers.add(new Answer("Prescreve em cinco anos a ação de cobrança de honorários de advogado, contando-se o prazo do trânsito em julgado da "
				+ "decisão que os fixar.", Code.B));
		answers.add(new Answer("Prescreve em dois anos a ação de cobrança de honorários de advogado, contando-se o prazo da ultimação do serviço "
				+ "extrajudicial.", Code.C));
		answers.add(new Answer("Prescreve em cinco anos a ação de cobrança de honorários de advogado, contando-se o prazo da decisão que os fixar, "
				+ "independentemente do seu trânsito em julgado.", Code.D));
		
		Question question = new Question("Sobre o prazo para ajuizamento de ação de cobrança de honorários de advogado, assinale a opção correta.",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ23(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("José tem direito a receber a integralidade dos honorários contratuais e de sucumbência, como se tivesse atuado na "
				+ "causa até o final, uma vez que foi substituído por vontade da cliente e não sua.", Code.A));
		answers.add(new Answer("José não tem direito a receber honorários, porque não atuou na causa até o seu fim.", Code.B));
		answers.add(new Answer("José tem direito a receber honorários contratuais, mas não tem direito a receber honorários de sucumbência.", Code.C));
		answers.add(new Answer("José tem direito a receber honorários contratuais, bem como honorários de sucumbência, calculados proporcionalmente, "
				+ "em face do serviço efetivamente prestado.", Code.D));
		
		Question question = new Question("Maria, após vários anos de tramitação de ação indenizatória em que figurava como autora, decidiu substituir José, "
				+ "advogado que até então atuava na causa, por João, amigo da família, que não cobraria honorários de nenhuma espécie de Maria. Ao final da "
				+ "ação, quando Maria finalmente recebeu os valores que lhe eram devidos, a título de indenização, foi procurada por José, que desejava receber "
				+ "honorários pelos serviços advocatícios prestados até o momento em que foi substituído. Sobre a hipótese sugerida, assinale a afirmativa correta.",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ24(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Conselho Seccional da OAB.", Code.A));
		answers.add(new Answer("Conselho Federal da OAB.", Code.B));
		answers.add(new Answer("Presidente do Conselho Federal da OAB.", Code.C));
		answers.add(new Answer("Presidente do Tribunal de Ética da OAB.", Code.D));
		
		Question question = new Question("Maria da Silva, advogada, apresenta requerimento ao Presidente da Seccional da OAB tendo o seu pleito sido indeferido. "
				+ "Nos termos do Estatuto da Advocacia, cabe recurso ao", 
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ25(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		
		answers.add(new Answer("à reunião com seu cliente, responsável pela empresa.", Code.A));
		answers.add(new Answer("desacompanhado, com procuração com poderes ad juditia.", Code.B));
		answers.add(new Answer("à reunião, com mandato outorgado com poderes especiais.", Code.C));
		answers.add(new Answer("ao local sem a presença do cliente e sem mandato.", Code.D));
		
		Question question = new Question("Agnaldo é advogado na área de Direito de Empresas, tendo como uma de suas clientes a sociedade Cobradora Eficiente "
				+ "Ltda., que consegue realizar os seus atos de cobrança com rara eficiência. Por força de sua atividade, a sociedade é convidada a participar de "
				+ "reunião com a Associação dos Consumidores Unidos e envia o seu advogado para dialogar com a referida instituição. Consoante o Estatuto da "
				+ "Advocacia, deve o advogado comparecer", 
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ26(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("vinte minutos do horário designado.", Code.A));
		answers.add(new Answer("trinta minutos do horário designado.", Code.B));
		answers.add(new Answer("quarenta minutos do horário designado.", Code.C));
		answers.add(new Answer("cinquenta minutos do horário designado.", Code.D));
		
		Question question = new Question("Abel, por força de suas atividades como advogado, comparece à audiência designada para ocorrer às 13 horas. Aguarda algum "
				+ "tempo, mas não recebe qualquer notícia do início dos trabalhos forenses. Nesse caso, consoante o Estatuto da Advocacia, protocolizando comunicação "
				+ "em juízo, pode retirar-se do recinto passados",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ27(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Compete ao Conselho Federal da OAB representar, em juízo ou fora dele, os interesses coletivos ou individuais "
				+ "dos advogados.", Code.A));
		answers.add(new Answer("Compete ao Conselho Federal da OAB editar seu regimento interno e o regimento interno das Seccionais da OAB.", Code.B));
		answers.add(new Answer("Compete ao Conselho Federal da OAB julgar, em grau de recurso, as questões decididas pelos Conselhos Seccionais, nos casos "
				+ "previstos no EAOAB e no regulamento geral.", Code.C));
		answers.add(new Answer("Compete ao Conselho Federal da OAB velar pela dignidade, independência, prerrogativas e valorização da advocacia.", Code.D));
		
		Question question = new Question("A respeito da competência do Conselho Federal da OAB, assinale a opção incorreta.",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ28(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("realizar propaganda, mesmo moderada, da sua atividade.", Code.A));
		answers.add(new Answer("ofertar serviços profissionais que impliquem exposição de clientela.", Code.B));
		answers.add(new Answer("apresentar o seu currículo profissional em público.", Code.C));
		answers.add(new Answer("distribuir cartões de visita com seu endereço profissional.", Code.D));
		
		Question question = new Question("A advogada Maria Vivian procura apresentar os seus serviços profissionais como de excelente qualidade, utilizando a "
				+ "estratégia aprendida em tempos em que atuava no teatro, quando finalizava a peça pedindo indicação aos amigos, se tivesse aprovado o espetáculo "
				+ "e, caso negativo, indicasse aos inimigos. A par disso, organiza um sistema sofisticado de divulgação de material de propaganda, informando o número "
				+ "de vitórias obtido em várias causas com temas próprios das causas de massa. Nos termos do Código de Ética da Advocacia, o advogado não pode", 
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ29(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Não. Juarez não pode aceitar a causa, pois está impedido de exercer a advocacia contra a Fazenda Pública que o "
				+ "remunera.", Code.A));
		answers.add(new Answer("Sim. Juarez poderá aceitar a causa, pois o impedimento de exercício da advocacia contra a Fazenda Pública que "
				+ "remunera os advogados que são servidores públicos não inclui a hipótese de docentes de cursos jurídicos.", Code.B));
		answers.add(new Answer("Sim. Juarez poderá aceitar a causa, pois não há nenhum tipo de impedimento para o exercício da advocacia por "
				+ "servidores públicos.", Code.C));
		answers.add(new Answer("Não. Juarez não poderá aceitar a causa, pois exerce o cargo de professor universitário, que é incompatível com o "
				+ "exercício da advocacia.", Code.D));
		
		Question question = new Question("Juarez da Silva, advogado, professor adjunto de Direito Administrativo em determinada Universidade Federal, foi procurado, "
				+ "na qualidade de advogado, por um grupo de funcionários públicos federais que desejavam ajuizar determinada ação contra a União. Pode Juarez aceitar "
				+ "a causa, advogando contra a União?",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
	
	private static Question createQ30(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Valdir não pode revelar o segredo que lhe foi confiado por André, pois o advogado deve sempre guardar sigilo sobre o "
				+ "que saiba em razão do seu ofício.", Code.A));
		answers.add(new Answer("Valdir poderia revelar o segredo que lhe foi confiado por André, mas apenas no caso de ser intimado como testemunha "
				+ "em ação penal eventualmente deflagrada para a apuração do homicídio que viesse a ser efetivamente praticado.", Code.B));
		answers.add(new Answer("Valdir pode revelar o segredo que lhe foi confiado por André, em razão de estar a vida da ex-esposa deste último "
				+ "em risco.", Code.C));
		answers.add(new Answer("Valdir não pode revelar o segredo que lhe foi confiado por André, mas tem obrigação legal de impedir que o homicídio "
				+ "seja praticado, sob pena de se tornar partícipe do crime.", Code.D));
		
		Question question = new Question("Valdir representa os interesses de André em ação de divórcio em que estão em discussão diversas questões relevantes, inclusive "
				+ "de cunho financeiro, como, por exemplo, o pensionamento e a partilha de bens. Irritado com as exigências de sua ex-esposa, André revela a Valdir que "
				+ "pretende contratar alguém para assassiná-la. Deve Valdir comunicar o segredo revelado por seu cliente às autoridades competentes?",
				answers, "", "Exame XIII 2014.1 - Tipo 1 Branca", correct);
		
		return question;
	}
}
