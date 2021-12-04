package by.itacademy.sologub.model;

import by.itacademy.sologub.qualifiers.JewelerQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class JewelryRepairShop {
    private String title;
    @Autowired
    @JewelerQualifier
    private Worker specialist;
}