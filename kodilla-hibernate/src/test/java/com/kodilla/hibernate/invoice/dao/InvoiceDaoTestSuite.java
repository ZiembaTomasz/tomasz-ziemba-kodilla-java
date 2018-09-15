package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        Product product = new Product("ELECTRONICS");
        Product product1 = new Product("VEHICLES");
        Item item = new Item(new BigDecimal(20),50,new BigDecimal(20));
        Item item1 = new Item(new BigDecimal(10), 20, new BigDecimal(10));
        item.setProduct(product);
        item1.setProduct(product1);
        Invoice invoice = new Invoice("50");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);


        productDao.save(product);
        productDao.save(product1);
        invoiceDao.save(invoice);
        int id = invoice.getId();




        Assert.assertEquals(1, id);

        invoiceDao.delete(id);





    }
}