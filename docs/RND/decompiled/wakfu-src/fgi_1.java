/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fGi
 */
public abstract class fgi_1<T extends Entity> {
    private static final Logger usE = Logger.getLogger(fgi_1.class);
    private T usF;

    public final T gxt() {
        return this.usF;
    }

    public final void gxu() {
        this.usF = this.dZq();
        ((Entity)this.usF).cWR = this;
        this.dZp();
    }

    protected abstract void dZp();

    protected abstract T dZq();

    public void clear() {
        ((ayy_2)this.usF).bsI();
        this.usF = null;
    }

    public void j(awk_1 awk_12) {
    }

    public abstract void a(fft_1 var1);
}

