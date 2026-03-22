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
 *  com.google.protobuf.Internal
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

/*
 * Renamed from zh
 */
public final class zh_2
extends GeneratedMessageV3
implements zo_1 {
    private static final long anx = 0L;
    int an;
    public static final int any = 1;
    long wX;
    public static final int anz = 2;
    int anA;
    public static final int anB = 3;
    int mj;
    private byte Y = (byte)-1;
    private static final zh_2 anC = new zh_2();
    @Deprecated
    public static final Parser<zh_2> anD = new zi_2();

    zh_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zh_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zh_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zh_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.wX = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.anA = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.mj = codedInputStream.readInt32();
                        continue block13;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor axy() {
        return zg_2.anv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zg_2.anw.ensureFieldAccessorsInitialized(zh_2.class, zj_2.class);
    }

    @Override
    public boolean LU() {
        return (this.an & 1) != 0;
    }

    @Override
    public long LV() {
        return this.wX;
    }

    @Override
    public boolean axz() {
        return (this.an & 2) != 0;
    }

    @Override
    public int axA() {
        return this.anA;
    }

    @Override
    public boolean tK() {
        return (this.an & 4) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.LU()) {
            this.Y = 0;
            return false;
        }
        if (!this.axz()) {
            this.Y = 0;
            return false;
        }
        if (!this.tK()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.wX);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.anA);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.mj);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.wX);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.anA);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.mj);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zh_2)) {
            return super.equals(object);
        }
        zh_2 zh_22 = (zh_2)object;
        if (this.LU() != zh_22.LU()) {
            return false;
        }
        if (this.LU() && this.LV() != zh_22.LV()) {
            return false;
        }
        if (this.axz() != zh_22.axz()) {
            return false;
        }
        if (this.axz() && this.axA() != zh_22.axA()) {
            return false;
        }
        if (this.tK() != zh_22.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != zh_22.tL()) {
            return false;
        }
        return this.unknownFields.equals((Object)zh_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zh_2.axy().hashCode();
        if (this.LU()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.LV());
        }
        if (this.axz()) {
            n = 37 * n + 2;
            n = 53 * n + this.axA();
        }
        if (this.tK()) {
            n = 37 * n + 3;
            n = 53 * n + this.tL();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zh_2 ei(ByteBuffer byteBuffer) {
        return (zh_2)anD.parseFrom(byteBuffer);
    }

    public static zh_2 cw(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zh_2)anD.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zh_2 dX(ByteString byteString) {
        return (zh_2)anD.parseFrom(byteString);
    }

    public static zh_2 cw(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zh_2)anD.parseFrom(byteString, extensionRegistryLite);
    }

    public static zh_2 cy(byte[] byArray) {
        return (zh_2)anD.parseFrom(byArray);
    }

    public static zh_2 cw(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zh_2)anD.parseFrom(byArray, extensionRegistryLite);
    }

    public static zh_2 fS(InputStream inputStream) {
        return (zh_2)GeneratedMessageV3.parseWithIOException(anD, (InputStream)inputStream);
    }

    public static zh_2 fS(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zh_2)GeneratedMessageV3.parseWithIOException(anD, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zh_2 fT(InputStream inputStream) {
        return (zh_2)GeneratedMessageV3.parseDelimitedWithIOException(anD, (InputStream)inputStream);
    }

    public static zh_2 fT(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zh_2)GeneratedMessageV3.parseDelimitedWithIOException(anD, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zh_2 cw(CodedInputStream codedInputStream) {
        return (zh_2)GeneratedMessageV3.parseWithIOException(anD, (CodedInputStream)codedInputStream);
    }

    public static zh_2 jo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zh_2)GeneratedMessageV3.parseWithIOException(anD, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zj_2 axB() {
        return zh_2.axC();
    }

    public static zj_2 axC() {
        return anC.axD();
    }

    public static zj_2 a(zh_2 zh_22) {
        return anC.axD().c(zh_22);
    }

    public zj_2 axD() {
        return this == anC ? new zj_2() : new zj_2().c(this);
    }

    protected zj_2 cw(GeneratedMessageV3.BuilderParent builderParent) {
        zj_2 zj_22 = new zj_2(builderParent);
        return zj_22;
    }

    public static zh_2 axE() {
        return anC;
    }

    public static Parser<zh_2> z() {
        return anD;
    }

    public Parser<zh_2> getParserForType() {
        return anD;
    }

    public zh_2 axF() {
        return anC;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cw(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.axD();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.axB();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.axD();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.axB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.axF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.axF();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(zh_2 zh_22) {
        return zh_22.unknownFields;
    }
}

