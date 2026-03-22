/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bFV
 */
public class bfv_0
implements adi_1 {
    private static final Logger jUg = Logger.getLogger(bfv_0.class);
    public static final byte jUh = 0;
    public static final byte jUi = 1;
    public static final byte jUj = 2;
    private static final bfv_0 jUk = new bfv_0();
    private static final String jUl = "APSTarget";
    private static final float[] jUm = new float[]{1.0f, 1.0f, 1.0f, 0.6f};
    private DisplayedScreenElement jUn;
    private bfw_0 jUo;
    private bdj_2 jUp;
    private byte jUq;

    private bfv_0() {
    }

    public void bX(byte by) {
        this.jUq = by;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        try {
            agx_0.bze().eF(jUl);
        }
        catch (Exception exception) {
            jUg.error((Object)"Erreur durant la cr\u00e9ation d'un layer sur le HighLightManager");
        }
        fhn_1.gzT().a(fzo_0.tHz, true);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (this.jUo != null) {
            acd_1 acd_12 = this.jUn == null ? null : new acd_1(this.jUn.bcC(), this.jUn.bcD(), this.jUn.bcE());
            this.jUo.W(acd_12);
            this.jUo = null;
        }
        agx_0.bze().eI(jUl);
        agx_0.bze().eG(jUl);
        fhn_1.gzT().bYz();
        this.jUq = 0;
        this.jUn = null;
        if (this.jUp != null) {
            this.jUp.dcT();
            this.jUp = null;
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        switch (aam_22.d()) {
            case 16346: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                ZH zH = aIs2.cgz();
                if (zH instanceof bdj_2) {
                    bdj_2 bdj_22 = (bdj_2)zH;
                    bdj_22.dcS();
                    this.jUp = bdj_22;
                    DisplayedScreenElement displayedScreenElement = aaa_0.brC().g(bdj_22.bcC(), bdj_22.bcD(), bdj_22.bcE(), abd.ccY);
                    if (displayedScreenElement != this.jUn) {
                        if (displayedScreenElement != null) {
                            agx_0.bze().eI(jUl);
                            agx_0.bze().a(displayedScreenElement.brp(), jUl);
                            agx_0.bze().eH(jUl).q(jUm);
                        }
                        this.jUn = displayedScreenElement;
                    }
                } else if (this.jUp != null) {
                    this.jUp.dcT();
                    this.jUp = null;
                } else {
                    ArrayList<DisplayedScreenElement> arrayList = aie_0.cfn().bmC().a(dcm_02.bqM(), dcm_02.bqN(), 0.0f, aar.bZj);
                    DisplayedScreenElement displayedScreenElement = null;
                    if (arrayList != null) {
                        for (int i = 0; i < arrayList.size(); ++i) {
                            DisplayedScreenElement displayedScreenElement2 = arrayList.get(i);
                            if (!wa_0.j(displayedScreenElement2.bcC(), displayedScreenElement2.bcD(), displayedScreenElement2.bcE())) continue;
                            displayedScreenElement = displayedScreenElement2;
                            break;
                        }
                    }
                    if (displayedScreenElement != this.jUn) {
                        if (displayedScreenElement != null) {
                            agx_0.bze().eI(jUl);
                            agx_0.bze().a(displayedScreenElement.brp(), jUl);
                            agx_0.bze().eH(jUl).q(jUm);
                        }
                        this.jUn = displayedScreenElement;
                    }
                }
                return false;
            }
            case 16902: {
                dcm_0 dcm_03 = (dcm_0)aam_22;
                if (dcm_03.fch()) {
                    Object object;
                    ZH zH = aIs2.cgz();
                    if ((this.jUq == 2 || this.jUq == 0) && zH instanceof bdj_2 && this.jUo != null) {
                        object = (bdj_2)zH;
                        this.jUo.B((bdj_2)object);
                        this.jUo = null;
                    }
                    if ((this.jUq == 1 || this.jUq == 0) && this.jUo != null) {
                        object = aeO.a(aie_0.cfn().bmC(), dcm_03.bqM(), dcm_03.bqN(), true);
                        this.jUo.V((acd_1)object);
                        this.jUo = null;
                    }
                }
                aue_0.cVJ().b(this);
            }
        }
        return false;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public static bfv_0 dTx() {
        return jUk;
    }

    public void a(bfw_0 bfw_02) {
        this.jUo = bfw_02;
    }
}

