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
 * Renamed from zG
 */
class zg_1
extends AbstractParser<zf_2> {
    zg_1() {
    }

    public zf_2 jE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new zf_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jE(codedInputStream, extensionRegistryLite);
    }
}

