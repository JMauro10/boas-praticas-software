public class Sistema {
    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double primeiraNota = 8;
        double segundaNota = 7;


//        System.out.println("Aluno: " + nomeAluno);
//        System.out.println("Media: " + mediaAluno);
//
//        if (mediaAluno >= 6){
//            System.out.println("Aprovado");
//        }else {
//            System.out.println("Reprovado");
//        }

    }

    public static double calcularMedia(double primeiraNota, double segundaNota) {
         Double mediaAluno = (primeiraNota + segundaNota)/2;
        return mediaAluno;
    }

    public static String situacaoAluno(double mediaAluno) {
        if (mediaAluno >= 6){
            return "Aprovado";
        }else {
            return "Reprovado";
        }

    }

    public static void exibirResultados(String nomeAluno, double mediaAluno, String situacaoAluno) {
        System.out.println("Nome Aluno: " + nomeAluno);
        System.out.println("Média: " + mediaAluno);
        System.out.println(situacaoAluno);
    }
}
