package by.itacademy.sologub;

import by.itacademy.sologub.model.JewelryRepairShop;
import by.itacademy.sologub.model.Smithy;
import by.itacademy.sologub.model.TradeShop;
import by.itacademy.sologub.model.Workshop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartWithXmlOnlyConfiguration {
    public static void main(String[] args) {
        runFirstPart();//оновная часть конфигурирования бинов в xml
        runSecondPart();//пример Simple Qualifier autowiring в xml
        runThirdPart();//пример Custom Qualifiers autowiring в xml
    }

    public static void runFirstPart() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dwarfs.xml");
        ctx.registerShutdownHook();

        Workshop workshop1 = ctx.getBean("workshop1", Workshop.class);
        Workshop workshop2 = ctx.getBean("workshop2", Workshop.class);
        Workshop workshop3 = ctx.getBean("workshop3", Workshop.class);
        Workshop workshop4 = ctx.getBean("workshop4", Workshop.class);
        Workshop workshop5 = ctx.getBean("workshop5", Workshop.class);

        System.out.println();
        System.out.println(workshop1);
        System.out.println();
        System.out.println(workshop2);
        System.out.println();
        System.out.println(workshop3);
        System.out.println();
        System.out.println(workshop4);
        System.out.println();
        System.out.println(workshop5);
        System.out.println();

        ctx.close();
    }

    public static void runSecondPart() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dwarf-simple-qualifier-for-xml.xml");
        ctx.registerShutdownHook();
        Workshop hrOffice = ctx.getBean("hr-office", Workshop.class);

        System.out.println();
        System.out.println(hrOffice);
        System.out.println();

        ctx.close();
    }

    private static void runThirdPart() {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("dwarfs-custom-qualifiers-for-xml.xml");
        ctx.registerShutdownHook();

        Smithy smithy = ctx.getBean("smithy", Smithy.class);
        JewelryRepairShop jewelryRepairShop = ctx.getBean("jewelryRepairShop", JewelryRepairShop.class);
        TradeShop tradeShop = ctx.getBean("tradeShop", TradeShop.class);

        System.out.println();
        System.out.println(smithy);
        System.out.println();
        System.out.println(jewelryRepairShop);
        System.out.println();
        System.out.println(tradeShop);
        System.out.println();

        ctx.close();
    }
}