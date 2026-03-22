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
 * Renamed from fyP
 */
public class fyp_0
extends fkq_2
implements ayz_2 {
    private static final Logger tDz = Logger.getLogger(fyp_0.class);
    public static final String TAG = "Color";
    public static final String tDA = "NamedColor";
    private axb_2 chO = null;
    private fzs_0 tDB = null;
    private String p = null;
    private static final ObjectPool tDC = new ayv_2(new fyq_0(), 800);
    public static final int tDD = 94842723;
    public static final int tDE = 3373707;
    public static final int tDF = 0x2C929929;

    public static fyp_0 checkOut() {
        fyp_0 fyp_02;
        try {
            fyp_02 = (fyp_0)tDC.borrowObject();
            fyp_02.uth = tDC;
        }
        catch (Exception exception) {
            tDz.error((Object)"Probl\u00e8me au borrowObject.");
            fyp_02 = new fyp_0();
            fyp_02.aVI();
        }
        return fyp_02;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setColor(axb_2 axb_22) {
        if (this.chO == axb_22) {
            return;
        }
        this.chO = axb_22;
        this.h(new flr_2(this));
    }

    public axb_2 getColor() {
        return this.chO;
    }

    public fzs_0 getPosition() {
        return this.tDB;
    }

    public void setPosition(fzs_0 fzs_02) {
        this.tDB = fzs_02;
        this.h(new flr_2(this));
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
        this.h(new flr_2(this));
    }

    @Override
    public void setup(fkq_1 fkq_12) {
        if (fkq_12 instanceof fyo_0) {
            ((fyo_0)fkq_12).setColor(this.chO, this.p);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.chO = null;
        this.p = null;
        this.tDB = null;
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fyp_0 fyp_02 = (fyp_0)fhi_22;
        super.a(fyp_02);
        fyp_02.setColor(this.getColor());
        fyp_02.p = this.p;
        fyp_02.tDB = this.tDB;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 94842723) {
            this.setColor(fic_12.vm(string));
        } else if (n == 3373707) {
            this.setName(fic_12.a(string, this.nQt));
        } else if (n == 0x2C929929) {
            this.setPosition(fzs_0.tA(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 94842723) {
            this.setColor((axb_2)object);
        } else if (n == 3373707) {
            this.setName(String.valueOf(object));
        } else if (n == 0x2C929929) {
            this.setPosition((fzs_0)((Object)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

