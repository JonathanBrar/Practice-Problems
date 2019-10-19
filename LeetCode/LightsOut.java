import java.util.ArrayList;


/**
 * The class <b>LightsOut</b> is the
 * class that implements the method to
 * computs solutions of the Lights Out game.
 * It contains the main of our application.
 *
 * @author Jonathan Brar
 */

public class LightsOut {

   




    /**
     * The method <b>solve</b> finds all the 
     * solutions to the <b>Lights Out</b> game 
     * for an initially completely ``off'' board 
     * of size <b>widthxheight</b>, using a  
     * Breadth-First Search algorithm. 
     *
     * It returns an <b>ArrayList&lt;Solution&gt;</b> 
     * containing all the valid solutions to the 
     * problem.
     *
     * During the computation of the solution, the 
     * method prints out a message each time a new 
     * solution  is found, along with the total time 
     * it took (in milliseconds) to find that solution.
     *
     * @param width
     *  the width of the board
     * @param height
     *  the height of the board
     * @return
     *  an instance of <b>ArrayList&lt;Solution&gt;</b>
     * containing all the solutions
     */
    public static ArrayList<Solution> solve(int width, int height){
        ArrayList<Solution> solutions = new ArrayList<Solution>();
        ArrayListSolutionQueue partialSolutions = new ArrayListSolutionQueue();
        Solution current = new Solution(width, height);
        long start; // variable to track start time of timer

        partialSolutions.enqueue(current);

        while(!(partialSolutions.isEmpty())){
            current = partialSolutions.dequeue();
            if (current.isSuccessful()){
                solutions.add(current);
                long time = System.currentTimeMillis() - start;
                System.out.print("Solution found in " + time + "ms ");
            }
            else{
                for (boolean c : current){
                    if(c ==  boolean nextValue){
                        current.setNext(nextValue);

                    }
                    
                    
                    
                    partialSolutions.enqueue(current);
                }

               
                

            }
        }
        return solutions;

    }

       
        

        
        
    

    /**
     * <b>main</b> method  calls the method <b>solve</b> 
     * and then prints out the number of solutions found,
     * as well as the details of each solution.
     *
     * The <b>width</b> and <b>height</b> used by the 
     * main are passed as runtime parameters to
     * the program. If no runtime parameters are passed 
     * to the program, or if the parameters are incorrect,
     * then the default values are used.
     *
     * @param args
     *  Strings array of runtime parameters
     */
    public static void main(String[] args) {

        StudentInfo.display();
       long start, stop , elapsed;

        start = System.currentTimeMillis();

    
    
        stop = System.currentTimeMillis();
        

        int width = 3;
        int height = 3;

        try{
            if(Integer.parseInt(args[0])> 0){
                width = Integer.parseInt(args[0]);
            }
            else{
                System.out.println("wrong width, using 3");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("wrong width, using 3");
        }
        

        try{
            if(Integer.parseInt(args[1])>0){
                height = Integer.parseInt(args[1]);

            }
            else{
                System.out.println("wrong height, using 3");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("wrong height, using 3");
        }

        ArrayList<Solution> solutions = solve(width, height);
        for (int i = 0; i < solutions.size(); i ++){
            System.out.println("**** \n" + solutions.get(i));
        }
        if (solutions.size() > 1){
            System.out.println("In a board of " + width + "x " + height +  ": " + solutions.size() + "solutions.");
        }
        else{
            System.out.println("In a board of " + width + "x " + height + ": " + solutions.size() + "solution.");

        }

        }
        
       



        
    }