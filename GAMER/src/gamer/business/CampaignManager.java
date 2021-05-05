package gamer.business;

import gamer.entities.Campaign;
import gamer.service.CampaignService;

public class CampaignManager implements CampaignService{

    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya olusturuldu -> "+campaign.getCampaignName());
        System.out.println("Kampanya baslangic tarihi : "+campaign.getStartingDate()+"\n");

    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya bilgileri guncellendi -> "+campaign.getCampaignName());

    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Kampanya silindi -> " +campaign.getCampaignName());

    }

}