import greenfoot.*;   

 
public class Rocket extends Actor
{   
    
   public void act() 
    {
           
        
        if (Greenfoot.isKeyDown("up")) {
           setLocation(getX(),getY()-5);
        }
        if (Greenfoot.isKeyDown("down")) {
           setLocation(getX(),getY()+5);
        }
        
         if (Greenfoot.isKeyDown("right")) {
           setLocation(getX()+5,getY());
        }
        if (Greenfoot.isKeyDown("left")) {
           setLocation(getX()-5,getY());
        }
        
         if ("space".equals(Greenfoot.getKey())) {
           fire();
        }
         if(getX() >= 1050 )
            {
            setLocation(0,getY());
            }
        
           
            
             if(getY() >= 700 )
            {
            setLocation(getX(),0);
            }
            
        else  if(getY() <= 1 )
            {
            setLocation(getX(),700);
            }
            addPrize();
    } 
    public void fire()
    {
        shoting shoting = new shoting();
        getWorld().addObject(shoting, getX(),getY());
       
    
    }
      public void addPrize()
    {   
        if(isTouching(Prize.class))
        {  
        removeTouching(Prize.class);
        Back back = (Back)getWorld();
        back.addSeconds(70);
        }
     }    
}
