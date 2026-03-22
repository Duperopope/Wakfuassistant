/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public class beH {
    public static final beH hNP = new beH();
    private final Map<Short, beG> hNQ = new HashMap<Short, beG>();
    private final Map<Byte, beI> hNR = new HashMap<Byte, beI>();

    private beH() {
    }

    public Optional<beG> deF() {
        if (!ue_0.bjV().bjo()) {
            return Optional.empty();
        }
        return this.y(ue_0.bjV().bjc());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Optional<beG> y(ux_0 ux_02) {
        Map<Short, beG> map = this.hNQ;
        synchronized (map) {
            short s = eHy.M(ux_02);
            beG beG2 = this.hNQ.get(s);
            if (beG2 != null) {
                return Optional.of(beG2);
            }
            this.A(ux_02);
            return Optional.empty();
        }
    }

    public boolean z(ux_0 ux_02) {
        return this.C(ux_02) && this.B(ux_02);
    }

    private void A(ux_0 ux_02) {
        String string = aum_0.cWf().aUXX().aUP();
        bQy.ejB().b(string, ux_02);
    }

    public Optional<beI> deG() {
        if (!ue_0.bjV().bjo()) {
            return Optional.empty();
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        return this.a(ux_02, (byte)ux_02.bjG());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Optional<beI> a(ux_0 ux_02, byte by) {
        Map<Byte, beI> map = this.hNR;
        synchronized (map) {
            beI beI2 = this.hNR.get(by);
            if (beI2 != null) {
                return Optional.of(beI2);
            }
            this.A(ux_02);
            return Optional.empty();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean B(ux_0 ux_02) {
        Map<Byte, beI> map = this.hNR;
        synchronized (map) {
            byte by = (byte)ux_02.bjG();
            beI beI2 = this.hNR.get(by);
            return beI2 != null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(beI beI2, ux_0 ux_02) {
        Map<Byte, beI> map = this.hNR;
        synchronized (map) {
            byte by = (byte)ux_02.bjG();
            this.hNR.put(by, beI2);
        }
    }

    public boolean deH() {
        if (!ue_0.bjV().bjo()) {
            return false;
        }
        return this.C(ue_0.bjV().bjc());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean C(ux_0 ux_02) {
        Map<Short, beG> map = this.hNQ;
        synchronized (map) {
            short s = eHy.M(ux_02);
            beG beG2 = this.hNQ.get(s);
            return beG2 != null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(beG beG2, ux_0 ux_02) {
        Map<Short, beG> map = this.hNQ;
        synchronized (map) {
            short s = eHy.M(ux_02);
            this.hNQ.put(s, beG2);
        }
    }

    @NotNull
    public String a(@NotNull beI beI2) {
        return aum_0.cWf().c("calendar.month." + beI2.bjG(), new Object[0]);
    }
}

