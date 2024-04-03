public class App {
    public void emitirboleto(){
        Boleto variavelBoleto = new Boleto(); //Criando o objeto variavelBoleto

        variavelBoleto.valor = 1000;
        variavelBoleto.vencimento = "Hoje";
        variavelBoleto.codigoDeBarra = "212132334";

        variavelBoleto.emitirboleto(variavelBoleto); //Enviando a variavelBoleto para o método emitirboleto da classe boleto

    }
}


/* Entidades que dividem responsabilidades do código entre si (Respomsabilidade é algo subjetivo)
 * As entidades são chamadas de CLASSES
 * Geralmente as responsabilidades são diferenciadas por ações
 * Cada classe é um arquivo .java diferente
 * Os nomes das classes têm que armazenar o tema e as ações devem estar nos nomes dos métodos
 * Ação = Método, Abstração/Tema/Tópico = Classes , Objeto = Indivíduo específico de uma classe (Um objeto específico de uma classe)
 * Objetos são indivíduos, instâncias de classe, as quais armazenam os objetos
*/
