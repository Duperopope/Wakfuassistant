/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJs
 */
public abstract class fjs_2
extends fha_2
implements fjk_2 {
    protected String cpF = null;
    protected Object aGT = null;
    protected Object uEg = null;
    protected boolean uEh = false;
    public static final boolean uEi = false;
    public static final int uEj = 111972721;
    public static final int uEk = -691307374;
    public static final int uEl = 106079;

    public Object getValue() {
        return this.aGT;
    }

    public void setValue(Object object) {
        if (object != null && !object.equals(this.aGT) || this.aGT != null && !this.aGT.equals(object)) {
            this.aGT = object;
            this.gCJ();
        }
    }

    public Object getComparedValue() {
        return this.uEg;
    }

    public void setComparedValue(Object object) {
        if (object != null && !object.equals(this.uEg) || this.uEg != null && !this.uEg.equals(object) || object == null && this.uEg == null) {
            this.uEg = object;
            this.uEh = true;
            this.gCJ();
        }
    }

    public void gCJ() {
        if (this.uxL instanceof fjs_2) {
            ((fjs_2)this.uxL).gCJ();
        } else if (this.uxL instanceof fjt_2) {
            ((fjt_2)this.uxL).gCJ();
        } else if (this.uxL instanceof fjp_2) {
            ((fjp_2)this.uxL).pg(false);
        }
    }

    public String getKey() {
        return this.cpF;
    }

    public void setKey(String string) {
        this.cpF = string;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fjs_2 fjs_22 = (fjs_2)fhi_22;
        fjs_22.setKey(this.cpF);
        fjs_22.setValue(this.aGT);
        if (this.uEh) {
            fjs_22.setComparedValue(this.uEg);
        }
        super.a(fjs_22);
    }

    public abstract boolean isValid(Object var1);

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -691307374) {
            this.setComparedValue(fic_12.a(string, this.nQt));
        } else if (n == 111972721) {
            this.setValue(fic_12.a(string, this.nQt));
        } else if (n == 106079) {
            this.setKey(fic_12.a(string, this.nQt));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -691307374) {
            this.setComparedValue(object);
        } else if (n == 111972721) {
            this.setValue(object);
        } else if (n == 106079) {
            this.setKey(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

