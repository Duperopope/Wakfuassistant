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
 * Renamed from Mc
 */
class mc_2
extends AbstractParser<mb_2> {
    mc_2() {
    }

    public mb_2 kA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new mb_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kA(codedInputStream, extensionRegistryLite);
    }
}

