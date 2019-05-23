import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends World
{
    public int seconds=2140;
    public int time=30;
    public int score=0;
     public void addSeconds(int secondss)
   {
    seconds=seconds+secondss;
    }
    public void addScore(int scoree)
    {
    score=score+scoree;
    }
    public void act()
    {   
        seconds--;
        this.showText("TİME = "+seconds/70, getWidth()/2, 90);
        this.showText("SCORE = "+score, getWidth()/2, 130);
        if(seconds/70==time-3)
        {   
            Prize prize = new Prize();
            addObject(prize,990,Greenfoot.getRandomNumber(getHeight()));
            time--;
        }
        if(seconds<=0)
        {   
            Greenfoot.delay(20);
            Greenfoot.stop();
            timesup timesup = new timesup();
            this.addObject(timesup, getWidth()/2, getHeight()/2);     
           
        }
    }

 public  Back()
    {    
        super(1080, 720, 1); 
        
        prepare();
    }
    

    private void prepare()
    {
        
        Rocket rocket = new Rocket();
        addObject(rocket,87,386);

        for(int i=0;i<8;i++)
        {
            Meteor meteor = new Meteor();
            addObject(meteor,990,Greenfoot.getRandomNumber(getHeight()));
        }

      
        
        
      
    }
}
