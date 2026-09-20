public class Problema4 {
    public static void main(String[] args) {
        double[][] ventas={{120,135,110,150,145,160,155},{100,125,130,140,150,155,165},{160,145,150,155,170,180,175},{90,105,115,120,125,130,140}};
        double[] totalDias=new double[7];
        double mayor=-1; int sucursal=0;
        for(int i=0;i<ventas.length;i++){
            double total=0;
            for(int j=0;j<ventas[i].length;j++){total+=ventas[i][j]; totalDias[j]+=ventas[i][j];}
            if(total>mayor){mayor=total; sucursal=i+1;}
        }
        double menor=totalDias[0]; int dia=1;
        for(int j=1;j<7;j++) if(totalDias[j]<menor){menor=totalDias[j]; dia=j+1;}
        System.out.println("PROBLEMA 4 - VENTAS POR SUCURSAL");
        System.out.println("Sucursal con mayor venta acumulada: "+sucursal);
        System.out.println("Dia con menor venta total: "+dia);
    }
}