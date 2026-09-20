public class Problema1 {
    public static void main(String[] args) {
        double[] produccion = {42,38,51,47,55,49,60,44,53,58,46,50,62,41,57,54,48,59,63,45,52,56,61,43,47,64,58,55,49,67};
        double total=0, mayor=produccion[0], menor=produccion[0];
        int diaMayor=1, diaMenor=1;
        for(int i=0;i<produccion.length;i++){
            total += produccion[i];
            if(produccion[i]>mayor){mayor=produccion[i]; diaMayor=i+1;}
            if(produccion[i]<menor){menor=produccion[i]; diaMenor=i+1;}
        }
        double promedio=total/produccion.length;
        int sobre=0;
        for(double valor:produccion) if(valor>promedio) sobre++;
        System.out.println("PROBLEMA 1 - PRODUCCION AGRICOLA");
        System.out.println("Produccion total: "+total+" kg");
        System.out.printf("Promedio diario: %.2f kg%n",promedio);
        System.out.println("Dia de mayor produccion: "+diaMayor+" ("+mayor+" kg)");
        System.out.println("Dia de menor produccion: "+diaMenor+" ("+menor+" kg)");
        System.out.println("Dias por encima del promedio: "+sobre);
    }
}