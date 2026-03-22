/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBW
 */
public class bbw_1
extends bbe_2 {
    static final Logger jGL = Logger.getLogger(bbw_1.class);

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jGL.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        switch (rw_02) {
            case bkO: {
                if (this.bmf != 1) {
                    return true;
                }
                if (rG instanceof bhJ) {
                    ((bhJ)rG).ddI().bvA();
                }
                this.b(rw_02);
                this.c(rw_02);
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ void a(bbw_1 bbw_12, ayv_2 ayv_22) {
        bbw_12.a(ayv_22);
    }
}

