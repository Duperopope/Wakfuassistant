/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Insets;
import org.apache.log4j.Logger;

/*
 * Renamed from fKw
 */
public class fkw_2
extends fkz_2 {
    private static Logger oO = Logger.getLogger(fkw_2.class);
    public static final String TAG = "BubbleBorder";
    private fla_1 uGp;
    private boolean nav = true;
    private boolean uGq = false;
    private float uGr = -2.0943952f;
    private boolean uGs = false;
    public static final int uGt = 1604064059;
    public static final int uGu = 1076156406;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fla_1 getMesh() {
        return this.uGp;
    }

    @Override
    public void setInsets(Insets insets) {
    }

    @Override
    public Entity getEntity() {
        return this.uGp.getEntity();
    }

    public void setDisplaySpark(boolean bl) {
        this.nav = bl;
        this.uGq = true;
        this.uGp.setDisplaySpark(bl);
    }

    public void setSparkAngle(float f2) {
        this.uGr = f2;
        this.uGs = true;
        if (this.nav) {
            this.uGp.setSparkAngle(f2);
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fkw_2 fkw_22 = (fkw_2)fhi_22;
        if (this.uGq) {
            fkw_22.setDisplaySpark(this.nav);
        }
        if (this.uGs) {
            fkw_22.setSparkAngle(this.uGr);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uGp.aVH();
        this.uGp = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uGr = -2.0943952f;
        this.nav = true;
        this.uGp = new fla_1();
        this.uGp.aVI();
        super.setInsets(this.uGp.getInsets());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1604064059) {
            this.setDisplaySpark(Bw.aK(string));
        } else if (n == 1076156406) {
            this.setSparkAngle(Bw.o(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1604064059) {
            this.setDisplaySpark(Bw.l(object));
        } else if (n == 1076156406) {
            this.setSparkAngle(Bw.o(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

