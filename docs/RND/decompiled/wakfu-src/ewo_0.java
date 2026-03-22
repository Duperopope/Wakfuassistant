/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ewo
 */
public class ewo_0 {
    public static final ewo_0 oBF = new ewo_0();
    private static final Logger oBG = Logger.getLogger(ewo_0.class);
    private final Map<ewr_0, Object> oBH = new EnumMap<ewr_0, Object>(ewr_0.class);
    public static final EnumSet<ewr_0> oBI = EnumSet.of(ewr_0.oDt, new ewr_0[]{ewr_0.oCy, ewr_0.oCg, ewr_0.oCz, ewr_0.oCA, ewr_0.oCK, ewr_0.oCb, ewr_0.oFf});
    private byte[] oBJ;
    private byte[] oBK;
    private final List<ewp_0> oBL = new ArrayList<ewp_0>();

    public static void rH(String string) {
        try {
            oBF.dJ(string);
        }
        catch (IOException iOException) {
            oBG.error((Object)("Erreur lors du chargement du fichier de propri\u00e9t\u00e9s : " + string), (Throwable)iOException);
        }
        catch (RuntimeException runtimeException) {
            oBG.error((Object)("Erreur lors du chargement du fichier de propri\u00e9t\u00e9s : " + string), (Throwable)runtimeException);
        }
    }

    public void a(ewp_0 ewp_02) {
        this.oBL.add(ewp_02);
    }

    public void b(ewp_0 ewp_02) {
        this.oBL.remove(ewp_02);
    }

    public void dJ(String string) {
        Properties properties = new Properties();
        properties.load(new FileInputStream(string));
        this.oBH.clear();
        for (ewr_0 ewr_02 : ewr_0.values()) {
            String string2 = properties.getProperty(ewr_02.getKey());
            if (string2 == null) {
                this.oBH.put(ewr_02, ewr_02.getDefaultValue());
            } else {
                this.oBH.put(ewr_02, ewm_0.a(ewr_02.feT(), string2));
            }
            this.oBL.forEach(ewp_02 -> ewp_02.onChange(ewr_02, null));
        }
        this.feO();
    }

    private void feO() {
        this.feP();
        this.feQ();
    }

    private void feP() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(ewr_0.oGs);
        for (ewr_0 ewr_02 : ewr_0.values()) {
            Object object;
            if (!ewr_02.feS() || (object = this.oBH.get((Object)ewr_02)) == null) continue;
            azg_12.aG(ewr_02.aIi());
            byte[] byArray = BH.aP(ewm_0.gm(ewr_02.getKey()));
            azg_12.vC(byArray.length);
            azg_12.dH(byArray);
        }
        this.oBJ = azg_12.bTe();
    }

    private void feQ() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(oBI.size());
        for (ewr_0 ewr_02 : oBI) {
            Object object = this.oBH.get((Object)ewr_02);
            if (object == null) continue;
            azg_12.aG(ewr_02.aIi());
            byte[] byArray = BH.aP(ewm_0.gm(ewr_02.getKey()));
            azg_12.vC(byArray.length);
            azg_12.dH(byArray);
        }
        this.oBK = azg_12.bTe();
    }

    public byte[] fdF() {
        if (this.oBJ == null) {
            this.feP();
        }
        return (byte[])this.oBJ.clone();
    }

    public byte[] feR() {
        if (this.oBK == null) {
            this.feQ();
        }
        return (byte[])this.oBK.clone();
    }

    public void dS(byte[] byArray) {
        this.oBH.clear();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            short s = byteBuffer.getShort();
            ewr_0 ewr_02 = ewr_0.dc(s);
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            String string = BH.dc(byArray2);
            if (ewr_02 == null) {
                oBG.warn((Object)("Unknown " + ewo_0.class.getSimpleName() + " with ID " + s + " received"));
                continue;
            }
            Object object = this.oBH.put(ewr_02, ewm_0.a(ewr_02.feT(), string));
            this.oBL.forEach(ewp_02 -> ewp_02.onChange(ewr_02, object));
        }
    }

    public boolean h(ewr_0 ewr_02) {
        return this.oBH.containsKey((Object)ewr_02);
    }

    public int i(ewr_0 ewr_02) {
        Object object = this.oBH.get((Object)ewr_02);
        if (object == null) {
            object = ewr_02.getDefaultValue();
        }
        return ((Number)object).intValue();
    }

    public long j(ewr_0 ewr_02) {
        Object object = this.oBH.get((Object)ewr_02);
        if (object == null) {
            object = ewr_02.getDefaultValue();
        }
        return ((Number)object).longValue();
    }

    public boolean k(ewr_0 ewr_02) {
        Object object = this.oBH.get((Object)ewr_02);
        if (object == null) {
            object = ewr_02.getDefaultValue();
        }
        return (Boolean)object;
    }

    public String l(ewr_0 ewr_02) {
        Object object = this.oBH.get((Object)ewr_02);
        if (object == null) {
            object = ewr_02.getDefaultValue();
        }
        return (String)object;
    }

    public ArrayList<String> m(ewr_0 ewr_02) {
        Object object = this.oBH.get((Object)ewr_02);
        if (object == null) {
            object = ewr_02.getDefaultValue();
        }
        return (ArrayList)object;
    }

    public uz_0 n(ewr_0 ewr_02) {
        Object object = this.oBH.get((Object)ewr_02);
        if (object == null) {
            object = ewr_02.getDefaultValue();
        }
        return (uz_0)object;
    }

    public List<Long> o(ewr_0 ewr_02) {
        Object object = this.oBH.get((Object)ewr_02);
        if (object == null) {
            object = ewr_02.getDefaultValue();
        }
        return (List)object;
    }

    public float p(ewr_0 ewr_02) {
        Object object = this.oBH.get((Object)ewr_02);
        if (object == null) {
            object = ewr_02.getDefaultValue();
        }
        return ((Number)object).floatValue();
    }

    public void a(@NotNull ewr_0 ewr_02, String string) {
        Object object = this.oBH.put(ewr_02, ewm_0.a(ewr_02.feT(), string));
        this.oBL.forEach(ewp_02 -> ewp_02.onChange(ewr_02, object));
        this.feO();
    }

    public void a(@NotNull ewo_0 ewo_02) {
        ewo_02.oBH.forEach((ewr_02, object) -> {
            Object object2 = this.oBH.put((ewr_0)((Object)ewr_02), object);
            this.oBL.forEach(ewp_02 -> ewp_02.onChange((ewr_0)((Object)ewr_02), object2));
        });
        this.feO();
    }

    public String toString() {
        return "SystemConfiguration{m_properties=" + this.oBH.size() + "}";
    }

    public String rI(String string) {
        return ewm_0.gm(string);
    }

    public static boolean z(Mv mv) {
        List<Long> list = oBF.o(ewr_0.oCz);
        if (list.isEmpty()) {
            return true;
        }
        for (Long l : list) {
            vb_0 vb_02 = vb_0.pS(l.intValue());
            if (vb_02.aUXX() != mv) continue;
            return true;
        }
        return false;
    }
}

