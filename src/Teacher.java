public class Teacher extends Person{

    private String teachingMajor;
    private int teachingExperience;
    private String typeOfEdu;
    private int ageOfTeacher;
    private boolean isMarried;


    public Teacher(String userName, String email, int phoneNumber, String image) {
        super(userName, email, phoneNumber, image);
    }

    @Override
    public String toConnecting(String userName, String email, long phoneNumber) {
        return "Details of a Teacher\n   "+
                "Name: "+getUserName()+
                "\n   Email: "+getEmail()+
                "\n   PhoneNumber: "+phoneNumber;
    }

    @Override
    public String profession() {
        return "Major Of Techer\n   "+
                "Name "+getUserName()+
                "\n   Profession: "+getTeachingMajor()+
                "\n   Teaching experience: "+getTeachingExperience()+
                "\n   Type of Education: "+getTypeOfEdu()+
                "\n   Age: "+getAgeOfTeacher()+
                "\n   Is Married: "+isMarried(ageOfTeacher);
    }

    public String getTeachingMajor() {
        return teachingMajor;
    }

    public void setTeachingMajor(String teachingMajor) {
        this.teachingMajor = teachingMajor;
    }

    public int getTeachingExperience() {
        return teachingExperience;
    }

    public void setTeachingExperience(int teachingExperience) {
        this.teachingExperience = teachingExperience;
    }

    public String getTypeOfEdu() {
        return typeOfEdu;
    }

    public void setTypeOfEdu(String typeOfEdu) {
        this.typeOfEdu = typeOfEdu;
    }
    public int getAgeOfTeacher() {
        return ageOfTeacher;
    }

    public void setAgeOfTeacher(int ageOfTeacher) {
        this.ageOfTeacher = ageOfTeacher;
    }

    public boolean isMarried(int age){
        return age>25;

 }


}
