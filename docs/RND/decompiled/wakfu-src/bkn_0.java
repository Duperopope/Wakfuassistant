/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKn
 */
public class bkn_0
extends ffi_0 {
    private foZ kni;
    private int knj;

    @Override
    public boolean bfh() {
        return false;
    }

    @Override
    public boolean b(vy_2 vy_22) {
        throw new UnsupportedOperationException("Un item d'inventaire de protecteur ne doit pas \u00eatre s\u00e9rialis\u00e9 par le client");
    }

    @Override
    public boolean a(vy_2 vy_22) {
        this.iWZ = new ffV();
        if (!this.iWZ.c(vy_22.agz)) {
            return false;
        }
        this.lk(vy_22.agB);
        fnm fnm2 = fnm.fo(vy_22.agA);
        if (fnm2 != null) {
            this.a(fnm2);
            return true;
        }
        sga.error((Object)("Impossible de trouver le pack \u00e0 " + vy_22.agA + " items"));
        return false;
    }

    public foZ ebh() {
        return this.kni;
    }

    public void a(foZ foZ2) {
        this.kni = foZ2;
    }

    public int ebi() {
        return this.knj;
    }

    public void HM(int n) {
        this.knj = n;
    }

    @Override
    public void al(short s) {
    }

    public bkq_0 ebj() {
        switch (this.kni) {
            case sNi: {
                return new bkk_0(this, this.knj);
            }
            case sNj: {
                return new bkl_0(this, this.knj);
            }
        }
        return null;
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.a((vy_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((vy_2)object);
    }
}

