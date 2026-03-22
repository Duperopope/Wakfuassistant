/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from btz
 */
class btz_0
extends bte_1 {
    private static final Logger jlV = Logger.getLogger(btz_0.class);
    private boolean jlW = true;

    btz_0(@NotNull bsS bsS2, @NotNull bgt_0 bgt_02) {
        super(bsS2, bgt_02);
    }

    btz_0 dHR() {
        this.jlW = false;
        return this;
    }

    @Override
    euf_0 dHS() {
        return this.dHY();
    }
}

