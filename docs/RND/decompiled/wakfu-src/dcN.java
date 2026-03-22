/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.util.ArrayList;
import java.util.Collections;

public class dcN
implements aeh_2 {
    public static final String ofM = "availableResolutions";
    public static final String ofN = "availableModes";
    public static final String ofO = "availableFrequencies";
    public static final String ofP = "selectedResolution";
    public static final String ofQ = "selectedMode";
    public static final String ofR = "selectedFrequency";
    public static final String ofS = "isFullScreenModeSelected";
    public static final String ofT = "isWindowedModeSelected";
    public static final String ofU = "isHidingTaskBar";
    public static final String[] ofV = new String[]{"availableResolutions", "availableModes", "availableFrequencies", "selectedResolution", "selectedMode", "selectedFrequency", "isFullScreenModeSelected", "isWindowedModeSelected", "isHidingTaskBar"};
    private final ahv ofW;
    private dcP ofX;
    private dcR ofY;
    private dcQ ofZ;
    private boolean cwM;
    private static final dcP oga = new dcP(0);
    private final TIntObjectHashMap<dcQ> ogb = new TIntObjectHashMap();

    public dcN(ahv ahv2) {
        this.ofW = ahv2;
        ahm ahm2 = this.ofW.bAI();
        this.ofY = ahm2.bzU() == ahn_0.cwQ ? new dcR(this.ofW.bAI().getWidth(), this.ofW.bAI().getHeight()) : (ahm2.bzU() == ahn_0.cwO ? this.a(ahm2.bzU()).stream().filter(dcR2 -> dcR2.getWidth() == this.ofW.getWidth() && dcR2.getHeight() == this.ofW.getHeight()).findFirst().orElse(dcR.ogf) : this.a(ahm2.bzU()).getLast());
        this.ofX = new dcP(ahm2.bzT());
        for (ahn_0 ahn_02 : ahn_0.values()) {
            this.ogb.put(ahn_02.ordinal(), (Object)new dcQ(ahn_02));
        }
        this.ofZ = (dcQ)this.ogb.get(ahm2.bzU().ordinal());
        this.cwM = ahm2.bzW();
    }

    @Override
    public String[] bxk() {
        return ofV;
    }

    public void a(ahn_0 ahn_02, dcR dcR2, dcP dcP2) {
        GraphicsDevice graphicsDevice = this.ofW.bAL();
        DisplayMode displayMode = graphicsDevice.getDisplayMode();
        this.ofW.d(switch (ahn_02) {
            case ahn_0.cwQ -> new ahm(dcR2.getWidth(), dcR2.getHeight(), displayMode.getBitDepth(), dcP2.ogd, ahn_02, graphicsDevice.getIDstring(), this.ofW.bAE(), this.ofW.bAF(), this.cwM);
            case ahn_0.cwO -> new ahm(dcR2.fct() ? this.ofW.getWidth() : dcR2.getWidth(), dcR2.fct() ? this.ofW.getHeight() : dcR2.getHeight(), -1, 0, ahn_02, graphicsDevice.getIDstring(), this.ofW.bAE(), this.ofW.bAF(), this.cwM);
            case ahn_0.cwP -> new ahm(0, 0, -1, 0, ahn_02, graphicsDevice.getIDstring(), this.ofW.bAE(), this.ofW.bAF(), this.cwM);
            default -> this.ofW.a(graphicsDevice.getIDstring(), this.ofW.bAE(), this.ofW.bAF(), this.cwM);
        });
    }

    public void a(dcQ dcQ2) {
        this.ofZ = dcQ2;
        fse_1.gFu().a((aef_2)this, ofN, ofS, ofO, ofT);
    }

    public void aM(Object object) {
        this.ofY = (dcR)object;
        fse_1.gFu().a((aef_2)this, ofO);
    }

    public void lc(boolean bl) {
        this.cwM = bl;
        fse_1.gFu().a((aef_2)this, ofU);
    }

    public ahn_0 fco() {
        return this.ofZ.oge;
    }

    public dcR fcp() {
        return this.ofY;
    }

    public dcP fcq() {
        return this.ofX;
    }

    private ArrayList<dcP> fcr() {
        ArrayList<dcP> arrayList = new ArrayList<dcP>();
        for (DisplayMode displayMode : this.ofW.bAL().getDisplayModes()) {
            dcP dcP2;
            int n = displayMode.getBitDepth();
            if (n != -1 && n < this.ofW.bAQ() || displayMode.getWidth() != this.ofY.getWidth() || displayMode.getHeight() != this.ofY.getHeight() || arrayList.contains(dcP2 = new dcP(displayMode.getRefreshRate()))) continue;
            arrayList.add(dcP2);
        }
        if (!arrayList.contains(oga)) {
            arrayList.add(oga);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public ArrayList<dcR> a(ahn_0 ahn_02) {
        ArrayList<dcR> arrayList = new ArrayList<dcR>();
        Dimension dimension = this.ofW.bAP();
        for (DisplayMode displayMode : this.ofW.bAL().getDisplayModes()) {
            dcR dcR2;
            int n = displayMode.getBitDepth();
            if (n != -1 && n < this.ofW.bAQ() || displayMode.getWidth() < dimension.width || displayMode.getHeight() < dimension.height || arrayList.contains(dcR2 = new dcR(displayMode.getWidth(), displayMode.getHeight()))) continue;
            arrayList.add(dcR2);
        }
        if (ahn_02 == ahn_0.cwO) {
            arrayList.add(dcR.ogf);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private Object[] fcs() {
        return this.ogb.values();
    }

    @Override
    public Object eu(String string) {
        return switch (string) {
            case ofM -> this.a(this.fco());
            case ofN -> this.fcs();
            case ofO -> this.fcr();
            case ofP -> this.ofY;
            case ofQ -> this.ofZ;
            case ofR -> this.ofX;
            case ofS -> this.ofZ.oge == ahn_0.cwQ;
            case ofT -> this.ofZ.oge == ahn_0.cwO;
            case ofU -> this.cwM;
            default -> null;
        };
    }
}

