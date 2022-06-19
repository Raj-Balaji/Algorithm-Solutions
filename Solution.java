

class Solution {
    public boolean isRobotBounded(String instructions) {
        
        
        /*
            Summary: We have to find a closed loop of sorts
                    Essentially, we keep following the instructions
                    until the robot ends at its original location with the same direction/same order of instructions
                    
            Example: if our robot starts at 0,0 with GL.... (n instructions in the same order)
            
            and at any point, the robot is at 0,0, facing the same direction with "n" instructions
            
            we have a closed loop
        
            
            Brute force method -> repeat instructions until we cycle back to the same original spot we started at
            
            a.k.a 
            Step1 : Repeat instruction, keep track of original spawn (0,0) and original direction (North)
            Step2 : If robot ends at (0,0) with direction = North & loop restarts -> closed loop
        */
        
        String move;
        int x=0,y=0;
        int direction = 0;
        // %4
        // North = 0
        // West = 1
        // South =2
        // East = 3
        int loop=0;
        while(loop<100)
        {
            if(loop!=0 && x ==0 && y==0 && direction ==0)
            {
                System.out.println("Infinite closed loop");
                loop=-1;
                break;
            }
             for(int i=0;i<instructions.length();i++)
                {
                move = instructions.substring(i,i+1);
                if(move.equals("G"))
                {
                    if(direction==0)
                        y++;
                    if(direction==2)
                        y--;
                    if(direction==3)
                        x++;
                    if(direction==1)
                        x--;
                }
                else if (move.equals("L"))
                {
                    direction++;
                    direction = direction%4;
                }
                else {
                        if(direction==0)
                            direction=3;
                    else direction--;
                    
                }   
             }
            loop++;
        }
       if(loop==-1)
           return true;
        return false;
    }
}
