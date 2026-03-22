/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.event.MouseEvent;
import org.apache.commons.pool.ObjectPool;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fLC
 */
public class flc_2
extends flp_2 {
    fbd_1 uIs;
    Object uIt;
    Object aGT;
    private static final ObjectPool uIF = new ayv_2(new fld_2());

    public flc_2() {
    }

    public flc_2(fbd_1 fbd_12, Object object) {
        this.setDragNDropable(fbd_12);
        this.uBe = fbd_12;
        this.aGT = object;
    }

    public static flc_2 a(MouseEvent mouseEvent, fbd_1 fbd_12, Object object) {
        flc_2 flc_22;
        try {
            flc_22 = (flc_2)uIF.borrowObject();
            flc_22.uth = uIF;
        }
        catch (Exception exception) {
            flc_22 = new flc_2();
            flc_22.aVI();
        }
        flc_22.NQ(mouseEvent.getButton());
        flc_22.aca(mouseEvent.getClickCount());
        flc_22.abZ(mouseEvent.getModifiersEx());
        flc_22.qu(fhz_2.gAS().getX());
        flc_22.qv(fhz_2.gAS().getY());
        flc_22.x((fhv_1)fbd_12);
        flc_22.b(fzq_0.tJz);
        flc_22.setDragNDropable(fbd_12);
        flc_22.aGT = object;
        return flc_22;
    }

    public static flc_2 a(flp_2 flp_22, fbd_1 fbd_12, Object object) {
        flc_2 flc_22;
        try {
            flc_22 = (flc_2)uIF.borrowObject();
            flc_22.uth = uIF;
        }
        catch (Exception exception) {
            flc_22 = new flc_2();
            flc_22.aVI();
        }
        flc_22.NQ(flp_22.ofv);
        flc_22.aca(flp_22.tPo);
        flc_22.abZ(flp_22.ofK);
        flc_22.qu(flp_22.bVF);
        flc_22.qv(flp_22.bVG);
        flc_22.x((fhv_1)fbd_12);
        flc_22.b(fzq_0.tJz);
        flc_22.setDragNDropable(fbd_12);
        flc_22.aGT = object;
        return flc_22;
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

    @Nullable
    public fes_2 gDM() {
        return fbj_1.getInstance().getWidget(this.bVF, this.bVG);
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
        return fzq_0.tJz;
    }
}

