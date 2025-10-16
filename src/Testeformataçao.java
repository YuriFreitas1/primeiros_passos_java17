public class Testeformataçao {
    public static void main(String[] args) {

        String filme = "Megamente";
        String sinopse = "Um vilão azul e com um grandiosa cabeça so usa ela para o mal";
        float nota = 7.6F;
        boolean disponivel = false;

        String disponibilidade;
        if (disponivel) {
            disponibilidade = "Disponivel";
        } else {
            disponibilidade = "Indisponivel";
        }
        String descricao = """
                Filme: %s
                Sinopse: %s
                Disponibilidade : %s
                Nota : %.2f
                """.formatted(filme, sinopse, disponivel, nota);
        System.out.println(descricao);
        //System.out.println(String.format("Filme: %s. disponibilidade: %s. Nota: %.2f",filme,disponibilidade,nota ));
        //commit teste
    }
}
