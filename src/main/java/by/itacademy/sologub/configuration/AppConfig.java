package by.itacademy.sologub.configuration;

import by.itacademy.sologub.model.Jeweler;
import by.itacademy.sologub.model.JewelryRepairShop;
import by.itacademy.sologub.model.Seller;
import by.itacademy.sologub.model.Smith;
import by.itacademy.sologub.model.Smithy;
import by.itacademy.sologub.model.TradeShop;
import by.itacademy.sologub.model.Worker;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Worker worker() {
        Worker w = new Worker();
        w.setId(1);
        w.setName("Леопольд");
        w.setSureName("Кот");
        return w;
    }

    @Bean
    public Seller seller() {
        Seller s = new Seller();
        s.setId(100);
        s.setName("Sergey");
        s.setSureName("Fillips");
        return s;
    }

    @Bean("shop")
    public TradeShop tradeShop() {
        TradeShop s = new TradeShop();
        s.setTitle("Сувенирная лавка");
        return s;
    }

    @Bean
    public Smith specialist() {
        Smith s = new Smith();
        s.setId(200);
        s.setName("Толфрид");
        s.setSureName("Серая грива");
        return s;
    }

    @Bean(autowire = Autowire.BY_NAME)
    public Smithy smithy() {
        Smithy s = new Smithy();
        s.setTitle("Кузня на вершине");
        return s;
    }

    @Bean
    public Jeweler jeweler() {
        Jeweler j = new Jeweler();
        j.setId(78);
        j.setName("Карл");
        j.setSureName("Фаберже");
        return j;
    }

    @Bean
    public JewelryRepairShop jewelryRepairShop() {
        JewelryRepairShop j = new JewelryRepairShop();
        j.setTitle("Ювелирная лавка У Фаберже");
        return j;
    }
}