public class Main {
    public static void main(String[] args) {
        ComplexType complexType = new ComplexType(10);
        SecondLevl secondLevl = new SecondLevl("ObjectA", complexType, Status.ACTIVE, 3.14);

        ThirdLevel objectB = new ThirdLevel(true);
        ThirdLevel objectC = new ThirdLevel(false);

        System.out.println("ObjectA:");
        SecondLevl objectA = null;
        System.out.println("Name: ");
        System.out.println("ComplexType value: ");
        System.out.println("Status: ");
        System.out.println("Value: ");

        System.out.println("\nObjectB: " + objectB);
        System.out.println("ObjectC: " + objectC);
    }

}
        