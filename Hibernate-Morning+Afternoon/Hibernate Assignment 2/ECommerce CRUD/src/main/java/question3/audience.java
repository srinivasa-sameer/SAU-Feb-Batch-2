package question3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class audience {
    @Id
    private int age;
    private String name;
    @ManyToOne
    private screen screen1;
    
    public void setScreen1(screen screen1)
    {
         this.screen1=screen1;
    }
    public screen getScreen1()
    {
       return screen1;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}