/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fLA
 */
public class fla_2
extends flp_2 {
    private fbd_1 uIC;
    private fbd_1 uIv;
    private Object uIt;
    private Object uID;
    private Object aGT;
    private int uAN;
    private static final ObjectPool uIE = new ayv_2(new flb_2());

    public fla_2() {
    }

    public fla_2(fbd_1 fbd_12, fbd_1 fbd_13, Object object) {
        this.F(fbd_13);
        this.G(fbd_12);
        this.uBe = fbd_12;
        this.aGT = object;
    }

    public static fla_2 c(flp_2 flp_22, fbd_1 fbd_12, fbd_1 fbd_13, Object object) {
        fla_2 fla_22;
        try {
            fla_22 = (fla_2)uIE.borrowObject();
            fla_22.uth = uIE;
        }
        catch (Exception exception) {
            fla_22 = new fla_2();
            fla_22.aVI();
        }
        fla_22.NQ(flp_22.ofv);
        fla_22.aca(flp_22.tPo);
        fla_22.abZ(flp_22.ofK);
        fla_22.qu(flp_22.bVF);
        fla_22.qv(flp_22.bVG);
        fla_22.x((fhv_1)fbd_12);
        fla_22.b(fzq_0.tJy);
        fla_22.F(fbd_13);
        fla_22.G(fbd_12);
        fla_22.aGT = object;
        return fla_22;
    }

    public fbd_1 gDH() {
        return this.uIv;
    }

    public void F(fbd_1 fbd_12) {
        fcv_1 fcv_12;
        if (fbd_12 instanceof fhv_1) {
            this.uIv = fbd_12;
        }
        if (fbd_12 != null && (fcv_12 = fbd_12.getRenderableParent()) != null) {
            this.uIt = fcv_12.getItemValue();
        }
    }

    public fbd_1 gDI() {
        return this.uIC;
    }

    public void G(fbd_1 fbd_12) {
        fcv_1 fcv_12;
        if (fbd_12 instanceof fhv_1) {
            this.uIC = fbd_12;
        }
        if (fbd_12 != null && (fcv_12 = fbd_12.getRenderableParent()) != null) {
            this.uID = fcv_12.getItemValue();
        }
    }

    public Object gDJ() {
        return this.uID;
    }

    public void bi(Object object) {
        this.uID = object;
    }

    public Object gDy() {
        return this.uIt;
    }

    public void bh(Object object) {
        this.uIt = object;
    }

    public Object getValue() {
        return this.aGT;
    }

    public void setValue(Object object) {
        this.aGT = object;
    }

    public int gDK() {
        return this.uAN;
    }

    public void abY(int n) {
        this.uAN = n;
    }

    @Override
    public fzq_0 gBy() {
        return fzq_0.tJy;
    }
}

