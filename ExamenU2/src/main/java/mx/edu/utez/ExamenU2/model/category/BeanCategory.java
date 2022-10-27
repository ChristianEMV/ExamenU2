package mx.edu.utez.ExamenU2.model.category;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BeanCategory")
@XmlAccessorType(XmlAccessType.FIELD)

public class BeanCategory {

    @XmlElement
    private int id;

    @XmlElement
    private String name;

    public BeanCategory() {
    }

public BeanCategory(int id, String name){
        this.id = id;
        this.name = name;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
