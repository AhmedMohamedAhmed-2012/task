/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author AL-Motahida
 */
public class ball implements tossable {
    String brandName;

    public ball() {
    }

    public ball(String brandName) {
        this.brandName = brandName;
    }
    
    @Override
    public void toss()
    {
        
        
    }

    public void ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    public void bounce()
    {
        
    }
    
}
