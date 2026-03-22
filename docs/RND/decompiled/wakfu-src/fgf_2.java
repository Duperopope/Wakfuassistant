/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Color;
import org.apache.log4j.Logger;

/*
 * Renamed from fGF
 */
public class fgf_2
extends fgb_2 {
    private static Logger oO = Logger.getLogger(fgf_2.class);
    private String bKP;
    private char[] uum;
    private int utn;
    private awx_1 cVs = null;
    private awm_2 uun = null;
    private Color bXH = null;
    private boolean uuo = false;
    private boolean uup = false;
    private boolean uuq = true;
    private boolean uur = true;

    public fgf_2() {
        this.a(fgc_2.uuh);
    }

    @Override
    public int aPs() {
        return this.bKP.length();
    }

    public String getText() {
        return this.bKP;
    }

    public char[] gza() {
        return this.uum;
    }

    public void setText(String string) {
        if (string != null && string.startsWith("\n")) {
            string = string.substring(1);
        }
        this.bKP = string;
        this.uum = (char[])(string != null ? this.bKP.toCharArray() : null);
    }

    public fgm_1 gzb() {
        return (fgm_1)this.uuf;
    }

    public awx_1 gzc() {
        if (this.cVs == null && this.gzb() != null) {
            return this.gzb().gzc();
        }
        return this.cVs;
    }

    public void b(awx_1 awx_12) {
        this.cVs = awx_12;
    }

    public awm_2 gzd() {
        return this.uun;
    }

    public void a(awm_2 awm_22) {
        this.uun = awm_22;
    }

    public int gxT() {
        return this.utn;
    }

    public void abn(int n) {
        this.utn = n;
    }

    public Color gze() {
        if (this.bXH == null && this.gzb() != null) {
            return this.gzb().gze();
        }
        return this.bXH;
    }

    public void c(Color color) {
        this.bXH = color;
    }

    public boolean gzf() {
        if (this.uuq && this.gzb() != null) {
            return this.gzb().gzf();
        }
        return this.uuo;
    }

    public void oR(boolean bl) {
        this.uuo = bl;
        this.uuq = false;
    }

    public boolean gzg() {
        if (this.uur && this.gzb() != null) {
            return this.gzb().gzg();
        }
        return this.uup;
    }

    public void oS(boolean bl) {
        this.uup = bl;
        this.uur = false;
    }

    @Override
    public int a(awx_1 awx_12, int n) {
        double d2 = 0.0;
        awx_1 awx_13 = this.gzc();
        if (awx_13 == null && awx_12 != null) {
            awx_13 = awx_12;
        }
        if (awx_13 != null) {
            String string = this.bKP;
            for (int i = 0; i < string.length(); ++i) {
                char c2 = string.charAt(i);
                int n2 = awx_13.e(c2);
                if (d2 + (double)n2 >= (double)n) {
                    return i;
                }
                d2 += (double)n2;
            }
        }
        return -1;
    }

    @Override
    public int b(awx_1 awx_12, int n) {
        String string = this.bKP.substring(0, GC.a(n, 0, this.bKP.length()));
        awx_1 awx_13 = this.gzc();
        if (awx_13 == null && awx_12 != null) {
            awx_13 = awx_12;
        }
        if (awx_13 != null) {
            return awx_13.gj(string);
        }
        return 0;
    }

    @Override
    public int c(awx_1 awx_12, int n) {
        String string = this.bKP.substring(0, n);
        awx_1 awx_13 = this.gzc();
        if (awx_13 == null && awx_12 != null) {
            awx_13 = awx_12;
        }
        if (awx_13 != null) {
            return awx_13.gj(string);
        }
        return 0;
    }

    public String toString() {
        return this.bKP;
    }

    @Override
    public /* synthetic */ fgk_2 gyW() {
        return this.gzb();
    }
}

