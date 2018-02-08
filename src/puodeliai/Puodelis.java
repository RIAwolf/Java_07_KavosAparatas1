package puodeliai;

public class Puodelis {
    private int maxTalpa;
    private int dabartineTalpa;

    public int getMaxTalpa() {
        return maxTalpa;
    }

    public void setMaxTalpa(int maxTalpa) {
        this.maxTalpa = maxTalpa;
    }

    public int getDabartineTalpa() {
        return dabartineTalpa;
    }

    public void setDabartineTalpa(int dabartineTalpa) {
        this.dabartineTalpa = dabartineTalpa;
    }

    @Override
    public String toString() {
        return "Mano talpa: " + maxTalpa;
    }
}
