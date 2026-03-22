/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from Yn
 */
public class yn_0
extends Yb<YX> {
    protected static final Logger bTO = Logger.getLogger(yn_0.class);
    protected Yg bTP;
    private float bTQ = 1.0f;

    public yn_0(YX yX) {
        super(yX);
        ((YX)this.bTD).a(this.bTA);
    }

    public float bos() {
        return this.bTQ;
    }

    public final void bN(float f2) {
        this.bTQ *= f2;
    }

    public void bO(float f2) {
        this.bTQ = f2;
    }

    public void bot() {
        if (!this.apo()) {
            return;
        }
        for (int i = 0; i < this.bTB.length; ++i) {
            this.bTB[i].a(this.bTC[i]);
        }
    }

    @Override
    public final void qF(int n) {
    }

    public final void b(Yg yg) {
        this.bTP = yg;
    }

    public boolean apo() {
        return this.bTP == null || this.bTP.floatValue() == 1.0f;
    }
}

