public class Artifact {

    int number;
    String culture;
    int age;
    static int count = 0;

    public Artifact(int number){
        count++;
        this.number = number;
    }
    public Artifact(int number,String culture){
        count++;
        this.number = number;
        this.culture = culture;
    }
    public  Artifact (int number, String culture, int age){
        count++;
        this.number = number;
        this.culture = culture;
        this.age = age;
    }
    public static void main(String[] args) {

        Artifact artifactpoor = new Artifact(2121);
        Artifact artifactparcial = new Artifact(2235,"Atstect");
        Artifact artifactfull = new Artifact (4455,"RTY",450);


        System.out.println("ID     Culture    Age ");
        System.out.println(artifactpoor.number);
        System.out.println(artifactparcial.number + "   " + artifactparcial.culture );
        System.out.println(artifactfull.number + "    " + artifactfull.culture + "       " + artifactfull.age);
        System.out.println("---------------------" );
        System.out.println("Total Artifacts:  " + count);
        }
}

