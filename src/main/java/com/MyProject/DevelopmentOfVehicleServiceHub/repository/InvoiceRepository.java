package com.MyProject.DevelopmentOfVehicleServiceHub.repository;

import com.MyProject.DevelopmentOfVehicleServiceHub.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByCustomerName(String customerName);

    List<Invoice> findByPaymentStatus(String paymentStatus);

    List<Invoice> findByInvoiceDateBetween(Date startDate, Date endDate);

    Double getTotalRevenue();

    Double getTotalExpenses();

    Double getProfitability();

    List<Invoice> getInvoicesForFinancialReport();
}
