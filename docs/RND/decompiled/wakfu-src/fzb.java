/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fzb
extends fys_0
implements ayz_2 {
    private static Logger oO = Logger.getLogger(fzb.class);
    public static final String TAG = "mapAppearance";
    private fze tEl = null;
    private axb_2 ncL = null;
    private int bpd;
    private int bpg;
    private int bpe;
    private int bph;
    private boolean tEs = false;
    private boolean tEt = false;
    private boolean tEu = false;
    private boolean tEv = false;
    public static final int tEw = -1156593849;
    public static final int tEx = -892483530;
    public static final int tEy = -892483529;
    public static final int tEz = 3117789;
    public static final int tEA = 3117790;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.tEl = (fze)fhv_12;
            if (this.tCV instanceof fbb_2) {
                ((fbb_2)this.tCV).setMapBackgroundPixmap(((fze)fhv_12).getPixmap());
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
        if (this.tCV instanceof fbb_2) {
            ((fbb_2)this.tCV).setModulationColor(axb_22);
        }
    }

    public int getStartX() {
        return this.bpd;
    }

    public void setStartX(int n) {
        this.bpd = n;
        this.tEs = true;
        fbb_2 fbb_22 = (fbb_2)this.tCV;
        if (fbb_22 != null) {
            fbb_22.setMapBackgroundStartX(this.bpd);
        }
    }

    public int getEndX() {
        return this.bpg;
    }

    public void setEndX(int n) {
        this.bpg = n;
        this.tEt = true;
        fbb_2 fbb_22 = (fbb_2)this.tCV;
        if (fbb_22 != null) {
            fbb_22.setMapBackgroundEndX(this.bpg);
        }
    }

    public int getStartY() {
        return this.bpe;
    }

    public void setStartY(int n) {
        this.bpe = n;
        this.tEu = true;
        fbb_2 fbb_22 = (fbb_2)this.tCV;
        if (fbb_22 != null) {
            fbb_22.setMapBackgroundStartY(this.bpe);
        }
    }

    public int getEndY() {
        return this.bph;
    }

    public void setEndY(int n) {
        this.bph = n;
        this.tEv = true;
        fbb_2 fbb_22 = (fbb_2)this.tCV;
        if (fbb_22 != null) {
            fbb_22.setMapBackgroundEndY(this.bph);
        }
    }

    @Override
    public void setWidget(fes_2 fes_22) {
        super.setWidget(fes_22);
        if (fes_22 instanceof fbb_2) {
            fbb_2 fbb_22 = (fbb_2)fes_22;
            if (this.ncL != null) {
                fbb_22.setModulationColor(this.ncL);
            }
            if (this.tEl != null) {
                fbb_22.setMapBackgroundPixmap(this.tEl.getPixmap());
            }
            fbb_22.setMapBackgroundStartX(this.bpd);
            fbb_22.setMapBackgroundStartY(this.bpe);
            fbb_22.setMapBackgroundEndX(this.bpg);
            fbb_22.setMapBackgroundEndY(this.bph);
        }
    }

    @Override
    public boolean LZ(int n) {
        if (this.tFj && this.tCV instanceof fbb_2) {
            fbb_2 fbb_22 = (fbb_2)this.tCV;
            if (this.tEl != null) {
                fbb_22.setMapBackgroundPixmap(this.tEl.getPixmap());
            }
            fbb_22.setMapBackgroundStartX(this.bpd);
            fbb_22.setMapBackgroundStartY(this.bpe);
            fbb_22.setMapBackgroundEndX(this.bpg);
            fbb_22.setMapBackgroundEndY(this.bph);
        }
        return super.LZ(n);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fzb fzb2 = (fzb)fhi_22;
        super.a(fzb2);
        if (this.tEs) {
            fzb2.setStartX(this.bpd);
        }
        if (this.tEu) {
            fzb2.setStartY(this.bpe);
        }
        if (this.tEt) {
            fzb2.setEndX(this.bpg);
        }
        if (this.tEv) {
            fzb2.setEndY(this.bph);
        }
        fzb2.setModulationColor(this.ncL);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tEl = null;
        this.ncL = null;
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1156593849) {
            this.setModulationColor(fic_12.vm(string));
        } else if (n == -892483530) {
            this.setStartX(Bw.m(string));
        } else if (n == -892483529) {
            this.setStartY(Bw.m(string));
        } else if (n == 3117789) {
            this.setEndX(Bw.m(string));
        } else if (n == 3117790) {
            this.setEndY(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1156593849) {
            this.setModulationColor((axb_2)object);
        } else if (n == -892483530) {
            this.setStartX(Bw.m(object));
        } else if (n == -892483529) {
            this.setStartY(Bw.m(object));
        } else if (n == 3117789) {
            this.setEndX(Bw.m(object));
        } else if (n == 3117790) {
            this.setEndY(Bw.m(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

