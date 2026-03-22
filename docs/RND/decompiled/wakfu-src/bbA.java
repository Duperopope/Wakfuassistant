/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

final class bbA
implements bby {
    private static final Logger hAu = Logger.getLogger(bbA.class);
    private String hAv;
    private String hAw;
    private String egZ;
    private String hAx;
    private String hAy;
    private int hAz = 1;
    private String eha;
    private short bVV;
    private ZH hAA;
    private boolean hAB = true;
    private afW hAC;
    @NotNull
    private final eSS hAD;
    private List<bbz> hAE;

    bbA(@NotNull eSS eSS2) {
        this.hAD = eSS2;
    }

    @Override
    public long Sn() {
        return this.hAD.Sn();
    }

    @Override
    public String getName() {
        ahv_2 ahv_22 = new ahv_2();
        qu_0 qu_02 = this.hAD.bci();
        if (qu_02 instanceof bgy) {
            fjm fjm2 = (fjm)((Object)qu_02);
            ahv_22.c("[").c(fjm2.getName()).c("] ");
        }
        ahv_22.c(aum_0.cWf().a(6, (long)((int)this.hAD.bcw()), new Object[0]));
        return ahv_22.ceL();
    }

    @Override
    public boolean cZN() {
        return this.egZ != null && !this.egZ.isEmpty();
    }

    @Override
    public String cZO() {
        return this.egZ;
    }

    @Override
    public String cZP() {
        if (!this.cZQ()) {
            return this.cZO();
        }
        return this.hAx;
    }

    @Override
    public boolean cZQ() {
        return this.hAx != null;
    }

    @Override
    public String cZR() {
        if (!this.cZS()) {
            return this.cZO();
        }
        return this.hAy;
    }

    @Override
    public boolean cZS() {
        return this.hAy != null;
    }

    @Override
    public void le(String string) {
        this.egZ = null;
        this.hAx = null;
        this.hAy = null;
        if (string == null) {
            return;
        }
        String[] stringArray = BH.a(string, '|');
        if (stringArray.length >= 1) {
            this.egZ = stringArray[0];
        }
        if (stringArray.length >= 2) {
            this.hAx = stringArray[1];
        }
        if (stringArray.length >= 3) {
            this.hAy = stringArray[2];
        }
    }

    void lf(String string) {
        this.hAv = string;
    }

    void lg(String string) {
        this.hAw = string;
    }

    @Override
    public boolean cZX() {
        return this.hAD.a(etl_0.rnl);
    }

    @Override
    public void lc(String string) {
        this.eha = string;
    }

    @Override
    public void AA(int n) {
        this.hAz = n;
    }

    @Override
    public void g(afW afW2) {
        this.hAC = afW2;
    }

    @Override
    public afW cZT() {
        return this.hAC;
    }

    @Override
    public boolean cZU() {
        return !BH.aU(this.eha);
    }

    @Override
    public String cZV() {
        return this.eha;
    }

    @Override
    public int cZW() {
        return this.hAz;
    }

    @Override
    public boolean cZY() {
        return !BH.aU(this.hAw);
    }

    @Override
    public String cZZ() {
        return this.hAw;
    }

    @Override
    public boolean daa() {
        return !BH.aU(this.hAv);
    }

    @Override
    public String dab() {
        return this.hAv;
    }

    public void aq(short s) {
        this.bVV = s;
    }

    @Override
    public short bpX() {
        return this.bVV;
    }

    @Override
    public void fi(boolean bl) {
        this.hAB = bl;
    }

    @Override
    public boolean dae() {
        return this.hAB;
    }

    @Override
    public void k(ZH zH) {
        this.hAA = zH;
        this.hAA.qR(afX.cso.byy());
        try {
            this.hAA.a(this.hAD.bcB());
            this.ld("AnimStatique");
            if (this.hAE == null || this.hAE.isEmpty()) {
                return;
            }
            for (int i = 0; i < this.hAE.size(); ++i) {
                this.hAE.get(i).a(this);
            }
        }
        catch (Exception exception) {
            hAu.error((Object)exception);
        }
    }

    @Override
    public long ld(String string) {
        if (this.hAA == null) {
            return 0L;
        }
        this.hAA.dT(string);
        return this.hAA.dY(string);
    }

    @Override
    public ZH dac() {
        return this.hAA;
    }

    @Override
    @NotNull
    public eSS dad() {
        return this.hAD;
    }

    @Override
    public void a(bbz bbz2) {
        if (this.hAE == null) {
            this.hAE = new ArrayList<bbz>();
        }
        this.hAE.add(bbz2);
    }

    @Override
    public void b(bbz bbz2) {
        if (this.hAE != null) {
            this.hAE.remove(bbz2);
        }
    }

    @Override
    public void b(bby bby2) {
        if (bby2 == null) {
            return;
        }
        this.egZ = bby2.cZO();
        this.hAx = bby2.cZQ() ? bby2.cZP() : null;
        this.hAy = bby2.cZS() ? bby2.cZR() : null;
        this.eha = bby2.cZV();
        this.hAz = bby2.cZW();
        this.hAw = bby2.cZZ();
        this.hAv = bby2.dab();
        this.hAA = bby2.dac();
        this.hAC = bby2.cZT();
        this.bVV = bby2.bpX();
    }
}

