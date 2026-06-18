package com.ecom.productcatalog.config;

import com.ecom.productcatalog.Repository.CategoryRespository;
import com.ecom.productcatalog.Repository.ProductRepository;
import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final CategoryRespository categoryRespository;

    public DataSeeder(ProductRepository productRepository, CategoryRespository categoryRespository) {
        this.productRepository = productRepository;
        this.categoryRespository = categoryRespository;
    }

    @Override
    public void run(String... args) throws Exception {
        //clear all existing data
        productRepository.deleteAll();
        categoryRespository.deleteAll();

        // create categories
        Category electronics=new Category();
        electronics.setName("Electronics");

        Category clothing=new Category();
        clothing.setName("Clothing");

        Category home=new Category();
        home.setName("Home and kichen");

        categoryRespository.saveAll(Arrays.asList(electronics,clothing,home));

        //create products
        product phone=new product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest model smart phone with amazing features");
        phone.setCategory(electronics);
        phone.setPrice(15000.0);
        phone.setImageUrl("/images/phone.jpg");

        product laptop = new product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop for work and gaming");
        laptop.setCategory(electronics);
        laptop.setPrice(65000.0);
        laptop.setImageUrl("/images/lap.jpg");

        product earbuds = new product();
        earbuds.setName("Wireless Earbuds");
        earbuds.setDescription("Noise cancelling wireless earbuds");
        earbuds.setCategory(electronics);
        earbuds.setPrice(2999.0);
        earbuds.setImageUrl("/images/earbuds.jpg");

        product smartwatch = new product();
        smartwatch.setName("Smart Watch");
        smartwatch.setDescription("Fitness tracking smartwatch");
        smartwatch.setCategory(electronics);
        smartwatch.setPrice(4999.0);
        smartwatch.setImageUrl("/images/watch.jpg");

// Clothing
        product tshirt = new product();
        tshirt.setName("Men T-Shirt");
        tshirt.setDescription("Comfortable cotton t-shirt");
        tshirt.setCategory(clothing);
        tshirt.setPrice(599.0);
        tshirt.setImageUrl("/images/tshirt.jpg");

        product jeans = new product();
        jeans.setName("Blue Jeans");
        jeans.setDescription("Slim fit blue jeans");
        jeans.setCategory(clothing);
        jeans.setPrice(1299.0);
        jeans.setImageUrl("/images/jeans.jpg");

        product jacket = new product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("Warm jacket for winter season");
        jacket.setCategory(clothing);
        jacket.setPrice(2499.0);
        jacket.setImageUrl("/images/jacket.jpg");

        product shoes = new product();
        shoes.setName("Running Shoes");
        shoes.setDescription("Lightweight sports shoes");
        shoes.setCategory(clothing);
        shoes.setPrice(1999.0);
        shoes.setImageUrl("/images/shoes.jpg");

// Home & Kitchen
        product mixer = new product();
        mixer.setName("Mixer Grinder");
        mixer.setDescription("Powerful kitchen mixer grinder");
        mixer.setCategory(home);
        mixer.setPrice(3499.0);
        mixer.setImageUrl("/images/mixer.jpg");

        product microwave = new product();
        microwave.setName("Microwave Oven");
        microwave.setDescription("25L convection microwave oven");
        microwave.setCategory(home);
        microwave.setPrice(8999.0);
        microwave.setImageUrl("/images/microwave.jpg");

        product vacuum = new product();
        vacuum.setName("Vacuum Cleaner");
        vacuum.setDescription("Compact vacuum cleaner for home");
        vacuum.setCategory(home);
        vacuum.setPrice(5499.0);
        vacuum.setImageUrl("/images/vaccum.jpg");

        product kettle = new product();
        kettle.setName("Electric Kettle");
        kettle.setDescription("Fast boiling electric kettle");
        kettle.setCategory(home);
        kettle.setPrice(999.0);
        kettle.setImageUrl("/images/kettle.jpg");

        productRepository.saveAll(Arrays.asList(
                phone,
                laptop,
                earbuds,
                smartwatch,
                tshirt,
                jeans,
                jacket,
                shoes,
                mixer,
                microwave,
                vacuum,
                kettle
        ));

    }
}
