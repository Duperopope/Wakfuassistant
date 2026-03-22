/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fLy
 */
public class fly_1
extends flp_2 {
    private fbd_1 uIv = null;
    private Object uIt = null;
    private Object aGT = null;
    private fbd_1 uIz = null;
    private Object uIA = null;
    private static final ObjectPool uIB = new ayv_2(new flz_1());

    public fly_1() {
    }

    public fly_1(fbd_1 fbd_12, fbd_1 fbd_13, Object object) {
        this.C(fbd_12);
        this.E(fbd_13);
        this.uBe = fbd_12;
        this.aGT = object;
    }

    public static fly_1 b(flp_2 flp_22, fbd_1 fbd_12, fbd_1 fbd_13, Object object) {
        fly_1 fly_12;
        try {
            fly_12 = (fly_1)uIB.borrowObject();
            fly_12.uth = uIB;
        }
        catch (Exception exception) {
            fly_12 = new fly_1();
            fly_12.aVI();
        }
        fly_12.NQ(flp_22.ofv);
        fly_12.aca(flp_22.tPo);
        fly_12.abZ(flp_22.ofK);
        fly_12.qu(flp_22.bVF);
        fly_12.qv(flp_22.bVG);
        fly_12.x((fhv_1)fbd_12);
        fly_12.b(fzq_0.tJx);
        fly_12.C(fbd_12);
        fly_12.E(fbd_13);
        fly_12.aGT = object;
        return fly_12;
    }

    public fbd_1 gDA() {
        return this.uIv;
    }

    public void C(fbd_1 fbd_12) {
        fcv_1 fcv_12;
        if (fbd_12 instanceof fhv_1) {
            this.uIv = fbd_12;
        }
        if (fbd_12 != null && (fcv_12 = fbd_12.getRenderableParent()) != null) {
            this.uIt = fcv_12.getItemValue();
        }
    }

    public fbd_1 gDE() {
        return this.uIz;
    }

    public void E(fbd_1 fbd_12) {
        fcv_1 fcv_12;
        if (fbd_12 instanceof fhv_1) {
            this.uIz = fbd_12;
        }
        if (fbd_12 != null && (fcv_12 = fbd_12.getRenderableParent()) != null) {
            this.uIA = fcv_12.getItemValue();
        }
    }

    public Object gDy() {
        return this.uIt;
    }

    public Object gDF() {
        return this.uIA;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tJx;
    }
}

