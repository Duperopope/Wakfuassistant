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
 * Renamed from jy
 */
class jy_1
extends AbstractParser<jx_1> {
    jy_1() {
    }

    public jx_1 fO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new jx_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fO(codedInputStream, extensionRegistryLite);
    }
}

