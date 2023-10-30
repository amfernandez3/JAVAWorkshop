public class Personaje {
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int nivel;

    public Personaje(int vitalidad, int ataque, int defensa, int nivel) {
        this.vitalidad = vitalidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
    }

    //Setter y Getters


    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
