/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eNq
 */
public class enq_0
extends qr_0 {
    public static final int qYa = -1;
    protected static final Logger qYb = Logger.getLogger(enq_0.class);
    private boolean qYc = false;
    private boolean qYd = false;
    private ero_0 qYe;
    private int qYf = -1;
    private boolean qYg = true;
    private int qYh = 0;
    private boolean qYi = false;
    private boolean qYj = false;
    private eNr qYk = eNr.qYl;
    private List<enw_0> aRj;

    public static enq_0 a(boolean bl, boolean bl2, ero_0 ero_02) {
        enq_0 enq_02 = new enq_0();
        enq_02.qYc = bl;
        enq_02.qYd = bl2;
        enq_02.qYe = ero_02;
        return enq_02;
    }

    public boolean fBf() {
        return this.qYc;
    }

    public boolean fBg() {
        return this.qYd;
    }

    public ero_0 fBh() {
        return this.qYe;
    }

    public int Oh() {
        return this.qYf;
    }

    public void RT(int n) {
        this.qYf = n;
    }

    public void lR(boolean bl) {
        this.qYg = bl;
    }

    @Override
    public boolean bap() {
        return this.qYg;
    }

    public boolean bbJ() {
        return this.qYj;
    }

    public void fBi() {
        this.qYj = true;
    }

    public void RU(int n) {
        this.qYk = eNr.qYm;
        this.qYh = n;
    }

    public void a(int n, eNr eNr2) {
        if (eNr2 == eNr.qYl) {
            qYb.error((Object)"On ne peut pas forcer une valeur avec le type NONE");
            return;
        }
        this.qYk = eNr2;
        this.qYh = n;
    }

    public int Ol() {
        return this.qYh;
    }

    public boolean fBj() {
        return this.qYk != eNr.qYl;
    }

    public eNr fBk() {
        return this.qYk;
    }

    public boolean fBl() {
        return this.qYi;
    }

    public void lS(boolean bl) {
        this.qYi = bl;
    }

    public void a(enw_0 enw_02) {
        if (this.aRj == null) {
            this.aRj = new ArrayList<enw_0>();
        }
        if (!this.aRj.contains(enw_02)) {
            this.aRj.add(enw_02);
        }
    }

    public void b(enw_0 enw_02) {
        if (this.aRj == null) {
            return;
        }
        this.aRj.remove(enw_02);
    }

    public List<enw_0> aYR() {
        return this.aRj;
    }

    private void aVH() {
        this.qYc = false;
        this.qYd = false;
        this.qYf = -1;
        this.qYg = true;
        this.qYk = eNr.qYl;
        this.aRj = null;
        this.qYh = 0;
        this.qYi = false;
        this.qYe = null;
        this.qYj = false;
    }

    @Override
    public void aZp() {
        this.aVH();
    }

    public enq_0 fBm() {
        enq_0 enq_02 = enq_0.a(this.qYc, this.qYd, this.qYe);
        enq_02.qYf = this.qYf;
        enq_02.qYh = this.qYh;
        enq_02.qYk = this.qYk;
        enq_02.qYg = this.qYg;
        enq_02.qYi = this.qYi;
        enq_02.qYj = this.qYj;
        if (this.aRj != null) {
            enq_02.aRj = new ArrayList<enw_0>(this.aRj);
        }
        return enq_02;
    }

    public iq_2 fBn() {
        is_1 is_12 = iq_2.Ot().A(this.qYc).B(this.qYd).ev(this.qYf).C(this.qYg).ew(this.qYh).D(this.qYi).E(this.qYj);
        Optional<it_1> optional = this.qYk.fBo();
        if (optional.isPresent()) {
            is_12.a(optional.get());
        } else {
            qYb.error((Object)String.format("[RE] Unable to convert following instance %s of %s to %s", new Object[]{this.qYk, eNr.class, it_1.class}));
        }
        return is_12.Oz();
    }

    public void f(@NotNull iq_2 iq_22) {
        this.qYc = iq_22.Od();
        this.qYd = iq_22.Of();
        this.qYf = iq_22.Oh();
        this.qYg = iq_22.Oj();
        this.qYh = iq_22.Ol();
        this.qYi = iq_22.On();
        this.qYj = iq_22.Op();
        Optional<eNr> optional = eNr.b(iq_22.Or());
        if (optional.isPresent()) {
            this.qYk = optional.get();
        } else {
            qYb.error((Object)String.format("[RE] Unable to convert following instance %s of %s to %s", new Object[]{iq_22.Or(), it_1.class, eNr.class}));
        }
    }

    @Override
    public /* synthetic */ qr_0 bao() {
        return this.fBm();
    }
}

