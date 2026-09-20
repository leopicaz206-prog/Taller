public class Problema3 {
    public static void main(String[] args) {
        double[] notas={78,55,91,63,47,82,60,74,88,52,69,95,58,71,84,43,66,79,90,61,57,73,86,49,68,92,54,77,81,59,70,65,87,45,76,83,62,89,51,67,94,72,56,80,64,85,53,75,93,48};
        for(int i=0;i<notas.length-1;i++)
            for(int j=0;j<notas.length-1-i;j++)
                if(notas[j]>notas[j+1]){
                    double temp=notas[j]; notas[j]=notas[j+1]; notas[j+1]=temp;
                }
        double buscada=80;
        int izq=0, der=notas.length-1;
        boolean encontrada=false;
        while(izq<=der){
            int medio=(izq+der)/2;
            if(notas[medio]==buscada){encontrada=true; break;}
            if(notas[medio]<buscada) izq=medio+1; else der=medio-1;
        }
        int aprobados=0;
        for(double n:notas) if(n>=60) aprobados++;
        System.out.println("PROBLEMA 3 - RANKING DE ESTUDIANTES");
        System.out.println("Nota buscada: "+buscada);
        System.out.println("Nota encontrada: "+encontrada);
        System.out.println("Estudiantes aprobados: "+aprobados);
    }
}