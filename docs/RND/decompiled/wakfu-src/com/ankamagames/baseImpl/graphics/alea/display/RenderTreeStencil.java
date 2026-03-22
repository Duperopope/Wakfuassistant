/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  org.apache.log4j.Logger
 */
package com.ankamagames.baseImpl.graphics.alea.display;

import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil$ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.log4j.Logger;

public class RenderTreeStencil
extends ayq_2
implements arr_2 {
    public static final RenderTreeStencil$ObjectFactory cbz = new RenderTreeStencil$ObjectFactory();
    protected static final Logger cbA = Logger.getLogger(RenderTreeStencil.class);
    private Entity cbs;
    private final ArrayList<RenderTreeStencil> cbB = new ArrayList(1);
    private final ArrayList<RenderTreeStencil> cbC = new ArrayList(1);
    private final ArrayList<RenderTreeStencil> cbD = new ArrayList(1);
    private final ArrayList<Entity> cbE = new ArrayList();
    private static short cbF = 1;
    private RenderTreeStencil cbG;
    private final ArrayList<Entity> cbH = new ArrayList();

    @Override
    public void clear() {
        this.cbH.clear();
        this.bsk();
    }

    @Override
    public void a(Entity entity, int n) {
        if (this.cbs == null) {
            this.cbs = entity;
            return;
        }
        RenderTreeStencil renderTreeStencil = (RenderTreeStencil)cbz.bSK();
        renderTreeStencil.cbs = entity;
        this.a(renderTreeStencil);
    }

    @Override
    public void c(Entity entity) {
        this.cbH.add(entity);
    }

    @Override
    public void b(art_1 art_12) {
        ava_2.bMH().dc(false);
        art_12.bIn();
        this.c(art_12);
        int n = this.cbH.size();
        for (int i = 0; i < n; ++i) {
            art_12.a(this.cbH.get(i));
        }
    }

    @Override
    public void c(HashSet<Entity> hashSet) {
        hashSet.addAll(this.cbE);
        hashSet.addAll(this.cbH);
        if (this.cbG != null) {
            this.cbG.c(hashSet);
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

    private void bsk() {
        this.cbB.clear();
        this.cbC.clear();
        this.cbD.clear();
        this.cbE.clear();
        this.cbs = null;
        this.cbH.clear();
        if (this.cbG != null) {
            this.cbG.bsk();
            this.cbG.bsI();
            this.cbG = null;
        }
        cbF = (short)254;
    }

    private void c(art_1 art_12) {
        int n;
        if (this.cbs == null) {
            return;
        }
        GL2 gL2 = art_12.bIq();
        int n2 = this.cbB.size();
        avd_2 avd_22 = avd_2.bMO();
        if (n2 != 0) {
            ave_2 ave_22 = new ave_2();
            ave_22.uJ(-2);
            ave_22.cb(true);
            ave_22.uK(7681);
            ave_22.G(512, 2, -1);
            ave_22.dg(false);
            avd_22.a((GL)gL2, ave_22);
            for (n = 0; n < n2; ++n) {
                var7_9 = this.cbB.get(n);
                art_12.a(((RenderTreeStencil)var7_9).cbs);
                var8_10 = ((RenderTreeStencil)var7_9).cbD.size();
                for (int i = 0; i < var8_10; ++i) {
                    var10_15 = ((RenderTreeStencil)var7_9).cbD.get(i);
                    art_12.a(var10_15.cbs);
                }
            }
            ave_22 = new ave_2();
            ave_22.cb(true);
            ave_22.uJ(0);
            ave_22.G(517, 2, -1);
            ave_22.uK(7680);
            ave_22.dg(true);
            avd_22.a((GL)gL2, ave_22);
            art_12.a(this.cbs);
            avd_22.b((GL)gL2, 2);
        } else {
            int n3 = this.cbC.size();
            if (n3 != 0) {
                art_12.a(this.cbs);
                n = this.cbD.size();
                var7_9 = new ave_2();
                ((ave_2)var7_9).cb(true);
                ((ave_2)var7_9).uJ(-2);
                ((ave_2)var7_9).uK(7681);
                ((ave_2)var7_9).G(512, cbF, -1);
                ((ave_2)var7_9).dg(false);
                avd_22.a((GL)gL2, (ave_2)var7_9);
                art_12.a(this.cbs);
                for (var8_10 = 0; var8_10 < n; ++var8_10) {
                    art_12.a(this.cbD.get((int)var8_10).cbs);
                }
                var7_9 = new ave_2();
                ((ave_2)var7_9).cb(false);
                ((ave_2)var7_9).uJ(-2);
                ((ave_2)var7_9).uK(7681);
                ((ave_2)var7_9).G(512, 0, -1);
                ((ave_2)var7_9).dg(false);
                avd_22.a((GL)gL2, (ave_2)var7_9);
                for (var8_10 = 0; var8_10 < n3; ++var8_10) {
                    int n4;
                    int n5 = -1;
                    var10_15 = this.cbC.get(var8_10);
                    int n6 = var10_15.cbB.size();
                    for (n4 = 0; n4 < n6; ++n4) {
                        if (var10_15.cbB.get(n4) != this) continue;
                        n5 = n4 + 1;
                        break;
                    }
                    if (n5 == -1) continue;
                    for (n4 = n5; n4 < n6; ++n4) {
                        RenderTreeStencil renderTreeStencil = var10_15.cbB.get(n4);
                        art_12.a(renderTreeStencil.cbs);
                        int n7 = renderTreeStencil.cbD.size();
                        for (int i = 0; i < n7; ++i) {
                            art_12.a(renderTreeStencil.cbD.get((int)i).cbs);
                        }
                    }
                }
                var7_9 = new ave_2();
                ((ave_2)var7_9).cb(true);
                ((ave_2)var7_9).uJ(0);
                ((ave_2)var7_9).uK(7680);
                ((ave_2)var7_9).G(514, cbF, -2);
                ((ave_2)var7_9).dg(true);
                avd_22.a((GL)gL2, (ave_2)var7_9);
                for (var8_10 = 0; var8_10 < n3; ++var8_10) {
                    RenderTreeStencil renderTreeStencil = this.cbC.get(var8_10);
                    art_12.a(renderTreeStencil.cbs);
                }
                if ((cbF = (short)(cbF - 2)) <= 2) {
                    cbF = (short)254;
                }
                avd_22.b((GL)gL2, 3);
            } else {
                art_12.a(this.cbs);
            }
        }
        int n8 = this.cbE.size();
        for (n = 0; n < n8; ++n) {
            this.cbE.get(n).b(art_12);
        }
        if (this.cbG != null) {
            this.cbG.c(art_12);
        }
    }

    private void a(RenderTreeStencil renderTreeStencil) {
        Entity entity = renderTreeStencil.cbs;
        if (this.cbs.azR > 1.0f && !(entity.azR > 1.0f) && RenderTreeStencil.a(entity, this.cbs, this.cbs.azR) && RenderTreeStencil.a(entity, this.cbs)) {
            int n = this.cbB.size();
            for (int i = 0; i < n; ++i) {
                RenderTreeStencil renderTreeStencil2 = this.cbB.get(i);
                if (renderTreeStencil2.cbs.cWN != entity.cWN || renderTreeStencil2.cbs.cWO != entity.cWO) continue;
                renderTreeStencil.cbD.addAll(renderTreeStencil2.cbD);
                renderTreeStencil.cbD.add(renderTreeStencil2);
                renderTreeStencil2.cbD.clear();
                renderTreeStencil2.cbC.remove(this);
                this.cbB.remove(i);
                break;
            }
            renderTreeStencil.cbC.add(this);
            this.cbB.add(renderTreeStencil);
        }
        if (this.cbG == null) {
            if (entity.azR > 1.0f || renderTreeStencil.cbB.size() != 0 || renderTreeStencil.cbC.size() != 0) {
                this.cbG = renderTreeStencil;
            } else {
                this.cbE.add(entity);
                renderTreeStencil.bsI();
            }
        } else {
            this.cbG.a(renderTreeStencil);
        }
    }

    private static boolean a(Entity entity, Entity entity2, float f2) {
        if (Math.abs(entity.cWN - entity2.cWN) >= f2) {
            return false;
        }
        return !(Math.abs(entity.cWO - entity2.cWO) >= f2);
    }

    private static boolean a(Entity entity, Entity entity2) {
        if (entity.cWN == entity2.cWN && entity.cWO == entity2.cWO) {
            return entity.cWP < entity2.cWP + entity2.cej;
        }
        return entity.cWP + entity.cej <= entity2.cWP;
    }

    public Entity getEntity() {
        return this.cbs;
    }

    public RenderTreeStencil bsl() {
        return this.cbG;
    }

    public ArrayList<RenderTreeStencil> bsm() {
        return this.cbD;
    }

    public ArrayList<RenderTreeStencil> bsn() {
        return this.cbC;
    }

    public ArrayList<RenderTreeStencil> bso() {
        return this.cbB;
    }

    public ArrayList<Entity> bsp() {
        return this.cbE;
    }
}

