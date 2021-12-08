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
public class Stewardess extends AirWorker {
    @Value("17")
    private Integer id;
    @Value("Весна")
    private String name;
    @Value("Вулович")
    private String sureName;
}