/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import java.util.Optional;

public class fdW {
    private final exP rZz;
    private final fdf_0 rZA;
    private final fdg_0 rZB;

    public fdW(exP exP2, fdf_0 fdf_02, fdg_0 fdg_02) {
        this.rZz = exP2;
        this.rZA = fdf_02;
        this.rZB = fdg_02;
    }

    public boolean fUm() {
        if (this.rZB.fTK() <= 0 || this.rZB.fTL() <= 0) {
            return true;
        }
        Object r = fgD.fXh().Vd(this.rZB.fTK());
        boolean bl = ((fhc_0)r).c(fgg_0.sia);
        boolean bl2 = ((fhc_0)r).c(fgg_0.sit);
        if (bl) {
            return this.fUo();
        }
        if (bl2) {
            return this.fUq();
        }
        return this.fUp();
    }

    public boolean fUn() {
        long l = 0L;
        TLongHashSet tLongHashSet = fcL.rUh.sx(this.rZz.Xi());
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            Object t = fcL.rUh.sw(tLongIterator.next());
            l += ((exP)t).dmi();
        }
        return l >= fcI.a((fjm)this.rZz, this.rZB);
    }

    private boolean fUo() {
        TLongHashSet tLongHashSet = fcL.rUh.sx(this.rZz.Xi());
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            ffh ffh2 = (ffh)fcL.rUh.sw(tLongIterator.next());
            fec_0 fec_02 = (fec_0)ffh2.a(fez_0.sep);
            Optional<ffm> optional = Optional.ofNullable(fec_02.UB(this.rZB.fTK()));
            if (optional.isEmpty()) {
                return false;
            }
            if (optional.get().bfd() >= this.rZB.fTL()) continue;
            return false;
        }
        return true;
    }

    private boolean fUp() {
        int n = 0;
        TLongHashSet tLongHashSet = fcL.rUh.sx(this.rZz.Xi());
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            Object t = fcL.rUh.sw(tLongIterator.next());
            fft_0 fft_02 = ((exP)t).dod();
            n += fft_02.UN(this.rZB.fTK());
        }
        return n >= fcI.a(this.rZz, this.rZB);
    }

    private boolean fUq() {
        Optional optional = evx_2.feo().b(this.rZz.Xi(), eva_1.owu);
        if (optional.isEmpty()) {
            return false;
        }
        feb_0 feb_02 = (feb_0)optional.get();
        return feb_02.Qe(this.rZB.fTK()) >= this.rZB.fTL();
    }

    public String toString() {
        return "TeleporterChecker{m_player=" + String.valueOf(this.rZz) + ", m_info=" + String.valueOf(this.rZA) + ", m_exit=" + this.rZB.d() + "}";
    }
}

