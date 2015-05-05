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
		answers.add(new Answer("O afastamento temporário do cargo afastamento temporário do cargo que gera a incompatibilidade "
				+ "permite inscrição provisória.", Code.B));
		answers.add(new Answer("A incompatibilidade permanece mesmo que ocorra o afastamento temporário do cargo.", Code.C));
		answers.add(new Answer("O afastamento do cargo incompatível permite a inscrição após um período de três anos.", Code.D));
		
		Question question = new Question("Abelardo é magistrado vinculado ao Tribunal de Justiça do Estado K e requer licença "
				+ "para tratamento de questões particulares, pelo prazo de três anos, o que foi deferido. Como, antes de assumir o "
				+ "referido cargo, era advogado regularmente inscrito nos quadros da OAB, requer o seu reingresso, comprovando o "
				+ "afastamento das funções judicantes. Nos termos do Estatuto da Advocacia, assinale a afirmativa correta.", 
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
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
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ11(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Age de tal maneira que uses a humanidade, tanto na tua pessoa como na pessoa de qualquer outro, "
				+ "sempre e simultaneamente como fim, e nunca como meio.", Code.A));
		answers.add(new Answer("Age exteriormente, de modo que o livre uso de teu arbítrio possa se conciliar com a liberdade de "
				+ "todos, segundo uma lei universal.", Code.B));
		answers.add(new Answer("Age como se a máxima de tua ação se devesse tornar, pela tua vontade, lei universal da natureza.", Code.C));
		answers.add(new Answer("Age de forma que conserves sempre a tua liberdade, ainda que tenhas de resistir à liberdade alheia.", Code.D));
		
		Question question = new Question("Na Doutrina do Direito, Kant busca um conceito puramente racional e que possa explicar o "
				+ "direito independentemente da configuração específica de cada legislação. Mais precisamente, seria o direito entendido "
				+ "como expressão de uma razão pura prática, capaz de orientar a faculdade de agir de qualquer ser racional. Assinale a "
				+ "opção que contém, segundo Kant, essa lei universal do direito.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ12(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("a lei não deve ser interpretada segundo a razão e os critérios valorativos daquele que deve aplicá-la, mas, "
				+ "ao contrário, este deve submeter-se completamente à razão expressa na própria lei.", Code.A));
		answers.add(new Answer("o legislador é onipotente porque é representante democraticamente eleito pela população, e esse processo "
				+ "representativo deve basear-se sempre no direito consuetudinário, porque este expressa o verdadeiro espírito do povo.", Code.B));
		answers.add(new Answer("uma vez promulgada a lei pelo legislador, o estado-juiz é competente para interpretá-la buscando aproximar a "
				+ "letra da lei dos valores sociais e das demandas populares legítimas.", Code.C));
		answers.add(new Answer("a única força jurídica legitimamente superior ao legislador é o direito natural; portanto, o legislador é "
				+ "soberano para tomar suas decisões, desde que não violem os princípios do direito natural.", Code.D));
		
		Question question = new Question("Ao explicar as características fundamentais da Escola da Exegese, o jusfilósofo italiano Norberto "
				+ "Bobbio afirma que tal Escola foi marcada por uma concepção rigidamente estatal de direito. Como consequência disso, "
				+ "temos o princípio da onipotência do legislador. Segundo Bobbio, a Escola da Exegese nos leva a concluir que",
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ13(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A perda do mandato do referido senador será decidida pelo Senado Federal, por maioria absoluta, mediante "
				+ "provocação da respectiva mesa ou de partido político representado no Congresso Nacional, assegurada a ampla defesa.", Code.A));
		answers.add(new Answer("Não poderá o referido parlamentar perder o mandato, já que o afastamento não ultrapassou cento e oitenta dias "
				+ "dentro da mesma sessão legislativa.", Code.B));
		answers.add(new Answer("A perda do mandato do referido senador poderá ser declarada pela Mesa da Casa Legislativa de ofício ou "
				+ "mediante provocação de qualquer dos seus membros, ou de partido político representado no Congresso Nacional, assegurada "
				+ "a ampla defesa.", Code.C));
		answers.add(new Answer("Caso o referido senador venha a renunciar após submetido ao processo que vise ou possa levar à perda do "
				+ "seu mandato, haverá o arquivamento do processo pela perda do seu objeto.", Code.D));
		
		Question question = new Question("O senador 'X' ausentou-se das atividades do Senado Federal para tratar de assunto de interesse "
				+ "particular por cento e cinquenta dias ininterruptos e, diante desse fato, enfrenta representação para a perda do seu "
				+ "mandato, por não ter comparecido à terça parte das sessões ordinárias da Casa, que foram realizadas no período em que "
				+ "esteve ausente. Nessa hipótese, assinale a alternativa correta.",
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ14(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("É vedada a edição da Medida Provisória, pois a matéria já havia sido disciplinada em projeto "
				+ "de lei aprovado pelo Congresso Nacional e pendente de sanção ou veto pelo Presidente da República.", Code.A));
		answers.add(new Answer("A Medida Provisória narrada na questão não poderia ser editada, visto que é vedado pela Constituição "
				+ "Federal dispor sobre matéria orçamentária por meio dessa espécie legislativa.", Code.B));
		answers.add(new Answer("A Medida Provisória é juridicamente viável, mas, se não for apreciada em até sessenta dias contados "
				+ "da sua publicação, entrará em regime de urgência, subsequentemente, em cada uma das Casas, ficando sobrestadas "
				+ "todas as demais deliberações legislativas da Casas em que estiver tramitando, até que se ultime a votação.", Code.C));
		answers.add(new Answer("A Medida Provisória é juridicamente viável e prorrogar á por duas vezes, por igual período, a sua vigência "
				+ "se, no prazo de 45 dias contados de sua publicação, não tiver a sua votação encerrada nas duas Casas do "
				+ "Congresso Nacional.", Code.D));
		
		Question question = new Question("O Presidente da República edita Medida Provisória que dispõe sobre a injeção extraordinária "
				+ "de verbas para o Fundo de Financiamento Estudantil (FIES). O tema, porém, já havia sido objeto de projeto de lei "
				+ "anteriormente aprovado pelo Congresso Nacional e remetido ao próprio Presidente da República para sanção. Nessa linha, "
				+ "observado o regramento estabelecido pela Constituição Federal, assinale a afirmativa correta.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ15(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		
		answers.add(new Answer("o interessado que tenha tido a repercussão geral de seu recurso extraordinário reconhecida pelo STF.", Code.A));
		answers.add(new Answer("a seccional da Ordem dos Advogados do Brasil de qualquer estado da Federação.", Code.B));
		answers.add(new Answer("a Mesa de Câmara dos Vereadores de município que tenha interesse direto na súmula.", Code.C));
		answers.add(new Answer("o Partido Político com representação no Congresso Nacional.", Code.D));
		
		Question question = new Question("O Supremo Tribunal Federal editou súmula com efeito vinculante. Pedro, advogado, deseja pleitear "
				+ "o cancelamento da referida súmula. Nos termos da Constituição Federal, considerando a legitimação para propor aprovação "
				+ "ou cancelamento de súmula junto ao Supremo Tribunal Federal, Pedro poderá provocar o seguinte legitimado:", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ16(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("constitucional, por tratar de proteção de direito fundamental.", Code.A));
		answers.add(new Answer("inconstitucional, por tratar de matéria de competência privativa da União.", Code.B));
		answers.add(new Answer("inconstitucional, por vício formal relacionado ao quórum mínimo para votação.", Code.C));
		answers.add(new Answer("constitucional, por tratar de assunto de interesse local e ter sido aprovada por "
				+ "processo legislativo idôneo.", Code.D));
		
		Question question = new Question("No município de São José dos Cavaleiros, 87% dos atendimentos médicos nas emergências "
				+ "hospitalares são decorrências de acidentes automobilísticos ocasionados pelo consumo de bebidas alcoólicas. "
				+ "Uma vereadora do município, Sra. X, ciente das estatísticas expostas, apresenta projeto de lei propondo que os "
				+ "cidadãos proprietários de veículos automotores, residentes no município, municiem seus veículos com equipamento "
				+ "que impeça a partida do carro no caso de o condutor ter consumido álcool. A Câmara Municipal, por voto de 2/3 "
				+ "dos vereadores, aprova a lei. Esta legislação deve ser considerada",
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ17(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Juan, cidadão espanhol, casado com Beatriz, brasileira, ambos residentes em Barcelona.", Code.A));
		answers.add(new Answer("Anderson, cidadão português, domiciliado no Brasil há 360 dias.", Code.B));
		answers.add(new Answer("Louis, cidadão francês, domiciliado em Brasília há 14 anos, que está em liberdade condicional, "
				+ "após condenação pelo crime de exploração sexual de vulnerável.", Code.C));
		answers.add(new Answer("Maria, 45 anos, cidadã russa, residente e domiciliada no Brasil desde seus 25 anos de idade, "
				+ "processada criminalmente por injúria, mas absolvida por sentença transitada em julgado.", Code.D));
		
		Question question = new Question("A CRFB/88 identifica as hipóteses de caracterização da nacionalidade para brasileiros natos e "
				+ "os brasileiros naturalizados. Com base no previsto na Constituição, assinale a alternativa que indica um caso "
				+ "constitucionalmente válido de naturalização requerida para obtenção de nacionalidade brasileira.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ18(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("A lei não pode retroagir, porque a situação versa sobre direitos indisponíveis de Pedro.", Code.A));
		answers.add(new Answer("A lei não pode retroagir para prejudicar a coisa julgada formada em favor de Pedro.", Code.B));
		answers.add(new Answer("A lei pode retroagir, pois não há direito adquirido de Pedro diante de nova legislação.", Code.C));
		answers.add(new Answer("A lei pode retroagir, porque não há ato jurídico perfeito em favor de Pedro diante de pagamentos "
				+ "pendentes.", Code.D));
		
		Question question = new Question("Pedro promoveu ação em face da União Federal e seu pedido foi julgado procedente, com efeitos "
				+ "patrimoniais vencidos e vincendos, não havendo mais recurso a ser interposto. Posteriormente, o Congresso Nacional aprovou "
				+ "lei, que foi sancionada, extinguindo o direito reconhecido a Pedro. Após a publicação da referida lei, a Administração "
				+ "Pública federal notificou Pedro para devolver os valores recebidos, comunicando que não mais ocorreriam os pagamentos "
				+ "futuros, em decorrência da norma em foco. Nos termos da Constituição Federal, assinale a opção correta.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ19(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Ao Conselho de Defesa Nacional compete opinar sobre a decretação do estado de defesa, do estado de "
				+ "sítio e da intervenção federal. Ao Conselho Nacional de Justiça compete o controle da atuação administrativa e "
				+ "financeira do Poder Judiciário, do Poder Legislativo e do Poder Executivo.", Code.A));
		answers.add(new Answer("Ao Conselho de Defesa Nacional compete opinar sobre as questões relevantes para a estabilidade das "
				+ "instituições democráticas. Ao Conselho da República compete opinar sobre as hipóteses de declaração de guerra "
				+ "e de celebração de paz.", Code.B));
		answers.add(new Answer("Ao Conselho Nacional de Justiça compete o controle da atuação administrativa e financeira do Poder "
				+ "Judiciário, do Poder Legislativo e do Poder Executivo. Ao Conselho da República compete opinar sobre as hipóteses "
				+ "de declaração de guerra e de celebração de paz.", Code.C));
		answers.add(new Answer("Ao Conselho de Defesa Nacional compete opinar sobre as hipóteses de declaração de guerra e de celebração "
				+ "de paz. Ao Conselho da República compete pronunciar-se sobre intervenção federal, estado de defesa e estado de "
				+ "sítio.", Code.D));
		
		Question question = new Question("O Presidente da República, à luz da CRFB/88, dispõe de dois órgãos de cúpula para consulta em "
				+ "determinados assuntos. Assinale a opção que elenca corretamente esses órgãos e suas atribuições constitucionalmente definidas.", 
				answers, "", "", correct);
		
		return question;
	}
	
	private static Question createQ20(Code correct) {
		ArrayList<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer("Sistema de visitas regulares de seus membros.", Code.A));
		answers.add(new Answer("Mutirões judiciais.", Code.B));
		answers.add(new Answer("Medidas legislativas de parlamentares que integrem o Mecanismo.", Code.C));
		answers.add(new Answer("Criação e fortalecimento de defensorias públicas.", Code.D));
		
		Question question = new Question("Como forma de evitar a ocorrência de violação de Direitos Humanos em estabelecimentos prisionais, "
				+ "o Brasil ratificou, em 2007, o Protocolo Facultativo à Convenção contra a tortura e outros tratamentos ou penas cruéis, "
				+ "desumanos ou degradantes. Tal protocolo estabelece que cada Estado-Parte deverá designar ou manter, em nível doméstico, "
				+ "um ou mais mecanismos preventivos nacionais. Por meio da Lei nº 12.847/13, o Brasil pretendeu atender à exigência do "
				+ "Protocolo, ao criar o Mecanismo Nacional de Prevenção e Combate à Tortura. Quanto ao meio proposto tanto pelo Protocolo "
				+ "quanto pela Lei para alcançar a finalidade almejada, assinale a afirmativa correta.", 
				answers, "", "", correct);
		
		return question;
	}
}
