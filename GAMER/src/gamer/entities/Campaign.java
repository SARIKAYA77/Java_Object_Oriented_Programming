package gamer.entities;

import java.util.Date;

import gamer.service.Entity;

public class Campaign  implements Entity {

    private int id;
    private String campaignName;
    private int discountRate;
    private boolean active;
    private Date startingDate;


    public Campaign(int id, String campaignName, int discountRate, boolean active, Date startingDate) {
        super();
        this.id = id;
        this.campaignName = campaignName;
        this.discountRate = discountRate;
        this.active = active;
        this.startingDate = startingDate;
    }


    public Date getStartingDate() {
        return startingDate;
    }


    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }


    public Campaign() {
        super();
    }


    public Campaign(int id, String campaignName, int discountRate, boolean active) {
        super();
        this.id = id;
        this.campaignName = campaignName;
        this.discountRate = discountRate;
        this.active = active;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getCampaignName() {
        return campaignName;
    }


    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }


    public int getDiscountRate() {
        return discountRate;
    }


    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }


    public boolean isActive() {
        return active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }







}