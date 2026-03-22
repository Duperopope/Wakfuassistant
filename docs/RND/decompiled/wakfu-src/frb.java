/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class frb {
    private static final Logger sXt = Logger.getLogger(frb.class);

    public boolean h(long l, int n, int n2) {
        int n3;
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown, player id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            sXt.error((Object)("Setting deck problem : player in fight, player id=" + l));
            return false;
        }
        frf frf2 = ((exP)t).dnJ();
        if (frf2 == null) {
            sXt.error((Object)("SpellDeck not found : player id=" + l));
            return false;
        }
        if (n2 > mz_1.aVX.aVe()) {
            sXt.error((Object)("Bad Level : > character max level = " + n2 + ", player id= " + l));
            return false;
        }
        eIm eIm2 = ((exP)t).dnK();
        eIj eIj2 = eIm2.fwt();
        int n4 = n3 = eIj2 == null ? Integer.MIN_VALUE : eIj2.wp();
        if (n == n3 && !eml_0.a(n2, t)) {
            sXt.error((Object)("Bad Level : > instance max level = " + n2 + ", player id= " + l));
            return false;
        }
        frd frd2 = frf2.Zx(n);
        if (frd2 == null) {
            frd2 = new frd();
            frf2.b(n, frd2);
        }
        frd2.PP(n2);
        if (!this.c(l, frd2)) {
            this.a(l, frd2);
            this.b(l, frd2);
        }
        if (!this.c(l, frd2)) {
            sXt.error((Object)("SpellDeck still invalid, player id=" + l + ", deck " + String.valueOf(frd2)));
        }
        eIj eIj3 = null;
        for (eIj eIj4 : eIm2.uv().values()) {
            if (eIj4.wp() != n || eIj4.tL() >= n2 || eIj4.tL() <= 0 || eIj2 != eIj4) continue;
            eIj3 = eIj4;
        }
        if (eIj3 != null && t instanceof emj_0) {
            ((emj_0)t).dmE().c(eIj3);
        }
        return true;
    }

    private void a(long l, frd frd2) {
        this.a(l, frd2, fra.sXp, fra.sXn, frd2.eEu());
    }

    private void b(long l, frd frd2) {
        this.a(l, frd2, fra.sXq, fra.sXo, frd2.eEv());
    }

    private void a(long l, frd frd2, int n, int[] nArray, ArrayList<Integer> arrayList) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown , player id=" + l));
            return;
        }
        Iterable<? extends fqE> iterable = ((exP)t).doM();
        int n2 = frd2.gjR() ? ((exP)t).dnG() : frd2.tL();
        for (int i = 0; i < n; ++i) {
            boolean bl;
            int n3 = arrayList.get(i);
            Object Spell = fqF.giR().Ig(n3);
            boolean bl2 = !this.a(n3, iterable, n2);
            boolean bl3 = n2 < nArray[i];
            boolean bl4 = bl = bl2 || bl3 || Spell == null;
            if (n3 == 0 || !bl) continue;
            this.a(n3, frd2);
        }
    }

    public boolean au(long l, int n) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            sXt.error((Object)("Setting deck problem : player in fight, player id=" + l));
            return false;
        }
        frf frf2 = ((exP)t).dnJ();
        if (frf2 == null) {
            sXt.error((Object)("SpellDeck not found : player id=" + l));
            return false;
        }
        frd frd2 = frf2.Zx(n);
        if (frd2 == null) {
            frd2 = new frd();
            frf2.b(n, frd2);
        }
        return true;
    }

    public boolean a(long l, int n, int n2, int n3) {
        short s;
        int n4;
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            sXt.error((Object)("Adding spell problem : player in fight, player id=" + l));
            return false;
        }
        frf frf2 = ((exP)t).dnJ();
        if (frf2 == null) {
            sXt.error((Object)("Adding spell problem : unknown deck set, player id=" + l));
            return false;
        }
        Object Spell = fqF.giR().Ig(n);
        if (Spell == null) {
            sXt.error((Object)("Spell unknown " + n + ", player id=" + l));
            return false;
        }
        if (!((exP)t).CX(n)) {
            sXt.error((Object)("Player can't use this spell , player id=" + l + ", spellId=" + n));
            return false;
        }
        if (n3 < 0) {
            sXt.error((Object)("Bad slot index " + n3 + ", player id=" + l));
            return false;
        }
        if (((fqD)Spell).eeY()) {
            if (fra.sXq <= n3) {
                sXt.error((Object)("Bad slot index " + n3 + ", player id=" + l));
                return false;
            }
        } else if (fra.sXp <= n3) {
            sXt.error((Object)("Bad slot index " + n3 + ", player id=" + l));
            return false;
        }
        int n5 = ((exP)t).dnG();
        frd frd2 = frf2.Zx(n2);
        if (frd2 == null) {
            frd2 = new frd();
            frf2.b(n2, frd2);
        }
        int n6 = n4 = frd2.gjR() ? n5 : frd2.tL();
        if (((fqD)Spell).eeY()) {
            if (fra.sXo[n3] > n4) {
                sXt.error((Object)("Bad slot index , Required level : " + fra.sXo[n3] + ", player id=" + l));
                return false;
            }
        } else if (fra.sXn[n3] > n4) {
            sXt.error((Object)("Bad slot index , Required level : " + fra.sXn[n3] + ", player id=" + l));
            return false;
        }
        if (n4 < (s = ((fqD)Spell).cvo())) {
            sXt.error((Object)String.format("Insufficient level to use this spell, Required level : %s, deck level : %d, player id=%d", s, n4, l));
            return false;
        }
        if (((fqD)Spell).eeY()) {
            frd2.gq(n, n3);
        } else {
            frd2.gp(n, n3);
        }
        eIm eIm2 = ((exP)t).dnK();
        eIj eIj2 = eIm2.fwt();
        if (eIj2 != null && eIj2.wp() == n2) {
            ((exP)t).f(((exP)t).dmQ());
        }
        return true;
    }

    public boolean a(long l, frd frd2, int n) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            sXt.error((Object)("Adding spell problem : player in fight, player id=" + l));
            return false;
        }
        frf frf2 = ((exP)t).dnJ();
        if (frf2 == null) {
            sXt.error((Object)("Adding spell problem : unknown deck set, player id=" + l));
            return false;
        }
        frd frd3 = frf2.Zx(n);
        if (frd3 == null) {
            frd3 = new frd();
            frf2.b(n, frd3);
        }
        ArrayList<Integer> arrayList = frd2.eEu();
        for (int i = 0; i < arrayList.size(); ++i) {
            frd3.gp(arrayList.get(i), i);
        }
        ArrayList<Integer> arrayList2 = frd2.eEv();
        for (int i = 0; i < arrayList2.size(); ++i) {
            frd3.gq(arrayList2.get(i), i);
        }
        eIm eIm2 = ((exP)t).dnK();
        eIj eIj2 = eIm2.fwt();
        if (eIj2 != null && eIj2.wp() == n) {
            ((exP)t).f(((exP)t).dmQ());
        }
        return true;
    }

    public boolean i(long l, int n, int n2) {
        eIm eIm2;
        eIj eIj2;
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            sXt.error((Object)("Adding spell problem : player in fight, player id=" + l));
            return false;
        }
        if (n <= 0) {
            sXt.error((Object)("Can't remove empty slot (spellId=0),  player id=" + l));
            return false;
        }
        frf frf2 = ((exP)t).dnJ();
        if (frf2 == null) {
            sXt.error((Object)("SpellDeck not found : player id=" + l));
            return false;
        }
        frd frd2 = frf2.Zx(n2);
        if (frd2 == null) {
            sXt.error((Object)("Removing spell problem : no deck at index=" + n2));
            return false;
        }
        boolean bl = this.a(n, frd2);
        if (bl && (eIj2 = (eIm2 = ((exP)t).dnK()).fwt()) != null && eIj2.wp() == n2) {
            ((exP)t).f(((exP)t).dmQ());
        }
        return bl;
    }

    private boolean a(int n, frd frd2) {
        int n2 = frd2.Zu(n);
        if (n2 < 0) {
            sXt.error((Object)("Trying to remove unknown spell : id=" + n));
            return false;
        }
        Object Spell = fqF.giR().Ig(n);
        if (Spell == null) {
            sXt.error((Object)("Spell unknown id=" + n));
            return false;
        }
        if (((fqD)Spell).eeY()) {
            frd2.gq(0, n2);
        } else {
            frd2.gp(0, n2);
        }
        return true;
    }

    public boolean a(long l, int n, frd frd2) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        ety_0 ety_02 = t.dlK();
        if (ety_02 != null && ety_02.dGp() != etw_0.rqT && ety_02.dGp() != etw_0.rqW) {
            sXt.error((Object)("Setting deck problem : player in fight, player id=" + l));
            return false;
        }
        frf frf2 = ((exP)t).dnJ();
        if (frf2 == null) {
            sXt.error((Object)("SpellDeck not found : player id=" + l));
            return false;
        }
        if (frd2 == null) {
            sXt.error((Object)("Trying to add null spell deck : player id=" + l));
            return false;
        }
        if (!this.c(l, frd2)) {
            sXt.error((Object)("Trying to add bad spell deck : player id=" + l));
            return false;
        }
        frf2.b(n, frd2);
        return true;
    }

    public void a(long l, int n, int n2, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown, player id=" + l));
            return;
        }
        frf frf2 = ((exP)t).dnJ();
        if (frf2 == null) {
            return;
        }
        frd frd2 = frf2.Zx(n);
        if (frd2 == null) {
            return;
        }
        frd2.PP(n2);
        frd2.d(arrayList, arrayList2);
    }

    public boolean c(long l, frd frd2) {
        int n;
        ArrayList<Integer> arrayList = frd2.eEv();
        ArrayList<Integer> arrayList2 = frd2.eEu();
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown , player id=" + l));
            return false;
        }
        Iterable<? extends fqE> iterable = ((exP)t).doM();
        int n2 = frd2.gjR() ? ((exP)t).dnG() : frd2.tL();
        for (n = 0; n < fra.sXp; ++n) {
            if (this.a(arrayList2.get(n), n, iterable, n2)) continue;
            return false;
        }
        for (n = 0; n < fra.sXq; ++n) {
            if (this.b(arrayList.get(n), n, iterable, n2)) continue;
            return false;
        }
        return true;
    }

    private boolean a(int n, Iterable<? extends fqE> iterable, int n2) {
        for (fqE fqE2 : iterable) {
            if (fqE2.axA() != n || ((fqD)fqE2.giP()).cvo() > n2) continue;
            return true;
        }
        return false;
    }

    @Nullable
    public frd d(long l, frd frd2) {
        ArrayList<Integer> arrayList = frd2.eEv();
        ArrayList<Integer> arrayList2 = frd2.eEu();
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown , player id=" + l));
            return null;
        }
        int n = ((exP)t).dnG();
        int n2 = frd2.gjR() ? n : frd2.tL();
        Iterable<? extends fqE> iterable = ((exP)t).doM();
        int[] nArray = new int[fra.sXp];
        for (int i = 0; i < Math.min(fra.sXp, arrayList2.size()); ++i) {
            if (!this.a(arrayList2.get(i), i, iterable, n2)) continue;
            nArray[i] = arrayList2.get(i);
        }
        int[] nArray2 = new int[fra.sXq];
        for (int i = 0; i < Math.min(fra.sXq, arrayList.size()); ++i) {
            if (!this.b(frd2.eEv().get(i), i, iterable, n2)) continue;
            nArray2[i] = frd2.eEv().get(i);
        }
        frd frd3 = new frd(nArray, nArray2);
        frd3.PP(frd2.tL());
        return frd3;
    }

    private boolean a(int n, int n2, Iterable<? extends fqE> iterable, int n3) {
        if (n == 0) {
            return true;
        }
        Object Spell = fqF.giR().Ig(n);
        boolean bl = this.a(n, iterable, n3);
        boolean bl2 = n3 >= fra.sXn[n2];
        return bl && bl2 && Spell != null && !((fqD)Spell).eeY();
    }

    private boolean b(int n, int n2, Iterable<? extends fqE> iterable, int n3) {
        if (n == 0) {
            return true;
        }
        Object Spell = fqF.giR().Ig(n);
        boolean bl = this.a(n, iterable, n3);
        boolean bl2 = n3 >= fra.sXo[n2];
        return bl && bl2 && Spell != null && ((fqD)Spell).eeY();
    }

    public int bX(exP exP2) {
        int n;
        int n2;
        frf frf2 = exP2.dnJ();
        if (frf2 == null) {
            sXt.error((Object)("SpellDeck not found : player id=" + exP2.Sn()));
            return -1;
        }
        eIm eIm2 = exP2.dnK();
        frd frd2 = frf2.Zx(eIm2.fwt().wp());
        if (frd2 == null) {
            sXt.error((Object)("Active Deck not found : player id=" + exP2.Sn()));
            return -1;
        }
        ArrayList<Integer> arrayList = frd2.eEu();
        int n3 = exP2.dnG();
        int n4 = n2 = frd2.gjR() ? n3 : frd2.tL();
        for (n = 0; n < fra.sXp && fra.sXn[n] <= n2 && arrayList.get(n) != 0; ++n) {
        }
        return n == fra.sXp || fra.sXn[n] > n2 ? -1 : n;
    }

    public boolean b(long l, byte by, int n) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            sXt.error((Object)("Character unknown, player id=" + l));
            return false;
        }
        frf frf2 = ((exP)t).dnJ();
        if (frf2 == null) {
            return false;
        }
        frf2.gr(by, n);
        return true;
    }
}

