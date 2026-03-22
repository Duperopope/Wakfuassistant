/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bGR
 */
public class bgr_2 {
    private final fhc_0 jWB;
    private int ejM;
    private boolean bmT;

    public bgr_2(@NotNull fhc_0 fhc_02) {
        this.jWB = fhc_02;
        this.ejM = 0;
        this.bmT = true;
    }

    public int avr() {
        return this.jWB.d();
    }

    public fhc_0 dOg() {
        return this.jWB;
    }

    public void Fq(int n) {
        this.ejM = n;
    }

    public int oP() {
        return this.ejM;
    }

    public short bfe() {
        return this.jWB.bfe();
    }

    public void bl(boolean bl) {
        this.bmT = bl;
    }

    public boolean bfb() {
        return this.bmT;
    }
}

