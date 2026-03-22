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
 * Renamed from aO
 */
class ao_2
extends AbstractParser<an_1> {
    ao_2() {
    }

    public an_1 ad(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new an_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ad(codedInputStream, extensionRegistryLite);
    }
}

