/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aYp
implements afl {
    protected static final Logger hxA = Logger.getLogger(aYp.class);
    public static final aYp hxB = new aYp();

    private aYp() {
    }

    public void a(WL wL) {
        boolean bl = auc_0.cVq().b("loadGameEvents", true);
        if (!bl) {
            wL.b(this);
            return;
        }
        this.cYp();
        wL.b(this);
    }

    private boolean cYp() {
        aqb_1.bGD().a(new aLG(), (T aLG2) -> {
            ang_2 ang_22;
            int n = aLG2.d();
            int n2 = aLG2.aeV();
            String[] stringArray = aLG2.cmd();
            String string = aLG2.aGr();
            short s = aLG2.cmb();
            short s2 = aLG2.cmc();
            boolean bl = aLG2.cme();
            String[] stringArray2 = stringArray != null ? new String[stringArray.length] : new String[]{};
            for (int i = 0; i < stringArray2.length; ++i) {
                stringArray2[i] = stringArray[i] != null && stringArray[i].equals("DEFAULT") ? null : stringArray[i];
            }
            try {
                ang_22 = ehu_0.rY(string);
            }
            catch (Exception exception) {
                ang_22 = null;
                hxA.error((Object)("Exception during loading Criterion " + string + " from storage"), (Throwable)exception);
            }
            bql_0 bql_02 = new bql_0(n, n2, stringArray2, ang_22, s, s2, bl);
            bqm_0.jbp.a(bql_02);
            for (ali_0 ali_02 : aLG2.cmf()) {
                this.a(bql_02, ali_02);
            }
        });
        bqm_0.jbp.aPg();
        return true;
    }

    private void a(bql_0 bql_02, ali_0 ali_02) {
        ang_2 ang_22;
        int n = ali_02.d();
        short s = ali_02.cmb();
        String string = ali_02.aGr();
        try {
            ang_22 = ehu_0.rY(string);
        }
        catch (Exception exception) {
            hxA.error((Object)("Exception during compilation of Criterion " + string), (Throwable)exception);
            ang_22 = null;
        }
        bqu_0 bqu_02 = new bqu_0(n, s, ang_22);
        bql_02.a(bqu_02);
        for (aLH aLH2 : ali_02.cmg()) {
            this.a(bqu_02, aLH2);
        }
    }

    private void a(bqu_0 bqu_02, aLH aLH2) {
        block8: {
            int n = aLH2.d();
            int n2 = aLH2.aeV();
            bqq_0 bqq_02 = bqy_1.dx(n2, n);
            ArrayList<amx_1> arrayList = new ArrayList<amx_1>();
            String[] stringArray = aLH2.aHm();
            aox_1 aox_12 = bqq_02.bEt();
            aow_1 aow_12 = aox_12.tm(stringArray.length);
            if (aow_12 != null) {
                boolean bl = true;
                try {
                    for (int i = 0; i < stringArray.length; ++i) {
                        String string = stringArray[i];
                        aoz_1 aoz_12 = (aoz_1)aow_12.tl(i);
                        amx_1 amx_12 = aoz_12.bDv().bDD().fl(string);
                        arrayList.add(amx_12);
                    }
                }
                catch (Exception exception) {
                    hxA.error((Object)("Exception during loading parameters of Action with id=" + bqq_02.d() + " : "), (Throwable)exception);
                    bl = false;
                }
                try {
                    if (bl) {
                        bqq_02.E(arrayList);
                        bqu_02.a(bqq_02);
                        break block8;
                    }
                    hxA.error((Object)("Unable to load action with id=" + bqq_02.d() + " : failed loading parameters"));
                }
                catch (Exception exception) {
                    hxA.error((Object)("Exception during parameters application of behavior with id=" + bqq_02.d() + " : "), (Throwable)exception);
                }
            } else {
                hxA.error((Object)("Client action id=" + bqq_02.d() + " hasn't correct parameters (undefined template with " + stringArray.length + " parameters)"));
            }
        }
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.scriptAction", new Object[0]);
    }
}

