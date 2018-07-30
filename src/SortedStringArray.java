public class SortedStringArray {
    private String[] stringArray;
    private int currentSize;

    public SortedStringArray() {
        this.stringArray = new String[10];
    }

    public SortedStringArray(int a) {
        this.stringArray = new String[a];
    }
    public boolean add(String string) {
        boolean added = false;
        String temp1 = string;
        String temp2;
        // check if array is full then add one more space
        if (size() == stringArray.length -1) {
            String[] tempArray = new String[stringArray.length * 2];
            for (int i = 0; i < this.stringArray.length; i++) {
                tempArray[i] = this.stringArray[i];
            }
            this.stringArray = tempArray;
        }
        for (int i = 0; i <= size(); i++) {
            if (stringArray[i] == string) break;//check duplicated
            if (stringArray[i] != null) {
                if (stringArray[i].compareToIgnoreCase(string) > 0) {
                    temp2 = stringArray[i];
                    stringArray[i] = temp1;
                    temp1 = temp2;
                }
            }
            else if (stringArray[i] == null) {
                stringArray[i] = temp1;
                added = true;
                break;
            }
        }
        return added;
    }

    public void print() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(stringArray[i]);
        }
    }

    public String get (int a) {
        if (a >= 0 && a < this.size()) return stringArray[a];
        return "ERROR";
    }

    public int getIndex(String s) {
        for (int i = 0; i < this.size(); i++) {
            if(stringArray[i] == s) return i;
        }
        return -1;
    }

    public boolean delete(int num) {
        if (stringArray[num] == null) return false;
        if (stringArray[num] != null) {
            stringArray[num] = null;
        }
        for (int i =0; i < stringArray.length-1; i++) {
            if (stringArray[i] == null && stringArray[i+1] != null){
                stringArray[i] = stringArray[i+1];
                stringArray[i+1] = null;
            }
        }
        return true;
    }

    public boolean delete (String string) {
        boolean deleted = false;
        for (int i = 0; i < this.stringArray.length; i++) {
            if(stringArray[i] == string) {
                stringArray[i] = null;
                deleted = true;
            }
        }
        for (int i =0; i < stringArray.length-1; i++) {
            if (stringArray[i] == null && stringArray[i+1] != null){
                stringArray[i] = stringArray[i+1];
                stringArray[i+1] = null;
            }
        }
        return deleted;
    }
    public int size () {
        this.currentSize = 0;
        for (int i = 0; i < this.stringArray.length; i++) {
            if (stringArray[i] != null) this.currentSize++;
        }
        return this.currentSize;
    }

    public  int capacity () {
        return stringArray.length;
    }
}
