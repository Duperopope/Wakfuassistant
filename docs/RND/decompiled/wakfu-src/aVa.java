/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

public final class aVa
implements aao_2 {
    private long aXv = this.hashCode();
    private int hsu;
    private final Set<aUZ> hsv = new HashSet<aUZ>();
    private final Set<aft_2> hsw = new HashSet<aft_2>();
    private static final int hsx = 125;

    public aVa() {
    }

    public aVa(int n) {
        this.hsu = n;
    }

    public void k(bsS bsS2) {
        this.hsv.clear();
        this.hsw.clear();
        this.hsu = bsS2 == null ? -1 : bsS2.d();
    }

    public void a(aUZ aUZ2) {
        if (this.hsu == -1) {
            return;
        }
        this.hsv.add(aUZ2);
    }

    public void b(aUZ aUZ2) {
        this.hsv.remove(aUZ2);
    }

    public void f(aft_2 aft_22) {
        if (this.hsu == -1) {
            return;
        }
        this.hsw.add(aft_22);
        abb_2.bUA().a(this, 125L, 0, 1L);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (this.hsu == -1) {
            return false;
        }
        if (this.hsw.isEmpty()) {
            return false;
        }
        if (!this.hsv.isEmpty()) {
            abb_2.bUA().a(this, 125L, 0, 1L);
            return false;
        }
        this.hsw.forEach(aft_22 -> aVi.cWF().a(this.hsu, (aft_2)aft_22));
        aVi.cWF().zW(this.hsu);
        this.hsw.clear();
        return false;
    }

    @Override
    public long Sn() {
        return this.aXv;
    }

    @Override
    public void dC(long l) {
        this.aXv = l;
    }
}

