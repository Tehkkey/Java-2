public class PointTester
{
    public static void main(String[] args)
    {
        ThreeDimensionalPoint one = new ThreeDimensionalPoint(5,6,7);
        ThreeDimensionalPoint two = new ThreeDimensionalPoint(5,6,7);
        ThreeDimensionalPoint three = new ThreeDimensionalPoint(5,6,8);
        ThreeDimensionalPoint four = new ThreeDimensionalPoint(5,8,7);
        ThreeDimensionalPoint five  = new ThreeDimensionalPoint(8,6,7);
    
        System.out.println("Expected 0: "+one.compareTo(two));
        System.out.println("Expected < 0: "+one.compareTo(three));
        System.out.println("Expected > 0: "+three.compareTo(one));
        System.out.println("Expected > 0: "+four.compareTo(one));
        System.out.println("Expected < 0: "+one.compareTo(five));
    
    }

}