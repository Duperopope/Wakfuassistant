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
 * Renamed from yZ
 */
class yz_2
extends AbstractParser<yy_2> {
    yz_2() {
    }

    public yy_2 jj(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new yy_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jj(codedInputStream, extensionRegistryLite);
    }
}

