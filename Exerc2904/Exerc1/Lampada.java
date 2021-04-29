import java.util.Random;

public class Lampada{
    private String tipo; // criando variaveis do tipo privado, para ter acesso a ela
    private int tensao; // somente dentro da classe
    private int potencia;
    private boolean status;

    public Lampada(String tipo, int tensao, int potencia){
        // Construtor.
        // Esse construtor define os tipos de variaveis que serão OBRIGATORIAS
        // Quando alguém criar uma classe do tipo LAMPADA no metodo princiapl (main)
        // No caso do LAMPADA, sera obrigatorio definir um TIPO, TENSAO e POTENCIA

        setTipo(tipo);
        // definindo o valor da variavel TIPO usando o metodo set
        // também é possivel fazer "this.tipo = tipo", mas é exatamente
        // o que há no metodo set, então é melhor chamar ele do que reescrever
        setTensao(tensao); 
        setPotencia(potencia);

        // Aqui criei um Status aleatorio, entre verdadeiro ou falso (tipo boolean)
        // para dizer se minha lampada está ligada (true) ou desligada (false)
        Random random = new Random();
        setStatus(random.nextBoolean());
    }

    // metodo GET - é responsável por fazer retornar o valor da variavel
    // lembrando que é necessário ter um metodo para isso pois as variaveis
    // são privadas, exatamente para não chamarmos ela direto na main (por segurança)
    public String getTipo() {
		return tipo;
	}
    // metodo SET - é responsável por dar valor a váriavel
    // para que isso aconteça deve ser passado um parametro (valor)
    // então, caso eu queira dar um tipo para minha lampada, eu devo escrever:
    // "setTipo("tipo");", exatamente o que está sendo feito no construtor principal
    // usando como parametro o valor que o usuario usou quando criou a lampada, 
    // na main.
    public void setTipo(String tipo) {
		this.tipo = tipo; // tipo = "LED"
	}

    // getter/setter tensao
    public int getTensao() {
		return tensao;
	}
    public void setTensao(int tensao) {
		this.tensao = tensao;
	}

    // getter/setter tensao
    public int getPotencia() {
		return potencia;
	}
    public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

    // getter/setter tensao
    public boolean getStatus() {
		return status;
	}
    public void setStatus(boolean status) {
		this.status = status;
	}

    // O metodo toString é o modo padrão de chamar uma classe
    // por exemplo, quando eu quero mostrar ao usuario os valores de lampada
    // (tanto o tipo, como tensao, potencia e status), eu uso o metodo toString
    // assim, sempre que ele quiser ver TODOS os atributos, ele pode chamar esse
    // metodo. Já se ele quiser ver SOMENTE um dos atributos, por exemplo, só o tipo
    // ai ele vai usar o metodo getTipo;
    @Override
    public String toString(){
        return "Tipo: " + this.tipo + ", Tensao: " + this.tensao + ", Potencia: " + this.potencia + ", Status: " + this.status;
    }
    
    // Esse metodo é que a professora pediu no exercicio.
    // O status da lampada é feito aleatoriamente (como ela também pediu)
    // Então, caso apareça APAGADO, eu posso usar o metodo ACENDER para trocar
    // o status de FALSE (apagado) para TRUE, acesso, usando os IFs abaixo,
    // que verificam se STATUS é true (acesso) ou false (apagado), e se estiver
    // apagado, ele acende (trocando o valor de Status para TRUE);
    void acender(){
        if(status == true){
            System.out.print("A lampadas selecionada ja esta acessa");
        }
        else{ // status == false
            setStatus(true);
            System.out.print("A lampada selecionada foi acessa");
        }
    }

    // O metodo APAGAR (como a professora pediu) segue a mesma logica do ACENDER
    // Com IFs ele vai verificar se Status é true (acesso) ou false (apagado),
    // e se for acesso ele vai trocar STATUS para falso (apagar ele), já se o status
    // se estiver como apagado (false) ele não faz nada, até pq já está apagado.
    void apagar(){
        if(status == true){
            setStatus(false);
            System.out.print("A lampadas selecionada foi apagada");
        }
        else{ // status == false
            System.out.print("A lampada selecionada ja esta apagada");
        }
    }

    // Esse metodo é para verificar o status da lampada.
    // O IF verificará se o status é TRUE (e se for vai mostrar uma mensagem de 
    // acesso) ou FALSE (e se for vai mostrar uma mensagem de apagada)
    void verificarStatus(){
        if(status == true){
            System.out.println("A lampada selecionada esta acessa");
        }
        else{ // status == false
            System.out.println("A lampada selecionada esta apagada");
        }
    }
    
}