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
 * Renamed from lq
 */
public final class lq_1
extends GeneratedMessageV3
implements lt_0 {
    private static final long HX = 0L;
    int an;
    public static final int HY = 1;
    int HZ;
    public static final int Ia = 2;
    long Ib;
    private byte Y = (byte)-1;
    private static final lq_1 Ic = new lq_1();
    @Deprecated
    public static final Parser<lq_1> Id = new lr_0();

    lq_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lq_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new lq_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lq_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.HZ = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Ib = codedInputStream.readInt64();
                        continue block12;
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

    public static final Descriptors.Descriptor agd() {
        return kF.FS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FT.ensureFieldAccessorsInitialized(lq_1.class, ls_0.class);
    }

    @Override
    public boolean age() {
        return (this.an & 1) != 0;
    }

    @Override
    public int agf() {
        return this.HZ;
    }

    @Override
    public boolean agg() {
        return (this.an & 2) != 0;
    }

    @Override
    public long agh() {
        return this.Ib;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.age()) {
            this.Y = 0;
            return false;
        }
        if (!this.agg()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.HZ);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.Ib);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.HZ);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.Ib);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lq_1)) {
            return super.equals(object);
        }
        lq_1 lq_12 = (lq_1)object;
        if (this.age() != lq_12.age()) {
            return false;
        }
        if (this.age() && this.agf() != lq_12.agf()) {
            return false;
        }
        if (this.agg() != lq_12.agg()) {
            return false;
        }
        if (this.agg() && this.agh() != lq_12.agh()) {
            return false;
        }
        return this.unknownFields.equals((Object)lq_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lq_1.agd().hashCode();
        if (this.age()) {
            n = 37 * n + 1;
            n = 53 * n + this.agf();
        }
        if (this.agg()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.agh());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lq_1 bO(ByteBuffer byteBuffer) {
        return (lq_1)Id.parseFrom(byteBuffer);
    }

    public static lq_1 bK(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_1)Id.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lq_1 cT(ByteString byteString) {
        return (lq_1)Id.parseFrom(byteString);
    }

    public static lq_1 bK(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_1)Id.parseFrom(byteString, extensionRegistryLite);
    }

    public static lq_1 bL(byte[] byArray) {
        return (lq_1)Id.parseFrom(byArray);
    }

    public static lq_1 bK(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_1)Id.parseFrom(byArray, extensionRegistryLite);
    }

    public static lq_1 eu(InputStream inputStream) {
        return (lq_1)GeneratedMessageV3.parseWithIOException(Id, (InputStream)inputStream);
    }

    public static lq_1 eu(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_1)GeneratedMessageV3.parseWithIOException(Id, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lq_1 ev(InputStream inputStream) {
        return (lq_1)GeneratedMessageV3.parseDelimitedWithIOException(Id, (InputStream)inputStream);
    }

    public static lq_1 ev(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_1)GeneratedMessageV3.parseDelimitedWithIOException(Id, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lq_1 bK(CodedInputStream codedInputStream) {
        return (lq_1)GeneratedMessageV3.parseWithIOException(Id, (CodedInputStream)codedInputStream);
    }

    public static lq_1 he(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lq_1)GeneratedMessageV3.parseWithIOException(Id, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ls_0 agi() {
        return lq_1.agj();
    }

    public static ls_0 agj() {
        return Ic.agk();
    }

    public static ls_0 c(lq_1 lq_12) {
        return Ic.agk().e(lq_12);
    }

    public ls_0 agk() {
        return this == Ic ? new ls_0() : new ls_0().e(this);
    }

    protected ls_0 bK(GeneratedMessageV3.BuilderParent builderParent) {
        ls_0 ls_02 = new ls_0(builderParent);
        return ls_02;
    }

    public static lq_1 agl() {
        return Ic;
    }

    public static Parser<lq_1> z() {
        return Id;
    }

    public Parser<lq_1> getParserForType() {
        return Id;
    }

    public lq_1 agm() {
        return Ic;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bK(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.agk();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.agi();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.agk();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.agi();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.agm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.agm();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(lq_1 lq_12) {
        return lq_12.unknownFields;
    }
}

