import greenfoot.*;  
 
public class Araclar extends Actor
{
    public boolean haritasonu() 
   {
      if(getX()<10 || getX() > getWorld().getWidth() - 10)
       {
           return true;
       }
      if(getY() < 10 || getY() > getWorld().getHeight() - 10)
       {
           return true;
       }
       else
       {
        return false;
        }
    }
    
    public void act() 
    {
         
    }    
}
