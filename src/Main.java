public class Main {
    public static void main(String[] args) {


        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n");
        Shifokor stamatolog = new Shifokor("OlimovOfficial", "ONozim@gamail.com", 979998879, "ONozimjon.jpg", "Stomatolog");
        stamatolog.setComment("Bu shfokorimiz \n chet elda malaka oshirib kelgan ");
        System.out.println("\n" + stamatolog.toConnecting("OlimovOfficial", "ONozim@gamail.com", 979998879) + "\n");
        System.out.println(stamatolog.getComment());
        System.out.println(stamatolog.profession() + "\n");

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n");

        Programmer injiner = new Programmer("khusniddin.kh", "xxusanboyev323@gmail.com", 978117074, "xusanboyevx.png");
        injiner.setMajorOfProgramming("Web Backend Developer");
        injiner.setWorkExperience(0);
        injiner.setPortfolioes("7777777 7777777 7777777");
        System.out.println(injiner.profession() + "\n");
        System.out.println(injiner.toConnecting(injiner.getUserName(), injiner.getEmail(), injiner.getPhoneNumber()) + "\n");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n");

        Teacher teacher = new Teacher("Odina Mahkamova", "omakhkamova@gmail.com", 985785624, "m_odina.png");
        teacher.setTeachingMajor("English Language");
        teacher.setTypeOfEdu("At University");
        teacher.setTeachingExperience(10);
        teacher.setAgeOfTeacher(15);

        System.out.println(teacher.toConnecting(stamatolog.getUserName(), injiner.getEmail(), injiner.getPhoneNumber()));

        System.out.println(teacher.profession());

    }
}
