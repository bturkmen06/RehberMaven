/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.rehbermaven.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import tr.gov.ptt.rehbermaven.entity.Giris;
import tr.gov.ptt.rehbermaven.facade.GirisFacade;

/**
 *
 * @author BEM
 */
@Stateless
public class GirisService {
    
    @EJB
    private GirisFacade girisFacade;
    
    public boolean giriseYetkilimi(Giris p_giris){
        
        return girisFacade.girisKontrol(p_giris);
        
    }
}
