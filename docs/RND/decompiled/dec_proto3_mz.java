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

public final class mz
extends GeneratedMessageV3
implements mC {
    private static final long Lo = 0L;
    int an;
    public static final int Lp = 1;
    mk Kp;
    public static final int Lq = 2;
    List<mt> Lr;
    public static final int Ls = 3;
    long Ks;
    private byte Y = (byte)-1;
    private static final mz Lt = new mz();
    @Deprecated
    public static final Parser<mz> Lu = new mA();

    mz(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mz() {
        this.Lr = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mz();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        mm mm2 = null;
                        if ((this.an & 1) != 0) {
                            mm2 = this.Kp.ald();
                        }
                        this.Kp = (mk)codedInputStream.readMessage(mk.KC, extensionRegistryLite);
                        if (mm2 != null) {
                            mm2.e(this.Kp);
                            this.Kp = mm2.alj();
                        }
                        this.an |= 1;
                        continue block13;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.Lr = new ArrayList<mt>();
                            n |= 2;
                        }
                        this.Lr.add((mt)codedInputStream.readMessage(mt.Lb, extensionRegistryLite));
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
        return ms.KN.ensureFieldAccessorsInitialized(mz.class, mB.class);
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
    public List<mt> amf() {
        return this.Lr;
    }

    @Override
    public List<? extends mw> amg() {
        return this.Lr;
    }

    @Override
    public int amh() {
        return this.Lr.size();
    }

    @Override
    public mt ik(int n) {
        return this.Lr.get(n);
    }

    @Override
    public mw il(int n) {
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
        if (!(object instanceof mz)) {
            return super.equals(object);
        }
        mz mz2 = (mz)object;
        if (this.akD() != mz2.akD()) {
            return false;
        }
        if (this.akD() && !this.akE().equals(mz2.akE())) {
            return false;
        }
        if (!this.amf().equals(mz2.amf())) {
            return false;
        }
        if (this.akG() != mz2.akG()) {
            return false;
        }
        if (this.akG() && this.akH() != mz2.akH()) {
            return false;
        }
        return this.unknownFields.equals((Object)mz2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mz.ame().hashCode();
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

    public static mz cc(ByteBuffer byteBuffer) {
        return (mz)Lu.parseFrom(byteBuffer);
    }

    public static mz bY(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mz)Lu.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mz dm(ByteString byteString) {
        return (mz)Lu.parseFrom(byteString);
    }

    public static mz bY(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mz)Lu.parseFrom(byteString, extensionRegistryLite);
    }

    public static mz bZ(byte[] byArray) {
        return (mz)Lu.parseFrom(byArray);
    }

    public static mz bY(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mz)Lu.parseFrom(byArray, extensionRegistryLite);
    }

    public static mz eW(InputStream inputStream) {
        return (mz)GeneratedMessageV3.parseWithIOException(Lu, (InputStream)inputStream);
    }

    public static mz eW(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mz)GeneratedMessageV3.parseWithIOException(Lu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mz eX(InputStream inputStream) {
        return (mz)GeneratedMessageV3.parseDelimitedWithIOException(Lu, (InputStream)inputStream);
    }

    public static mz eX(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mz)GeneratedMessageV3.parseDelimitedWithIOException(Lu, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mz bY(CodedInputStream codedInputStream) {
        return (mz)GeneratedMessageV3.parseWithIOException(Lu, (CodedInputStream)codedInputStream);
    }

    public static mz hU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mz)GeneratedMessageV3.parseWithIOException(Lu, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mB ami() {
        return mz.amj();
    }

    public static mB amj() {
        return Lt.amk();
    }

    public static mB a(mz mz2) {
        return Lt.amk().c(mz2);
    }

    public mB amk() {
        return this == Lt ? new mB() : new mB().c(this);
    }

    protected mB bY(GeneratedMessageV3.BuilderParent builderParent) {
        mB mB2 = new mB(builderParent);
        return mB2;
    }

    public static mz aml() {
        return Lt;
    }

    public static Parser<mz> z() {
        return Lu;
    }

    public Parser<mz> getParserForType() {
        return Lu;
    }

    public mz amm() {
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

    static /* synthetic */ UnknownFieldSet b(mz mz2) {
        return mz2.unknownFields;
    }
}
