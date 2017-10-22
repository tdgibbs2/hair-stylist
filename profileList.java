import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Profiles")
public class profileList {
    
    //list of profiles
    private List<Profile> Profiles = new ArrayList<>();

    @XmlElement(name = "Profile")
    public List<Profile> getProfiles(){
        return this.Profiles;
    }
    
    public void setProfiles(List<Profile> Profiles){
        this.Profiles = Profiles;
    }
    
    public void addprofile(Profile newProfile){
        Profiles.add(newProfile);
    }
    
}
