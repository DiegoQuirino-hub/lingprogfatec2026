    public class Main{
        public static void main(String[] args){
            float soma = 0;
            int condicao = 1;
            float nota;
            while (condicao <= 10){
                nota = (int) (Math.random()*10);
                System.out.println("Nota = " + nota);

                condicao++;
                soma = soma + nota;

            }
            System.out.println("Média = " + soma / 10);
    }
}