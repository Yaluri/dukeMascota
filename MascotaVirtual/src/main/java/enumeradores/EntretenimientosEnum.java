package enumeradores;

public enum EntretenimientosEnum {

    BAILAR(20), CANTAR(15), PASEAR(30), LEER(10);

    private int desaburrimiento;

    EntretenimientosEnum(int desaburrimiento) {
        this.desaburrimiento = desaburrimiento;
    }

    public int getDesaburrimiento() {
        return this.desaburrimiento;
    }
}
