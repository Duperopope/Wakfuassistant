/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aCk
 */
public class ack_1
implements Iterable<acd_1> {
    private static final Logger dAv = Logger.getLogger(ack_1.class);
    private final acd_1 dAw;
    private final acd_1 dAx;

    public ack_1(acd_1 acd_12, acd_1 acd_13) {
        long l;
        if (!acd_12.E(acd_13)) {
            throw new IllegalArgumentException("Can't create a segment from unaligned points : " + String.valueOf(acd_12) + ", " + String.valueOf(acd_13));
        }
        if (acd_12.ac(acd_13)) {
            throw new IllegalArgumentException("Can't create a segment from a point : " + String.valueOf(acd_12) + ", " + String.valueOf(acd_13));
        }
        long l2 = ack_1.K(acd_12);
        if (l2 < (l = ack_1.K(acd_13))) {
            this.dAw = new acd_1(acd_12);
            this.dAx = new acd_1(acd_13);
        } else {
            this.dAw = new acd_1(acd_13);
            this.dAx = new acd_1(acd_12);
        }
    }

    public ack_1(ack_1 ack_12) {
        this(ack_12.dAw, ack_12.dAx);
    }

    @Override
    @NotNull
    public Iterator<acd_1> iterator() {
        return new acm_1(this);
    }

    public boolean bWN() {
        return this.dAw.getY() == this.dAx.getY();
    }

    public boolean bWO() {
        return this.dAw.getX() == this.dAx.getX();
    }

    public boolean d(acd_1 acd_12) {
        return this.G(acd_12) == acl_1.dAz;
    }

    public acl_1 G(acd_1 acd_12) {
        if (acd_12 == null) {
            return acl_1.dAy;
        }
        if (!this.H(acd_12)) {
            return acl_1.dAy;
        }
        long l = ack_1.K(acd_12);
        if (l < ack_1.K(this.dAw)) {
            return acl_1.dAA;
        }
        if (l > ack_1.K(this.dAx)) {
            return acl_1.dAB;
        }
        return acl_1.dAz;
    }

    public boolean H(acd_1 acd_12) {
        if (acd_12 == null) {
            return false;
        }
        if (this.dAw.ac(acd_12)) {
            return true;
        }
        if (this.dAx.ac(acd_12)) {
            return true;
        }
        return this.dAw.e(this.dAx, acd_12);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ack_1 ack_12 = (ack_1)object;
        if (this.dAx != null ? !this.dAx.ac(ack_12.dAx) : ack_12.dAx != null) {
            return false;
        }
        return this.dAw != null ? this.dAw.ac(ack_12.dAw) : ack_12.dAw == null;
    }

    public boolean I(acd_1 acd_12) {
        acl_1 acl_12 = this.G(acd_12);
        return acl_12 == acl_1.dAB || acl_12 == acl_1.dAA;
    }

    public boolean J(acd_1 acd_12) {
        acl_1 acl_12 = this.G(acd_12);
        switch (acl_12.ordinal()) {
            case 2: {
                this.dAw.C(acd_12);
                return true;
            }
            case 3: {
                this.dAx.C(acd_12);
                return true;
            }
        }
        return false;
    }

    public acd_1 bWP() {
        return new acd_1(this.dAw);
    }

    public acd_1 bWQ() {
        return new acd_1(this.dAx);
    }

    public int bDw() {
        return (int)(ack_1.K(this.dAx) - ack_1.K(this.dAw) + 1L);
    }

    public int hashCode() {
        int n = this.dAw != null ? this.dAw.bWA() : 0;
        n = 31 * n + (this.dAx != null ? this.dAx.bWA() : 0);
        return n;
    }

    public String toString() {
        return "{Segment (" + String.valueOf(this.dAw) + ")-(" + String.valueOf(this.dAx) + ")}";
    }

    private static long K(acd_1 acd_12) {
        return acd_12.getX() + acd_12.getY();
    }
}

