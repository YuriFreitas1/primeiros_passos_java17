
public class Main {
    public static void main(String[] args) {

        String filme = "Megamente";
        int anoDeLancamento = 2010;
        String sinopse = "Um vilão azul e com um grandiosa cabeça so usa ela para o mal";
        float nota = 7.6F;
        boolean disponivel = true;
        double mediaNota = (7.6 + 8 ) / 2 ;

        String disponibilidade;
        if (disponivel) {
            disponibilidade = "Disponivel";
        } else {
            disponibilidade = "Indisponivel";
        }
        String descricao = """
                Filme: %s
                Ano: %d
                Sinopse: %s
                Disponibilidade : %s
                Nota : %.2f
                """.formatted(filme,anoDeLancamento, sinopse, disponibilidade, nota);
        System.out.println(descricao);

        //System.out.println(String.format("Filme: %s. disponibilidade: %s. Nota: %.2f",filme,disponibilidade,nota ));
        //commit teste
    }}
