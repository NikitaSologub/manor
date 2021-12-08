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
public class Pilot1StClass extends AirWorker {
    @Value("#{new java.util.Random().nextInt(200)}")
    private Integer id;
    @Value("Уилбер")
    private String name;
    @Value("Райт")
    private String sureName;
}