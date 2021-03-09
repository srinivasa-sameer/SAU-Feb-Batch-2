package question3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class screen {
    @Id
    private int screenno;
    private String name;
    private int showtime;

    @OneToMany(mappedBy = "screen1")
    private List<audience> audiences = new ArrayList<>();


    public void setaudience(List<audience> audiences) {
        this.audiences = audiences;
    }
    public List<audience> getAudience() {
        return audiences;
    }

    public void setScreenno(int screenno) {
        this.screenno = screenno;
    }
    public int getScreenno() {
        return screenno;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setShowtime(int showtime) {
        this.showtime = showtime;
    }
    public int getShowtime() {
        return showtime;
    }

}
