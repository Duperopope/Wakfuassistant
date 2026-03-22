/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.ImmutableList
 *  com.google.inject.Module
 *  com.google.inject.PrivateModule
 *  com.google.inject.Provides
 *  com.google.inject.Scopes
 *  io.netty.channel.ChannelHandler
 *  io.netty.handler.codec.string.StringDecoder
 *  io.netty.handler.codec.string.StringEncoder
 */
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.inject.Module;
import com.google.inject.PrivateModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import java.util.List;

/*
 * Renamed from cAC
 */
public final class cac_0
extends PrivateModule {
    @FT
    public List<Module> eGE() {
        return ImmutableList.of((Object)((Object)new aud_0()), (Object)((Object)new euD()));
    }

    protected void configure() {
        this.bind(cax_0.class).in(Scopes.SINGLETON);
        this.expose(cax_0.class);
    }

    @Provides
    private List<ChannelHandler> a(cau_0 cau_02, cav_0 cav_02, cat_0 cat_02) {
        return ImmutableList.of((Object)new StringDecoder(Charsets.UTF_8), (Object)new StringEncoder(Charsets.UTF_8), (Object)((Object)cau_02), (Object)((Object)cav_02), (Object)((Object)cat_02));
    }
}

