/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from Ta
 */
public abstract class ta_0<TQuotaType extends PH>
extends sz_0<TQuotaType> {
    private static final Logger brT = Logger.getLogger(ta_0.class);
    private final int brU;
    private final int brV;

    protected ta_0(int n, int n2, int n3) {
        this(n, n2, n3, 0);
    }

    protected ta_0(int n, int n2, int n3, int n4) {
        super(n, n4);
        this.brU = n2;
        this.brV = n3;
    }

    @Override
    public void a(TQuotaType TQuotaType) {
        super.a(TQuotaType);
        if (this.brS > this.brV) {
            this.c(TQuotaType);
        }
    }

    @Override
    public void b(TQuotaType TQuotaType) {
        super.b(TQuotaType);
        if (this.brS < this.brU) {
            this.d(TQuotaType);
        }
    }

    public boolean bgx() {
        return this.brS < this.brV;
    }

    public boolean bgy() {
        return this.brS > this.brU;
    }

    protected abstract void c(TQuotaType var1);

    protected abstract void d(TQuotaType var1);

    public int bgz() {
        return this.brU;
    }

    public int bgA() {
        return this.brV;
    }
}

