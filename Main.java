public class Main {
    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            LPAStudent s =new LPAStudent("S93948"+i,switch (i){
//                case 1->"Mary";
//                case 2->"Carol";
//                case 3->"Tim";
//                case 4->"Harry";
//                case 5->"Lisa";
//                default -> "Anonymous";
//            },"09/06/1999","Java Class");
//
//            System.out.println(s);
//        }
    Student pojoStudent=new Student("0001","chy","09/06/99","java class");
        LPAStudent recordStudent=new LPAStudent("0002","sanju","06/09/1999","java class");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        pojoStudent.setClassName(pojoStudent.getClassName()+", java OCP Exam 829");
//        recordStudent.className(recordStudent.className()+", java OCP Exam 829");
        System.out.println(pojoStudent.getName()+" is taking "+pojoStudent.getClassName());
        System.out.println(recordStudent.name()+" is taking "+recordStudent.className());
    }
}