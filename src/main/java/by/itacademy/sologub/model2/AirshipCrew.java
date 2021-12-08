package by.itacademy.sologub.model2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@ToString()
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class AirshipCrew {
    private Pilot1StClass firstPilot;
    private Pilot2NdClass secondPilot;
    @Autowired
    private Stewardess stewardess;
    @Autowired
    private Cook cook;

    @Autowired
    @Qualifier("pilot2NdClass")
    private AirWorker dispatcher;

    @Autowired
    public void setFirstPilot(Pilot1StClass firstPilot) {
        this.firstPilot = firstPilot;
    }

    @Autowired
    public void setSecondPilot(Pilot2NdClass secondPilot) {
        this.secondPilot = secondPilot;
    }
}