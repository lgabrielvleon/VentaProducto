package Entity;

public class DetalleVenta {
    private int ID;
    private Producto objproducto;
    private Venta objventa;

    public DetalleVenta() {
        this.ID = 0;
        this.objproducto = new Producto();
        this.objventa = new Venta();
    }

    public DetalleVenta(int ID, Producto objproducto, Venta objventa) {
        this.ID = ID;
        this.objproducto = objproducto;
        this.objventa = objventa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Producto getObjproducto() {
        return objproducto;
    }

    public void setObjproducto(Producto objproducto) {
        this.objproducto = objproducto;
    }

    public Venta getObjventa() {
        return objventa;
    }

    public void setObjventa(Venta objventa) {
        this.objventa = objventa;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" +
                "ID=" + ID +
                ", objproducto=" + objproducto +
                ", objventa=" + objventa +
                '}';
    }
}