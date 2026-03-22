/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class fyY
extends fys_0
implements ayz_2 {
    private static final Logger tEi = Logger.getLogger(fyY.class);
    public static final String TAG = "ImageAppearance";
    private boolean tEj;
    private boolean tEk;
    private fze tEl;
    private axb_2 ncL;
    private String tEm;
    private static final ObjectPool tEn = new ayv_2(new fyZ());
    public static final int tEo = -908189606;
    public static final int tEp = -903579675;

    public static fyY checkOut() {
        fyY fyY2;
        try {
            fyY2 = (fyY)tEn.borrowObject();
            fyY2.uth = tEn;
        }
        catch (Exception exception) {
            tEi.error((Object)"Probl\u00e8me au borrowObject.");
            fyY2 = new fyY();
            fyY2.aVI();
        }
        return fyY2;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.tEl = (fze)fhv_12;
            if (this.tCV instanceof fbt_1) {
                ((fbt_1)this.tCV).setPixmap((fze)fhv_12);
                if (this.tEk) {
                    ((fbt_1)this.tCV).setScaled(this.tEj);
                }
            } else if (this.tCV != null) {
                tEi.error((Object)("Un " + String.valueOf(this.tCV.getClass()) + " poss\u00e8de une ImageAppearance et ne peut pas recevoir de Pixmap"));
            }
        }
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public axb_2 getModulationColor() {
        return this.ncL;
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
        if (this.tCV instanceof fbt_1) {
            ((fbt_1)this.tCV).setModulationColor(axb_22);
        }
    }

    public boolean isScaled() {
        return this.tEj;
    }

    public void setScaled(boolean bl) {
        this.tEj = bl;
        this.tEk = true;
        if (this.tCV instanceof fbt_1) {
            ((fbt_1)this.tCV).setScaled(this.tEj);
        }
    }

    @Override
    public void setWidget(fes_2 fes_22) {
        super.setWidget(fes_22);
        if (fes_22 instanceof fbt_1) {
            fbt_1 fbt_12 = (fbt_1)fes_22;
            if (this.tEk) {
                fbt_12.setScaled(this.tEj);
            }
            if (this.ncL != null) {
                fbt_12.setModulationColor(this.ncL);
            }
            this.setShader(this.tEm);
        }
    }

    @Override
    public boolean LZ(int n) {
        if (this.tFj && this.tCV instanceof fbt_1) {
            fbt_1 fbt_12 = (fbt_1)this.tCV;
            if (this.tEl != null) {
                fbt_12.setPixmap(this.tEl);
            }
            if (this.tEk) {
                fbt_12.setScaled(this.tEj);
            }
        }
        return super.LZ(n);
    }

    @Override
    public void grd() {
        for (int i = this.tDS.size() - 1; i >= 0; --i) {
            fkp_1 fkp_12 = (fkp_1)this.tDS.get(i);
            if (!(fkp_12 instanceof fze)) continue;
            this.tCV.getEntity().bJk();
        }
        super.grd();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fyY fyY2 = (fyY)fhi_22;
        super.a(fyY2);
        if (this.tEk) {
            fyY2.setScaled(this.tEj);
        }
        fyY2.setShader(this.tEm);
        fyY2.setModulationColor(this.ncL);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tEl = null;
        this.ncL = null;
        this.tEm = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tEj = false;
        this.tEk = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -908189606) {
            this.setScaled(Bw.aK(string));
        } else if (n == -903579675) {
            this.setShader(string);
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    public void setShader(String string) {
        this.tEm = string;
        fes_2 fes_22 = this.getWidget();
        if (fes_22 == null) {
            return;
        }
        ((fbt_1)fes_22).setShader(string);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -908189606) {
            this.setScaled(Bw.l(object));
        } else if (n == -903579675) {
            this.setShader(object.toString());
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

