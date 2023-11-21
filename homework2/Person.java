public class Person {
    private int varsta;
    private boolean insotitDeMama;
    private boolean insotitDeTata;
    private boolean pasaport;
    private boolean actPermisiuneMama;
    private boolean actPermisiuneTata;

    public Person(int varsta, boolean insotitDeMama, boolean insotitDeTata, boolean pasaport, boolean actPermisiuneMama, boolean actPermisiuneTata) {
        this.varsta = varsta;
        this.insotitDeMama = insotitDeMama;
        this.insotitDeTata = insotitDeTata;
        this.pasaport = pasaport;
        this.actPermisiuneMama = actPermisiuneMama;
        this.actPermisiuneTata = actPermisiuneTata;
    }

    public static boolean sePoateImbarca(Person person) {
        if (person.varsta >= 18) {
            return person.pasaport;
        }
        else if (person.pasaport){
            if (person.insotitDeMama && person.insotitDeTata)
                return true;
            else return (person.insotitDeMama && person.actPermisiuneTata) || (person.insotitDeTata && person.actPermisiuneMama);
        }
        else return false;
    }
}
