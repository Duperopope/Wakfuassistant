/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

public class biB
implements aEH {
    public static final String ile = "slots";
    public static final biB ilf = new biB();
    public static final String ilg = "characterCount";
    public static final String ilh = "maxCharacterCount";
    public static final String ili = "characterLimitInfo";
    public static final String ilj = "characterCountText";
    public static final String ilk = "tileSize";
    private biC ill = biC.ilu;
    private final List<biy> ilm = new ArrayList<biy>();
    private final List<biE> iln = new ArrayList<biE>();
    private final List<biy> ilo = new ArrayList<biy>();
    private byte ilp = 0;
    private int ilq;
    private int ilr;

    private biB() {
        ewo.oBF.a((ewr ewr2, Object object) -> {
            if (ewr2 != ewr.oCb) {
                return;
            }
            this.a(this.ilp, this.ilm.stream().map(biy::dqj).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList()));
        });
    }

    public List<biy> dql() {
        return this.ilo;
    }

    public List<biy> dqm() {
        return this.ilm;
    }

    public biy Db(int n) {
        return this.ilm.get(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void dqn() {
        List<biE> list = this.iln;
        synchronized (list) {
            this.iln.clear();
            for (int i = 1; i <= 13; ++i) {
                this.iln.add(new biE(i));
            }
            Collections.sort(this.iln);
        }
        this.dqo();
    }

    public synchronized void a(byte by, List<bgy> list) {
        this.ilm.clear();
        this.ilp = by;
        this.ilq = ewo.oBF.i(ewr.oCb) + this.ilp;
        this.ilr = list.size();
        list.sort(Comparator.comparing(bgy::bEr));
        for (aEF aEF2 : list) {
            biz biz2 = new biz((bgy)aEF2);
            this.ilm.add(biz2);
        }
        if (this.ilr < this.ilq) {
            for (int i = 0; i < this.ilq - this.ilr; ++i) {
                aEF aEF2;
                aEF2 = new biD();
                this.ilm.add((biy)aEF2);
            }
        }
        this.dqo();
    }

    public void dqo() {
        this.ilo.clear();
        this.ilo.addAll(this.ilm);
        if (this.ilr >= this.ilq && this.ilp < this.iln.size()) {
            this.ilo.add(this.iln.get(this.ilp));
        }
        int n = this.ilo.size();
        for (int i = 0; i < n; ++i) {
            this.ilo.get(i).setOffset(i);
        }
        this.ilo.sort(Comparator.comparingInt(biy2 -> biy2.dqi().aJr()));
        fSe.gFu().a((aEF)this, ile, ilg, ilh, ili, ilj, ilk);
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ile)) {
            return this.ilo;
        }
        if (string.equals(ilg)) {
            return this.ilr;
        }
        if (string.equals(ilh)) {
            return this.ilq;
        }
        if (string.equals(ili)) {
            return aUM.cWf().c("characterChoice.character.number", ewo.oBF.i(ewr.oCb), 13);
        }
        if (string.equals(ilj)) {
            return aUM.cWf().c("characterChoice.character.count", this.ilr, this.ilq);
        }
        if (string.equals(ilk)) {
            return this.ill.d();
        }
        return null;
    }

    public int dqp() {
        return this.ilq;
    }

    public boolean dqq() {
        return this.ilq > 0 && this.ilr > this.ilq;
    }

    public int aI(bgy bgy2) {
        if (bgy2 == null) {
            return -1;
        }
        int n = this.ilm.size();
        for (int i = 0; i < n; ++i) {
            biy biy2 = this.ilm.get(i);
            if (!biy2.dqj().isPresent() || biy2.dqj().get().Sn() != bgy2.Sn()) continue;
            return i;
        }
        return -1;
    }

    public Optional<bgy> aJ(bgy bgy2) {
        if (bgy2 == null) {
            return Optional.empty();
        }
        boolean bl = false;
        for (int i = this.ilm.size() - 1; i >= 0; --i) {
            biy biy2 = this.ilm.get(i);
            if (bl) {
                return biy2.dqj();
            }
            if (!biy2.dqj().isPresent() || biy2.dqj().get().Sn() != bgy2.Sn()) continue;
            bl = true;
        }
        return Optional.empty();
    }

    public Optional<bgy> aK(bgy bgy2) {
        if (bgy2 == null) {
            return Optional.empty();
        }
        boolean bl = false;
        int n = this.ilm.size();
        for (int i = 0; i < n; ++i) {
            biy biy2 = this.ilm.get(i);
            if (bl) {
                return biy2.dqj();
            }
            if (!biy2.dqj().isPresent() || biy2.dqj().get().Sn() != bgy2.Sn()) continue;
            bl = true;
        }
        return Optional.empty();
    }

    public void c(bgy bgy2, bgy bgy3) {
        int n = this.aI(bgy2);
        int n2 = this.aI(bgy3);
        biy biy2 = this.ilm.get(n);
        biy biy3 = this.ilm.set(n2, biy2);
        this.ilm.set(n, biy3);
        biy2.gk(false);
        biy3.gk(false);
        this.dqo();
    }

    public void a(biC biC2) {
        this.ill = biC2;
        fSe.gFu().a((aEF)this, ilk);
        ((bSG)aIe.cfn().bmH()).a((afe)bSN.ljH, biC2.d());
    }

    public void Dc(int n) {
        this.a(biC.Dd(n));
    }

    public biC dqr() {
        return this.ill;
    }
}
