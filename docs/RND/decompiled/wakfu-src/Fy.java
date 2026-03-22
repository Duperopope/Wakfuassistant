/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Preconditions
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

class Fy {
    public static final Function<Fy, FC> aBy = new Fz();
    private final FB aBz;
    private final FC aBA;
    private final FC aBB;

    public static Predicate<Fy> a(FB fB) {
        return new FA(fB);
    }

    Fy(FB fB, FC fC, FC fC2) {
        this.aBz = (FB)((Object)Preconditions.checkNotNull((Object)((Object)fB)));
        this.aBA = (FC)Preconditions.checkNotNull((Object)fC);
        this.aBB = (FC)Preconditions.checkNotNull((Object)fC2);
    }

    public FB aKZ() {
        return this.aBz;
    }

    public FC aLa() {
        return this.aBA;
    }

    public FC aLb() {
        return this.aBB;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + this.aBA.hashCode();
        n2 = 31 * n2 + this.aBB.hashCode();
        n2 = 31 * n2 + this.aBz.hashCode();
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Fy fy = (Fy)object;
        if (!this.aBA.equals(fy.aBA)) {
            return false;
        }
        if (!this.aBB.equals(fy.aBB)) {
            return false;
        }
        return this.aBz == fy.aBz;
    }

    public String toString() {
        return String.valueOf((Object)this.aBz) + "[" + String.valueOf(this.aBA) + " -> " + String.valueOf(this.aBB) + "]";
    }
}

