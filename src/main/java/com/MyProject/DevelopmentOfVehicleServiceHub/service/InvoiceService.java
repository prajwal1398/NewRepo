package com.MyProject.DevelopmentOfVehicleServiceHub.service;

import com.MyProject.DevelopmentOfVehicleServiceHub.model.Invoice;
import com.MyProject.DevelopmentOfVehicleServiceHub.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice getInvoiceById(Long id) {
        return invoiceRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Invoice not found"));
    }

    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public Invoice updateInvoice(Long id, Invoice invoiceDetails) {
        Invoice invoice = getInvoiceById(id);
        invoice.setInvoiceNumber(invoiceDetails.getInvoiceNumber());
        invoice.setInvoiceDate(invoiceDetails.getInvoiceDate());
        invoice.setTotalAmount(invoiceDetails.getTotalAmount());
        invoice.setPaidAmount(invoiceDetails.getPaidAmount());
        invoice.setBalanceAmount(invoiceDetails.getBalanceAmount());
        invoice.setPaymentStatus(invoiceDetails.getPaymentStatus());
        invoice.setPaymentMethod(invoiceDetails.getPaymentMethod());
        invoice.setCustomerName(invoiceDetails.getCustomerName());
        invoice.setCustomerAddress(invoiceDetails.getCustomerAddress());
        return invoiceRepository.save(invoice);
    }

    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }

    public List<Invoice> getInvoicesByCustomerName(String customerName) {
        return invoiceRepository.findByCustomerName(customerName);
    }

    public List<Invoice> getInvoicesByPaymentStatus(String paymentStatus) {
        return invoiceRepository.findByPaymentStatus(paymentStatus);
    }

    public List<Invoice> getInvoicesByDateRange(Date startDate, Date endDate) {
        return invoiceRepository.findByInvoiceDateBetween(startDate, endDate);
    }

    public Double getTotalRevenue() {
        return invoiceRepository.getTotalRevenue();
    }

    public Double getTotalExpenses() {
        return invoiceRepository.getTotalExpenses();
    }

    public Double getProfitability() {
        return invoiceRepository.getProfitability();
    }

    public List<Invoice> getInvoicesForFinancialReport() {
        return invoiceRepository.getInvoicesForFinancialReport();
    }

}

