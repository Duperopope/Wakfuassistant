/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aJy
implements Uu {
    protected static final Logger ebo = Logger.getLogger(aJy.class);
    private static final aJy ebp = new aJy();
    private static final float ebq = 25.0f;
    private static final float ebr = 1.0f;
    private static final float ebs = 0.0f;
    private static final double ebt = -0.5235987755982988;
    private boolean ebu = false;
    private final float ebv;
    private final float ebw;

    private aJy() {
        this.ebv = 0.0f;
        this.ebw = 0.0f;
    }

    @Override
    public void onCalendarEvent(Uv uv, ut_0 ut_02) {
        switch (uv) {
            case bvz: {
                if (!ut_02.bjo()) break;
                this.a((ue_0)ut_02);
            }
        }
    }

    public void a(ue_0 ue_02) {
    }

    public float chF() {
        return this.ebv;
    }

    public float chG() {
        return this.ebw;
    }

    public boolean chH() {
        return this.ebu;
    }

    public void ep(boolean bl) {
        this.ebu = bl;
    }

    public static aJy chI() {
        return ebp;
    }
}

