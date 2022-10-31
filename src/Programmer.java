public class Programmer extends Person {
    private String majorOfProgramming;
    private String portfolioes;
    private int workExperience;

    public Programmer(String userName, String email, int phoneNumber, String image) {
        super(userName, email, phoneNumber, image);

    }

    @Override
    public String toConnecting(String userName, String email, long phoneNumber) {
        return "Dasturchi:\n   NickName: "+userName+
                "\n   Major of programmming : "+majorOfProgramming+
                "\n   Partfolio: "+portfolioes+
                "\n   Email: "+email+
                "\n   PhoneNumber: "+phoneNumber+"\n   ";

    }

    @Override
    public String profession() {
        return "Software enginer\n   " +
                "NickName: "+getUserName()+
                "\n   Major: "+majorOfProgramming+
                "\n   Work experience: "+workExperience;
    }

    public String getMajorOfProgramming() {
        return majorOfProgramming;
    }

    public void setMajorOfProgramming(String majorOfProgramming) {
        this.majorOfProgramming = majorOfProgramming;
    }

    public String getPortfolioes() {
        return portfolioes;
    }

    public void setPortfolioes(String portfolioes) {
        this.portfolioes = portfolioes;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}
