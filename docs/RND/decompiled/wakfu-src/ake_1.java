/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.List;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akE
 */
public class ake_1
extends aly_1<List<alq_1>> {
    private static final Logger cDF = Logger.getLogger(akh_1.class);
    public static final String cDG = "playRandomSound";
    private static final afe_1[] cDH = new afe_1[]{new afe_1("soundId, gain", null, aff_2.dJC, true)};

    public ake_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDG;
    }

    @Override
    public afe_1[] bBg() {
        return cDH;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    protected List<alq_1> sG(int n) {
        return this.g(0, n, false);
    }

    @Override
    protected void a(List<alq_1> list, afx_1 afx_12) {
        alq_1 alq_12 = this.o(list);
        try {
            if (alq_12.aYj() != 0L) {
                aiv_2.bBr().a(alq_12.aYj(), alq_12.bBt() / 100.0f, 1, -1L, -1L, afx_12.bha());
            } else {
                cDF.error((Object)"Id du son nul");
            }
        }
        catch (Exception exception) {
            this.a(cDF, "soundExtension or soundPath not initialized " + String.valueOf(exception));
        }
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sG(n);
    }
}

