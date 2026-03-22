/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.ArrayList;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class bad
implements afl {
    private static final Logger hyL = LoggerFactory.getLogger(bad.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new aOj(), aOj2 -> {
            int n = aOj2.d();
            ArrayList<fdJ> arrayList = new ArrayList<fdJ>(aOj2.cue().length);
            for (aok_0 aok_02 : aOj2.cue()) {
                int n2 = aok_02.cuf();
                Optional<ftj_0> optional = ftk_0.glR().aaj(n2);
                if (optional.isEmpty()) {
                    hyL.error("Unable to parse {} with following id {} from biomeId of {}, we can't register this {} (id of {} related : {})", new Object[]{ftj_0.class.getSimpleName(), n2, aOj.class.getSimpleName(), fdJ.class.getSimpleName(), fdI.class.getSimpleName(), n});
                    continue;
                }
                arrayList.add(fdJ.a(optional.get(), aok_02.cug(), aok_02.cjf(), n));
            }
            fdI fdI2 = new fdI(n, 0, eIx.qwB, 0, arrayList);
            fda_0.rWI.a(fdI2);
        });
        wL.b(this);
    }

    @Override
    public String getName() {
        return "contentLoader.ranchTeleporters";
    }
}

