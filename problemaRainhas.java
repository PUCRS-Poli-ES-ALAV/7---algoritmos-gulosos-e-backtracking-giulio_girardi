
public class problemaRainhas{

    private static int[][] tabuleiro = new int[7][7];

    public static void main(String args[]){
        
        populaTabuleiro(tabuleiro);

    }

    public static void primeiraJogada(int linha, int coluna){

    

    }


    public static void populaTabuleiro(int[][] tabuleiro){
        int count=1;

        for(int i=0; i<7; i++){
            System.out.println("\n");
            for(int j=0; j<7; j++){
                tabuleiro[i][j] = count;
                System.out.print("[" + tabuleiro[i][j]+ "]");
                count++;
            }
        }
    }
}