public class Main {
    public static void main(String[] args) {

        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("blememne1.jpg");

        Product product2 = new Product();
        product2.setName("Belrial Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(4);
        product2.setUnitsInStock(5);
        product2.setImageUrl("blememne2.jpg");

        Product product3 = new Product();
        product3.setName("Arial Kahve Makinesi");
        product3.setUnitPrice(5500);
        product3.setDiscount(3);
        product3.setUnitsInStock(7);
        product3.setImageUrl("blememne3.jpg");


        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0538456466");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Fuat");
        individualCustomer.setLastName("Kuzu");

        CorporateCustomer corporateCustomer= new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Greater.web");
        corporateCustomer.setPhone("21561355165");
        corporateCustomer.setTaxNumber("111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers ={individualCustomer,corporateCustomer};
    }
}