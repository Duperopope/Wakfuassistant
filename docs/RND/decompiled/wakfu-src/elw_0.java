/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from eLw
 */
public class elw_0 {
    private final elp_0[] qGK;
    private final short qGL;
    private final short qGM;
    private final boolean qGN;

    public elw_0(elp_0[] elp_0Array, short s, short s2, boolean bl) {
        this.qGK = elp_0Array;
        this.qGL = s;
        this.qGM = s2;
        this.qGN = bl;
    }

    public elp_0[] fzN() {
        return this.qGK;
    }

    public short aVf() {
        return this.qGL;
    }

    public short cut() {
        return this.qGM;
    }

    public boolean cuu() {
        return this.qGN;
    }

    public String toString() {
        return "RecipeMaterialSlot{m_materialTypes=" + Arrays.toString(this.qGK) + ", m_minLevel=" + this.qGL + ", m_minRarity=" + this.qGM + ", m_optionnal=" + this.qGN + "}";
    }

    public boolean equals(Object object) {
        if (!(object instanceof elw_0)) {
            return false;
        }
        elw_0 elw_02 = (elw_0)object;
        for (elp_0 elp_02 : elw_02.fzN()) {
            if (ado_1.a(this.qGK, elp_02)) continue;
            return false;
        }
        return this.qGL == elw_02.aVf() && this.qGM == elw_02.aVf() && this.qGN == elw_02.cuu();
    }
}

