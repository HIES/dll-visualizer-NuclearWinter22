import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author Jake Wilson
 */
public class DLLVisualizer {
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Credentials
        final String API_KEY = "1332807560857";
        final String USER_ID = "Nuclear22";
        
        // Constructed new Bridge
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);
        
        // Builds new WebpageVisits
        WebpageVisit googleHome = new WebpageVisit("https://www.google.com/", true);
        WebpageVisit googleSearch = new WebpageVisit("https://www.google.com/search?source=hp&q=hies", true);
        WebpageVisit hiesHome = new WebpageVisit("https://www.hies.org/page",true);
        WebpageVisit hiesLogin = new WebpageVisit("https://hies.myschoolapp.com/app#login",true);
        WebpageVisit hiesStudent = new WebpageVisit("https://hies.myschoolapp.com/app/student#studentmyday/progress",true);
        
        // Builds new DLelements with the WebpageVists
        DLelement head = new DLelement(googleHome.toString(), googleHome);
        DLelement second = new DLelement(googleSearch.toString(), googleSearch);
        DLelement third = new DLelement(hiesHome.toString(), hiesHome);
        DLelement fourth = new DLelement(hiesLogin.toString(), hiesLogin);
        DLelement tail = new DLelement(hiesStudent.toString(), hiesStudent);
        
        // Links the DLelements into a doubly linked list
        head.setNext(second);
        second.setPrev(head);
        second.setNext(third);
        third.setPrev(second);
        third.setNext(fourth);
        fourth.setPrev(third);
        fourth.setNext(tail);
        tail.setPrev(fourth);
        
        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();
    }
}
