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

/*
 * Renamed from biB
 */
public class bib_0
implements aeh_2 {
    public static final String ile = "slots";
    public static final bib_0 ilf = new bib_0();
    public static final String ilg = "characterCount";
    public static final String ilh = "maxCharacterCount";
    public static final String ili = "characterLimitInfo";
    public static final String ilj = "characterCountText";
    public static final String ilk = "tileSize";
    private bic_0 ill = bic_0.ilu;
    private final List<biy_0> ilm = new ArrayList<biy_0>();
    private final List<bie_0> iln = new ArrayList<bie_0>();
    private final List<biy_0> ilo = new ArrayList<biy_0>();
    private byte ilp = 0;
    private int ilq;
    private int ilr;

    private bib_0() {
        ewo_0.oBF.a((ewr_0 ewr_02, Object object) -> {
            if (ewr_02 != ewr_0.oCb) {
                return;
            }
            this.a(this.ilp, this.ilm.stream().map(biy_0::dqj).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList()));
        });
    }

    public List<biy_0> dql() {
        return this.ilo;
    }

    public List<biy_0> dqm() {
        return this.ilm;
    }

    public biy_0 Db(int n) {
        return this.ilm.get(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void dqn() {
        List<bie_0> list = this.iln;
        synchronized (list) {
            this.iln.clear();
            for (int i = 1; i <= 13; ++i) {
                this.iln.add(new bie_0(i));
            }
            Collections.sort(this.iln);
        }
        this.dqo();
    }

    public synchronized void a(byte by, List<bgy> list) {
        this.ilm.clear();
        this.ilp = by;
        this.ilq = ewo_0.oBF.i(ewr_0.oCb) + this.ilp;
        this.ilr = list.size();
        list.sort(Comparator.comparing(bgy::bEr));
        for (aef_2 aef_22 : list) {
            biz_1 biz_12 = new biz_1((bgy)aef_22);
            this.ilm.add(biz_12);
        }
        if (this.ilr < this.ilq) {
            for (int i = 0; i < this.ilq - this.ilr; ++i) {
                aef_2 aef_22;
                aef_22 = new bid_0();
                this.ilm.add((biy_0)aef_22);
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
        this.ilo.sort(Comparator.comparingInt(biy_02 -> biy_02.dqi().aJr()));
        fse_1.gFu().a((aef_2)this, ile, ilg, ilh, ili, ilj, ilk);
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
            return aum_0.cWf().c("characterChoice.character.number", ewo_0.oBF.i(ewr_0.oCb), 13);
        }
        if (string.equals(ilj)) {
            return aum_0.cWf().c("characterChoice.character.count", this.ilr, this.ilq);
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
            biy_0 biy_02 = this.ilm.get(i);
            if (!biy_02.dqj().isPresent() || biy_02.dqj().get().Sn() != bgy2.Sn()) continue;
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
            biy_0 biy_02 = this.ilm.get(i);
            if (bl) {
                return biy_02.dqj();
            }
            if (!biy_02.dqj().isPresent() || biy_02.dqj().get().Sn() != bgy2.Sn()) continue;
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
            biy_0 biy_02 = this.ilm.get(i);
            if (bl) {
                return biy_02.dqj();
            }
            if (!biy_02.dqj().isPresent() || biy_02.dqj().get().Sn() != bgy2.Sn()) continue;
            bl = true;
        }
        return Optional.empty();
    }

    public void c(bgy bgy2, bgy bgy3) {
        int n = this.aI(bgy2);
        int n2 = this.aI(bgy3);
        biy_0 biy_02 = this.ilm.get(n);
        biy_0 biy_03 = this.ilm.set(n2, biy_02);
        this.ilm.set(n, biy_03);
        biy_02.gk(false);
        biy_03.gk(false);
        this.dqo();
    }

    public void a(bic_0 bic_02) {
        this.ill = bic_02;
        fse_1.gFu().a((aef_2)this, ilk);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljH, bic_02.d());
    }

    public void Dc(int n) {
        this.a(bic_0.Dd(n));
    }

    public bic_0 dqr() {
        return this.ill;
    }
}

