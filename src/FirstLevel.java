public class FirstLevel {
    private String name;
    private ComplexType complexType;
    private Status status;

    public FirstLevel(String name, ComplexType complexType, Status status) {
        this.name = name;
        this.complexType = complexType;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public ComplexType getComplexType() {
        return complexType;
    }

    public Status getStatus() {
        return status;
    }
}
