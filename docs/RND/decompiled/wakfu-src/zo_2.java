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

/*
 * Renamed from zO
 */
public final class zo_2
extends GeneratedMessageV3
implements zr_1 {
    private static final long aoY = 0L;
    public static final int aoZ = 1;
    Internal.IntList apa;
    public static final int apb = 2;
    Internal.IntList apc;
    private byte Y = (byte)-1;
    private static final zo_2 apd = new zo_2();
    @Deprecated
    public static final Parser<zo_2> ape = new zp_1();

    zo_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zo_2() {
        this.apa = zo_2.emptyIntList();
        this.apc = zo_2.emptyIntList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zo_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zo_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.apa = zo_2.newIntList();
                            n |= 1;
                        }
                        this.apa.addInt(codedInputStream.readInt32());
                        continue block14;
                    }
                    case 10: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 1) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.apa = zo_2.newIntList();
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
                            this.apc = zo_2.newIntList();
                            n |= 2;
                        }
                        this.apc.addInt(codedInputStream.readInt32());
                        continue block14;
                    }
                    case 18: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 2) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.apc = zo_2.newIntList();
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
        return zn_2.aoW;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zn_2.aoX.ensureFieldAccessorsInitialized(zo_2.class, zq_1.class);
    }

    @Override
    public List<Integer> aAx() {
        return this.apa;
    }

    @Override
    public int aAy() {
        return this.apa.size();
    }

    @Override
    public int lb(int n) {
        return this.apa.getInt(n);
    }

    @Override
    public List<Integer> aAz() {
        return this.apc;
    }

    @Override
    public int aAA() {
        return this.apc.size();
    }

    @Override
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
        if (!(object instanceof zo_2)) {
            return super.equals(object);
        }
        zo_2 zo_22 = (zo_2)object;
        if (!this.aAx().equals(zo_22.aAx())) {
            return false;
        }
        if (!this.aAz().equals(zo_22.aAz())) {
            return false;
        }
        return this.unknownFields.equals((Object)zo_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zo_2.aAw().hashCode();
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

    public static zo_2 ep(ByteBuffer byteBuffer) {
        return (zo_2)ape.parseFrom(byteBuffer);
    }

    public static zo_2 cD(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zo_2)ape.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zo_2 ee(ByteString byteString) {
        return (zo_2)ape.parseFrom(byteString);
    }

    public static zo_2 cD(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zo_2)ape.parseFrom(byteString, extensionRegistryLite);
    }

    public static zo_2 cF(byte[] byArray) {
        return (zo_2)ape.parseFrom(byArray);
    }

    public static zo_2 cD(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zo_2)ape.parseFrom(byArray, extensionRegistryLite);
    }

    public static zo_2 gg(InputStream inputStream) {
        return (zo_2)GeneratedMessageV3.parseWithIOException(ape, (InputStream)inputStream);
    }

    public static zo_2 gg(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zo_2)GeneratedMessageV3.parseWithIOException(ape, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zo_2 gh(InputStream inputStream) {
        return (zo_2)GeneratedMessageV3.parseDelimitedWithIOException(ape, (InputStream)inputStream);
    }

    public static zo_2 gh(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zo_2)GeneratedMessageV3.parseDelimitedWithIOException(ape, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zo_2 cD(CodedInputStream codedInputStream) {
        return (zo_2)GeneratedMessageV3.parseWithIOException(ape, (CodedInputStream)codedInputStream);
    }

    public static zo_2 jJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zo_2)GeneratedMessageV3.parseWithIOException(ape, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zq_1 aAB() {
        return zo_2.aAC();
    }

    public static zq_1 aAC() {
        return apd.aAD();
    }

    public static zq_1 a(zo_2 zo_22) {
        return apd.aAD().c(zo_22);
    }

    public zq_1 aAD() {
        return this == apd ? new zq_1() : new zq_1().c(this);
    }

    protected zq_1 cD(GeneratedMessageV3.BuilderParent builderParent) {
        zq_1 zq_12 = new zq_1(builderParent);
        return zq_12;
    }

    public static zo_2 aAE() {
        return apd;
    }

    public static Parser<zo_2> z() {
        return ape;
    }

    public Parser<zo_2> getParserForType() {
        return ape;
    }

    public zo_2 aAF() {
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
        return zo_2.emptyIntList();
    }

    static /* synthetic */ Internal.IntList aAG() {
        return zo_2.emptyIntList();
    }

    static /* synthetic */ UnknownFieldSet b(zo_2 zo_22) {
        return zo_22.unknownFields;
    }

    static /* synthetic */ Internal.IntList amY() {
        return zo_2.emptyIntList();
    }

    static /* synthetic */ Internal.IntList e(Internal.IntList intList) {
        return zo_2.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList Ac() {
        return zo_2.emptyIntList();
    }

    static /* synthetic */ Internal.IntList vM() {
        return zo_2.emptyIntList();
    }

    static /* synthetic */ Internal.IntList a(Internal.IntList intList) {
        return zo_2.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList vN() {
        return zo_2.emptyIntList();
    }
}

