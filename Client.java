package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String clientName;
    private String email;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    public Client() {}

    public Client(String clientName, String email, String phone,
                  FinancialAdvisor advisor, Portfolio portfolio) {
        this.clientName = clientName;
        this.email = email;
        this.phone = phone;
        this.advisor = advisor;
        this.portfolio = portfolio;
    }

    public Long getClientId() { return clientId; }
    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public FinancialAdvisor getAdvisor() { return advisor; }
    public void setAdvisor(FinancialAdvisor advisor) { this.advisor = advisor; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
