/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import javax.faces.context.FacesContext;

/**
 *
 * @author Simone Bissolotti
 */

public class Tools{

    public static <T> T FindBean(String mangedBeanName, Class<T> beanClass) {
        FacesContext context = FacesContext.getCurrentInstance();
        return beanClass.cast(context.getApplication().evaluateExpressionGet(context, "#{" + mangedBeanName + "}", beanClass));
    }
}
