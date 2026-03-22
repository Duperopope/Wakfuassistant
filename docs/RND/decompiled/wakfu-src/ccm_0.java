/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ccM
 */
public class ccm_0
implements adi_1 {
    protected static final Logger lPK = Logger.getLogger(ccm_0.class);
    private static final ccm_0 lPL = new ccm_0();

    public static ccm_0 etT() {
        return lPL;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        bJK bJK2 = aue_0.cVJ().cVK().dnU();
        switch (aam_22.d()) {
            case 13885: {
                bJv bJv2;
                bJr bJr2;
                cpT cpT2 = (cpT)aam_22;
                int n = cpT2.exL();
                byte[] byArray = cpT2.exJ();
                byte[] byArray2 = cpT2.exK();
                boa_2 boa_22 = boa_2.ehn();
                bod_1 bod_12 = bod_1.ehw();
                boc_2 boc_22 = boc_2.eht();
                boa_22.ID(n);
                bod_12.dS(byArray2);
                boc_22.dS(byArray);
                boa_22.ehp();
                if (bJK2 != null && (bJr2 = (bJr)bJK2.doW()) != null && !(bJv2 = bJr2.eaH()).gfH().isEmpty()) {
                    bTp bTp2 = bJv2.eaN();
                    ArrayList<boz_2> arrayList = boc_22.ehs();
                    int n2 = arrayList.size();
                    for (int i = 0; i < n2; ++i) {
                        int n3 = arrayList.get(i).cqy();
                        if (!bJv2.XV(n3)) continue;
                        bTo bTo2 = bTp2.D(n3, true);
                        if (bTo2 == null) {
                            lPK.error((Object)("On tente d'update le famille d'id=" + n3 + " alors qu'elle n'existe pas dans l'\u00e9cosyst\u00e8me !!!"));
                            continue;
                        }
                        bTo2.eny();
                    }
                }
                cAY.eHc().eHv();
                boolean bl = bod_12.ehv().size() > 0 && boc_22.ehs().size() > 0;
                fse_1.gFu().f("wakfuEcosystemEnabled", bl);
                fse_1.gFu().f("wakfuGlobalZoneManager", boa_2.ehn());
                fse_1.gFu().a((aef_2)boa_2.ehn(), "protectorSatisfaction", "protectorSatisfactionColor", "protectorSatisfactionStyle", "protectorSatisfactionText");
                return false;
            }
            case 12048: {
                coz coz2 = (coz)aam_22;
                bof_1 bof_12 = new bof_1();
                bof_12.a(coz2.ews(), coz2.ewt(), coz2.ewu(), coz2.ewv(), coz2.eww(), coz2.blE());
                bof_12.a((float)coz2.ewr() + coz2.ewu(), 0.0f, 0.0f, 0.0f, null, coz2.blE(), coz2.blv(), 0.0f);
                if (bJK2 != null) {
                    bJr bJr3 = (bJr)bJK2.doW();
                    bof_12.g(bJr3);
                } else {
                    lPK.error((Object)"R\u00e9ception d'informations de meteo wakfu hors d'un territoire : \u00e9trange");
                }
                return false;
            }
            case 13783: {
                cwc_0 cwc_02 = (cwc_0)aam_22;
                byte[] byArray = cwc_02.eEF();
                if (byArray != null && byArray.length > 0) {
                    boe_1 boe_12 = new boe_1();
                    boe_12.fb(ByteBuffer.wrap(byArray));
                    boh_1.ehH().b(boe_12);
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

