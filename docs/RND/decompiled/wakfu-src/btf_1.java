/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from btF
 */
class btf_1 {
    bJr jmi;
    final /* synthetic */ bte_1 jmj;

    btf_1(bte_1 bte_12) {
        this.jmj = bte_12;
    }

    public boolean dIf() {
        if (this.jmj.jma.dGo() != eUw.ruH) {
            return false;
        }
        this.jmi = this.doD();
        if (this.jmi == null) {
            bte_1.jlY.error((Object)String.format("Fight id=%d de type %s sans protecteur.", new Object[]{this.jmj.jma.d(), eUw.ruH}));
            return false;
        }
        return this.jmi.cXa().bcP() == 1 - this.jmj.jmc;
    }

    private bJr doD() {
        for (bgy bgy2 : this.jmj.jma.dGs()) {
            bJr bJr2 = this.bz(bgy2);
            if (bJr2 == null) continue;
            return bJr2;
        }
        return null;
    }

    @Nullable
    private bJr bz(bgy bgy2) {
        if (bgy2.aFW() != 1 || !(bgy2 instanceof bhx_0)) {
            return null;
        }
        bhx_0 bhx_02 = (bhx_0)bgy2;
        return bhx_02.doD();
    }
}

