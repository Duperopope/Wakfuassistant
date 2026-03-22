/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fLu
 */
public class flu_1
extends flp_2 {
    private static final Logger uIr = Logger.getLogger(flu_1.class);
    private fbd_1 uIs = null;
    private Object uIt = null;
    private Object aGT = null;
    private static final ObjectPool uIu = new ayv_2(new flv_1());

    public flu_1() {
    }

    public flu_1(fbd_1 fbd_12, Object object) {
        this.setDragNDropable(fbd_12);
        this.uBe = fbd_12;
        this.aGT = object;
    }

    public static flu_1 a(flp_2 flp_22, fhv_1 fhv_12, Object object) {
        flu_1 flu_12;
        try {
            flu_12 = (flu_1)uIu.borrowObject();
            flu_12.uth = uIu;
        }
        catch (Exception exception) {
            uIr.error((Object)"Probl\u00e8me au borrowObject.");
            flu_12 = new flu_1();
            flu_12.aVI();
        }
        flu_12.NQ(flp_22.ofv);
        flu_12.aca(flp_22.tPo);
        flu_12.abZ(flp_22.ofK);
        flu_12.qu(flp_22.bVF);
        flu_12.qv(flp_22.bVG);
        flu_12.x(fhv_12);
        flu_12.b(fzq_0.tJv);
        flu_12.setDragNDropable((fbd_1)fhv_12);
        flu_12.aGT = object;
        return flu_12;
    }

    public fbd_1 getDragNDropable() {
        return this.uIs;
    }

    public void setDragNDropable(fbd_1 fbd_12) {
        fcv_1 fcv_12;
        if (fbd_12 instanceof fhv_1) {
            this.uIs = fbd_12;
        }
        if (fbd_12 != null && (fcv_12 = fbd_12.getRenderableParent()) != null) {
            this.uIt = fcv_12.getItemValue();
        }
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

    @Override
    public fzq_0 gBy() {
        return fzq_0.tJv;
    }
}

