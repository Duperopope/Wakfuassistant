Picked up JAVA_TOOL_OPTIONS: 
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal$IntList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 *  zN
 *  zQ
 *  zR
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zO
extends GeneratedMessageV3
implements zR {
    private static final long aoY = 0L;
    public static final int aoZ = 1;
    Internal.IntList apa;
    public static final int apb = 2;
    Internal.IntList apc;
    private byte Y = (byte)-1;
    private static final zO apd = new zO();
    @Deprecated
    public static final Parser<zO> ape = new zP();

    zO(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zO() {
        this.apa = zO.emptyIntList();
        this.apc = zO.emptyIntList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zO();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block14: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block14;
                    }
                    case 8: {
                        if ((n & 1) == 0) {
                            this.apa = zO.newIntList();
                            n |= 1;
                        }
                        this.apa.addInt(codedInputStream.readInt32());
                        continue block14;
                    }
                    case 10: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 1) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.apa = zO.newIntList();
                            n |= 1;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.apa.addInt(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block14;
                    }
                    case 16: {
                        if ((n & 2) == 0) {
                            this.apc = zO.newIntList();
                            n |= 2;
                        }
                        this.apc.addInt(codedInputStream.readInt32());
                        continue block14;
                    }
                    case 18: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 2) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.apc = zO.newIntList();
                            n |= 2;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.apc.addInt(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block14;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (n & true) {
                this.apa.makeImmutable();
            }
            if ((n & 2) != 0) {
                this.apc.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aAw() {
        return zN.aoW;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zN.aoX.ensureFieldAccessorsInitialized(zO.class, zQ.class);
    }

    public List<Integer> aAx() {
        return this.apa;
    }

    public int aAy() {
        return this.apa.size();
    }

    public int lb(int n) {
        return this.apa.getInt(n);
    }

    public List<Integer> aAz() {
        return this.apc;
    }

    public int aAA() {
        return this.apc.size();
    }

    public int lc(int n) {
        return this.apc.getInt(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.apa.size(); ++n) {
            codedOutputStream.writeInt32(1, this.apa.getInt(n));
        }
        for (n = 0; n < this.apc.size(); ++n) {
            codedOutputStream.writeInt32(2, this.apc.getInt(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        int n3 = 0;
        for (n = 0; n < this.apa.size(); ++n) {
            n3 += CodedOutputStream.computeInt32SizeNoTag((int)this.apa.getInt(n));
        }
        n2 += n3;
        n2 += 1 * this.aAx().size();
        n3 = 0;
        for (n = 0; n < this.apc.size(); ++n) {
            n3 += CodedOutputStream.computeInt32SizeNoTag((int)this.apc.getInt(n));
        }
        n2 += n3;
        n2 += 1 * this.aAz().size();
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zO)) {
            return super.equals(object);
        }
        zO zO2 = (zO)((Object)object);
        if (!this.aAx().equals(zO2.aAx())) {
            return false;
        }
        if (!this.aAz().equals(zO2.aAz())) {
            return false;
        }
        return this.unknownFields.equals((Object)zO2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zO.aAw().hashCode();
        if (this.aAy() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.aAx().hashCode();
        }
        if (this.aAA() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.aAz().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zO ep(ByteBuffer byteBuffer) {
        return (zO)((Object)ape.parseFrom(byteBuffer));
    }

    public static zO cD(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zO)((Object)ape.parseFrom(byteBuffer, extensionRegistryLite));
    }

    public static zO ee(ByteString byteString) {
        return (zO)((Object)ape.parseFrom(byteString));
    }

    public static zO cD(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zO)((Object)ape.parseFrom(byteString, extensionRegistryLite));
    }

    public static zO cF(byte[] byArray) {
        return (zO)((Object)ape.parseFrom(byArray));
    }

    public static zO cD(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zO)((Object)ape.parseFrom(byArray, extensionRegistryLite));
    }

    public static zO gg(InputStream inputStream) {
        return (zO)GeneratedMessageV3.parseWithIOException(ape, (InputStream)inputStream);
    }

    public static zO gg(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zO)GeneratedMessageV3.parseWithIOException(ape, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zO gh(InputStream inputStream) {
        return (zO)GeneratedMessageV3.parseDelimitedWithIOException(ape, (InputStream)inputStream);
    }

    public static zO gh(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zO)GeneratedMessageV3.parseDelimitedWithIOException(ape, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zO cD(CodedInputStream codedInputStream) {
        return (zO)GeneratedMessageV3.parseWithIOException(ape, (CodedInputStream)codedInputStream);
    }

    public static zO jJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zO)GeneratedMessageV3.parseWithIOException(ape, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zQ aAB() {
        return zO.aAC();
    }

    public static zQ aAC() {
        return apd.aAD();
    }

    public static zQ a(zO zO2) {
        return apd.aAD().c(zO2);
    }

    public zQ aAD() {
        return this == apd ? new zQ() : new zQ().c(this);
    }

    protected zQ cD(GeneratedMessageV3.BuilderParent builderParent) {
        zQ zQ2 = new zQ(builderParent);
        return zQ2;
    }

    public static zO aAE() {
        return apd;
    }

    public static Parser<zO> z() {
        return ape;
    }

    public Parser<zO> getParserForType() {
        return ape;
    }

    public zO aAF() {
        return apd;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cD(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aAD();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aAB();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aAD();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aAB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aAF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aAF();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.IntList auN() {
        return zO.emptyIntList();
    }

    static /* synthetic */ Internal.IntList aAG() {
        return zO.emptyIntList();
    }

    static /* synthetic */ UnknownFieldSet b(zO zO2) {
        return zO2.unknownFields;
    }

    static /* synthetic */ Internal.IntList amY() {
        return zO.emptyIntList();
    }

    static /* synthetic */ Internal.IntList e(Internal.IntList intList) {
        return zO.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList Ac() {
        return zO.emptyIntList();
    }

    static /* synthetic */ Internal.IntList vM() {
        return zO.emptyIntList();
    }

    static /* synthetic */ Internal.IntList a(Internal.IntList intList) {
        return zO.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList vN() {
        return zO.emptyIntList();
    }
}

