/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

class cdh
implements aaq_2<csc> {
    cdh() {
    }

    @Override
    public boolean a(csc csc2) {
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(csc2.KU());
        fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
        fed_0 fed_02 = new fed_0(fec_02);
        Iterator<fen_0> iterator = csc2.eAy();
        while (iterator.hasNext()) {
            iterator.next().a(fed_02);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13084;
    }
}

