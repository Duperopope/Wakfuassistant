/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bMb
 */
public class bmb_1
extends ezw
implements aef_2 {
    protected static final Logger kvt = Logger.getLogger(bmb_1.class);
    public static final String kvu = "name";
    public static final String kvv = "level";
    public static final String kvw = "iconUrl";
    public static final String kvx = "breedName";
    public static final String kvy = "isAvailable";
    public static final String kvz = "unavailableReasons";
    public static final String kvA = "cooldown";
    public static final String kvB = "breedAndLevel";
    public static final String kvC = "actorDescriptorLibrary";
    public static final String kvD = "actorStandardScale";
    static final String[] kvE = new String[]{"name", "level", "iconUrl", "breedName", "isAvailable", "unavailableReasons", "cooldown", "breedAndLevel"};

    bmb_1(short s, String string, int n, short s2, long l) {
        super(s, string, n, s2);
        this.pw(l);
    }

    @Override
    public void e(String string, Object object) {
    }

    @Override
    public String[] bxk() {
        return kvE;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kvu)) {
            return this.getName();
        }
        if (string.equals(kvv)) {
            return this.eed();
        }
        if (string.equals(kvw)) {
            try {
                bjz_1 bjz_12 = bja_1.drJ().bC(this.doG());
                if (bjz_12 == null) {
                    return null;
                }
                eyv eyv2 = eyw.fik().OW(bjz_12.cqy());
                if (eyv2 == null) {
                    return null;
                }
                int n = eyv2.fii();
                if (n == 0) {
                    return null;
                }
                bje_1 bje_12 = bje_1.inx;
                String string2 = bje_12.Dh(n);
                return bl_0.bl(string2) ? string2 : bje_12.Dh(0);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (string.equals(kvx)) {
            return Optional.ofNullable(bja_1.drJ().bC(this.doG())).map(bjz_1::getName).orElse(null);
        }
        if (string.equals(kvB)) {
            Optional<String> optional = Optional.ofNullable(bja_1.drJ().bC(this.doG())).map(bjz_1::getName);
            if (optional.isEmpty()) {
                return null;
            }
            String string3 = aum_0.cWf().c("spellDescription.levelShort", new Object[0]);
            return optional.get() + " " + string3 + this.eed();
        }
        if (string.equals(kvy)) {
            bgy bgy2 = bvz_0.ju(this.fmF());
            if (!(bgy2 instanceof ezi_0)) {
                return false;
            }
            if (!bgy2.djT()) {
                return true;
            }
            ezi_0 ezi_02 = (ezi_0)((Object)bgy2);
            byte by = ezi_02.dob().c(this);
            return ezi_02.dob().Pn(by);
        }
        if (string.equals(kvA)) {
            bgy bgy3 = bvz_0.ju(this.fmF());
            if (!(bgy3 instanceof ezi_0)) {
                return false;
            }
            ezi_0 ezi_03 = (ezi_0)((Object)bgy3);
            byte by = ezi_03.dob().c(this);
            int n = ezi_03.bp(by);
            return n > 0 ? Integer.valueOf(n) : null;
        }
        if (string.equals(kvz)) {
            return null;
        }
        if (string.equals(kvC)) {
            return this.eee();
        }
        if (string.equals(kvD)) {
            short s = bja_1.drJ().bC(this.doG()).bcN();
            float f2 = this.eee().bqd().getScale();
            return Float.valueOf(bsz_0.c(s, f2));
        }
        return null;
    }

    private short eed() {
        bgy bgy2 = bvz_0.ju(this.fmF());
        return bgy2 != null ? bgy2.cmL() : this.fmE();
    }

    private ZG eee() {
        ZG zG = new ZG(aym_2.bSE(), 0.0f, 0.0f, 0.0f);
        int n = bja_1.drJ().bC(this.doG()).aGs();
        try {
            zG.k(String.format(auc_0.cVq().bS("npcGfxPath"), n), true);
        }
        catch (IOException iOException) {
            kvt.error((Object)"", (Throwable)iOException);
            return null;
        }
        catch (fu_0 fu_02) {
            kvt.error((Object)"", (Throwable)fu_02);
            return null;
        }
        zG.dP(String.valueOf(n));
        zG.a(abi_1.dzl);
        zG.dT("AnimStatique");
        return zG;
    }

    @Override
    public boolean hP(String string) {
        return string.equals(kvu);
    }

    @Override
    public void d(String string, Object object) {
    }

    @Override
    public void c(String string, Object object) {
        if (string.equals(kvu)) {
            this.setName(object.toString());
        }
    }

    @Override
    public void lM(long l) {
        super.lM(l);
        fse_1.gFu().a((aef_2)this, kvy);
    }

    @Override
    public void setName(String string) {
        super.setName(string);
        fse_1.gFu().a((aef_2)this, kvu);
    }

    public void eef() {
        fse_1.gFu().a((aef_2)this, kvy);
    }

    public String daT() {
        return this.getName();
    }
}

