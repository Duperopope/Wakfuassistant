/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from fMm
 */
public class fmm_2
extends fip_1 {
    private fbd_1 uIv;
    private fbd_1 uIC;
    private Object uIt;
    private Object uID;
    private Object aGT;

    public void e(String string, fhs_2 fhs_22) {
        this.b(string, fhs_22);
    }

    public void a(fbd_1 fbd_12, fbd_1 fbd_13, Object object) {
        fcv_1 fcv_12;
        this.aGT = object;
        this.uIv = fbd_12;
        this.uIC = fbd_13;
        if (this.uIv != null && (fcv_12 = this.uIv.getRenderableParent()) != null) {
            this.uIt = fcv_12.getItemValue();
        }
        if (this.uIC != null && (fcv_12 = this.uIC.getRenderableParent()) != null) {
            this.uID = fcv_12.getItemValue();
        }
    }

    @Override
    protected void a(String[] stringArray, List<Class<?>> list, List<Object> list2) {
        list.add(fbd_1.class);
        list.add(Object.class);
        list.add(fbd_1.class);
        list.add(Object.class);
        list.add(Object.class);
        list2.add(this.uIv);
        list2.add(this.uIt);
        list2.add(this.uIC);
        list2.add(this.uID);
        list2.add(this.aGT);
        super.a(stringArray, list, list2);
    }

    public void a(fmm_2 fmm_22) {
        fmm_22.e(this.cEp, this.nQt);
    }

    public fmm_2 gEx() {
        fmm_2 fmm_22 = new fmm_2();
        this.a(fmm_22);
        return fmm_22;
    }

    public Object b(fbd_1 fbd_12, fbd_1 fbd_13, Object object) {
        fcv_1 fcv_12;
        this.aGT = object;
        this.uIv = fbd_12;
        this.uIC = fbd_13;
        if (this.uIv != null && (fcv_12 = this.uIv.getRenderableParent()) != null) {
            this.uIt = fcv_12.getItemValue();
        }
        if (this.uIC != null && (fcv_12 = this.uIC.getRenderableParent()) != null) {
            this.uID = fcv_12.getItemValue();
        }
        return super.gBz();
    }
}

