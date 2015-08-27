/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.rehbermaven.bean;

import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import tr.gov.ptt.rehbermaven.entity.Kisi;
import tr.gov.ptt.rehbermaven.service.KisiService;
import tr.gov.ptt.rehbermaven.util.JSPUtil;

/**
 *
 * @author BEM
 */

@ManagedBean
@RequestScoped
public class KisiBean {
    
    private Kisi kisi = new Kisi();
    
    @EJB
    private KisiService kisiService; 

    public KisiBean() {
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }
    
    
    public String ekle(){
        kisiService.ekle(kisi);
        JSPUtil.mesajGoster("Kisi Eklendi", kisi.getAd()+" "+kisi.getSoyad()+" eklendi.");
        
        return "kisiListele.xhtml?faces-redirect=true";
    }
    
    public List<Kisi> getKisiListe(){
        
        return kisiService.kisileriGetir();
        
    }
    
    
    
    
}
