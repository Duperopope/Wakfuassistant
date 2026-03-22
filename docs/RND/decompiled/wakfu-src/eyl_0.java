/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from eyL
 */
public abstract class eyl_0 {
    protected static final Logger pkb = Logger.getLogger(eyl_0.class);
    private final qi_1 pkc = new qi_1();
    private final qk_2 pkd = new qk_2();
    private final qg_2 pke = new qg_2();
    private final oq_2 pkf = new oq_2();
    private final sb_2 pkg = new sb_2();
    private final rt_2 pkh = new rt_2();
    private final pl_1 pki = new pl_1();
    private final pa_2 pkj = new pa_2();
    private final pa_2 pkk = new pa_2();
    private final rz_1 pkl = new rz_1();
    private final rz_1 pkm = new rz_1();
    private final pd_2 pkn = new pd_2();
    private final pn_2 pko = new pn_2();
    private final qe_1 pkp = new qe_1();
    private final pz_1 pkq = new pz_1();
    private final qm_2 pkr = new qm_2();

    public void clear() {
        this.pkc.clear();
        this.pkd.clear();
        this.pke.clear();
        this.pkf.clear();
        this.pkg.clear();
        this.pkh.clear();
        this.pki.clear();
        this.pkj.clear();
        this.pkk.clear();
        this.pkl.clear();
        this.pkm.clear();
        this.pkn.clear();
        this.pko.clear();
        this.pkp.clear();
        this.pkr.clear();
        this.pkq.clear();
    }

    public final qg_2 fiq() {
        return this.pke;
    }

    public final qk_2 fir() {
        return this.pkd;
    }

    public final qi_1 fis() {
        return this.pkc;
    }

    public final oq_2 fit() {
        return this.pkf;
    }

    public sb_2 fiu() {
        return this.pkg;
    }

    public final rt_2 fiv() {
        return this.pkh;
    }

    public final pl_1 fiw() {
        return this.pki;
    }

    public final pa_2 fix() {
        return this.pkj;
    }

    public final pa_2 fiy() {
        return this.pkk;
    }

    public final pn_2 fiz() {
        return this.pko;
    }

    public final rz_1 fiA() {
        return this.pkl;
    }

    public final rz_1 fiB() {
        return this.pkm;
    }

    public final pd_2 fiC() {
        return this.pkn;
    }

    public final qe_1 fiD() {
        return this.pkp;
    }

    public qm_2 fiE() {
        return this.pkr;
    }

    public pz_1 fiF() {
        return this.pkq;
    }

    final go_0 a(eym_0 eym_02) {
        switch (eym_02.ordinal()) {
            case 48: {
                return this.fji();
            }
            case 49: {
                return this.fjj();
            }
            case 5: {
                return this.fiG();
            }
            case 6: {
                return this.fiH();
            }
            case 13: {
                return this.fiO();
            }
            case 14: {
                return this.fiP();
            }
            case 15: {
                return this.fiR();
            }
            case 3: {
                return this.fit();
            }
            case 4: {
                return this.fiu();
            }
            case 23: {
                return this.fiL();
            }
            case 59: {
                return this.fjl();
            }
            case 25: {
                return this.fiM();
            }
            case 26: {
                return this.fiN();
            }
            case 57: {
                return this.fiC();
            }
            case 12: {
                return this.fjm();
            }
            case 58: {
                return this.fiz();
            }
            case 16: {
                return this.fiW();
            }
            case 64: {
                return this.fiX();
            }
            case 46: {
                return this.fjf();
            }
            case 73: {
                return this.fjg();
            }
            case 74: {
                return this.fjh();
            }
            case 50: {
                return this.fiw();
            }
            case 52: {
                return this.fiB();
            }
            case 55: {
                return this.fix();
            }
            case 72: {
                return this.fiy();
            }
            case 47: {
                return this.fjk();
            }
            case 60: {
                return this.fjn();
            }
            case 27: {
                return this.fjv();
            }
            case 28: {
                return this.fjw();
            }
            case 29: {
                return this.fjx();
            }
            case 30: {
                return this.fjz();
            }
            case 31: {
                return this.fjA();
            }
            case 32: {
                return this.fjB();
            }
            case 33: {
                return this.fjy();
            }
            case 34: {
                return this.fjC();
            }
            case 35: {
                return this.fjD();
            }
            case 36: {
                return this.fjE();
            }
            case 70: {
                return this.fjF();
            }
            case 71: {
                return this.fjG();
            }
            case 37: {
                return this.fjH();
            }
            case 38: {
                return this.fjI();
            }
            case 62: {
                return this.fjo();
            }
            case 63: {
                return this.fjp();
            }
            case 9: {
                return this.fjc();
            }
            case 0: {
                return this.fis();
            }
            case 1: {
                return this.fir();
            }
            case 2: {
                return this.fiq();
            }
            case 61: {
                return this.fjs();
            }
            case 7: {
                return this.fiv();
            }
            case 8: {
                return this.fjt();
            }
            case 54: {
                return this.fiJ();
            }
            case 53: {
                return this.fiI();
            }
            case 24: {
                return this.fiS();
            }
            case 56: {
                return this.fiY();
            }
            case 21: {
                return this.fiZ();
            }
            case 65: {
                return this.fja();
            }
            case 22: {
                return this.fiK();
            }
            case 18: {
                return this.fiU();
            }
            case 20: {
                return this.fiV();
            }
            case 19: {
                return this.fiT();
            }
            case 17: {
                return this.fjb();
            }
            case 51: {
                return this.fiA();
            }
            case 10: {
                return this.fjd();
            }
            case 11: {
                return this.fje();
            }
            case 39: {
                return this.fjJ();
            }
            case 40: {
                return this.fjK();
            }
            case 41: {
                return this.fjO();
            }
            case 42: {
                return this.fjP();
            }
            case 43: {
                return this.fjL();
            }
            case 66: {
                return this.fjM();
            }
            case 67: {
                return this.fjN();
            }
            case 44: {
                return this.fjQ();
            }
            case 68: {
                return this.fjq();
            }
            case 69: {
                return this.fjr();
            }
            case 75: {
                return this.fiD();
            }
            case 76: {
                return this.fiF();
            }
            case 77: {
                return this.fiQ();
            }
            case 45: {
                return this.fiE();
            }
        }
        return null;
    }

    public final byte[] a(eyn_0 eyn_02) {
        int n = 1;
        for (eym_0 eym_02 : eyn_02.fkk()) {
            go_0 object = this.a(eym_02);
            if (object != null) {
                try {
                    object.DM().zo();
                }
                catch (Exception exception) {
                    pkb.error((Object)("Exception lors du callback de s\u00e9rialisation de la part " + String.valueOf((Object)eym_02) + " : "), (Throwable)exception);
                }
                n += object.DN();
                continue;
            }
            pkb.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration de la CharacterSerializedPart correspondant \u00e0 " + String.valueOf((Object)eym_02) + " de la forme " + String.valueOf((Object)eyn_02)));
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.put((byte)eyn_02.ordinal());
        for (eym_0 eym_02 : eyn_02.fkk()) {
            go_0 go_02 = this.a(eym_02);
            if (go_02 == null || go_02.aF(byteBuffer)) continue;
            pkb.error((Object)("Erreur lors de la s\u00e9rialisation de la part " + String.valueOf((Object)eym_02) + " de la forme " + String.valueOf((Object)eyn_02) + " pour le personnage " + this.pkc.Uo + ": " + go_02.toString().replaceAll("\\n", "|")));
        }
        return byteBuffer.array();
    }

    public final void ev(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        if (n < 0 || n >= eyn_0.values().length) {
            pkb.error((Object)("Num\u00e9ro de part invalide : " + n));
            return;
        }
        boolean bl = ewo_0.oBF.k(ewr_0.oDb);
        eyn_0 eyn_02 = eyn_0.values()[n];
        for (eym_0 eym_02 : eyn_02.fkk()) {
            go_0 go_02 = this.a(eym_02);
            if (bl && this.a(byteBuffer, eym_02, go_02)) continue;
            if (go_02 != null) {
                go_02.aG(byteBuffer);
                try {
                    go_02.DM().zp();
                }
                catch (Exception exception) {
                    pkb.error((Object)("Exception lors du callback de d\u00e9s\u00e9rialisation de la part " + String.valueOf((Object)eym_02) + ": "), (Throwable)exception);
                }
                continue;
            }
            pkb.error((Object)("Impossible de trouver la CharacterPart correspondant \u00e0 " + String.valueOf((Object)eym_02)));
        }
    }

    private boolean a(ByteBuffer byteBuffer, eym_0 eym_02, go_0 go_02) {
        byte[] byArray;
        byte[] byArray2;
        if (eym_02 != eym_0.plg || go_02 == null) {
            return false;
        }
        byteBuffer.mark();
        oc_1 oc_12 = new oc_1();
        oc_12.aG(byteBuffer);
        nn_1 nn_12 = new nn_1();
        try {
            byArray2 = oc_12.Rr ? fum_0.eY(oc_12.Rq) : oc_12.Rq;
        }
        catch (IOException iOException) {
            pkb.warn((Object)"[SERIAL] Invalid achievement data received, skipping part", (Throwable)iOException);
            return true;
        }
        if (byArray2 == null) {
            pkb.warn((Object)("[SERIAL] Null achievement data received for " + eym_02.name() + ", skipping part"));
            return true;
        }
        no_1.a(nn_12).cg(byArray2);
        oc_1 oc_13 = (oc_1)go_02;
        nn_1 nn_13 = new nn_1();
        try {
            byte[] byArray3 = byArray = oc_13.Rr ? fum_0.eY(oc_13.Rq) : oc_13.Rq;
            if (byArray == null) {
                byteBuffer.reset();
                return false;
            }
        }
        catch (IOException iOException) {
            pkb.fatal((Object)"[SERIAL] Existing achievement data is invalid, replacing with the new part", (Throwable)iOException);
            byteBuffer.reset();
            return false;
        }
        no_1.a(nn_13).cg(byArray);
        Optional<Long> optional = nn_13.apF();
        if (optional.isEmpty()) {
            byteBuffer.reset();
            return false;
        }
        if (nn_12.apF().map(l -> l > (Long)optional.get()).orElse(true).booleanValue()) {
            pkb.fatal((Object)String.format("[SERIAL] Received achievement data but the earliest completion date is AFTER the one of the actual blob; It most probably means a data loss will occur ! Old blob: %s, new blob: %s", nn_13, nn_12));
            return true;
        }
        byteBuffer.reset();
        return false;
    }

    public final void a(go_0 go_02, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        if (n < 0 || n >= eyn_0.values().length) {
            pkb.error((Object)("Num\u00e9ro de part invalide : " + n));
            return;
        }
        eyn_0 eyn_02 = eyn_0.values()[n];
        try {
            for (eym_0 eym_02 : eyn_02.fkk()) {
                go_0 go_03 = this.a(eym_02);
                if (go_03 != null) {
                    if (go_03 == go_02) {
                        go_03.aG(byteBuffer);
                        try {
                            go_03.DM().zp();
                            return;
                        }
                        catch (Exception exception) {
                            pkb.error((Object)("Exception lors du callback de d\u00e9s\u00e9rialisation de la part " + String.valueOf((Object)eym_02)), (Throwable)exception);
                            continue;
                        }
                    }
                    go_03 = (go_0)go_03.getClass().newInstance();
                    go_03.aG(byteBuffer);
                    continue;
                }
                pkb.error((Object)("Impossible de trouver la CharacterPart correspondant \u00e0 " + String.valueOf((Object)eym_02)));
            }
        }
        catch (InstantiationException instantiationException) {
            pkb.error((Object)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            pkb.error((Object)illegalAccessException);
        }
    }

    public final void a(Set<go_0> set, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        if (n < 0 || n >= eyn_0.values().length) {
            pkb.error((Object)("Num\u00e9ro de part invalide : " + n));
            return;
        }
        eyn_0 eyn_02 = eyn_0.values()[n];
        try {
            for (eym_0 eym_02 : eyn_02.fkk()) {
                go_0 go_02 = this.a(eym_02);
                if (go_02 != null) {
                    if (set.remove(go_02)) {
                        go_02.aG(byteBuffer);
                        try {
                            go_02.DM().zp();
                            if (set.isEmpty()) {
                                return;
                            }
                        }
                        catch (Exception exception) {
                            pkb.error((Object)("Exception lors du callback de d\u00e9s\u00e9rialisation de la part " + String.valueOf((Object)eym_02)), (Throwable)exception);
                        }
                        continue;
                    }
                    go_02 = (go_0)go_02.getClass().newInstance();
                    go_02.aG(byteBuffer);
                    continue;
                }
                pkb.error((Object)("Impossible de trouver la CharacterPart correspondant \u00e0 " + String.valueOf((Object)eym_02)));
            }
        }
        catch (InstantiationException instantiationException) {
            pkb.error((Object)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            pkb.error((Object)illegalAccessException);
        }
    }

    public go_0 fiG() {
        return go_0.sb;
    }

    public go_0 fiH() {
        return go_0.sb;
    }

    public go_0 fiI() {
        return go_0.sb;
    }

    public go_0 fiJ() {
        return go_0.sb;
    }

    public go_0 fiK() {
        return go_0.sb;
    }

    public go_0 fiL() {
        return go_0.sb;
    }

    public go_0 fiM() {
        return go_0.sb;
    }

    public go_0 fiN() {
        return go_0.sb;
    }

    public go_0 fiO() {
        return go_0.sb;
    }

    public go_0 fiP() {
        return go_0.sb;
    }

    public go_0 fiQ() {
        return go_0.sb;
    }

    public go_0 fiR() {
        return go_0.sb;
    }

    public go_0 fiS() {
        return go_0.sb;
    }

    public go_0 fiT() {
        return go_0.sb;
    }

    public go_0 fiU() {
        return go_0.sb;
    }

    public go_0 fiV() {
        return go_0.sb;
    }

    public go_0 fiW() {
        return go_0.sb;
    }

    public go_0 fiX() {
        return go_0.sb;
    }

    public go_0 fiY() {
        return go_0.sb;
    }

    public go_0 fiZ() {
        return go_0.sb;
    }

    public go_0 fja() {
        return go_0.sb;
    }

    public go_0 fjb() {
        return go_0.sb;
    }

    public go_0 fjc() {
        return go_0.sb;
    }

    public go_0 fjd() {
        return go_0.sb;
    }

    public go_0 fje() {
        return go_0.sb;
    }

    public go_0 fjf() {
        return go_0.sb;
    }

    public go_0 fjg() {
        return go_0.sb;
    }

    public go_0 fjh() {
        return go_0.sb;
    }

    public go_0 fji() {
        return go_0.sb;
    }

    public go_0 fjj() {
        return go_0.sb;
    }

    public go_0 fjk() {
        return go_0.sb;
    }

    public go_0 fjl() {
        return go_0.sb;
    }

    public go_0 fjm() {
        return go_0.sb;
    }

    public go_0 fjn() {
        return go_0.sb;
    }

    public go_0 fjo() {
        return go_0.sb;
    }

    public go_0 fjp() {
        return go_0.sb;
    }

    public go_0 fjq() {
        return go_0.sb;
    }

    public go_0 fjr() {
        return go_0.sb;
    }

    public go_0 fjs() {
        return go_0.sb;
    }

    public go_0 fjt() {
        return go_0.sb;
    }

    public go_0 fju() {
        return go_0.sb;
    }

    public go_0 fjv() {
        return go_0.sb;
    }

    public go_0 fjw() {
        return go_0.sb;
    }

    public go_0 fjx() {
        return go_0.sb;
    }

    public go_0 fjy() {
        return go_0.sb;
    }

    public go_0 fjz() {
        return go_0.sb;
    }

    public go_0 fjA() {
        return go_0.sb;
    }

    public go_0 fjB() {
        return go_0.sb;
    }

    public go_0 fjC() {
        return go_0.sb;
    }

    public go_0 fjD() {
        return go_0.sb;
    }

    public go_0 fjE() {
        return go_0.sb;
    }

    public go_0 fjF() {
        return go_0.sb;
    }

    public go_0 fjG() {
        return go_0.sb;
    }

    public go_0 fjH() {
        return go_0.sb;
    }

    public go_0 fjI() {
        return go_0.sb;
    }

    public go_0 fjJ() {
        return go_0.sb;
    }

    public go_0 fjK() {
        return go_0.sb;
    }

    public go_0 fjL() {
        return go_0.sb;
    }

    public go_0 fjM() {
        return go_0.sb;
    }

    public go_0 fjN() {
        return go_0.sb;
    }

    public go_0 fjO() {
        return go_0.sb;
    }

    public go_0 fjP() {
        return go_0.sb;
    }

    public go_0 fjQ() {
        return go_0.sb;
    }

    public byte[] lj(boolean bl) {
        return bl ? this.a(eyn_0.pmt) : this.a(eyn_0.pmu);
    }

    public byte[] fgq() {
        return this.a(eyn_0.pmv);
    }

    public byte[] fjR() {
        return this.a(eyn_0.pmx);
    }

    public byte[] fjS() {
        return this.a(eyn_0.pmK);
    }

    public byte[] fjT() {
        return this.a(eyn_0.plZ);
    }

    public byte[] fgA() {
        return this.a(eyn_0.pme);
    }

    public byte[] fgB() {
        return this.a(eyn_0.pmf);
    }

    public byte[] fjU() {
        return this.a(eyn_0.plU);
    }

    public byte[] apI() {
        return this.a(eyn_0.plT);
    }

    public byte[] fgb() {
        return this.a(eyn_0.plV);
    }

    public byte[] fjV() {
        return this.a(eyn_0.plW);
    }

    public byte[] fgc() {
        return this.a(eyn_0.pmF);
    }

    public byte[] fgd() {
        return this.a(eyn_0.pmG);
    }

    public byte[] fge() {
        return this.a(eyn_0.pmH);
    }

    public final byte[] fjW() {
        return this.a(eyn_0.plX);
    }

    public final byte[] fjX() {
        return this.a(eyn_0.pmr);
    }

    public final byte[] fjY() {
        return this.a(eyn_0.pmA);
    }

    public final byte[] fjZ() {
        return this.a(eyn_0.pms);
    }

    public final byte[] fka() {
        return this.a(eyn_0.pmw);
    }

    public byte[] fgp() {
        return this.a(eyn_0.plY);
    }

    public byte[] fgs() {
        return this.a(eyn_0.pmd);
    }

    public byte[] fgz() {
        return this.a(eyn_0.pmg);
    }

    public byte[] fkb() {
        return this.a(eyn_0.pmb);
    }

    public byte[] fkc() {
        return this.a(eyn_0.pma);
    }

    public byte[] fkd() {
        return this.a(eyn_0.pmc);
    }

    public byte[] fke() {
        return this.a(eyn_0.pml);
    }

    public byte[] fkf() {
        return this.a(eyn_0.pmm);
    }

    public byte[] fkg() {
        return this.a(eyn_0.pmn);
    }

    public byte[] fgD() {
        return this.a(eyn_0.pmo);
    }

    public byte[] fgE() {
        return this.a(eyn_0.pmj);
    }

    public byte[] fgF() {
        return this.a(eyn_0.pmk);
    }

    public byte[] fgG() {
        return this.a(eyn_0.pmp);
    }

    public byte[] fkh() {
        return this.a(eyn_0.pmq);
    }

    public byte[] fki() {
        return this.a(eyn_0.pmz);
    }

    public String ew(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        stringBuilder.append(this.getClass().getSimpleName()).append(" serialization=").append(byArray.length).append(" byte(s) in ");
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        if (n < 0 || n >= eyn_0.values().length) {
            return "[ERROR: invalid serialization type: " + n + "]";
        }
        eyn_0 eyn_02 = eyn_0.values()[n];
        stringBuilder.append((Object)eyn_02).append(", parts=");
        for (eym_0 eym_02 : eyn_02.fkk()) {
            go_0 go_02 = this.a(eym_02);
            if (go_02 != null) {
                stringBuilder.append("{").append((Object)eym_02).append(" ");
                int n2 = byteBuffer.position();
                go_02.aG(byteBuffer);
                for (int i = n2; i < byteBuffer.position(); ++i) {
                    stringBuilder.append(String.format("%02x", byArray[i]));
                    if ((i - n2) % 4 != 3 || i >= byteBuffer.position() - 1) continue;
                    stringBuilder.append(".");
                }
            } else {
                return "[ERROR: no character part for " + String.valueOf((Object)eym_02) + "]";
            }
            stringBuilder.append("} ");
        }
        stringBuilder.append("] ").append(byteBuffer.remaining()).append(" byte(s) left.");
        return stringBuilder.toString();
    }
}

