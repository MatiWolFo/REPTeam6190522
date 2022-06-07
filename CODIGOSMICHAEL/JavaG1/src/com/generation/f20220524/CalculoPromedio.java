package com.generation.f20220524;


public class CalculoPromedio {
    public static void main(String[] args) {
        //int cantidadNotas = 12;
        //arreglos
        Integer[] notas = {88, 80, 67, 20, 10, 70, 28, 70, 58, 79, 23, 80};

        int Sumanotas = 0;

        int Notafuera = 0;

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] < 0 || notas[i] > 100) {

                System.out.println("La nota " + notas[i] + " esta incorrecta. Porfavor ingrese un valor entre 0 y 100 ");

                Notafuera = Notafuera + 1;
            } else {

                Sumanotas = Sumanotas + notas[i];
            }
        }



        int promedio = (Sumanotas / notas.length);

        if (promedio >= 50) {
            //prints the true response
            System.out.println("Su promedio es: " + promedio);
            System.out.println("APRUEBO!!!");

        } else {
            //prints the false response
            System.out.println("Su promedio es: " + promedio);
            System.out.println("Vuelva a estudiar :(((");
        }
    }
}




    //package com.generation.f20220523;
//
//public class CalculoPromedio {
//
//	public static void main(String[] args) {
//		//int cantidadNotas = 12;
//		//arreglo notas
//		Integer[] notas = {20,50,67,99,10,0,88,77,58,79,33,50};
//
//		int sumaNotas = 0;//20
//
//
//		//como recorrer el arreglo de notas
//		for (int i = 0; i < notas.length; i++) {//i=0
//
//			sumaNotas = sumaNotas + notas[i];
//		}
//		System.out.println("suma de notas: " + sumaNotas);
//
//		//promedio-> suma todas las notas / cantidad de notas;
//		float promedio = sumaNotas / notas.length;
//		/*  validar el orden >= */
//		//101
//		if(promedio >= 50 && promedio <= 100) {
//
//		}else {
//
//		}
//
//	}
//}