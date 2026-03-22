/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ZG
extends ZC {
    private static final Logger bWj = Logger.getLogger(ZG.class);
    protected abi_1 bmk = abi_1.dzk;
    protected boolean bWk;

    public ZG() {
    }

    public ZG(long l) {
        super(l);
    }

    public ZG(long l, float f2, float f3) {
        super(l, f2, f3);
    }

    public ZG(long l, float f2, float f3, float f4) {
        super(l, f2, f3, f4);
    }

    @Override
    protected final float bpQ() {
        return this.bmk == abi_1.dzk ? 1.0f : 0.0f;
    }

    @Override
    protected final float bpR() {
        return this.bmk == abi_1.dzm ? 1.0f : 0.0f;
    }

    public void a(abi_1 abi_12) {
        if (abi_12 == null) {
            bWj.error((Object)"Unable to set a Direction8 to null", (Throwable)new Exception());
            return;
        }
        if (this.bmk != abi_12) {
            this.bmk = abi_12;
            this.bWk = true;
        }
    }

    public abi_1 bcB() {
        return this.bmk;
    }

    @Override
    protected String dQ(String string) {
        return this.ea(string);
    }

    @Override
    protected boolean bpJ() {
        return super.bpJ() || this.bWk;
    }

    @Override
    protected void bpK() {
        super.bpK();
        this.bWk = false;
    }

    @Override
    public String bpG() {
        return this.ea(this.bkI());
    }

    @Override
    public int dY(String string) {
        if (BH.aU(string)) {
            return 0;
        }
        String string2 = this.ea(string);
        return super.dY(string2);
    }

    public boolean dZ(String string) {
        aro_1 aro_12 = this.bqd();
        if (aro_12 == null) {
            return false;
        }
        return aro_12.dZ(this.ea(string));
    }

    public final String ea(String string) {
        return ZG.a(this.bmk.dzy, string, this.bpE());
    }

    public static String a(int n, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(n).append('_').append(string);
        if (string2 != null) {
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    @Override
    protected boolean bpM() {
        return super.bpM() || this.bWk;
    }
}

