public class Application {
    public static void main(String[] args) {

    }

    public int suma_elem_unikalnych (int tab[]) {
        int suma=0;
        if(tab.length>0) {
            for(int i = 0; i < tab.length; i++) {
                boolean unikalna = true;
                for (int j = 0; j < tab.length; j++) {
                    if (i != j) {
                        if (tab[i] == tab[j]) {
                            unikalna= false;
                        }
                    }
                }
                if(unikalna)
                    suma+=tab[i];
            }
        }
        return suma;
    }
}
