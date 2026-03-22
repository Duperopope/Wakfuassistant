/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import org.apache.log4j.Logger;

/*
 * Renamed from alo
 */
public class alo_2
implements alj_2 {
    private static final Logger cFi = Logger.getLogger(alo_2.class);
    private byte cFj;
    private byte cFh = (byte)100;

    public alo_2() {
    }

    public alo_2(apl_1 apl_12) {
        this.a(apl_12);
    }

    public alo_2(byte by, byte by2) {
        this.cFj = by;
        this.cFh = by2;
    }

    @Override
    public void a(arj_2 arj_22, int n) {
        if (!alu_1.a(arj_22)) {
            return;
        }
        if (!arj_22.bpw().cbx()) {
            return;
        }
        ZC zC = (ZC)arj_22;
        byte by = alo_2.f(zC);
        try {
            aix_2 aix_22 = aiv_2.bBr().f(by, this.cFj);
            if (aix_22 == null) {
                cFi.debug((Object)"Impossible de trouver de GroundSoundData ad\u00e9quat");
                return;
            }
            if (!zC.bpw().hC(aix_22.aYj())) {
                return;
            }
            if (!alu_1.gh(aix_22.aYj())) {
                return;
            }
            float f2 = aix_22.bBt() * (float)this.cFh / 100.0f;
            aiv_2.bBr().a(aix_22.aYj(), f2, aix_22.bBN(), 1, -1L, -1L, zC.bqo(), n, zC, aix_22.bBw());
        }
        catch (Exception exception) {
            cFi.debug((Object)("soundExtension or soundPath not initialized " + String.valueOf(exception)));
        }
    }

    private static byte f(ZC zC) {
        short s = wa_0.w(zC.bcC(), zC.bcD(), zC.bcE());
        DisplayedScreenElement displayedScreenElement = aaa_0.brC().e(zC.bcC(), zC.bcD(), s, abd.ccZ);
        if (displayedScreenElement == null) {
            return agj_1.dLQ.aFW();
        }
        aeS aeS2 = displayedScreenElement.brk().bsz();
        if (aeS2 != null) {
            return aeS2.bxa();
        }
        return agj_1.dLQ.aFW();
    }

    @Override
    public int aeV() {
        return 2;
    }

    @Override
    public void a(apl_1 apl_12) {
        this.cFj = apl_12.aIy();
        this.cFh = apl_12.aIy();
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.g(this.cFj);
        fs_02.g(this.cFh);
    }

    public void ax(byte by) {
        this.cFj = by;
    }

    public void aw(byte by) {
        this.cFh = by;
    }
}

