/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.baseImpl.graphics.alea.display;

import com.ankamagames.baseImpl.graphics.alea.display.RenderTree$ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;
import java.util.HashSet;

public class RenderTree
extends ayq_2
implements arr_2 {
    public static final RenderTree$ObjectFactory cbn = new RenderTree$ObjectFactory();
    private final ArrayList<Entity> cbo = new ArrayList(0);
    private final ArrayList<Entity> cbp = new ArrayList(0);
    private RenderTree cbq;
    private RenderTree cbr;
    private Entity cbs;
    private boolean cbt;
    private float cbu;
    private float cbv;
    private final ArrayList<Entity> cbw = new ArrayList();
    private static final int cbx = 1000;
    private static final boolean cby = true;

    RenderTree() {
    }

    @Override
    public void clear() {
        this.cbw.clear();
        if (this.cbq != null) {
            this.cbq.bsI();
            this.cbq = null;
        }
        if (this.cbr != null) {
            this.cbr.bsI();
            this.cbr = null;
        }
        this.cbo.clear();
        this.cbp.clear();
        this.cbs = null;
    }

    @Override
    public void a(Entity entity, int n) {
        if (this.cbs == null) {
            this.cbs = entity;
            this.cbt = this.e(this.cbs);
            this.cbu = this.cbs.cWN;
            this.cbv = this.cbs.cWO;
            this.cbu = Float.MAX_VALUE;
            this.cbv = Float.MAX_VALUE;
            return;
        }
        if (!this.cbt) {
            if (this.cbr == null) {
                if (!this.e(entity)) {
                    this.cbp.add(entity);
                } else {
                    if (this.cbr == null) {
                        this.cbr = (RenderTree)cbn.bSK();
                    }
                    this.cbr.a(entity, n + 1);
                }
            } else {
                this.cbr.a(entity, n + 1);
            }
            return;
        }
        if (this.f(entity)) {
            if (this.cbq == null) {
                this.cbq = (RenderTree)cbn.bSK();
            }
            this.cbq.a(entity, n + 1);
        } else {
            if (this.cbr == null) {
                this.cbr = (RenderTree)cbn.bSK();
            }
            this.cbr.a(entity, n + 1);
        }
    }

    public final void a(ArrayList<Entity> arrayList, int n) {
        int n2;
        for (n2 = 0; n2 < this.cbo.size(); ++n2) {
            arrayList.add(this.cbo.get(n2));
        }
        if (this.cbq != null) {
            this.cbq.a(arrayList, n);
        }
        if (this.cbs != null) {
            arrayList.add(this.cbs);
        }
        for (n2 = 0; n2 < this.cbp.size(); ++n2) {
            arrayList.add(this.cbp.get(n2));
        }
        if (n > 1000) {
            return;
        }
        if (this.cbr != null) {
            this.cbr.a(arrayList, n + 1);
        }
    }

    @Override
    public void c(Entity entity) {
        this.cbw.add(entity);
    }

    @Override
    public void b(art_1 art_12) {
        this.c(art_12);
        int n = this.cbw.size();
        for (int i = 0; i < n; ++i) {
            art_12.a(this.cbw.get(i));
        }
    }

    @Override
    public void c(HashSet<Entity> hashSet) {
        hashSet.addAll(this.cbp);
        hashSet.addAll(this.cbo);
        hashSet.addAll(this.cbw);
        if (this.cbq != null) {
            this.cbq.c(hashSet);
        }
        if (this.cbr != null) {
            this.cbr.c(hashSet);
        }
        if (this.cbs != null) {
            hashSet.add(this.cbs);
        }
    }

    @Override
    public void brr() {
    }

    @Override
    public void brs() {
        this.clear();
    }

    private void c(art_1 art_12) {
        int n;
        int n2 = this.cbo.size();
        for (n = 0; n < n2; ++n) {
            this.cbo.get(n).b(art_12);
        }
        if (this.cbq != null) {
            this.cbq.c(art_12);
        }
        if (this.cbs != null) {
            this.cbs.b(art_12);
        }
        n = this.cbp.size();
        for (int i = 0; i < n; ++i) {
            this.cbp.get(i).b(art_12);
        }
        if (this.cbr != null) {
            this.cbr.c(art_12);
        }
    }

    private boolean e(Entity entity) {
        return entity.azR > 1.0f;
    }

    private boolean f(Entity entity) {
        if (entity.cWN < this.cbs.cWN) {
            return true;
        }
        return entity.cWO < this.cbs.cWO;
    }
}

