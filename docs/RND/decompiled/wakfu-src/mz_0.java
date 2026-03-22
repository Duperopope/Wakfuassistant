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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from mz
 */
public final class mz_0
extends GeneratedMessageV3
implements mc_0 {
    private static final long Lo = 0L;
    int an;
    public static final int Lp = 1;
    mk Kp;
    public static final int Lq = 2;
    List<mt_1> Lr;
    public static final int Ls = 3;
    long Ks;
    private byte Y = (byte)-1;
    private static final mz_0 Lt = new mz_0();
    @Deprecated
    public static final Parser<mz_0> Lu = new mA();

    mz_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mz_0() {
        this.Lr = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mz_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mz_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 10: {
                        mm_0 mm_02 = null;
                        if ((this.an & 1) != 0) {
                            mm_02 = this.Kp.ald();
                        }
                        this.Kp = (mk)codedInputStream.readMessage(mk.KC, extensionRegistryLite);
                        if (mm_02 != null) {
                            mm_02.e(this.Kp);
                            this.Kp = mm_02.alj();
                        }
                        this.an |= 1;
                        continue block13;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.Lr = new ArrayList<mt_1>();
                            n |= 2;
                        }
                        this.Lr.add((mt_1)codedInputStream.readMessage(mt_1.Lb, extensionRegistryLite));
                        continue block13;
                    }
                    case 24: {
                        this.an |= 2;
                        this.Ks = codedInputStream.readInt64();
                        continue block13;
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
            if ((n & 2) != 0) {
                this.Lr = Collections.unmodifiableList(this.Lr);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor ame() {
        return ms.KM;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ms.KN.ensureFieldAccessorsInitialized(mz_0.class, mB.class);
    }

    @Override
    public boolean akD() {
        return (this.an & 1) != 0;
    }

    @Override
    public mk akE() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public mn akF() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public List<mt_1> amf() {
        return this.Lr;
    }

    @Override
    public List<? extends mw_0> amg() {
        return this.Lr;
    }

    @Override
    public int amh() {
        return this.Lr.size();
    }

    @Override
    public mt_1 ik(int n) {
        return this.Lr.get(n);
    }

    @Override
    public mw_0 il(int n) {
        return this.Lr.get(n);
    }

    @Override
    public boolean akG() {
        return (this.an & 2) != 0;
    }

    @Override
    public long akH() {
        return this.Ks;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.akD()) {
            this.Y = 0;
            return false;
        }
        if (!this.akG()) {
            this.Y = 0;
            return false;
        }
        if (!this.akE().isInitialized()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.amh(); ++i) {
            if (this.ik(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.Lr.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.Lr.get(i));
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(3, this.Ks);
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
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.Lr.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.Lr.get(i)));
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.Ks);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mz_0)) {
            return super.equals(object);
        }
        mz_0 mz_02 = (mz_0)object;
        if (this.akD() != mz_02.akD()) {
            return false;
        }
        if (this.akD() && !this.akE().equals(mz_02.akE())) {
            return false;
        }
        if (!this.amf().equals(mz_02.amf())) {
            return false;
        }
        if (this.akG() != mz_02.akG()) {
            return false;
        }
        if (this.akG() && this.akH() != mz_02.akH()) {
            return false;
        }
        return this.unknownFields.equals((Object)mz_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mz_0.ame().hashCode();
        if (this.akD()) {
            n = 37 * n + 1;
            n = 53 * n + this.akE().hashCode();
        }
        if (this.amh() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.amf().hashCode();
        }
        if (this.akG()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.akH());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mz_0 cc(ByteBuffer byteBuffer) {
        return (mz_0)Lu.parseFrom(byteBuffer);
    }

    public static mz_0 bY(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mz_0)Lu.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mz_0 dm(ByteString byteString) {
        return (mz_0)Lu.parseFrom(byteString);
    }

    public static mz_0 bY(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mz_0)Lu.parseFrom(byteString, extensionRegistryLite);
    }

    public static mz_0 bZ(byte[] byArray) {
        return (mz_0)Lu.parseFrom(byArray);
    }

    public static mz_0 bY(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mz_0)Lu.parseFrom(byArray, extensionRegistryLite);
    }

    public static mz_0 eW(InputStream inputStream) {
        return (mz_0)GeneratedMessageV3.parseWithIOException(Lu, (InputStream)inputStream);
    }

    public static mz_0 eW(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mz_0)GeneratedMessageV3.parseWithIOException(Lu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mz_0 eX(InputStream inputStream) {
        return (mz_0)GeneratedMessageV3.parseDelimitedWithIOException(Lu, (InputStream)inputStream);
    }

    public static mz_0 eX(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mz_0)GeneratedMessageV3.parseDelimitedWithIOException(Lu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mz_0 bY(CodedInputStream codedInputStream) {
        return (mz_0)GeneratedMessageV3.parseWithIOException(Lu, (CodedInputStream)codedInputStream);
    }

    public static mz_0 hU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mz_0)GeneratedMessageV3.parseWithIOException(Lu, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mB ami() {
        return mz_0.amj();
    }

    public static mB amj() {
        return Lt.amk();
    }

    public static mB a(mz_0 mz_02) {
        return Lt.amk().c(mz_02);
    }

    public mB amk() {
        return this == Lt ? new mB() : new mB().c(this);
    }

    protected mB bY(GeneratedMessageV3.BuilderParent builderParent) {
        mB mB2 = new mB(builderParent);
        return mB2;
    }

    public static mz_0 aml() {
        return Lt;
    }

    public static Parser<mz_0> z() {
        return Lu;
    }

    public Parser<mz_0> getParserForType() {
        return Lu;
    }

    public mz_0 amm() {
        return Lt;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bY(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.amk();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ami();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.amk();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ami();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.amm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.amm();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mz_0 mz_02) {
        return mz_02.unknownFields;
    }
}

