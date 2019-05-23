
import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Arkaplan extends World
{   

    public int sure=700;
    
   public void addSure(int surre)
   {
    sure=sure+surre;
    }
    public void act()
    {
        sure--; 
        this.showText(""+sure/70, 57, 60);
        if(sure<=0)
        {   
            Greenfoot.delay(20);
            Greenfoot.stop();
            gameover finish = new gameover();
            this.addObject(finish, getWidth()/2, getHeight()/2);     
         
        }
       

    }

    public Arkaplan()
    {
        super(1080, 720, 1);

        GreenfootImage arkaplan = new GreenfootImage(getWidth(),getHeight()); 
        arkaplan.setColor(new Color(170,210,255));
        arkaplan.fill();
        // for(int i=0;i<10;i++)
        //{
        //  arkaplan.drawImage(new GreenfootImage("cloud.png"), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));  

        // }
        setBackground(arkaplan);
        islemler();

      
    }

    private void islemler()
    {   
        Airplane ucak = new Airplane();
        addObject(ucak,75,360);

        for(int i=0;i<5;i++)
        {
            Gallon gallon = new Gallon();
            addObject(gallon,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }

        for(int i=0;i<4;i++)
        {
            int a=Greenfoot.getRandomNumber(getWidth());
            int b=Greenfoot.getRandomNumber(getHeight());

            if(a<180 && a>0 || b<460 && b>180)
            {
                a=Greenfoot.getRandomNumber(getWidth());
                b=Greenfoot.getRandomNumber(getHeight());
                i=i-1;
            }
            else {
                Fuze fuze = new Fuze();
                addObject(fuze,a,b);
            }

        }
        for(int i=0;i<10;i++)
        {
            bulut bulut = new bulut();
            addObject(bulut,Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));

        }
        Sure sure = new Sure();
        addObject(sure,56,65);
    }
    
   
     
}
