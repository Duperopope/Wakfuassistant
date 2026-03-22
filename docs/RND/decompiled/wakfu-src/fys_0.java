/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NonNls
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fyS
 */
public class fys_0
extends fzm
implements fkq_1,
fyo_0,
fzc {
    protected static final Logger tDG = Logger.getLogger(fys_0.class);
    public static final String TAG = "Appearance";
    public static final String tDH = "ScrollContainerAppearance";
    public static final String tDI = "SliderAppearance";
    public static final String tDJ = "ScrollBarAppearance";
    public static final String tDK = "WindowAppearance";
    public static final String tDL = "PopupMenuAppearance";
    @NonNls
    public static final String tDM = fzy_0.tGa.getName();
    public static final String tDN = "modulation";
    protected awx_2 tDO = null;
    @NotNull
    private awx_2 tDP = new awx_2(255, 255, 255, 255);
    @NotNull
    private awx_2 tDQ = new awx_2(0, 0, 0, 0);
    protected final ArrayList<fkx_1> tDR = new ArrayList();
    protected final ArrayList<fkp_1> tDS = new ArrayList();
    protected final ArrayList<fku_1> tDT = new ArrayList();
    private String tDU = tDM;
    @NonNls
    protected String tDV = tDM;
    private final Set<fku_2> tDW = new HashSet<fku_2>();
    protected boolean tDX = true;
    private static final ObjectPool tDY = new ayv_2(new fyt_0());
    public static final int tDZ = -1156593849;
    public static final int tEa = 2122114371;
    public static final int tEb = 874064533;
    public static final int tEc = 109757585;

    public static fys_0 checkOut() {
        fys_0 fys_02;
        try {
            fys_02 = (fys_0)tDY.borrowObject();
            fys_02.uth = tDY;
        }
        catch (Exception exception) {
            tDG.error((Object)"Probl\u00e8me au borrowObject.");
            fys_02 = new fys_0();
            fys_02.aVI();
        }
        return fys_02;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fkx_1) {
            this.a((fkx_1)((Object)fhv_12));
        }
        if (fhv_12 instanceof fkp_1) {
            this.a((fkp_1)((Object)fhv_12));
        }
        if (fhv_12 instanceof fku_1) {
            this.a((fku_1)((Object)fhv_12));
        }
    }

    public void gra() {
        if (this.tCV == null) {
            return;
        }
        EntityGroup entityGroup = this.tCV.getEntity();
        int n = this.tDR.size();
        for (int i = 0; i < n; ++i) {
            fkx_1 fkx_12 = this.tDR.get(i);
            if (!fkx_12.isEnabled() || fkx_12.getEntity() == null) continue;
            entityGroup.g(fkx_12.getEntity());
        }
        this.tDX = false;
    }

    public void a(fku_1 fku_12) {
        this.a(fku_12, true);
    }

    public void a(fku_1 fku_12, boolean bl) {
        fku_12.setDecoratorAppearance(this);
        if (bl) {
            this.tDT.add(fku_12);
        }
        if (this.tCV != null) {
            this.tCV.a(fku_12.getTriggerAction(), new fyu_0(this, fku_12), false);
        }
        if (this.tCV != null) {
            this.tCV.setNeedsToResetMeshes();
        }
    }

    protected void a(fkp_1 fkp_12) {
        fkp_12.setDecoratorAppearance(this);
        if (this.tDO != null && fkp_12 instanceof fzc) {
            ((fzc)((Object)fkp_12)).setModulationColor(this.tDO);
        }
        if (fkp_12.getState() == null) {
            fkp_12.setState(this.tDU);
        }
        if ((fkp_12.getState().equalsIgnoreCase(tDM) || fkp_12.getState().equalsIgnoreCase(this.tDV)) && this.tCV != null) {
            fkp_12.setEnabled(true);
            if (fkp_12.isDecoratorSwitch()) {
                fkp_12.setup(this);
            } else {
                fkp_12.setup(this.tCV);
            }
        }
        this.tDS.add(fkp_12);
        if (this.tCV != null) {
            this.tCV.setNeedsToResetMeshes();
        }
    }

    protected void a(fkx_1 fkx_12) {
        fkx_12.setDecoratorAppearance(this);
        if (fkx_12.getState() == null) {
            fkx_12.setState(this.tDU);
        }
        if (this.tDO != null && fkx_12 instanceof fzc) {
            ((fzc)((Object)fkx_12)).setModulationColor(this.tDO);
        }
        if ((fkx_12.getState().equalsIgnoreCase(tDM) || fkx_12.getState().equalsIgnoreCase(this.tDV)) && this.tCV != null) {
            fkx_12.setEnabled(true);
        }
        if (fkx_12 instanceof fkz_2) {
            this.setBorder(((fkz_2)fkx_12).getInsets());
        }
        if (this.tCV != null) {
            fkx_12.b(this.tCV.ukt, this.tFe, this.tFf, this.tFg);
        }
        this.tDR.add(fkx_12);
        if (this.tCV != null) {
            this.tCV.setNeedsToResetMeshes();
        }
    }

    protected void a(fkz_2 fkz_22) {
        this.a((fkx_1)fkz_22);
    }

    public void b(fkx_1 fkx_12) {
        this.tDR.remove(fkx_12);
        if (fkx_12 instanceof fkz_2) {
            this.gre();
        }
        ((fhv_1)((Object)fkx_12)).gAC();
    }

    public void grb() {
        for (int i = this.tDR.size() - 1; i >= 0; --i) {
            ((fhv_1)((Object)this.tDR.get(i))).gAC();
        }
        this.tDR.clear();
        this.gre();
    }

    public void c(fkx_1 fkx_12) {
        this.tDR.remove(fkx_12);
        ((fhv_1)((Object)fkx_12)).gAD();
        if (fkx_12 instanceof fkz_2) {
            this.gre();
        }
    }

    public void grc() {
        int n;
        for (n = this.tDR.size() - 1; n >= 0; --n) {
            ((fhv_1)((Object)this.tDR.get(n))).gAD();
        }
        this.tDR.clear();
        this.gre();
        for (n = this.tDS.size() - 1; n >= 0; --n) {
            ((fhv_1)((Object)this.tDS.get(n))).gAD();
        }
        this.tDS.clear();
    }

    public void grd() {
        fko_2 fko_22;
        int n;
        for (n = this.tDR.size() - 1; n >= 0; --n) {
            fko_22 = this.tDR.get(n);
            if (!fko_22.isRemovable()) continue;
            ((fhv_1)((Object)fko_22)).gAD();
            this.tDR.remove(n);
        }
        this.gre();
        for (n = this.tDS.size() - 1; n >= 0; --n) {
            fko_22 = this.tDS.get(n);
            if (!fko_22.isRemovable()) continue;
            ((fhv_1)((Object)fko_22)).gAD();
            this.tDS.remove(n);
        }
    }

    public void setState(String string) {
        this.tDU = string;
    }

    public void setAppearanceState(@NotNull fzy_0 fzy_02) {
        this.setState(fzy_02.getName());
    }

    public String getState() {
        return this.tDU;
    }

    public fzy_0 getAppearanceState() {
        return fzy_0.tt(this.tDU);
    }

    public String getCurrentState() {
        return this.tDV;
    }

    public fzy_0 getCurrentAppearanceState() {
        return fzy_0.tt(this.tDV);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setEnabled(String string, boolean bl) {
        String string2 = this.tDV;
        this.tDV = string;
        new ArrayList<fku_2>(this.tDW).forEach(fku_22 -> {
            try {
                fku_22.aR(string2, this.tDV);
            }
            catch (Exception exception) {
                tDG.error((Object)String.format("Error occured in call of following %s(%s) with followings args : \"%s\", \"%s\"", fku_22, fku_22.getClass().getName(), string2, this.tDV), (Throwable)exception);
            }
        });
        for (int i = 0; i < this.tDR.size(); ++i) {
            fkx_1 fkx_12 = this.tDR.get(i);
            if (fkx_12.getLabel() == null || !fkx_12.getLabel().equals(string)) continue;
            fkx_12.setEnabled(bl);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = this.tDS.size() - 1; i >= 0; --i) {
            fkp_1 fkp_12 = this.tDS.get(i);
            if (fkp_12.getLabel() == null || !fkp_12.getLabel().equals(string)) continue;
            fkp_12.setEnabled(bl);
            if (arrayList.contains(fkp_12.getClass()) || !fkp_12.isEnabled()) continue;
            if (fkp_12.isDecoratorSwitch()) {
                fkp_12.setup(this);
            } else {
                fkp_12.setup(this.getWidget());
            }
            arrayList.add(fkp_12.getClass());
        }
    }

    public void setEnabled(@NotNull fzy_0 fzy_02, boolean bl) {
        this.setEnabled(fzy_02.getName(), bl);
    }

    public boolean a(@NotNull fku_2 fku_22) {
        return this.tDW.add(fku_22);
    }

    public boolean b(@NotNull fku_2 fku_22) {
        return this.tDW.remove(fku_22);
    }

    public boolean a(@NotNull fzy_0 fzy_02) {
        return this.ts(fzy_02.getName());
    }

    public boolean ts(@NotNull String string) {
        return this.tDR.stream().anyMatch(fkx_12 -> string.equals(fkx_12.getLabel())) || this.tDS.stream().anyMatch(fkp_12 -> string.equals(fkp_12.getLabel()));
    }

    @Override
    public void setWidget(fes_2 fes_22) {
        fkt_2 fkt_22;
        int n;
        super.setWidget(fes_22);
        int n2 = this.tDR.size();
        for (n = 0; n < n2; ++n) {
            fkt_22 = this.tDR.get(n);
            if (!fkt_22.getState().equalsIgnoreCase(this.tDV) || this.tCV == null) continue;
            fkt_22.setEnabled(true);
        }
        n2 = this.tDS.size();
        for (n = 0; n < n2; ++n) {
            fkt_22 = this.tDS.get(n);
            if (!fkt_22.getState().equalsIgnoreCase(this.tDV) || this.tCV == null) continue;
            fkt_22.setEnabled(true);
            if (fkt_22.isDecoratorSwitch()) continue;
            fkt_22.setup(fes_22);
        }
        n2 = this.tDT.size();
        for (n = 0; n < n2; ++n) {
            fkt_22 = this.tDT.get(n);
            this.a((fku_1)fkt_22, false);
        }
        if (this.tDO != null && this.tCV instanceof fzc) {
            ((fzc)((Object)this.tCV)).setModulationColor(this.tDO);
        }
        if (fes_22 != null) {
            fes_22.setNeedsToResetMeshes();
        }
    }

    public void setNeedsToResetMeshes() {
        if (this.tCV != null) {
            this.tCV.setNeedsToResetMeshes();
        }
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equalsIgnoreCase(tDN)) {
            this.setModulationColor(axb_22);
        }
    }

    public void setPixmapBackground(fkd_1 fkd_12) {
        this.a(fkd_12);
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        fko_2 fko_22;
        int n;
        if (this.tDO == axb_22) {
            return;
        }
        awx_2 awx_22 = axb_22 == null ? null : (this.tDO = axb_22 instanceof awx_2 ? (awx_2)axb_22 : new awx_2(axb_22));
        if (this.tCV instanceof fzc) {
            ((fzc)((Object)this.tCV)).setModulationColor(axb_22);
        }
        for (n = this.tDR.size() - 1; n >= 0; --n) {
            fko_22 = this.tDR.get(n);
            if (!(fko_22 instanceof fzc)) continue;
            ((fzc)((Object)fko_22)).setModulationColor(axb_22);
        }
        for (n = this.tDS.size() - 1; n >= 0; --n) {
            fko_22 = this.tDS.get(n);
            if (!(fko_22 instanceof fzc)) continue;
            ((fzc)((Object)fko_22)).setModulationColor(axb_22);
        }
    }

    @Override
    @NotNull
    public awx_2 getMaxModulationColor() {
        return new awx_2(this.tDP);
    }

    @Override
    @NotNull
    public awx_2 getMinModulationColor() {
        return new awx_2(this.tDQ);
    }

    public void setMaxModulationColor(@Nullable axb_2 axb_22) {
        if (axb_22 == null) {
            return;
        }
        this.tDP = new awx_2(axb_22);
    }

    public void setMinModulationColor(@Nullable axb_2 axb_22) {
        if (axb_22 == null) {
            return;
        }
        this.tDQ = new awx_2(axb_22);
    }

    @Override
    public axb_2 getModulationColor() {
        return this.tDO;
    }

    public void gre() {
        Insets insets = null;
        for (int i = this.tDR.size() - 1; i >= 0; --i) {
            fkx_1 fkx_12 = this.tDR.get(i);
            if (!(fkx_12 instanceof fkz_2)) continue;
            insets = ((fkz_2)fkx_12).getInsets();
            break;
        }
        if (insets == null) {
            insets = new Insets(0, 0, 0, 0);
        }
        this.setBorder(insets);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fys_0 fys_02 = (fys_0)fhi_22;
        if (this.tDO != null) {
            fys_02.setModulationColor(this.tDO);
        }
        fys_02.setMaxModulationColor(this.tDP);
        fys_02.setMinModulationColor(this.tDQ);
    }

    public void grf() {
        for (fkx_1 fko_22 : this.tDR) {
            fko_22.setEnabled(false);
        }
        for (fkp_1 fkp_12 : this.tDS) {
            fkp_12.setEnabled(false);
        }
    }

    @Override
    public void grg() {
        if (this.tCV != null) {
            for (int i = this.tDR.size() - 1; i >= 0; --i) {
                this.tDR.get(i).b(this.tCV.ukt, this.tFe, this.tFf, this.tFg);
            }
        }
        super.grg();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tDR.clear();
        this.tDS.clear();
        this.tDT.clear();
        this.tDO = null;
        this.tDW.clear();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tDP = new awx_2(255, 255, 255, 255);
        this.tDQ = new awx_2(0, 0, 0, 0);
        this.tDU = tDM;
        this.tDV = tDM;
        this.tDX = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1156593849) {
            this.setModulationColor(fic_12.vm(string));
        } else if (n == 2122114371) {
            this.setMaxModulationColor(fic_12.vm(string));
        } else if (n == 874064533) {
            this.setMinModulationColor(fic_12.vm(string));
        } else if (n == 109757585) {
            this.setState(fic_12.a(string, this.nQt));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1156593849) {
            this.setModulationColor((axb_2)object);
        } else if (n == 2122114371) {
            this.setMaxModulationColor((axb_2)object);
        } else if (n == 874064533) {
            this.setMinModulationColor((axb_2)object);
        } else if (n == 109757585) {
            this.setState(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

