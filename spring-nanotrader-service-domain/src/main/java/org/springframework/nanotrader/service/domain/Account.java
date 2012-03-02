package org.springframework.nanotrader.service.domain;



import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
/**
 *  Account
 *  @author Brian Dussault 
 *  @author
 */

public class Account {

    private Set<Order> orders;
    private Date creationdate;
    private BigDecimal openbalance;
    private Integer logoutcount;
    private BigDecimal balance;
    private Date lastlogin;
    private Integer logincount;

	public Set<Order> getOrders() {
        return orders;
    }

	public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }


	public Date getCreationdate() {
        return creationdate;
    }

	public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

	public BigDecimal getOpenbalance() {
        return openbalance;
    }

	public void setOpenbalance(BigDecimal openbalance) {
        this.openbalance = openbalance;
    }

	public Integer getLogoutcount() {
        return logoutcount;
    }

	public void setLogoutcount(Integer logoutcount) {
        this.logoutcount = logoutcount;
    }

	public BigDecimal getBalance() {
        return balance;
    }

	public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

	public Date getLastlogin() {
        return lastlogin;
    }

	public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

	public Integer getLogincount() {
        return logincount;
    }

	public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }


    private Integer accountid;

	public Integer getAccountid() {
        return this.accountid;
    }

	public void setAccountid(Integer id) {
        this.accountid = id;
    }


}
