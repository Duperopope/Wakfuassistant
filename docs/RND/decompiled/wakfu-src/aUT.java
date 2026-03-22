/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public abstract class aUT
extends aUU {
    private static final int hrX = 999;
    private static final float hrY = 1.4f;
    protected static final bsT hrZ = new bsT();
    private afW hsa;
    private double hsb;
    private final boolean hsc;
    private final boolean hsd;
    private int bap;
    private int baq;
    private short ban;

    public aUT(int n, int n2, int n3, int n4, boolean bl, boolean bl2, long l, int n5, int n6, short s) {
        super(n, n2, n3, n4);
        this.f(new bwp_2(this));
        this.hB(l);
        this.hsc = bl;
        this.hsd = bl2;
        this.bap = n5;
        this.baq = n6;
        this.ban = s;
    }

    @Override
    public long cbk() {
        if (this.hsd) {
            this.xV(999);
        }
        return super.cbk();
    }

    public boolean cWw() {
        return this.hsc;
    }

    public boolean cWx() {
        return this.hsd;
    }

    public int getX() {
        return this.bap;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public int getY() {
        return this.baq;
    }

    public void setY(int n) {
        this.baq = n;
    }

    public short bdi() {
        return this.ban;
    }

    public void aM(short s) {
        this.ban = s;
    }

    public abstract short cmL();

    public boolean cWy() {
        return false;
    }

    @Nullable
    public QQ cWz() {
        return null;
    }

    @Nullable
    public QQ cWA() {
        return null;
    }
}

