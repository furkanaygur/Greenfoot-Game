import greenfoot.*;  


public class Gallon extends Actor
{
 
    public void act() 
    {
        move(1);
         
            if(getX() >= 1000 )
            {
            setLocation(0,getY());
            }
            
    }    
}
