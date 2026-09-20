public class Problema2 {
    public static void main(String[] args) {
        double[] temperaturas={19,20,21,23,25,27,29,31,34,37,41,39,35,30,26,24,22,20,19,18,17,21,23,25};
        boolean critica=false;
        double mayorVariacion=0;
        int horasOptimas=0;
        for(double t:temperaturas){
            if(t>40) critica=true;
            if(t>=18 && t<=25) horasOptimas++;
        }
        for(int i=1;i<temperaturas.length;i++){
            double v=Math.abs(temperaturas[i]-temperaturas[i-1]);
            if(v>mayorVariacion) mayorVariacion=v;
        }
        System.out.println("PROBLEMA 2 - TEMPERATURAS");
        System.out.println("Hubo temperatura critica: "+critica);
        System.out.println("Mayor variacion: "+mayorVariacion+" C");
        System.out.println("Horas dentro del rango optimo: "+horasOptimas);
    }
}