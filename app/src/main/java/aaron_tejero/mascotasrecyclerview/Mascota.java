package aaron_tejero.mascotasrecyclerview;

/**
 * Created by AaronTejero on 15/05/2016.
 */
public class Mascota {
    int foto;
    String nombre;
    int raiting;

    public Mascota(int foto, String nombre, int raiting){
        this.foto=foto;
        this.nombre=nombre;
        this.raiting=raiting;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
