/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from bHT
 */
public class bht_2
extends bhi_1 {
    public static final int kcP = 0;
    public static final int kcQ = 1;
    private final bij_1 kcR;
    private final boolean kcS;

    public bht_2(bij_1 bij_12, boolean bl, bhl_1 bhl_12) {
        super(() -> {
            if (bl) {
                bhl_12.dVa().mM(null);
            } else {
                bhl_12.dVa().mL(null);
            }
            bhl_12.dVi();
        });
        this.kcR = bij_12;
        this.kcS = bl;
    }

    @Override
    public bhh_1 dWS() {
        return bhh_1.kcy;
    }

    @Override
    public void b(fiu_0 fiu_02) {
        if (this.kcS) {
            fiu_02.Wn(this.kcR.AK());
        } else {
            fiu_02.Wm(this.kcR.AK());
        }
    }

    @Override
    protected void c(fiu_0 fiu_02) {
        if (this.kcS) {
            fiu_02.Wn(-1);
        } else {
            fiu_02.Wm(-1);
        }
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public String dDG() {
        return this.kcR.getName();
    }

    @Override
    public int dWT() {
        return this.kcS ? 1 : 0;
    }

    @Generated
    public bij_1 dXa() {
        return this.kcR;
    }
}

