    void setup(){
        size(1000,1000);  

    }

    void draw(){
for(int i =600; i>0; i-=1)
{
  
  ellipse(300,300,i,i);
  if(i/10 % 2 ==0)
{
  fill(#000000);
}
else
{
  fill(#FF0303);
}
}
  for(int j = 0; j < 25; j++)
  {
    
  }

    }
