public class Shifokor extends Person {

    private String doctor;
    private String comment;


    public Shifokor(String userName, String email, long phoneNumber, String image ,String doctor ) {
        super(userName, email, (int) phoneNumber, image);
        setDoctor(doctor);
    }

    @Override
    public String profession() {
        return "Malakali shifokor :\n   "+getImage()+"\n   "+doctor+"\n   "+getUserName()+"\n   "+getComment();
    }

    @Override
    public String toConnecting(String userName, String email, long phoneNumber) {
        return " To Connect with "+doctor+"\n"+"Nickname: "+userName+"\n"+"Email: "+email+"\n"+"PHoneNumber: "+getPhoneNumber();
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }


    public String getComment() {
        return comment;
    }


    public void setComment(String comment) {
        this.comment = comment;
    }
}
