package by.itacademy.sologub.model2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.With;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ToString(includeFieldNames = false)
@AllArgsConstructor
@NoArgsConstructor
@Data
@With
@Component
@PropertySource("classpath:kili.properties")
public class Cook extends AirWorker {
    @Value("${kili.id}")
    private Integer id;
    @Value("${kili.name}")
    private String name;
    @Value("${kili.surename}")
    private String sureName;
}
