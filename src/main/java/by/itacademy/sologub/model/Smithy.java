package by.itacademy.sologub.model;

import by.itacademy.sologub.qualifiers.SmithQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Smithy {
    private String title;
    @Autowired
    @SmithQualifier
    private Worker specialist;
}