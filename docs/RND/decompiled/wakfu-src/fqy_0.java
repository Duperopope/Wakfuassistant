/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from fqy
 */
public class fqy_0 {
    protected static final Logger sTD = Logger.getLogger(fqy_0.class);
    private final int sTE;
    private final String sTF;
    private final int sTG;
    private final String sTH;
    private final int[] sTI;
    private boolean cHn = true;
    private final boolean sTJ = false;

    public fqy_0(int n, String string, int n2, String string2, int[] nArray) {
        this.sTE = n;
        this.sTF = string;
        this.sTG = n2;
        this.sTH = string2;
        this.sTI = nArray;
    }

    public int clf() {
        return this.sTE;
    }

    public String giu() {
        return this.sTF;
    }

    public int giv() {
        return this.sTG;
    }

    public String giw() {
        return this.sTH;
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    public boolean gix() {
        return false;
    }

    public boolean giy() {
        return this.sTI.length != 0;
    }

    public boolean bV(exP exP2) {
        return !this.giy() || this.bW(exP2) != null;
    }

    public ffV bW(exP exP2) {
        assert (this.giy());
        Long l = exP2.dmL().t(ffS.sgS);
        fhe fhe2 = fhi.soc.aI(exP2.Xi(), exP2.Sn());
        if (fhe2 == null) {
            return null;
        }
        Optional<ffV> optional = fhe2.B(l);
        if (optional.isPresent()) {
            ffV ffV2 = optional.get();
            if (this.y(ffV2)) {
                return ffV2;
            }
            for (int n : this.sTI) {
                ffV ffV3 = exP2.dod().UK(n);
                if (ffV3 == null) continue;
                return ffV3;
            }
        }
        return null;
    }

    private boolean y(RT rT) {
        if (rT == null) {
            return false;
        }
        for (int n : this.sTI) {
            if (rT.avr() != n) continue;
            return true;
        }
        return false;
    }

    public int[] cuZ() {
        return (int[])this.sTI.clone();
    }

    public String toString() {
        return "ActionVisual{m_visualId=" + this.sTE + ", m_animLink='" + this.sTF + "', m_mruGfx=" + this.sTG + ", m_mruLabelKey='" + this.sTH + "', m_associatedItems=" + Arrays.toString(this.sTI) + ", m_enabled=" + this.cHn + ", m_multiCell=false}";
    }
}

