import edu.duke.*;
import java.io.File;


public class PerimeterAssignmentRunner {
    public int getNumPoints (Shape s) {
         //Start the counter at 0
         int count = 0;
         //For each point increment the counter by 1
        for (Point p : s.getPoints()) {
            count = count + 1;
        }
        
        return count;
    }

    public double getAverageLength(Shape s) {
        
        return getPerimeter(s)/getNumPoints(s);
    }

    public double getLargestSide(Shape s) {
           double largestSide = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {   
            // Find distance from prevPt point to currPt 
            double currSide = prevPt.distance(currPt);
            if(currSide > largestSide){
                largestSide = currSide;
            }
        }
        return largestSide;
    }

    public double getLargestX(Shape s) {
           double largestX = 0.0;
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {    
            double currX = currPt.getX();
            if(currX > largestX){
                largestX = currX;
            }
        }

        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
           double largestPerim = 0.0;
           DirectoryResource dr = new DirectoryResource();
        // For each file in set,
        for (File f : dr.selectedFiles()) {  
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            if(getPerimeter(s) > largestPerim) {
                largestPerim = getPerimeter(s);
            }
        }
        return largestPerim;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;
        double largestPerim = 0.0;
        DirectoryResource dr = new DirectoryResource();
                for (File f : dr.selectedFiles()) {  
            FileResource fr = new FileResource(f);  
            Shape s = new Shape(fr);
           if(getPerimeter(s) > largestPerim) {
               largestPerim = getPerimeter(s);
               temp = f;
            }
        }
            // replace this code
        return temp.getName();
    }

    public void testPerimeterMultipleFiles() {
        // Put code here
        System.out.println("the largest perimeter is " + getLargestPerimeterMultipleFiles());
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
        System.out.println("and the name of the file with the largest perimeter is . . . " + getFileWithLargestPerimeter());
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }
        public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double perimeter = getPerimeter(s);
        System.out.println("perimeter = " + perimeter);
        System.out.println("number of points = " + getNumPoints(s));
        System.out.println("average length = " + getAverageLength(s));
        System.out.println("largest side = " + getLargestSide(s));
        System.out.println("largest X = " + getLargestX(s));
    }
    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        
        pr.testPerimeter();
        
    }


}
