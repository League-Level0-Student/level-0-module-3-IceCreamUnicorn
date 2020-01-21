    void setup(){
        size(1000,1000); 
       
      }
      int speed = 10;
       int x = 0;
       int x2 = 1000;
        void draw()
        
        {
          noFill();
        int size=400;
        if(x>=1000 && x<=0)
      {
        speed*=-1;
      }
        background (#ffffff);
        for(int i =0; i < 20; i++)
        {
          
          ellipse(x,200,size,size);
          size-=20;
      
       }
   x+=speed;
      
       
        
        
         size=400;
        
        for(int i =0; i < 20; i++)
        {
          
          ellipse(x2,200,size,size);
          size-=20;
      
       }
       
         x2-=speed;
      
    }
