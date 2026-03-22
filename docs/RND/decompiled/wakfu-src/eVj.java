/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class eVj
implements Iterable<acd_1> {
    private final ack_1 rzG;

    public eVj(eST eST2, eST eST3) {
        this.rzG = new ack_1(eST2.aZw(), eST3.aZw());
    }

    public eVj(acd_1 acd_12, acd_1 acd_13) {
        this.rzG = new ack_1(acd_12, acd_13);
    }

    public acd_1 fMZ() {
        return this.rzG.bWP();
    }

    public acd_1 fNa() {
        return this.rzG.bWQ();
    }

    public boolean bWN() {
        return this.rzG.bWN();
    }

    public boolean bWO() {
        return this.rzG.bWO();
    }

    boolean a(eST eST2, int n) {
        if (!this.a(eST2.aZw(), n)) {
            return false;
        }
        return this.rzG.J(eST2.aZw());
    }

    @Override
    @NotNull
    public Iterator<acd_1> iterator() {
        return this.rzG.iterator();
    }

    public boolean a(acd_1 acd_12, int n) {
        switch (this.rzG.G(acd_12)) {
            case dAB: {
                return this.rzG.bWQ().B(acd_12) <= n;
            }
            case dAA: {
                return this.rzG.bWP().B(acd_12) <= n;
            }
        }
        return false;
    }

    public static boolean b(acd_1 acd_12, acd_1 acd_13, int n) {
        if (!acd_12.E(acd_13)) {
            return false;
        }
        return acd_12.B(acd_13) <= n;
    }

    public String toString() {
        return "{MicrobotCombination from segment " + String.valueOf(this.rzG) + "}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        eVj eVj2 = (eVj)object;
        return this.rzG.equals(eVj2.rzG);
    }

    public int hashCode() {
        return this.rzG != null ? this.rzG.hashCode() : 0;
    }
}

