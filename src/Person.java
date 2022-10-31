public class Person {
    private String userName;
    private String email;
    private long phoneNumber;
    private String image;


    public Person(String userName, String email, int phoneNumber,String image){
        this.userName=userName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.image = image;

    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public String toConnecting(String userName, String email, long phoneNumber){
        return "";
    }

    public String profession(){
        return "profession";
    }







}
