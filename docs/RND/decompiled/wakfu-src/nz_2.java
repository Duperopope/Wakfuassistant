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
 * Renamed from nZ
 */
class nz_2
extends AbstractParser<ny_2> {
    nz_2() {
    }

    public ny_2 iL(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ny_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iL(codedInputStream, extensionRegistryLite);
    }
}

