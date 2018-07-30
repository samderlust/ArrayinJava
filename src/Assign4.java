
public class Assign4 {

    public static void main(String[] args) {
        boolean testSucceeds;

        // Test that the default constructor works properly

        testSucceeds=true;
        SortedStringArray ssa = new SortedStringArray();
        if(ssa.size()!=0)
        {
            System.err.println("Default constructor: initial size is wrong");
            testSucceeds=false;
        }
        if(ssa.capacity()!=10)
        {
            System.err.println("Default constructor: initial capacity is wrong");
            testSucceeds=false;
        }
        if(testSucceeds)
        {
            System.out.println("Default constructor: working correctly");
        }

        // Test that the initial constructor works properly
        ssa = new SortedStringArray(14);
        if (ssa.capacity() == 14) {
            System.out.println("Initial constructor: working correctly");
        }

        // Test that the add method works properly
        if (!ssa.add("hi")) {
            testSucceeds = false;
            System.out.println("Add: working Incorrectly");
        }
        if (testSucceeds) System.out.println("Add: working correctly");

        // Test that the get method works properly
        if (ssa.get(0) == null) {
            testSucceeds = false;
            System.out.println("Get: working Incorrectly");
        }
        if (ssa.get(0) == "hi") System.out.println("Get: working correctly");


        // Test that the getIndex method works properly
        if (ssa.getIndex("hi") == -1) {
            testSucceeds = false;
            System.out.println("getIndex: working Incorrectly");
        }
        if (ssa.getIndex("hi") == 0)System.out.println("getIndex: working correctly");

        // Test that the delete method works properly
        ssa.add("delete");
        if(!ssa.delete("delete")) {
            testSucceeds = false;
            System.out.println("Delete: working Incorrectly");
        }
        ssa.add("delete");
        if(!ssa.delete(0)) {
            testSucceeds =false;
            System.out.println("Delete method with Int: working Incorrectly");
        }
        if (testSucceeds) System.out.println("Delete: working correctly");

        ssa.add("q");
        ssa.add("a");
        ssa.add("b");
        ssa.add("z");
        ssa.add("x");
        ssa.add("u");
        ssa.add("o");
        ssa.add("p");
        ssa.add("t");
        ssa.add("k9");
        ssa.add("k");
        ssa.add("k5");
        ssa.add("k3");
        ssa.add("k2");
        ssa.add("k1");
        ssa.add("k0");
        ssa.add("k9");
        ssa.add("l");
        ssa.delete("q");
        ssa.print();

    }

}