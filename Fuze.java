import lang.stride.*;
import java.util.*;
import greenfoot.*;
 
public class Fuze extends Actor
{

   
    public void act()
    {
        move(4);
        if(Greenfoot.getRandomNumber(120)<10)
         {
          turn(Greenfoot.getRandomNumber(15)-30);
         
         }
        eatUcak();
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

    public void eatUcak()
    {   
        
    if(isTouching(Airplane.class))
        {  
          
        removeTouching(Airplane.class);
         getWorld().showText("PATLADIN!!",550,100);
         setImage("olum.png");
          Greenfoot.delay(30);
         Greenfoot.stop();
            gameover2 finish = new gameover2();
    getWorld().addObject(finish, getWorld().getWidth()/2, getWorld().getHeight()/2);
       
        }
        
    }
}
