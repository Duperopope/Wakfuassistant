/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aln
 */
public class aln_2
implements alj_2 {
    private static final Logger cFf = Logger.getLogger(aln_2.class);
    private int cFg;
    private byte cFh = (byte)100;
    private int aHP = -1;

    public aln_2() {
    }

    public aln_2(apl_1 apl_12) {
        this.a(apl_12);
    }

    public aln_2(int n, byte by, int n2) {
        this.cFg = n;
        this.cFh = by;
        this.aHP = n2;
    }

    @Override
    public void a(apl_1 apl_12) {
        this.cFg = apl_12.aIA();
        this.cFh = apl_12.aIy();
        this.aHP = apl_12.aIA();
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.mz(this.cFg);
        fs_02.g(this.cFh);
        fs_02.mz(this.aHP);
    }

    @Override
    public void a(arj_2 arj_22, int n) {
        if (!alu_1.a(arj_22)) {
            return;
        }
        if (this.cFg == 0) {
            cFf.debug((Object)"Id du son nul");
            return;
        }
        try {
            aix_2 aix_22 = aiv_2.bBr().a(this.cFg, (agn_1)((Object)arj_22), this.aHP);
            if (aix_22 == null) {
                cFf.debug((Object)"Impossible de trouver de BarkData ad\u00e9quat");
                return;
            }
            long l = aix_22.aYj();
            if (!arj_22.bpw().hC(l)) {
                return;
            }
            if (!alu_1.gh(l)) {
                return;
            }
            float f2 = aix_22.bBt() * (float)this.cFh / 100.0f;
            aiv_2.bBr().a(l, f2, aix_22.bBN(), 1, -1L, -1L, arj_22.bqo(), n, (agn_1)((Object)arj_22), aix_22.bBw());
        }
        catch (Exception exception) {
            cFf.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    @Override
    public int aeV() {
        return 1;
    }

    public void sR(int n) {
        this.cFg = n;
    }

    public void aw(byte by) {
        this.cFh = by;
    }

    public void sS(int n) {
        this.aHP = n;
    }
}

