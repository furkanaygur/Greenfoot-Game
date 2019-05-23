import greenfoot.*;   

 
public class Stars extends Actor
{
    
    public void act() 
    {
       move(-1);
       
        if(getX() <= 0 )
            {
            setLocation(1000,getY());
            }
    }    
}
