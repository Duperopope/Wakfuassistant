/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bIq
 */
public class biq_2
extends bip_1 {
    private static final Logger kga = Logger.getLogger(biq_2.class);
    private final bii_2 kgb;
    private final byte kgc;
    private final ang_2 kgd;

    public biq_2(vf_0 vf_02, int n, bii_2 bii_22, String string, String string2, byte by, String string3, String string4, long l) {
        super(vf_02, n, null, string, null, (byte)0, string3, string4, l, bii_22.dZi());
        this.kgb = bii_22;
        this.kgc = by;
        this.kgd = biq_2.u(string2, n);
    }

    private static ang_2 u(String string, int n) {
        try {
            return ehu_0.rY(string);
        }
        catch (Exception exception) {
            kga.error((Object)("Error when compiling visibility criterion of map zone " + n), (Throwable)exception);
            return null;
        }
    }

    public bii_2 dYl() {
        return this.kgb;
    }

    @Override
    public byte dYm() {
        return this.kgc;
    }

    @Override
    public boolean dXU() {
        biq_1 biq_12 = bih_2.dZf().b(this.kgb, this.Sn());
        return biq_12 != null;
    }

    @Override
    public void a(bif_2 bif_22) {
        bic_2 bic_22;
        biq_1 biq_12 = bih_2.dZf().b(this.kgb, this.Sn());
        if (biq_12 != null && this.kgb == bii_2.khD && !(bic_22 = (bic_2)biq_12).dYu()) {
            bic_22.dYv();
        }
        bif_22.a(biq_12);
    }

    @Override
    public String dYn() {
        return big_2.lA(this.Sn());
    }

    @Override
    public boolean dYo() {
        return true;
    }

    @Override
    public boolean isVisible() {
        return this.kgd == null || this.kgd.b(null, null, null, null);
    }
}

