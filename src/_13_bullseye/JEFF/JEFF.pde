    void setup(){
        size(1000,1000); 
        
        int size=400;
        for(int i =0; i < 20; i++)
        {
          ellipse(200,200,size,size);
          size-=20;
        }
    }
