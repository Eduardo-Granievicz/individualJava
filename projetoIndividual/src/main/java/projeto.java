
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class projeto {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
         
        Boolean continuarPrograma = true;
        System.out.println(" -------------------------- ");
        System.out.println("| Seja bem vindo ao CS.NET | ");
        System.out.println(" -------------------------- ");
        do {         
        
        
        System.out.println("\nPor favor, digite um número de 1 a 4"
                         + "\n1 - Analisando inventário"
                         + "\n2 - Vendo quantidade de campeonatos"
                         + "\n3 - Sorteio de skins"
                         + "\n4 - Sair do programa");
        
        
        Integer numeroDigitado = leitor.nextInt();
        
           

            
        
        switch (numeroDigitado) {
                case 1:
                System.out.println("Quantas skins de AK-47 você tem?");
                Integer ak47 = leitor.nextInt();
                System.out.println("Quantas skins de AWP você tem?");
                Integer AWP = leitor.nextInt();
                System.out.println("Quantas skins de M4A4 você tem?");
                Integer M4A4 = leitor.nextInt();
                Integer total = (ak47 + AWP + M4A4);
                if(total == 0){
                System.out.println(String.format("Que isso, como você tem %d skins?"
                                               + "\nEstá precisando adquirir algumas!", total));                
                }
                else if (total >= 1 && total <= 4){
                System.out.println(String.format("%d é um número pouco de skins, mas com o tempo você"
                                               + "\nvai adquirindo mais!", total));
                }
                else if (total >= 5 && total <= 9){
                System.out.println(String.format("Caramba! Com essa quantidade de %d skins"
                                               + "\njá está se tornando um inventário legal!", total));
                }
                else{
                System.out.println(String.format("Meu Deus, você tem o invetário"
                                               + "\ndos sonhos de qualquer jogador"
                                               + "\ncom esse número de %d skins!", total));
} 
                break;

                case 2:
                System.out.println("Você já foi para quantos campeonatos de CSGO?");
                Integer camps = leitor.nextInt();                
                if (camps == 0){
                System.out.println("Que isso, esta precisando juntar um dinheiro em");
                }
                else if (camps > 0 && camps <= 3){
                System.out.println("Já é alguma coisa, está virando um grande torcedor");
                }
                else if (camps >= 4 && camps <= 7){
                System.out.println("Oloco, está ficando viciado em");
                }
                else{
                System.out.println("Me passe essa formula do dinheiro urgentemente!!!");
                }
                break;


                case 3:
                System.out.println("Bem vindo a roleta, vamos testar sua sorte!");
                Integer sorte = ThreadLocalRandom.current().nextInt(1, 11);
                System.out.println("Insira um número de 1 a 10");
                Integer numeroSorteio = leitor.nextInt();
                
                if (numeroSorteio > 0 && numeroSorteio <= 10){
                System.out.println(String.format("Número sorteado foi o %d", sorte));
                }
                if (sorte == numeroSorteio){
                System.out.println("Parabéns! Você ganhou uma skin muito valiosa");
                }
                if (sorte != numeroSorteio) {
                System.out.println("Não foi dessa vez! Tente novamente");
                }    
                break;


                case 4:
                System.out.println("Obrigado pela a atenção, volte sempre!");
                continuarPrograma = false;
                break;

                default:
                System.out.println("Selecione um número válido!");

                
                
               
               
               
                }
              } while (continuarPrograma);
             }
            }
