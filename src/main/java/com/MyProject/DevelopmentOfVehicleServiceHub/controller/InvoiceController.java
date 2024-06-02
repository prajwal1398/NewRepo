package com.MyProject.DevelopmentOfVehicleServiceHub.controller;

import com.MyProject.DevelopmentOfVehicleServiceHub.model.Invoice;
import com.MyProject.DevelopmentOfVehicleServiceHub.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/invoices")

public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;

    @GetMapping
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable Long id) {
        return invoiceService.getInvoiceById(id);
    }

    @PostMapping
    public Invoice createInvoice(@RequestBody Invoice invoice) {
        return invoiceService.createInvoice(invoice);
    }

    @PutMapping("/{id}")
    public Invoice updateInvoice(@PathVariable Long id, @RequestBody Invoice invoiceDetails) {
        return invoiceService.updateInvoice(id, invoiceDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteInvoice(@PathVariable Long id) {
        invoiceService.deleteInvoice(id);
    }

    @GetMapping("/customer/{customerName}")
    public List<Invoice> getInvoicesByCustomerName(@PathVariable String customerName) {
        return invoiceService.getInvoicesByCustomerName(customerName);
    }

    @GetMapping("/payment-status/{paymentStatus}")
    public List<Invoice> getInvoicesByPaymentStatus(@PathVariable String paymentStatus) {
        return invoiceService.getInvoicesByPaymentStatus(paymentStatus);
    }

    @GetMapping("/date-range/{startDate}/{endDate}")
    public List<Invoice> getInvoicesByDateRange(@PathVariable Date startDate, @PathVariable Date endDate) {
        return invoiceService.getInvoicesByDateRange(startDate, endDate);
    }

    @GetMapping("/financial-report")
    public List<Invoice> getInvoicesForFinancialReport() {
        return invoiceService.getInvoicesForFinancialReport();
    }

}
