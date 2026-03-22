/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.occlusion.shadow.RedrawEntity;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class acS
extends acL {
    private static final Logger chQ = Logger.getLogger(acS.class);
    private final ArrayList<RedrawEntity> chR = new ArrayList();
    public static final acS chS = new acS();

    private acS() {
    }

    @Override
    public void reset() {
        super.reset();
        this.chR.clear();
    }

    @Override
    public ZL btT() {
        return new acR();
    }

    @Override
    protected void b(Entity entity, Entity entity2) {
        super.b(entity, entity2);
        this.chR.add(new RedrawEntity(entity2, awx_2.dnG));
    }

    @Override
    protected void a(int n, Entity entity) {
    }

    @Override
    public void f(aaj_0 aaj_02) {
        int n = this.chR.size();
        for (int i = 0; i < n; ++i) {
            aaj_02.a(this.chR.get(i), false);
        }
    }
}

