package by.itacademy.sologub.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Set;

@ToString
@AllArgsConstructor
@Data
public class Workshop extends AbstractBean {
    private int id;
    private String groupTitle;
    @Autowired
    @Qualifier("dwarf-hr")
    private Worker owner;
    private Set<Worker> workers;

    public Workshop() {
    }

    public Workshop(int id, String groupTitle) {
        this.id = id;
        this.groupTitle = groupTitle;
    }
}