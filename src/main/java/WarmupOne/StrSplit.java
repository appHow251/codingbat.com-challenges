package WarmupOne;

public class StrSplit {

    public static void main(String[] args) {
        splitByCommaAndSpace("Alpha, Beta, Delta, Gamma, Sigma");
        System.out.println();
        splitBySpace("Welcome to this happy place!");
    }

        public static void splitByCommaAndSpace(String strMain) {

            String[] arrSplit = strMain.split(", ");
            for (int i = 0; i < arrSplit.length; i++) {
                System.out.println(arrSplit[i]);
            }
        }

    public static void splitBySpace(String str){

        String[] arrSplit_3 = str.split("\\s");
        for (int i=0; i < arrSplit_3.length; i++){
            System.out.println(arrSplit_3[i]);
        }
    }
}


