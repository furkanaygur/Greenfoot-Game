import lang.stride.*;
import java.util.*;
import greenfoot.*; 
 
public class Airplane extends Araclar
{
     
   private int skor=0;
       
   
    public void act()
    {
        move(2);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(3);
        }
      
        benzinal();
        
         if(getX() >= 1050 )
            {
            setLocation(0,getY());
            }
        
            else if(getX() <= 0 )
            {
            setLocation(1050,getY());
            }
            
             if(getY() >= 700 )
            {
            setLocation(getX(),0);
            }
            
        else  if(getY() <= 1 )
            {
            setLocation(getX(),700);
            }
         
    }
    
     
    
    
    public void benzinal()
    {   
        if(isTouching(Gallon.class))
        {  
        removeTouching(Gallon.class);
        skor=skor+1;
        getWorld().showText(skor+" BENZİN ALDIN TEBRİKLER.", 550, 125);
        yenibenzin();
        Arkaplan arkaplan = (Arkaplan)getWorld();
        arkaplan.addSure(70);
         
        }
        
    }

    
    
    public void yenibenzin()
    {
        Gallon yeniGal;
        yeniGal = new Gallon();
        World dunya;
        dunya = getWorld();
        
            Gallon gallon = new Gallon();
            dunya.addObject(gallon,Greenfoot.getRandomNumber(dunya.getWidth()),Greenfoot.getRandomNumber(dunya.getHeight()));
        
    }
}
