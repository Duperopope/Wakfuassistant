/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from biG
 */
final class big_0
extends bil_0 {
    private static final Logger ilF = Logger.getLogger(big_0.class);
    private final bgy ilG;
    private int brS = 0;
    private int ilH = 0;

    big_0(exf_2 exf_22, bim_0 bim_02, bgy bgy2) {
        super(exf_22, bim_02, (byte)83);
        this.ilG = bgy2;
        this.brS = exf_22.aYB();
        this.ilH = exf_22.aYB();
    }

    @Override
    protected int dqv() {
        return super.dqv();
    }

    @Override
    protected int dqw() {
        return this.ilH;
    }

    @Override
    public String dqx() {
        ahv_2 ahv_22 = new ahv_2();
        try {
            ahv_22.a(auk_0.zU(this.imh), 16, 16, null).c(" ");
        }
        catch (fu_0 fu_02) {
            ilF.warn((Object)fu_02.getMessage());
            ahv_22.af(this.dqE()).c(" : ");
        }
        ahv_22.yx(this.dqv()).c("/").yx(this.dqw());
        return ahv_22.ceL();
    }

    @Override
    public void a(pr_0 pr_02) {
        if (pr_02.aYQ() != this.dqy()) {
            return;
        }
        if (pr_02.aYB() > this.brS) {
            int n = this.ilG.e(exx_2.rGi).aYD();
            boolean bl = this.ilG.aFW() == 0 || this.ilG.aFW() == 5;
            this.ilH = bl ? (int)Math.ceil((double)n / 2.0) : n;
        } else if (pr_02.aYB() <= 0) {
            this.ilH = 0;
        }
        this.brS = pr_02.aYB();
        super.a(pr_02);
    }
}

