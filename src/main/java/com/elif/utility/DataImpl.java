package com.elif.utility;

import com.elif.entity.*;
import com.elif.service.*;
import com.elif.utility.enums.ECategory;
import com.elif.utility.enums.ESubCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.elif.utility.enums.ESubCategory.L;

@Component
@RequiredArgsConstructor
public class DataImpl implements ApplicationRunner {
    private final BrandService brandService;
    private final FeatureService featureService;
    private final ModelService modelService;
    private final ImageService imageService;
    private final ProductService productService;
    private final ProductFeatureService productFeatureService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        createFeature();
        createBrand();
        createModel();
        createProduct();
        createProductFeature();
    }

    private void createFeature(){
        //Product 1 -> Feature 1,2,3
        Feature feature = Feature.builder()
                .id(1L)
                .category(ECategory.KUMAS)
                .subcategory(ESubCategory.AKRILIK)
                .description("Kumaş Özelliği")
                .build();
        Feature feature2 = Feature.builder()
                .id(2L)
                .category(ECategory.CINSIYET)
                .subcategory(ESubCategory.KADIN)
                .description("Cinsiyet")
                .build();
        Feature feature3 = Feature.builder()
                .id(3L)
                .category(ECategory.BOYUT)
                .subcategory(ESubCategory.S)
                .description("Beden")
                .build();
        //Product 2 -> Feature 4,5,6
        Feature feature4 = Feature.builder()
                .id(4L)
                .category(ECategory.KUMAS)
                .subcategory(ESubCategory.KADIFE)
                .description("Kumaş Özelliği")
                .build();
        Feature feature5 = Feature.builder()
                .id(5L)
                .category(ECategory.CINSIYET)
                .subcategory(ESubCategory.ERKEK)
                .description("Cinsiyet")
                .build();
        Feature feature6 = Feature.builder()
                .id(6L)
                .category(ECategory.BOYUT)
                .subcategory(L)
                .description("Beden")
                .build();
        //Product 3 -> Feature 7,8,9
        Feature feature7 = Feature.builder()
                .id(7L)
                .category(ECategory.KUMAS)
                .subcategory(ESubCategory.LIKRA)
                .description("Kumaş Özelliği")
                .build();
        Feature feature8 = Feature.builder()
                .id(8L)
                .category(ECategory.CINSIYET)
                .subcategory(ESubCategory.ERKEK)
                .description("Cinsiyet")
                .build();
        Feature feature9 = Feature.builder()
                .id(9L)
                .category(ECategory.BOYUT)
                .subcategory(ESubCategory.M)
                .description("Beden")
                .build();
        //Product 4 -> Feature 10,11,12
        Feature feature10 = Feature.builder()
                .id(10L)
                .category(ECategory.KUMAS)
                .subcategory(ESubCategory.AKRILIK)
                .description("Kumaş Özelliği")
                .build();
        Feature feature11 = Feature.builder()
                .id(11L)
                .category(ECategory.CINSIYET)
                .subcategory(ESubCategory.KADIN)
                .description("Cinsiyet")
                .build();
        Feature feature12 = Feature.builder()
                .id(12L)
                .category(ECategory.BOYUT)
                .subcategory(L)
                .description("Beden")
                .build();
        featureService.saveAll(List.of(feature,feature2,feature3,feature4,feature5,feature6,feature7,feature8,feature9,feature10,feature11,feature12));

    }

    private void createBrand(){
        Brand mavi = Brand.builder()
                .id(1L)
                .name("Mavi")
                .country("Turkey")
                .foundingYear("1991")
                .description("40 yıllık denim deneyimine sahip olarak " +
                        "1991 yılında İstanbul'da kurulan Mavi, küresel moda dünyasında söz " +
                        "sahibi bir lifestyle markası olarak tanınıyor.")
                .build();
        Brand penti = Brand.builder()
                .id(2L)
                .name("Penti")
                .country("Turkey")
                .foundingYear("1977")
                .description("1977 yılında İstanbul'da kurulan Penti, iç giyim ve çorap alanında " +
                        "geniş bir ürün yelpazesi sunan Türkiye'nin önde gelen markalarından biridir.")
                .build();

        Brand addax = Brand.builder()
                .id(3L)
                .name("Addax")
                .country("Turkey")
                .foundingYear("1983")
                .description("1983 yılında kurulan Addax, Türkiye'nin öncü spor giyim markalarından biridir. " +
                        "Yüksek kaliteli ürünleri ve şık tasarımları ile dikkat çekmektedir.")
                .build();
        Brand lcWaikiki = Brand.builder()
                .id(4L)
                .name("LC Waikiki")
                .country("Turkey")
                .foundingYear("1988")
                .description("1988 yılında Fransız moda devi LC Waikiki, Türkiye pazarına adım atarak " +
                        "geniş bir müşteri kitlesi kazanmıştır. Modaya uygun tasarımları ve uygun fiyatları ile " +
                        "bilinmektedir.")
                .build();

        Brand adidas = Brand.builder()
                .id(5L)
                .name("Adidas")
                .country("Germany")
                .foundingYear("1949")
                .description("Adidas, 1949 yılında Almanya'da kurulan dünyaca ünlü bir spor giyim ve " +
                        "ayakkabı markasıdır. Yenilikçi tasarımları ve performans odaklı ürünleri ile bilinir.")
                .build();

        Brand nike = Brand.builder()
                .id(6L)
                .name("Nike")
                .country("United States")
                .foundingYear("1964")
                .description("Nike, 1964 yılında Amerika'da kurulan dünyanın en büyük spor giyim ve " +
                        "ayakkabı markalarından biridir. Sloganı 'Just Do It' ile bilinir ve geniş bir " +
                        "ürün yelpazesi sunar.")
                .build();

        brandService.saveAll(List.of(mavi,penti,addax,lcWaikiki,adidas,nike));


    }

    private void createModel(){
        Model maviModel1 = Model.builder()
                .id(1L)
                .name("Denim Etek")
                .build();

        Model maviModel2 = Model.builder()
                .id(2L)
                .name("Slim Fit Jeans")
                .build();

        Model maviModel3 = Model.builder()
                .id(3L)
                .name("Cotton T-Shirt")
                .build();

        Model pentiModel1 = Model.builder()
                .id(4L)
                .name("Lace Bodysuit")
                .build();

        Model pentiModel2 = Model.builder()
                .id(5L)
                .name("Seamless Bralette")
                .build();

        Model pentiModel3 = Model.builder()
                .id(6L)
                .name("Microfiber Panties")
                .build();

        Model addaxModel1 = Model.builder()
                .id(7L)
                .name("Running Shoes")
                .build();

        Model addaxModel2 = Model.builder()
                .id(8L)
                .name("Training Leggings")
                .build();

        Model addaxModel3 = Model.builder()
                .id(9L)
                .name("Dri-FIT T-Shirt")
                .build();

        Model lcWaikikiModel1 = Model.builder()
                .id(10L)
                .name("Hooded Sweatshirt")
                .build();

        Model lcWaikikiModel2 = Model.builder()
                .id(11L)
                .name("Straight Fit Jeans")
                .build();

        Model lcWaikikiModel3 = Model.builder()
                .id(12L)
                .name("Printed Blouse")
                .build();

        Model adidasModel1 = Model.builder()
                .id(13L)
                .name("Ultra Boost Sneakers")
                .build();

        Model adidasModel2 = Model.builder()
                .id(14L)
                .name("Essentials Hoodie")
                .build();

        Model adidasModel3 = Model.builder()
                .id(15L)
                .name("Training Shorts")
                .build();

        Model nikeModel1 = Model.builder()
                .id(16L)
                .name("Air Max Running Shoes")
                .build();

        Model nikeModel2 = Model.builder()
                .id(17L)
                .name("Sportswear Joggers")
                .build();

        Model nikeModel3 = Model.builder()
                .id(18L)
                .name("Dri-FIT Training Top")
                .build();

        modelService.saveAll(List.of(maviModel1,maviModel2,maviModel3,pentiModel1,pentiModel2,
                pentiModel3,addaxModel1,addaxModel2,addaxModel3,lcWaikikiModel1,lcWaikikiModel2,
                lcWaikikiModel3,adidasModel1,adidasModel2,adidasModel3,nikeModel1,nikeModel2,nikeModel3));

    }

    private void createProduct(){
        Product maviproduct1 = Product.builder()
                .id(1L)
                .name("Mavi Slim Fit Jeans Yeni")
                .brandId(1L)
                .modelId(2L)
                .stock(45_000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(750.0)
                .build();
        Product maviproduct2 = Product.builder()
                .id(2L)
                .name("Mavi Cotton T-Shirt")
                .brandId(1L)
                .modelId(3L)
                .stock(10_000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(456.0)
                .build();
        Product pentiproduct1 = Product.builder()
                .id(3L)
                .name("Penti Microfiber Panties")
                .brandId(2L)
                .modelId(6L)
                .stock(42_000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(53.0)
                .build();
        Product pentiproduct2 = Product.builder()
                .id(4L)
                .name("Penti Seamless Bralette Kısa Çorap")
                .brandId(2L)
                .modelId(3L)
                .stock(20_000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(50.0)
                .build();
        Product addaxproduct1 = Product.builder()
                .id(5L)
                .name("Addax Running Shoes")
                .brandId(3L)
                .modelId(7L)
                .stock(28_00L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(680.0)
                .build();
        Product addaxproduct2 = Product.builder()
                .id(6L)
                .name("Addax Training Leggings")
                .brandId(3L)
                .modelId(8L)
                .stock(1000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(450.0)
                .build();
        Product lcWaikikiproduct1 = Product.builder()
                .id(7L)
                .name("Waikiki Hooded Sweatshirt")
                .brandId(4L)
                .modelId(10L)
                .stock(1000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(450.0)
                .build();
        Product lcWaikikiproduct2 = Product.builder()
                .id(8L)
                .name("Waikiki Straight Fit Jeans")
                .brandId(4L)
                .modelId(11L)
                .stock(1000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(450.0)
                .build();
        Product adidasproduct1 = Product.builder()
                .id(9L)
                .name("Adidas Ultra Boost Sneakers")
                .brandId(5L)
                .modelId(13L)
                .stock(1000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(1200.0)
                .build();
        Product adidasproduct2 = Product.builder()
                .id(10L)
                .name("Adidas Training Shorts")
                .brandId(5L)
                .modelId(15L)
                .stock(1000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(1100.0)
                .build();
        Product nikeproduct1 = Product.builder()
                .id(11L)
                .name("Nike Air Max Running Shoes New")
                .brandId(6L)
                .modelId(16L)
                .stock(12_000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(1300.0)
                .build();
        Product nikeproduct2 = Product.builder()
                .id(12L)
                .name("Nike Sportswear Joggers")
                .brandId(6L)
                .modelId(17L)
                .stock(10_000L)
                .baseEntity(BaseEntity.builder()
                        .createAt(System.currentTimeMillis())
                        .updateAt(System.currentTimeMillis())
                        .build())
                .price(999.0)
                .build();

        productService.saveAll(List.of(maviproduct1,maviproduct2,
                pentiproduct1,pentiproduct2,addaxproduct1,addaxproduct2,
                lcWaikikiproduct1,lcWaikikiproduct2,adidasproduct1,adidasproduct2,
                nikeproduct1,nikeproduct2));
    }

    private void createProductFeature(){
        ProductFeature pf1 = ProductFeature.builder()
                .featureId(1L)
                .productId(1L)
                .build();
        ProductFeature pf2 = ProductFeature.builder()
                .featureId(2L)
                .productId(1L)
                .build();
        ProductFeature pf3 = ProductFeature.builder()
                .featureId(3L)
                .productId(1L)
                .build();
        ProductFeature pf4 = ProductFeature.builder()
                .featureId(4L)
                .productId(2L)
                .build();
        ProductFeature pf5 = ProductFeature.builder()
                .featureId(5L)
                .productId(2L)
                .build();
        ProductFeature pf6 = ProductFeature.builder()
                .featureId(6L)
                .productId(2L)
                .build();
        ProductFeature pf7 = ProductFeature.builder()
                .featureId(7L)
                .productId(3L)
                .build();
        ProductFeature pf8 = ProductFeature.builder()
                .featureId(8L)
                .productId(3L)
                .build();
        ProductFeature pf9 = ProductFeature.builder()
                .featureId(9L)
                .productId(3L)
                .build();
//--------------------
        ProductFeature pf10 = ProductFeature.builder()
                .featureId(10L)
                .productId(4L)
                .build();
        ProductFeature pf11 = ProductFeature.builder()
                .featureId(11L)
                .productId(4L)
                .build();
        ProductFeature pf12 = ProductFeature.builder()
                .featureId(12L)
                .productId(4L)
                .build();
        ProductFeature pf13 = ProductFeature.builder()
                .featureId(1L)
                .productId(5L)
                .build();
        ProductFeature pf14 = ProductFeature.builder()
                .featureId(2L)
                .productId(5L)
                .build();
        ProductFeature pf15 = ProductFeature.builder()
                .featureId(3L)
                .productId(5L)
                .build();
        ProductFeature pf16 = ProductFeature.builder()
                .featureId(1L)
                .productId(6L)
                .build();
        ProductFeature pf17 = ProductFeature.builder()
                .featureId(2L)
                .productId(6L)
                .build();
        ProductFeature pf18 = ProductFeature.builder()
                .featureId(3L)
                .productId(6L)
                .build();
        ProductFeature pf19 = ProductFeature.builder()
                .featureId(4L)
                .productId(7L)
                .build();
        ProductFeature pf20 = ProductFeature.builder()
                .featureId(5L)
                .productId(7L)
                .build();
        ProductFeature pf21 = ProductFeature.builder()
                .featureId(6L)
                .productId(7L)
                .build();
        ProductFeature pf22 = ProductFeature.builder()
                .featureId(7L)
                .productId(8L)
                .build();
        ProductFeature pf23 = ProductFeature.builder()
                .featureId(8L)
                .productId(8L)
                .build();
        ProductFeature pf24 = ProductFeature.builder()
                .featureId(9L)
                .productId(8L)
                .build();
        ProductFeature pf25 = ProductFeature.builder()
                .featureId(7L)
                .productId(9L)
                .build();
        ProductFeature pf26 = ProductFeature.builder()
                .featureId(8L)
                .productId(9L)
                .build();
        ProductFeature pf27 = ProductFeature.builder()
                .featureId(9L)
                .productId(9L)
                .build();
        ProductFeature pf28 = ProductFeature.builder()
                .featureId(10L)
                .productId(10L)
                .build();
        ProductFeature pf29 = ProductFeature.builder()
                .featureId(11L)
                .productId(10L)
                .build();
        ProductFeature pf30 = ProductFeature.builder()
                .featureId(12L)
                .productId(10L)
                .build();
        ProductFeature pf31 = ProductFeature.builder()
                .featureId(1L)
                .productId(11L)
                .build();
        ProductFeature pf32 = ProductFeature.builder()
                .featureId(2L)
                .productId(11L)
                .build();
        ProductFeature pf33 = ProductFeature.builder()
                .featureId(3L)
                .productId(11L)
                .build();
        ProductFeature pf34 = ProductFeature.builder()
                .featureId(10L)
                .productId(12L)
                .build();
        ProductFeature pf35 = ProductFeature.builder()
                .featureId(11L)
                .productId(12L)
                .build();
        ProductFeature pf36 = ProductFeature.builder()
                .featureId(12L)
                .productId(12L)
                .build();
       productFeatureService.saveAll(List.of(pf1,pf2,pf3,pf4,pf5,pf6,pf7,pf8,pf9,
               pf10,pf11,pf12,pf13,pf14,pf15,pf16,pf17,pf18,pf19,pf20,pf21,pf22,pf23,
               pf24,pf25,pf26,pf27,pf28,pf29,pf30,pf31,pf32,pf33,pf34,pf35,pf36));



    }




}
