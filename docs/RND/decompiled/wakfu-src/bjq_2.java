/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bjQ
 */
class bjq_2
extends bjo_2 {
    private static final Logger ipL = Logger.getLogger(bjq_2.class);

    bjq_2(int n, byte by, ang_2 ang_22, boolean bl, fqy_0 fqy_02, int n2, long l, boolean bl2, boolean bl3, boolean bl4) {
        super(n, by, ang_22, bl, fqy_02, n2, l, bl2, bl3, bl4);
    }

    @Override
    public void i(bhx_0 bhx_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!evg_1.osQ.a(new eve_2[]{bgt_02})) {
            ipL.error((Object)"Impossible pour un joueur non abonn\u00e9 de d\u00e9marrer une action de dialogue");
            return;
        }
        super.i(bhx_02);
        this.jU(bhx_02.Sn());
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public int DN() {
        return 0;
    }

    @Override
    public void clear() {
    }
}

