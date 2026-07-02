package com.example.U5_W1_D1_SPRING_INTRO.service;
import com.example.U5_W1_D1_SPRING_INTRO.model.Menu;
import com.example.U5_W1_D1_SPRING_INTRO.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

    @Component
    public class AppRunner implements CommandLineRunner {

        private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

        private final Menu menu;
        private final Order order;
        private final MenuPrinter menuPrinter;
        private final OrderService orderService;

        @Autowired
        public AppRunner(Menu menu, Order order, MenuPrinter menuPrinter, OrderService orderService) {
            this.menu = menu;
            this.order = order;
            this.menuPrinter = menuPrinter;
            this.orderService = orderService;
        }

        @Override
        public void run(String... args) throws Exception {
            menuPrinter.printMenu(menu);

            double totale = orderService.calculateTotal(order);
            order.setBill(totale);

            logger.info("Ordine creato: {}", order);
        }
    }

