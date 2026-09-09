public class Sistema {
    public static double calcularMedia(double primeiraNota, double segundaNota) {
        double mediaAluno = (primeiraNota + segundaNota) / 2;
        return mediaAluno;
    }

    public static String verificarSituacao(double mediaAluno) {
        if (mediaAluno >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void exibirResultados(String nomeAluno, double mediaAluno, String situacaoAluno) {
        System.out.println("Nome Aluno: " + nomeAluno);
        System.out.println("Média: " + mediaAluno);
        System.out.println("Situação: " + situacaoAluno);
    }

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double primeiraNota = 8;
        double segundaNota = 7;

        double media = calcularMedia(primeiraNota, segundaNota);
        String situacao = verificarSituacao(media);

        exibirResultados(nomeAluno, media, situacao);
    }
}