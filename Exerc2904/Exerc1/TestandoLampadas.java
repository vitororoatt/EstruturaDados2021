public class TestandoLampadas {

    public static void main(String[] args) {
        // As linhas abaixo criam lampadas (lamp1, lamp2 e lamp3) usando a
        // classe Lampada. Sendo assim, cada uma dessas 3 lampadas vai herdar todos
        // metodos e atributos (variaveis privadas) da classe Lampada
        Lampada lamp1 = new Lampada("Led", 110, 10);
        Lampada lamp2 = new Lampada("Fluorescente", 220, 40);
        Lampada lamp3 = new Lampada("Fria", 110, 20);
        // Lembrete: eu preciso, por padrão, criar a lampada e colocar os três
        // atributos, igual eu coloquei acima (exeplo: ("Fria", 110, 20)), pois
        // quando eu criei a classe Lampada eu fiz o construtor com 3 parametros
        // obrigando você a passar esses parametros quando cria as lampadas.
        // Caso eu não tivesse criado aquele construtor eu conseguiria criar uma
        // lampada vazia, sem tipo, sem potencia, sem tensão e sem status
        // para definir essas coisas posteriormente, usando os metodos set.

        System.out.println("True = Ligada / False = Desligada");
        // Nesses System.out estou mostrando só a classe.
        // Quando eu faço isso, sem colocar nenhum metodo na frente, ele por padrão
        // usa o metodo "toString", que no caso da classe Lampada é aquele que
        // definimos para mostrar TODAS as váriaveis.
        System.out.println(lamp1);
        System.out.println(lamp2);
        System.out.println(lamp3);
    }
}