import greenfoot.*;   

 
public class Meteor extends Actor
{
   public void act() 
    {
        move(Greenfoot.getRandomNumber(4)-5);
        
         
          
          if(getX() <= 0 )
            {
            setLocation(1050,getY());
            }
           
           if(isTouching(Rocket.class))
        {  
        removeTouching(Rocket.class);  
           setImage("boom.png");
            Greenfoot.stop();
             
        } 
    }    
}
