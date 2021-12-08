package by.itacademy.sologub.model2;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@NoArgsConstructor
@Data
@Component
@PropertySource("classpath:aero.properties")
public class Airplane {
    @Value("${id}")
    private int id;
    @Value("${name}")
    private String companyTitle;
    private AirshipCrew crew;
    @Value("#{'${countries}'.split(',')}")
    private Set<String> countries;

    @Value("#{${directions}}")
    private Map<String, String> directions;

    @Autowired
    public Airplane(AirshipCrew crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "Airplane{id=" + id + ", companyTitle='" + companyTitle + "', crew=" + crew + ", countries=" + countries
                + ", directions=" + directions + '}';
    }
}