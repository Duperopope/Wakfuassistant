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
 * Renamed from zK
 */
class zk_1
extends AbstractParser<zj_1> {
    zk_1() {
    }

    public zj_1 jH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new zj_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jH(codedInputStream, extensionRegistryLite);
    }
}

