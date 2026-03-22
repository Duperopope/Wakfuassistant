/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLx
 */
public class blx_2
implements aeh_2 {
    public static final String ktc = "name";
    public static final String ktd = "item";
    public static final String kte = "description";
    public static final String ktf = "level";
    public static final String ktg = "isComplete";
    private final blv_2 kth;
    private final bgv_2 kti;

    public blx_2(blv_2 blv_22) {
        this.kth = blv_22;
        this.kti = (bgv_2)fgD.fXh().Vd(this.kth.cuW());
    }

    public blv_2 ecI() {
        return this.kth;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ktc)) {
            return aum_0.cWf().a(15, (long)this.kth.cuW(), new Object[0]);
        }
        if (string.equals(ktd)) {
            return this.kti;
        }
        if (string.equals(kte)) {
            return aum_0.cWf().a(143, (long)this.kth.d(), new Object[0]);
        }
        if (string.equals(ktf)) {
            return aum_0.cWf().c("levelShort.custom", this.kth.cmL());
        }
        if (string.equals(ktg)) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (fea_0.ah(bgt_02.aZj(), this.kth.cuW()) > 0) {
                return true;
            }
            fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
            return fec_02.UB(this.kth.cuW()) != null;
        }
        return null;
    }
}

