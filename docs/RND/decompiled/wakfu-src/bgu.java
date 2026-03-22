/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class bgu {
    private static final Logger iao = Logger.getLogger(bgu.class);
    private final ArrayList<bis> iap = new ArrayList(2);
    private long aDh;
    private final double iaq;
    private int iar;
    private long ias;
    private int iat;
    private int iau;

    protected bgu(double d2) {
        this.iaq = d2;
    }

    public void jo(long l) {
        this.aDh = l;
        this.ias = System.currentTimeMillis();
        this.iat = this.getValue();
        this.iau = 0;
    }

    public void dl(int n, int n2) {
        this.CC(n);
        this.iar = n2;
        this.ias = System.currentTimeMillis();
        this.iat = n;
        this.iau = 0;
    }

    public void a(bis bis2) {
        if (!this.iap.contains(bis2)) {
            this.iap.add(bis2);
        }
    }

    public void b(bis bis2) {
        this.iap.remove(bis2);
    }

    public void CB(int n) {
        this.iar = n;
    }

    public void jp(long l) {
        double d2 = l - this.ias;
        int n = (int)Math.round((double)this.iar * d2 / this.iaq);
        if (n > this.iau) {
            int n2 = n - this.iau;
            this.CD(n2);
            this.iau = n;
        }
    }

    protected abstract void CC(int var1);

    protected void CD(int n) {
        for (int i = this.iap.size() - 1; i >= 0; --i) {
            this.iap.get(i).y(this.aDh, n);
        }
    }

    protected abstract int getValue();
}

