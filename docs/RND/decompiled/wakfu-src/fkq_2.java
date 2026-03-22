/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fKq
 */
public abstract class fkq_2
extends fkp_2
implements fkp_1 {
    private static Logger oO = Logger.getLogger(fkq_2.class);
    private boolean uGk;
    public static final int uGl = 52396879;

    @Override
    public boolean isDecoratorSwitch() {
        return this.uGk;
    }

    @Override
    public void setDecoratorSwitch(boolean bl) {
        this.uGk = bl;
    }

    @Override
    public abstract void setup(fkq_1 var1);

    @Override
    public void aVI() {
        super.aVI();
        this.uGk = false;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fkq_2 fkq_22 = (fkq_2)fhi_22;
        fkq_22.setDecoratorSwitch(this.uGk);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 52396879) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setDecoratorSwitch(Bw.aK(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 52396879) {
            return super.setPropertyAttribute(n, object);
        }
        this.setDecoratorSwitch(Bw.l(object));
        return true;
    }
}

