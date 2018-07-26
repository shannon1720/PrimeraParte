package com.cenfotec.object;



	public class CribaEratostenes {

		public static int[] generaCriba(int tope) throws Exception{
			int i,j ;
			if (esMayor2(tope)){
				int dim = tope+1;
				boolean[] primo = new boolean[dim];
				seleccionarPrimos(dim, primo);
				int cuenta = cuentaPrimos(dim, primo);
//				int[] primos = crearArreglode1(dim, primo, cuenta);	
				int[] primos = crearArregloPrimosDeN(dim, primo, cuenta);	
				return primos;
			} else {
				return new int[0];
			}
		}
		public static int[] crearArreglode1(int dim, boolean[] primo, int cuenta) {
			int i;
			int j;
			int[] primos = new int[cuenta];
			for (i = 0,j=0; i < dim; i++){
				if (primo[i])
					primos[j++] = 1;
			}
			return primos;
		}
		public static int[] crearArregloPrimosDeN(int dim, boolean[] primo, int cuenta) {
			int i;
			int j;
			int[] primos = new int[cuenta];
			for (i = 0,j=0; i < dim; i++){
				if (primo[i])
					primos[j++] = i;
			}
			return primos;
		}

		public static int cuentaPrimos(int dim, boolean[] primo) {
			int i;
			int cuenta = 0;			
			for (i = 0; i < dim; i++){
				if (primo[i])
					cuenta++;
			}
			return cuenta;
		}

		public static boolean esMayor2(int tope) throws Exception {
			boolean istrue=false;
			if(tope>=2) {
				istrue=true;
			}else {				
				throw new Exception("No es un valor mayor a dos.");
			}
			return istrue;
		}
		//Hace que el arreglo llamado primo se llene de true
		//y luego "tacha" los numeros compuestos.
		private static void seleccionarPrimos(int dim, boolean[] primo) {
			int i,j;
			i = crearArreglodeTrue(dim, primo);
			primo[0] = primo[1] = false;
			for (i = 2; i< Math.sqrt(dim) + 1; i++){
				if (primo[i]){
					for (j = 2*i; j < dim; j+=i){
						primo[j] = false;
					}
				}
			}
		}
		public  static int crearArreglodeTrue(int dim, boolean[] primo) {
			int i;
			for (i = 0; i < dim; i++){
				primo[i] = true;
			}
			return i;
		}
	}


	