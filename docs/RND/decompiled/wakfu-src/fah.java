/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class fah
implements RW<ffV, uy_1> {
    public static final fah rNA = new fah();
    private final fgh rNB;
    private final fgc_0 rNC;

    private fah() {
        this.rNB = fgD.fXh();
        this.rNC = fgD.fXh();
    }

    fah(fgh fgh2, fgc_0 fgc_02) {
        this.rNB = fgh2;
        this.rNC = fgc_02;
    }

    @Nullable
    public uy_1 a(gq_0<uy_1> gq_02) {
        uy_1 uy_12 = this.fQK();
        return gq_02.a(uy_12) ? uy_12 : null;
    }

    @Nullable
    public ffV a(uy_1 uy_12) {
        ffV ffV2 = this.fQJ();
        return ffV2.c(uy_12) ? ffV2 : null;
    }

    public ffV fQJ() {
        return this.rNB.fQJ();
    }

    public uy_1 fQK() {
        return this.rNC.fXg();
    }

    public String toString() {
        return "GuildStorageBoxContentProvider{m_itemProvider=" + this.rNB.getClass().getName() + ", m_rawItemProvider=" + this.rNC.getClass().getName() + "}";
    }

    @Override
    @Nullable
    public /* synthetic */ RT x(Object object) {
        return this.a((uy_1)object);
    }
}

