package recepcijaStart;

import recepcija.model.Operater;
import recepcija.pomocno.HibernateUtil;
import recepcija.view.Izbornik;

public class Start {

    public static void main(String[] args) {
        new Izbornik().setVisible(true);

        HibernateUtil.getSession();

    }

}
