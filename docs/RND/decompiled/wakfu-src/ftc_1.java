/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fTc
 */
public class ftc_1
implements Cloneable {
    protected static final Logger vfq = Logger.getLogger(ftc_1.class);
    private double aRr;

    public ftc_1(int n) {
        this.aRr = n;
    }

    public ftc_1(double d2) {
        this.aRr = d2;
    }

    public static ftc_1 wj(String string) {
        if (string.charAt(string.length() - 1) != '%') {
            return null;
        }
        double d2 = Double.valueOf(string.substring(0, string.length() - 1));
        return new ftc_1(d2);
    }

    public double glb() {
        return this.aRr;
    }

    public void J(double d2) {
        this.aRr = d2;
    }

    public boolean a(ftc_1 ftc_12) {
        return ftc_12 != null && ftc_12.aRr == this.aRr;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            vfq.error((Object)"CloneNotSupportedException during clone", (Throwable)cloneNotSupportedException);
            return null;
        }
    }
}

