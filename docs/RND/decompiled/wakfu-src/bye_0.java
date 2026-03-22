/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bye
 */
public class bye_0
extends bCA {
    static final Logger jCi = Logger.getLogger(bye_0.class);
    public static final short jCj = 0;
    public static final short jCk = 1;

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)0);
        this.bf(true);
        this.bi(true);
        this.hu(true);
    }

    @Override
    public void c(ng_1 ng_12) {
        jCi.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jCi.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        this.b(rw_02);
        switch (rw_02) {
            case bla: {
                if (this.bem() == 1) {
                    this.c(rw_02);
                }
                return true;
            }
            case blb: {
                this.c(rw_02);
                return true;
            }
        }
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bla;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bla};
    }

    @Override
    public byte bcN() {
        return 4;
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    static /* synthetic */ void a(bye_0 bye_02, ayv_2 ayv_22) {
        bye_02.a(ayv_22);
    }
}

