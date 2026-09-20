public class Problema7 {
    public static void main(String[] args) {
        int[][] mat={{0,1,1,0,0},{1,0,1,1,0},{1,1,0,0,0},{0,1,0,0,1},{0,0,0,1,0}};
        int unos=0;
        System.out.println("PROBLEMA 7 - MATRIZ DE CONECTIVIDAD");
        for(int i=0;i<mat.length;i++){
            System.out.print("Computador "+(i+1)+" conectado con: ");
            boolean conectado=false;
            for(int j=0;j<mat[i].length;j++) if(mat[i][j]==1){System.out.print((j+1)+" "); conectado=true; unos++;}
            if(!conectado) System.out.print("ninguno");
            System.out.println();
        }
        System.out.println("Total de conexiones: "+(unos/2));
        boolean simetrica=true;
        for(int i=0;i<mat.length;i++) for(int j=0;j<mat.length;j++)
            if(mat[i][j]!=mat[j][i]) simetrica=false;
        System.out.println("La matriz es simetrica: "+simetrica);
    }
}