/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

/*
 * Renamed from asC
 */
public class asc_1 {
    private final asy_2 cZi;
    public final String cZj;
    public final String cZk;
    private final int cZl;
    private boolean cHn = true;
    private final float cZm = 1.0f;
    private long cwf = 0L;
    private static final float cZn = 0.1f;
    private static final float cZo = 0.04f;

    public asc_1(String string, String string2) {
        this.cZj = string;
        this.cZk = string2;
        this.cZl = arn_2.fW(string2);
        this.cZi = new asy_2();
        this.cZi.x(fq_0.bJ(string), string);
        ast_1.bJG().a(this.cZi);
    }

    public void ca(float f2) {
        this.cwf = (long)((float)this.cwf + f2);
    }

    public final boolean bJP() {
        return this.cHn;
    }

    public final void cP(boolean bl) {
        this.cHn = bl;
    }

    public final boolean bJQ() {
        return true;
    }

    public void az(boolean bl) {
    }

    public final asy_2 bJR() {
        return this.cZi;
    }

    public final int bJS() {
        return this.cZl;
    }

    public asl_1 bJT() {
        return null;
    }

    public void a(EntitySprite entitySprite) {
        entitySprite.a(this.bJR(), this.bJS(), this.bJT());
        entitySprite.b(arn_2.bIc().cVd);
    }
}

