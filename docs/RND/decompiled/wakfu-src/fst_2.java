/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fSt
 */
public class fst_2
extends fss_2<axb_2> {
    private final float[] vef;
    private final arx_1 veg;
    private float @Nullable [] veh;

    public fst_2(float[] fArray, axb_2 axb_22, axb_2 axb_23, arx_1 arx_12, fax_1 fax_12, int n, int n2, abn abn2, int n3) {
        super(axb_22, axb_23, fax_12, n, n2, abn2);
        this.vef = (float[])fArray.clone();
        this.veg = arx_12;
        this.acd(n3);
    }

    public arx_1 dqZ() {
        return this.veg;
    }

    public void ag(float @Nullable [] fArray) {
        this.veh = fArray;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ == null) {
            return true;
        }
        float[] fArray = new float[]{this.tXJ.h(((axb_2)this.veb).aIU(), ((axb_2)this.vec).aIU(), this.bUi, this.bMn), this.tXJ.h(((axb_2)this.veb).aIV(), ((axb_2)this.vec).aIV(), this.bUi, this.bMn), this.tXJ.h(((axb_2)this.veb).aIW(), ((axb_2)this.vec).aIW(), this.bUi, this.bMn), this.tXJ.h(((axb_2)this.veb).aIX(), ((axb_2)this.vec).aIX(), this.bUi, this.bMn)};
        ((fax_1)this.ved).getAnimatedElement().a(this.veg, fArray);
        ((fax_1)this.ved).getAnimatedElement().bD(true);
        return true;
    }

    @Override
    public void cbz() {
        ((fax_1)this.ved).getAnimatedElement().a(this.veg, this.veh != null ? this.veh : this.vef);
        ((fax_1)this.ved).getAnimatedElement().bD(true);
        super.cbz();
    }
}

