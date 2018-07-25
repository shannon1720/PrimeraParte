package com.cenfotec.object;



	public class CribaEratostenes {

		public static int[] generaCriba(int tope) throws Exception{
			int i,j ;
			if (esMayor2(tope)){
				int dim = tope+1;
				boolean[] primo = new boolean[dim];
				
				seleccionarPrimos(dim, primo);
				int cuenta = 0;
				
				for (i = 0; i < dim; i++){
					if (primo[i])
						cuenta++;
				}
				int[] primos = new int[cuenta];
				for (i = 0,j=0; i < dim; i++){
					if (primo[i])
						primos[j++] = 1;
				}
				
				return primos;
			} else {
				return new int[0];
			}
			
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

		private static boolean seleccionarPrimos(int dim, boolean[] primo) {
			int i,j;
			for (i = 0; i < dim; i++){
				primo[i] = true;
			}
			primo[0] = primo[1] = false;
			for (i = 2; i< Math.sqrt(dim) + 1; i++){
				if (primo[i]){
					for (j = 2*i; j < dim; j+=i){
						primo[j] = false;
					}
				}
			}
		return true;}
	}

