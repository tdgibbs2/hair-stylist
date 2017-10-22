
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class test {

    public static void main(String[] args) throws JAXBException {
        //this line saves the file name as a variable
        File file = new File("profiles.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(profileList.class);

        //creates the unmarshaller
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        
        //creates the marshaller
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //uses unmarshaller to read in the xml file and store it in the profile list class which is an Array List
        profileList pl = (profileList) jaxbUnmarshaller.unmarshal(file);     
        //adds the profile to the Array list
        Profile testProfile = new Profile(1234, "this is name", "This is last");     
        pl.addprofile(testProfile);
       
        //writes the profile list(Array list)back into the xml file
        jaxbMarshaller.marshal(pl, System.out);
        jaxbMarshaller.marshal(pl, file);

    }

}
