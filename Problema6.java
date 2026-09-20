public class Problema6 {
    public static void main(String[] args) {
        int[][] imagen={{120,130,140,150,160},{110,200,180,170,100},{90,125,250,135,145},{80,115,155,190,175},{70,105,165,185,220}};
        int suma=0, maximo=imagen[0][0];
        for(int i=0;i<imagen.length;i++)
            for(int j=0;j<imagen[i].length;j++){
                suma+=imagen[i][j];
                if(imagen[i][j]>maximo) maximo=imagen[i][j];
            }
        double promedio=(double)suma/25;
        int sobre=0;
        for(int[] fila:imagen) for(int pixel:fila) if(pixel>promedio) sobre++;
        System.out.println("PROBLEMA 6 - IMAGEN EN ESCALA DE GRISES");
        System.out.printf("Promedio: %.2f%n",promedio);
        System.out.println("Pixel mas brillante: "+maximo);
        System.out.println("Pixeles sobre el promedio: "+sobre);
    }
}