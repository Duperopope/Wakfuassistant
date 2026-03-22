/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.Stack;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class fyW
extends fkq_2
implements ayz_2 {
    private static final Logger tEe = Logger.getLogger(fyW.class);
    public static final String TAG = "Font";
    private awx_1 dbJ = null;
    private static final ObjectPool tEf = new ayv_2(new fyx_0(), 500);
    public static final int tEg = -494845757;
    public static final int tEh = 112787;

    public static fyW checkOut() {
        fyW fyW2;
        try {
            fyW2 = (fyW)tEf.borrowObject();
            fyW2.uth = tEf;
        }
        catch (Exception exception) {
            tEe.error((Object)"Probl\u00e8me au borrowObject.");
            fyW2 = new fyW();
            fyW2.aVI();
        }
        return fyW2;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setRenderer(awx_1 awx_12) {
        this.dbJ = awx_12;
    }

    public awx_1 getRenderer() {
        return this.dbJ;
    }

    @Override
    public void setup(fkq_1 fkq_12) {
        if (fkq_12 instanceof fyv_0) {
            ((fyv_0)fkq_12).setFont(this.dbJ);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.dbJ = null;
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fyW fyW2 = (fyW)fhi_22;
        super.a(fyW2);
        fyW2.dbJ = this.dbJ;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -494845757) {
            this.setRenderer(fic_12.vq(string));
        }
        if (n != 112787) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setRenderer(fyw_0.gqw().gqB().uG(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -494845757) {
            return super.setPropertyAttribute(n, object);
        }
        this.setRenderer((awm_2)object);
        return true;
    }

    @Override
    public void a(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
        super.a(apd_12, fhv_12, stack, fhu_12);
        apd_1 apd_13 = apd_12.fq("ref");
        if (apd_13 != null) {
            this.setRenderer(fyw_0.gqw().gqB().uG(apd_13.bCt()));
        }
        apd_12.b(apd_13);
    }
}

