package com.example.U5_W1_D1_SPRING_INTRO.config;

import com.example.U5_W1_D1_SPRING_INTRO.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
@Bean
        public Topping ham(){return new Topping(35, 0.99, "HAM");}
    @Bean
public Topping cheese(){return new Topping(92, 0.69, "CHEESE" );}
    @Bean
    public Topping onion(){return new Topping(22,0.99,"ONION");}
    @Bean
    public Topping pinapple(){return new Topping(24, 0.79, "PINEAPPLE");}
    @Bean
    public Topping salami(){return new Topping(89, 0.99, "SALAMI");}

    @Bean
    public Drinks lemonade(){return new Drinks(129, 1.29, "LEMONADE", 0.33);}
    @Bean
    public Drinks water(){return new Drinks(0, 0.50, "WATER", 0.5);}
    @Bean
    public Drinks whine(){return new Drinks(120, 22, "GEWURSTRAMINER", 0.75, 6);}
    @Bean
    public Pizza margherita(){return  new Pizza(1104, 4.99,"MARGHERITA", List.of());}
    @Bean
    public Pizza hawaiian(){return  new Pizza(1189, 8.99, "HAWAIIAN", List.of(pinapple(), ham()));}
    @Bean
    public Pizza diavola(){return  new Pizza(2000, 7.80, "DIAVOLA", List.of(salami()));}

    @Bean
    public Menu menu(){return new Menu(List.of(margherita(), hawaiian(), diavola()), List.of(lemonade(),water(),whine()), List.of(ham(), onion(), cheese(), pinapple(), salami()));}

    @Bean
    public Table table1(){return new Table(5,4,TableState.FREE);}

    @Bean
    public Order order1(){return new Order(table1(),OrderState.IN_PROGRESS,List.of(margherita(), water()),2,1001L);}
}
