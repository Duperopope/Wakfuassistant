/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class fgb {
    private ayp_2 shP;
    @Nullable
    private ayp_2 shQ;
    @Nullable
    private fgc shR;
    @Nullable
    private fgi_0 shS;

    public void a(ayp_2 ayp_22, @Nullable ayp_2 ayp_23, @Nullable fgc fgc2, @Nullable fgi_0 fgi_02) {
        assert (this.shP == null) : "ItemComposer already initialized. Can't be initialized twice.";
        this.shP = ayp_22;
        this.shQ = ayp_23;
        this.shR = fgc2;
        this.shS = fgi_02;
    }

    public ayp_2 fWE() {
        return this.shP;
    }

    public ayp_2 fWF() {
        return this.shQ != null ? this.shQ : this.shP;
    }

    @Nullable
    public fgc fWG() {
        return this.shR;
    }

    @Nullable
    public fgi_0 fWH() {
        return this.shS;
    }

    public String toString() {
        return "ItemComposer{, m_uidGenerator=" + String.valueOf(this.shP) + ", m_fieldProvider=" + String.valueOf(this.shR) + ", m_quantityChangeListener=" + String.valueOf(this.shS) + "}";
    }
}

