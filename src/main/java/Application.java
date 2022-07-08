public class Application {
    public static void main(String[] args) {

    }

    public int[] newTab(int[] oldTab, int newLenght) {
        int[] newTab = new int[newLenght];

        if (checkIfOldTabIsBiggerThanNew(oldTab.length, newLenght)) {
            return writeRecordsToNewTabWithOutZeros(newTab, oldTab);
        } else {
            return writeRecordsToNewTabWithZeros(newTab, oldTab);
        }
    }

    public boolean checkIfOldTabIsBiggerThanNew(int oldTabLength, int newTabLength) {
        return oldTabLength >= newTabLength;
    }

    public int[] writeRecordsToNewTabWithZeros(int[] newTab, int[] oldTab) {
        for (int i = 0; i < newTab.length; i++) {
            if (i < oldTab.length) {
                newTab[i] = oldTab[i];
            } else {
                newTab[i] = 0;
            }
        }
        return newTab;
    }

    public int[] writeRecordsToNewTabWithOutZeros(int[] newTab, int[] oldTab) {
        for (int i = 0; i < newTab.length; i++) {
            newTab[i] = oldTab[i];
        }
        return newTab;
    }
}
