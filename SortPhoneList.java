
import sorting.Sorting;

/**
 * Stephen Zoyac
 * Date: 11/8/20
 * Fall 2020
 * Project 18.1
 * This Driver calls the bubbleSort method, and organizes the
 * contacts in Alphabetical Order. The bubbleSort method is modified to end 
 * when the list of Contacts are already in alphabetical order, as with a 
 * regular bubbleSort method the method will keep checking even after the 
 * contacts are shifted in the right place. Tracers have also been added to the
 * bubbleSort to track how many passes it takes to order the list, and when it
 * finishes ordering.
 */
public class SortPhoneList {

    /**
     * Creates an array of Contact objects, sorts them, then prints them.
     *
     * @param args
     */
    public static void main(String[] args) {
        Contact[] friends1 = new Contact[7];
        Contact[] friends2 = new Contact[7];
        friends1[6] = new Contact("John", "Smith", "610-555-7384");
        friends1[0] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends1[4] = new Contact("Mark", "Riley", "733-555-2969");
        friends1[1] = new Contact("Laura", "Getz", "663-555-3984");
        friends1[5] = new Contact("Larry", "Smith", "464-555-3489");
        friends1[3] = new Contact("Frank", "Phelps", "322-555-2284");
        friends1[2] = new Contact("Marsha", "Grant", "243-555-2837");

        Sorting.bubbleSort(friends1);

        for (Contact friend : friends1) {
            System.out.println(friend);
        }
System.out.println();
        friends2[0] = new Contact("John", "Smith", "610-555-7384");
        friends2[1] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends2[2] = new Contact("Mark", "Riley", "733-555-2969");
        friends2[3] = new Contact("Laura", "Getz", "663-555-3984");
        friends2[4] = new Contact("Larry", "Smith", "464-555-3489");
        friends2[5] = new Contact("Frank", "Phelps", "322-555-2284");
        friends2[6] = new Contact("Marsha", "Grant", "243-555-2837");
        
        Sorting.bubbleSort(friends2);

        for (Contact friend : friends2) {
            System.out.println(friend);
        }
        
    }
}
