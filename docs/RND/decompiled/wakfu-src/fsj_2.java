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
 * Renamed from fSj
 */
public class fsj_2
extends fha_2
implements ayz_2 {
    private static final Logger vdA = Logger.getLogger(fsj_2.class);
    public static final String TAG = "Property";
    private String p = null;
    private String dFo = null;
    private String vcM = null;
    private boolean uEM = false;
    private fsf_1 vdB = null;
    private fjj_2 vcO = null;
    private static final ObjectPool vdC = new ayv_2(new fsk_2(), 500);
    public static final int vdD = 103145323;
    public static final int vdE = 3373707;
    public static final int vdF = 13085340;
    public static final int vdG = 97427706;

    public static fsj_2 checkOut() {
        fsj_2 fsj_22;
        try {
            fsj_22 = (fsj_2)vdC.borrowObject();
            fsj_22.uth = vdC;
        }
        catch (Exception exception) {
            vdA.error((Object)"Probl\u00e8me au borrowObject.");
            fsj_22 = new fsj_2();
            fsj_22.aVI();
        }
        return fsj_22;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fjj_2) {
            this.vcO = (fjj_2)((Object)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public void setField(String string) {
        this.dFo = string;
    }

    public void setAttribute(String string) {
        this.vcM = string;
    }

    public void setLocal(boolean bl) {
        this.uEM = bl;
    }

    public fsf_1 getProperty() {
        return this.vdB;
    }

    public void ao(fhi_2 fhi_22) {
        if (this.vdB != null && fhi_22 != null) {
            this.vdB.b(new fsi_1<fhi_2>(fhi_22, fkc_2.gCQ().vR(fhi_22.getTag()), this.vcM, this.dFo, this.vcO), false);
        }
    }

    public void gFQ() {
        if (this.vdB == null && this.uwp) {
            fix_2[] fix_2Array;
            fhu_1 fhu_12;
            this.vdB = fse_1.gFu().j(this.p, this.uEM ? this.nQt : null);
            if (this.vdB == null) {
                this.vdB = new fsf_1(this.p, this.uEM ? this.nQt : null);
                fse_1.gFu().b(this.vdB);
            }
            if ((fhu_12 = this.nQt.gqC()) == null) {
                fhu_12 = fyw_0.gqw().gqC();
            }
            if ((fix_2Array = fhu_12.gAz()) != null) {
                for (fix_2 fix_22 : fix_2Array) {
                    fix_22.b(this.vdB);
                }
            }
            fsi_1<fhi_2> fsi_12 = new fsi_1<fhi_2>(this.uwe, fkc_2.gCQ().vR(this.uwe.getTag()), this.vcM, this.dFo, this.vcO);
            this.vdB.b(fsi_12, false);
        }
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.gFQ();
    }

    @Override
    public void gvr() {
        super.gvr();
        this.gFQ();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.p = null;
        this.dFo = null;
        this.vcM = null;
        this.vcO = null;
        this.vdB = null;
    }

    @Override
    public void aVI() {
        this.uEM = false;
        super.aVI();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fsj_2 fsj_22 = (fsj_2)fhi_22;
        super.a(fsj_22);
        fsj_22.vcM = this.vcM;
        fsj_22.dFo = this.dFo;
        fsj_22.p = this.p;
        fsj_22.uEM = this.uEM;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 103145323) {
            this.setLocal(Bw.aK(string));
        } else if (n == 3373707) {
            this.setName(fic_12.a(string, this.nQt));
        } else if (n == 13085340) {
            this.setAttribute(fic_12.a(string, this.nQt));
        } else if (n == 97427706) {
            this.setField(fic_12.a(string, this.nQt));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 103145323) {
            this.setLocal(Bw.l(object));
        } else if (n == 3373707) {
            this.setName(String.valueOf(object));
        } else if (n == 13085340) {
            this.setAttribute(String.valueOf(object));
        } else if (n == 97427706) {
            this.setField(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

