/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from bLG
 */
public class blg_2
implements aeh_2 {
    private static final Logger ktP = Logger.getLogger(blg_2.class);
    public static final String ktQ = "shortcuts";
    public static final String ktR = "name";
    public static final String ktS = "type";
    public static final String ktT = "index";
    public static final String ktU = "indexText";
    public static final String ktV = "keyList";
    public static final String ktW = "opened";
    public static final String ktX = "isEmpty";
    public static final String ktY = "additionalBarTooltip";
    public static final String[] ktZ = new String[]{"shortcuts", "name", "type", "index", "indexText", "keyList", "opened", "isEmpty"};
    public static final String kua = "additionalShortcutBar";
    private final fqw_0<blb_2> kub;
    private final TByteObjectHashMap<blb_2> kuc = new TByteObjectHashMap();
    private final TByteObjectHashMap<blb_2> kud = new TByteObjectHashMap();
    private final TByteObjectHashMap<blb_2> kue = new TByteObjectHashMap();
    private boolean bqK = false;
    private boolean kuf = false;
    private byte hOe;

    public blg_2(fqt_0 fqt_02, byte by) {
        this.kub = new fqw_0<blb_2>(fqt_02, ble_2.ecR(), fqt_02.gij(), fqt_02.gik(), false);
        this.hOe = by;
    }

    public fqt_0 ecS() {
        return this.kub.ecS();
    }

    public boolean ah(short s) {
        if (this.kub == null) {
            return false;
        }
        return this.kub.ah(s);
    }

    public short a(blb_2 blb_22) {
        if (this.kub == null) {
            return -1;
        }
        return this.kub.e(blb_22);
    }

    public short beO() {
        if (this.kub == null) {
            return -1;
        }
        return this.kub.beO();
    }

    public blb_2 cc(short s) {
        if (this.kub == null) {
            return null;
        }
        return (blb_2)this.kub.ai(s);
    }

    public ArrayList<blb_2> pd(int n) {
        return this.kub.pd(n);
    }

    public blb_2 HY(int n) {
        if (this.kub == null) {
            return null;
        }
        return (blb_2)this.kub.pc(n);
    }

    public blb_2 lL(long l) {
        if (this.kub == null) {
            return null;
        }
        return (blb_2)this.kub.dN(l);
    }

    public boolean b(blb_2 blb_22) {
        try {
            return this.kub.i(blb_22);
        }
        catch (Exception exception) {
            return false;
        }
    }

    public boolean a(blb_2 blb_22, short s) {
        if (this.kub == null) {
            return false;
        }
        if (blb_22 == null) {
            return false;
        }
        if (this.kub.dN(blb_22.LV()) != null) {
            aPd.e("error.shortcutItemAlreadyPresent", new Object[0]);
            return false;
        }
        try {
            short s2 = s;
            if (s == -1) {
                for (s2 = 0; s2 < this.kub.bfa() && !this.kub.ah(s2); s2 = (short)(s2 + 1)) {
                }
            } else if (!this.kub.ah(s)) {
                this.a(s, true);
            }
            if (s2 >= this.kub.bfa()) {
                return false;
            }
            boolean bl = this.kub.a(blb_22, s2);
            if (bl) {
                byte by = (byte)s2;
                boolean bl2 = true;
                if (this.kud.get(by) == blb_22) {
                    bl2 = false;
                    this.kud.remove(by);
                }
                if (bl2) {
                    this.kuc.put(by, (Object)blb_22);
                }
            }
            fse_1.gFu().a((aef_2)this, ktQ, ktX);
            return bl;
        }
        catch (SD | sa_0 sb_02) {
            aPd.e("error.shortcutItemDropNotPossible", new Object[0]);
        }
        catch (Sz sz) {
            aPd.e("error.shortcutItemAlreadyPresent", new Object[0]);
        }
        return false;
    }

    public boolean a(short s, boolean bl) {
        if (this.kub == null) {
            return false;
        }
        if (!this.kub.ah(s)) {
            blb_2 blb_22 = (blb_2)this.kub.ai(s);
            byte by = (byte)s;
            boolean bl2 = true;
            if (this.kuc.get(by) == blb_22) {
                this.kuc.remove(by);
                bl2 = false;
            }
            if (bl2) {
                if (bl) {
                    this.kue.put(by, (Object)blb_22);
                    bl = false;
                } else {
                    this.kud.put(by, (Object)blb_22);
                }
            }
            boolean bl3 = bl ? this.kub.ag(s) : this.kub.af(s) != null;
            fse_1.gFu().a((aef_2)this, ktQ, ktX);
            return bl3;
        }
        return false;
    }

    public void a(int n, fqu_0 fqu_02, boolean bl) {
        ArrayList arrayList = this.kub.pd(n);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; --i) {
                blb_2 blb_22 = (blb_2)arrayList.get(i);
                if (blb_22 == null || blb_22.gih() != fqu_02) continue;
                this.a(this.kub.dK(blb_22.LV()), bl);
            }
        }
    }

    public boolean c(blb_2 blb_22) {
        if (this.kub == null) {
            return false;
        }
        return this.kub.c(blb_22);
    }

    public void b(blb_2 blb_22, short s) {
        byte by = (byte)s;
        if (this.kud.get(by) != null) {
            this.kue.put(by, (Object)blb_22);
        }
        fse_1.gFu().a((aef_2)this, ktQ, ktX);
    }

    public boolean ecT() {
        return (!this.kuc.isEmpty() || !this.kue.isEmpty() || !this.kud.isEmpty()) && this.ecS().efP();
    }

    public void ecU() {
        this.kuc.clear();
        this.kud.clear();
        TByteObjectIterator tByteObjectIterator = this.kue.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            ((blb_2)tByteObjectIterator.value()).aZp();
        }
        this.kue.clear();
    }

    public TByteObjectIterator<blb_2> ecV() {
        return this.kuc.iterator();
    }

    public TByteObjectIterator<blb_2> ecW() {
        return this.kud.iterator();
    }

    public TByteObjectIterator<blb_2> ecX() {
        return this.kue.iterator();
    }

    public void a(blm_2 blm_22) {
        Iterator iterator = this.kub.iterator();
        while (iterator.hasNext()) {
            blm_22.a((blb_2)iterator.next(), this);
        }
    }

    public void clean() {
        this.kub.beP();
    }

    public void ecY() {
        fse_1.gFu().a((aef_2)this, ktQ, ktX);
    }

    public void ecZ() {
        for (blb_2 blb_22 : this.kub) {
            fse_1.gFu().a((aef_2)blb_22, "usable");
        }
    }

    @Override
    public String[] bxk() {
        return ktZ;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "shortcuts": {
                return this.kub.a(new blb_2[this.kub.bfa()]);
            }
            case "name": {
                return aum_0.cWf().c("desc.shortcut.type." + this.ecS().ordinal(), new Object[0]);
            }
            case "type": {
                return this.ecS().ordinal();
            }
            case "index": {
                return this.hOe;
            }
            case "indexText": {
                return this.ecS() == fqt_0.sTe ? Integer.valueOf(1) : String.valueOf(this.eda());
            }
            case "keyList": {
                return this.edb();
            }
            case "opened": {
                return this.bqK;
            }
            case "isEmpty": {
                return this.aJG();
            }
            case "additionalBarTooltip": {
                aUl aUl2 = aUn.cUM().kj(kua + this.hOe);
                if (aUl2 == null) {
                    return null;
                }
                StringBuilder stringBuilder = new StringBuilder(aum_0.cWf().c("desc.additionalShortcutBar", new Object[0]));
                stringBuilder.append(" (");
                stringBuilder.append(aUl2.cUz());
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
        }
        return null;
    }

    private int eda() {
        return this.hOe - aue_0.cVJ().cVN().cm(this.hOe).ecS().eFS() + 1;
    }

    private ArrayList<String> edb() {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n = this.kub.bfa();
        int n2 = this.eda();
        for (int i = 0; i < n; ++i) {
            aUl aUl2 = (aUl)aUn.cUM().eu("shortcut" + String.valueOf(n2 - 1) + String.valueOf(i));
            arrayList.add(aUl2.cUy());
        }
        return arrayList;
    }

    public boolean a(yj_2 yj_22) {
        return this.kub.c(yj_22);
    }

    public void n(long l, boolean bl) {
        blb_2 blb_22 = (blb_2)this.kub.dN(l);
        if (blb_22 != null) {
            this.a(this.kub.dK(blb_22.LV()), bl);
        }
    }

    public boolean aJG() {
        return this.kub.aJG();
    }

    public boolean isFull() {
        return this.kub.isFull();
    }

    public byte deO() {
        return this.hOe;
    }

    public void ce(byte by) {
        this.hOe = by;
    }

    public boolean edc() {
        return this.bqK;
    }

    public void hW(boolean bl) {
        this.bqK = bl;
    }

    public boolean isVertical() {
        return this.kuf;
    }

    public void setVertical(boolean bl) {
        this.kuf = bl;
    }

    public void hX(boolean bl) {
        for (blb_2 blb_22 : this.kub) {
            blb_22.setUsable(bl);
            fse_1.gFu().a((aef_2)blb_22, "usable");
        }
    }

    public void aZp() {
        this.kub.beZ();
    }

    public fqw_0<blb_2> edd() {
        return this.kub;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[type=" + String.valueOf(this.kub == null ? "null" : this.kub.ecS()) + "]";
    }
}

