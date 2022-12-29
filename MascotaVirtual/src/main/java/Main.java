import modelos.DukeMascota;
import modelos.Mascota;
import persistencia.persistenceCollections.IMascotaPersistenceUseList;

public class Main {

    public static void main(String[] args) {

        IMascotaPersistenceUseList persistence = new IMascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Duke-Merlina", "Lucia" );
        DukeMascota duke2 = new DukeMascota("Duke-Milo", "Lucia" );
        DukeMascota duke3 = new DukeMascota("Duke-Layka", "Lucia" );
        persistence.guardar(duke);
        persistence.guardar(duke2);
        persistence.guardar(duke3);

        for (Mascota mascota : persistence.getAllMascotas()) {
            System.out.println(mascota);
        }

    }

}
