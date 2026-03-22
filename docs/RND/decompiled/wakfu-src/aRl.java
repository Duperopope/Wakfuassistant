/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

class aRl
implements Comparable<aRl> {
    private final int eJn;
    private final String eJo;
    private final String eJp;

    aRl(ewp_1 ewp_12) {
        this.eJn = ewp_12.d();
        this.eJo = aum_0.cWf().a(140, (long)this.eJn, new Object[0]);
        this.eJp = aum_0.cWf().a(141, (long)this.eJn, new Object[0]);
    }

    public int a(@NotNull aRl aRl2) {
        return this.eJo.compareTo(aRl2.eJo);
    }

    public String toString() {
        return this.eJn + " : " + this.eJo + " - " + this.eJp;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((aRl)object);
    }
}

