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
 * Renamed from zd
 */
class zd_1
extends AbstractParser<zc_1> {
    zd_1() {
    }

    public zc_1 jm(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new zc_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jm(codedInputStream, extensionRegistryLite);
    }
}

