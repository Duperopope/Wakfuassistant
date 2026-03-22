/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

final class aXB
implements aaq_2<czf> {
    private static final Logger hwX = Logger.getLogger(aXB.class);

    aXB() {
    }

    @Override
    public boolean a(czf czf2) {
        hwX.info((Object)"Receiving companion list");
        byte[] byArray = czf2.eFX();
        List<eJS> list = this.dR(byArray);
        aUQ aUQ2 = aue_0.cVJ().cVO();
        long l = aUQ2.xl();
        eJN.qAF.pS(l);
        for (eJS eJS2 : list) {
            try {
                eJN.qAF.a(l, eJS2);
                eJS2.b(aXG.hxc);
                this.a(eJS2);
                if (!aue_0.cVJ().c(ctu_2.nJd)) continue;
                ctu_2.nJd.ePP();
                ctu_2.nJd.ePR();
            }
            catch (Exception exception) {
                hwX.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        hwX.info((Object)("Companions received : " + list.size()));
        return false;
    }

    private List<eJS> dR(byte[] byArray) {
        ArrayList<eJS> arrayList = new ArrayList<eJS>();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            arrayList.add(eJU.fs(byteBuffer));
        }
        return arrayList;
    }

    private void a(eJS eJS2) {
        for (ffV ffV2 : eJS2.dme()) {
            ffV2.bYg();
        }
    }

    @Override
    public int bkq() {
        return 22167;
    }
}

