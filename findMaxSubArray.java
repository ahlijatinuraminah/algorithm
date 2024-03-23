class findMaxSubArray {
      public static void main(String[] args) {
        
        String[] stringArgs = args[0].split(",");

        int[] array = new int[stringArgs.length];
        for (int i = 0; i < stringArgs.length; i++) {            
            array[i] = Integer.parseInt(stringArgs[i]);
        }

        int jml_maks = Integer.MIN_VALUE;
        int awal = 0;
        int akhir = 0;    
        for (int i = 0; i < array.length; i++) {
            int jml_current = 0;
            for (int j = i; j < array.length; j++) {
                jml_current += array[j];
                if (jml_maks < jml_current) {
                    jml_maks = jml_current;
                    awal = i;
                    akhir = j;
                }
            }
        }
        for (int i = awal; i <= akhir; i++) {            
            System.out.print(i != akhir ? array[i] + "," : array[i]);         
        }
    }
}