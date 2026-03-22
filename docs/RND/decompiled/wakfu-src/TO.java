/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class TO
implements Ug {
    private Ui<TO> bud;

    protected TO() {
    }

    public abstract long biC();

    public boolean isValid() {
        return true;
    }

    @Override
    public void a(Uh uh) {
        if (!this.isValid()) {
            return;
        }
        this.b(uh);
    }

    protected abstract void b(Uh var1);

    protected abstract int biD();

    protected abstract void eP(ByteBuffer var1);

    protected abstract void e(Tz var1, ByteBuffer var2);

    public int DN() {
        return TP.j(this.getClass()).b(this);
    }

    public void as(ByteBuffer byteBuffer) {
        TP.j(this.getClass()).a(this, byteBuffer);
    }

    public static TO f(Tz tz, ByteBuffer byteBuffer) {
        TO tO = TP.eQ(byteBuffer);
        tO.e(tz, byteBuffer);
        return tO;
    }

    public void clean() {
    }

    public void a(Ui<TO> ui) {
        this.bud = ui;
    }

    public void biE() {
        if (this.bud != null) {
            this.bud.b(this);
        }
    }
}

