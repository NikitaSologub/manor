package by.itacademy.sologub.model2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString(includeFieldNames = false)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Pilot2NdClass extends AirWorker {
    @Value("#{T(by.itacademy.sologub.util.UtilHelper).INT_CONSTANT}")
    private Integer id;
    @Value("Орвилл")
    private String name;
    @Value("Райт")
    private String sureName;
}