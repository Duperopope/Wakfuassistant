/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from zl
 */
class zl_2
extends AbstractParser<zk_2> {
    zl_2() {
    }

    public zk_2 js(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new zk_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.js(codedInputStream, extensionRegistryLite);
    }
}

