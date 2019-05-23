import greenfoot.*;  

 
public class Prize extends Actor
{
     
    public void act() 
    {
        move(Greenfoot.getRandomNumber(2)-3);
        
          
         if(getX() <= 0 )
            {
            getWorld().removeObject(this);
            }
    }    
}
