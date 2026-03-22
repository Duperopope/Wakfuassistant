/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

final class dcP
implements Comparable<dcP> {
    final int ogd;

    dcP(int n) {
        this.ogd = n;
    }

    public int getValue() {
        return this.ogd;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        dcP dcP2 = (dcP)object;
        return this.ogd == dcP2.ogd;
    }

    public int hashCode() {
        return this.ogd;
    }

    public String toString() {
        if (this.ogd == 0) {
            return "Default";
        }
        return Integer.toString(this.ogd) + " Hz";
    }

    public int a(@NotNull dcP dcP2) {
        return this.ogd - dcP2.ogd;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((dcP)object);
    }
}

