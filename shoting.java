import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
public class shoting extends Actor
{
     public int meteorHeal=10;
    public void act() 
    {
        move(6); 
        removeMeteor();
        if(getX()>=999)
        {
        getWorld().removeObject(this);
        }
        
    }  
    
    public void removeMeteor()
    {
       if(isTouching(Meteor.class))
        {  
          meteorHeal--;
          if(meteorHeal==0)
          {
        removeTouching(Meteor.class);
     
        Back back = (Back)getWorld();
        back.addScore(10);
        Meteor meteor = new Meteor();
        for (int i=Greenfoot.getRandomNumber(3);i>=0;i--)
        {
        getWorld().addObject(meteor,990,Greenfoot.getRandomNumber(getWorld().getHeight()));
       }
    }
        
        }
        
    }
     
     
}
