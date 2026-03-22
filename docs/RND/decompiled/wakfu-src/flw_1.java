/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fLw
 */
public class flw_1
extends flp_2 {
    private fbd_1 uIv = null;
    private Object uIt = null;
    private Object aGT = null;
    private fbd_1 uIw = null;
    private Object uIx = null;
    private static final ObjectPool uIy = new ayv_2(new flx_1());

    public flw_1() {
    }

    public flw_1(fbd_1 fbd_12, fbd_1 fbd_13, Object object) {
        this.C(fbd_12);
        this.D(fbd_13);
        this.uBe = fbd_12;
        this.aGT = object;
    }

    public static flw_1 a(flp_2 flp_22, fbd_1 fbd_12, fbd_1 fbd_13, Object object) {
        flw_1 flw_12;
        try {
            flw_12 = (flw_1)uIy.borrowObject();
            flw_12.uth = uIy;
        }
        catch (Exception exception) {
            flw_12 = new flw_1();
            flw_12.aVI();
        }
        flw_12.NQ(flp_22.ofv);
        flw_12.aca(flp_22.tPo);
        flw_12.abZ(flp_22.ofK);
        flw_12.qu(flp_22.bVF);
        flw_12.qv(flp_22.bVG);
        flw_12.x((fhv_1)fbd_12);
        flw_12.b(fzq_0.tJw);
        flw_12.C(fbd_12);
        flw_12.D(fbd_13);
        flw_12.aGT = object;
        return flw_12;
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

    public fbd_1 gDB() {
        return this.uIw;
    }

    public void D(fbd_1 fbd_12) {
        fcv_1 fcv_12;
        if (fbd_12 instanceof fhv_1) {
            this.uIw = fbd_12;
        }
        if (fbd_12 != null && (fcv_12 = fbd_12.getRenderableParent()) != null) {
            this.uIx = fcv_12.getItemValue();
        }
    }

    public Object gDy() {
        return this.uIt;
    }

    public Object gDC() {
        return this.uIx;
    }

    public Object getValue() {
        return this.aGT;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tJw;
    }
}

