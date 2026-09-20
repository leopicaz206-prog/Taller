public class Problema5 {
    public static void main(String[] args) {
        double[][] notas={{4.0,3.5,4.2},{3.0,2.8,3.5},{4.5,4.2,4.8},{2.5,3.0,2.8},{3.8,4.0,3.9},{4.2,3.7,4.5},{3.2,3.5,3.0},{4.8,4.5,4.7},{2.9,2.7,3.1},{3.6,3.9,4.0}};
        double mejor=-1; int estudiante=0;
        for(int i=0;i<notas.length;i++){
            double suma=0;
            for(int j=0;j<3;j++) suma+=notas[i][j];
            double promedio=suma/3;
            System.out.printf("Estudiante %d - promedio: %.2f%n",i+1,promedio);
            if(promedio>mejor){mejor=promedio; estudiante=i+1;}
        }
        for(int j=0;j<3;j++){
            double suma=0;
            for(int i=0;i<notas.length;i++) suma+=notas[i][j];
            System.out.printf("Promedio parcial %d: %.2f%n",j+1,suma/notas.length);
        }
        System.out.println("Mejor estudiante: "+estudiante);
        System.out.printf("Mejor promedio: %.2f%n",mejor);
    }
}