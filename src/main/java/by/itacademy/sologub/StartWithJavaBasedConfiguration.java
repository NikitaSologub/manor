package by.itacademy.sologub;

import by.itacademy.sologub.configuration.AppConfig;
import by.itacademy.sologub.model.JewelryRepairShop;
import by.itacademy.sologub.model.Smithy;
import by.itacademy.sologub.model.TradeShop;
import by.itacademy.sologub.model.Worker;
import by.itacademy.sologub.model2.Airplane;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartWithJavaBasedConfiguration {
    public static void main(String[] args) {
        runFirstPart();
        runSecondPart();
    }

    private static void runFirstPart() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("by/itacademy/sologub/model2");
        System.out.println(ctx.getBean(Airplane.class));
        ctx.close();
    }

    private static void runSecondPart() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ctx.getBean("worker", Worker.class));
        System.out.println(ctx.getBean("shop", TradeShop.class));
        System.out.println(ctx.getBean("smithy", Smithy.class));
        System.out.println(ctx.getBean("jewelryRepairShop", JewelryRepairShop.class));
        ctx.close();
    }
}