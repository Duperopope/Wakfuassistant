/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class dcR
implements Comparable<dcR> {
    public static final dcR ogf = new dcR(-1, -1);
    private final int ogg;
    private final int ogh;

    public dcR(int n, int n2) {
        this.ogg = n;
        this.ogh = n2;
    }

    public int getWidth() {
        return this.ogg;
    }

    public int getHeight() {
        return this.ogh;
    }

    public boolean fct() {
        return this.ogg == -1 || this.ogh == -1;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        dcR dcR2 = (dcR)object;
        if (this.ogh != dcR2.ogh) {
            return false;
        }
        return this.ogg == dcR2.ogg;
    }

    public int hashCode() {
        return 31 * this.ogg + this.ogh;
    }

    public String toString() {
        if (this.fct()) {
            return aum_0.cWf().c("screen.size.custom", new Object[0]);
        }
        return this.ogg + "x" + this.ogh;
    }

    public int b(@NotNull dcR dcR2) {
        return Long.compare((long)this.ogg * (long)this.ogh, (long)dcR2.ogg * (long)dcR2.ogh);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.b((dcR)object);
    }
}

