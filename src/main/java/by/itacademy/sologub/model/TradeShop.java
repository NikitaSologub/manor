package by.itacademy.sologub.model;

import by.itacademy.sologub.qualifiers.SellerQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TradeShop {
    private String title;
    @Autowired
    @SellerQualifier
    private Worker specialist;
}