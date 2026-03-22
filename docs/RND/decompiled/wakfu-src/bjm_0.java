/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bJm
 */
public class bjm_0
extends bjg_0<ffV>
implements fns_0 {
    private static final Logger klp = Logger.getLogger(bjm_0.class);

    public bjm_0(ffV ffV2) {
        super(ffV2.ead(), ffV2);
        this.klf.a(this);
        this.dZX();
    }

    @Override
    protected boolean eaa() {
        return aue_0.cVJ().cVK().dmL().tz(((ffV)this.klg).LV()) != null || aue_0.cVJ().cVK().dno().x((RT)((Object)this.klg)) != null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("smallIconUrl")) {
            return ((ffV)this.klg).eu("iconUrl");
        }
        if (string.equals("breedName")) {
            return ((ffV)this.klg).eu("name");
        }
        if (string.equals("bonusDescription")) {
            boolean bl = !this.klf.geQ() && this.klf.agM() > 0;
            ArrayList<String> arrayList = new ArrayList<String>();
            Object object = ((ffV)this.klg).eu("effectAndCaracteristic");
            if (object == null) {
                return arrayList;
            }
            for (String string2 : (ArrayList)object) {
                ahv_2 ahv_22 = new ahv_2();
                if (!bl) {
                    ahv_22.ceC();
                    ahv_22.ih(awx_2.dnQ.bQk());
                }
                ahv_22.c(string2);
                if (!bl) {
                    ahv_22.ceD();
                }
                arrayList.add(ahv_22.ceL());
            }
            return arrayList;
        }
        return super.eu(string);
    }

    @Override
    public boolean I(bgt_0 bgt_02) {
        fhk fhk2 = bgt_02.dmL();
        if (fhk2 == null) {
            return false;
        }
        Long l = fhk2.t(ffS.sgZ);
        if (l == null) {
            return false;
        }
        return l.longValue() == ((ffV)this.klg).LV();
    }

    @Override
    public void mx(String string) {
        fse_1.gFu().a((aef_2)this, "name");
    }

    @Override
    public void Hk(int n) {
        fse_1.gFu().a((aef_2)this, "animatedElement", "color");
    }

    @Override
    public void Hl(int n) {
        fse_1.gFu().a((aef_2)this, "petAnimationEquipment", "animatedElement", "equipment");
    }

    @Override
    public void Hm(int n) {
        fse_1.gFu().a((aef_2)this, "hp", "hpDescription");
    }

    @Override
    public void Hn(int n) {
        ((ffV)this.klg).bYg();
        fse_1.gFu().a((aef_2)this, "levelTextShort", "xpValue", "xpText", "bonusDescription");
    }

    @Override
    public void I(ux_0 ux_02) {
        fse_1.gFu().a((aef_2)this, "lastMealDateText", "dietDescription");
    }

    @Override
    public void J(ux_0 ux_02) {
        if (this.klf.agM() == 0) {
            return;
        }
        this.kle.dT("AnimEmote-Effrayee");
        this.kle.bpC();
    }

    @Override
    public void K(ux_0 ux_02) {
        fse_1.gFu().a((aef_2)this, "isActive");
        fse_1.gFu().a(this.klg, "backgroundStyle");
    }

    @Override
    public void Ho(int n) {
    }

    public ffV eai() {
        return (ffV)this.klg;
    }

    @Override
    public String getName() {
        String string = this.klf.getName();
        return string == null || string.length() == 0 ? ((ffV)this.klg).getName() : string;
    }

    @Override
    public void clean() {
        super.clean();
        this.klf.b(this);
    }

    public void eaj() {
        fse_1.gFu().a((aef_2)this, klc);
    }

    public bdf_1 eak() {
        return this.kle;
    }

    @Override
    public long eae() {
        return ((ffV)this.klg).LV();
    }

    @Override
    public int d() {
        return ((ffV)this.klg).avr();
    }
}

