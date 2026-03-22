/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

final class bgX
extends eyj_0 {
    private final of_1 ifB;
    final /* synthetic */ bgt_0 ifC;

    bgX(bgt_0 bgt_02, of_1 of_12) {
        this.ifC = bgt_02;
        this.ifB = of_12;
        this.ifB.DM().a(this);
    }

    @Override
    public void zl() {
    }

    @Override
    public void zm() {
        List<eIo> list = null;
        if (this.ifC.hUL == null) {
            this.ifC.hUL = new eIm();
        } else {
            list = this.ifC.hUL.aYR();
            this.ifC.hUL.dQY();
        }
        if (this.ifC.hUL.aVo() == 0) {
            eIj eIj2 = eIj.fwo();
            this.ifC.hUL.g(eIj2);
            this.ifC.hUL.PS(0);
        } else {
            bgt_0.dol().error((Object)"Part for active equipment sheet received from world, but BuildSheetSet is not empty.");
        }
        if (list != null) {
            for (eIo eIo2 : list) {
                this.ifC.hUL.a(eIo2);
            }
        }
    }
}

