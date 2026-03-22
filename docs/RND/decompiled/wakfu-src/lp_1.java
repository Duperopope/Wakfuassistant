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
 * Renamed from lP
 */
class lp_1
extends AbstractParser<lo_1> {
    lp_1() {
    }

    public lo_1 hx(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new lo_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hx(codedInputStream, extensionRegistryLite);
    }
}

